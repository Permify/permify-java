#!/bin/bash

set -e

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
PROJECT_ROOT="${SCRIPT_DIR}/.."
DEFAULT_OPENAPI_FILE="${SCRIPT_DIR}/openapi.json"
DEFAULT_PACKAGE_NAME="co.permify.sdk"
DEFAULT_CLIENT_NAME="PermifyClient"

usage() {
    echo "Usage: $0 [OPTIONS]"
    echo ""
    echo "Generate Java SDK from OpenAPI specification and update project directories"
    echo ""
    echo "Options:"
    echo "  -i, --input FILE        OpenAPI JSON file (default: ${DEFAULT_OPENAPI_FILE})"
    echo "  -p, --package NAME      Java package name (default: ${DEFAULT_PACKAGE_NAME})"
    echo "  -c, --client NAME       Client class name (default: ${DEFAULT_CLIENT_NAME})"
    echo "  -h, --help              Show this help message"
    echo ""
    echo "This script will update the following directories:"
    echo "  - ../api"
    echo "  - ../src"
    echo "  - ../docs"
    echo ""
    echo "Examples:"
    echo "  $0                                    # Use defaults"
    echo "  $0 -i swagger.json                   # Custom input file"
    echo "  $0 -p com.example.client             # Custom package name"
}

OPENAPI_FILE="${DEFAULT_OPENAPI_FILE}"
PACKAGE_NAME="${DEFAULT_PACKAGE_NAME}"
CLIENT_NAME="${DEFAULT_CLIENT_NAME}"

while [[ $# -gt 0 ]]; do
    case $1 in
        -i|--input)
            OPENAPI_FILE="$2"
            shift 2
            ;;
        -p|--package)
            PACKAGE_NAME="$2"
            shift 2
            ;;
        -c|--client)
            CLIENT_NAME="$2"
            shift 2
            ;;
        -h|--help)
            usage
            exit 0
            ;;
        *)
            echo "Unknown option: $1"
            usage
            exit 1
            ;;
    esac
done

if [[ ! -f "${OPENAPI_FILE}" ]]; then
    echo "Error: OpenAPI file '${OPENAPI_FILE}' not found"
    exit 1
fi

if ! command -v docker &> /dev/null; then
    echo "Error: Docker is required but not installed"
    echo "Please install Docker: https://docs.docker.com/get-docker/"
    exit 1
fi

TEMP_OUTPUT_DIR=$(mktemp -d)
trap 'rm -rf "${TEMP_OUTPUT_DIR}"' EXIT

OPENAPI_ABSOLUTE_PATH=$(realpath "${OPENAPI_FILE}")

OPENAPI_VERSION=$(grep -o '"version": *"[^"]*"' "${OPENAPI_FILE}" | cut -d '"' -f 4)
if [[ -z "${OPENAPI_VERSION}" ]]; then
    echo "Error: Could not extract version from OpenAPI file"
    exit 1
fi

echo "Generating Java SDK..."
echo "  OpenAPI file: ${OPENAPI_ABSOLUTE_PATH}"
echo "  OpenAPI version: ${OPENAPI_VERSION}"
echo "  Package name: ${PACKAGE_NAME}"
echo "  Client name: ${CLIENT_NAME}"
echo "  Temp directory: ${TEMP_OUTPUT_DIR}"
echo ""

docker run --rm \
    -v "${OPENAPI_ABSOLUTE_PATH}:/local/openapi.json:ro" \
    -v "${TEMP_OUTPUT_DIR}:/local/out" \
    openapitools/openapi-generator-cli:latest generate \
    -i /local/openapi.json \
    -g java \
    -o /local/out \
    --package-name="${PACKAGE_NAME}" \
    --api-package="${PACKAGE_NAME}.api" \
    --model-package="${PACKAGE_NAME}.model" \
    --invoker-package="${PACKAGE_NAME}.client" \
    --additional-properties=clientPackage="${PACKAGE_NAME}.client",clientName="${CLIENT_NAME}" \
    --additional-properties=useJakartaEe=true \
    --additional-properties=library=native \
    --additional-properties=dateLibrary=java8 \
    --additional-properties=java8=true \
    --additional-properties=hideGenerationTimestamp=true \
    --skip-validate-spec

if [[ $? -ne 0 ]]; then
    echo ""
    echo "❌ Failed to generate Java SDK"
    exit 1
fi

echo "Updating project directories..."

API_DIR="${PROJECT_ROOT}/api"
SRC_DIR="${PROJECT_ROOT}/src"
DOCS_DIR="${PROJECT_ROOT}/docs"

if [[ -f "${TEMP_OUTPUT_DIR}/openapi.yaml" ]]; then
    echo "  Updating ${API_DIR}/openapi.yaml"
    mkdir -p "${API_DIR}"
    cp "${TEMP_OUTPUT_DIR}/openapi.yaml" "${API_DIR}/openapi.yaml"
fi

if [[ -d "${TEMP_OUTPUT_DIR}/src" ]]; then
    echo "  Updating ${SRC_DIR}"
    rm -rf "${SRC_DIR}/main/java/${PACKAGE_NAME//./\/}"
    mkdir -p "${SRC_DIR}/main/java"
    cp -r "${TEMP_OUTPUT_DIR}/src/main/java/"* "${SRC_DIR}/main/java/"
    
    if [[ -d "${TEMP_OUTPUT_DIR}/src/test" ]]; then
        rm -rf "${SRC_DIR}/test/java/${PACKAGE_NAME//./\/}"
        mkdir -p "${SRC_DIR}/test/java"
        cp -r "${TEMP_OUTPUT_DIR}/src/test/java/"* "${SRC_DIR}/test/java/"
    fi
fi

if [[ -d "${TEMP_OUTPUT_DIR}/docs" ]]; then
    echo "  Updating ${DOCS_DIR}"
    rm -rf "${DOCS_DIR}"/*.md
    mkdir -p "${DOCS_DIR}"
    cp "${TEMP_OUTPUT_DIR}/docs/"*.md "${DOCS_DIR}/"
fi

# Strip 'v' prefix from version if present
VERSION_WITHOUT_V="${OPENAPI_VERSION#v}"
echo "  Updating version in pom.xml to ${VERSION_WITHOUT_V}"
POM_FILE="${PROJECT_ROOT}/pom.xml"
if [[ -f "${POM_FILE}" ]]; then
    if command -v sed &> /dev/null; then
        if [[ "$OSTYPE" == "darwin"* ]]; then
            sed -i '' '/<name>Permify Java<\/name>/{n;s|<version>[^<]*</version>|<version>'"${VERSION_WITHOUT_V}"'</version>|;}' "${POM_FILE}"
            if [[ $? -eq 0 ]]; then
                echo "    ✅ Updated pom.xml version to ${VERSION_WITHOUT_V}"
            else
                echo "    ❌ Error: Failed to update pom.xml version"
            fi
        else
            sed -i '/<name>Permify Java<\/name>/{n;s|<version>[^<]*</version>|<version>'"${VERSION_WITHOUT_V}"'</version>|;}' "${POM_FILE}"
            if [[ $? -eq 0 ]]; then
                echo "    ✅ Updated pom.xml version to ${VERSION_WITHOUT_V}"
            else
                echo "    ❌ Error: Failed to update pom.xml version"
            fi
        fi
    else
        echo "    ⚠️  Warning: sed not available, could not update pom.xml version"
    fi
else
    echo "    ⚠️  Warning: pom.xml not found at ${POM_FILE}"
fi

echo ""
echo "✅ Java SDK updated successfully!"
echo "📁 Updated directories:"
echo "   - ${API_DIR}"
echo "   - ${SRC_DIR}"
echo "   - ${DOCS_DIR}"
echo "📝 Updated version in pom.xml to ${OPENAPI_VERSION}"