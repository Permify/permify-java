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
    echo "This script will update the following:"
    echo "  - ../api (OpenAPI spec)"
    echo "  - ../src (generated source code)"
    echo "  - ../docs (API documentation)"
    echo "  - ../pom.xml (dependencies and version)"
    echo "  - ../build.gradle (dependencies and version)"
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

# Check if Java is available
if ! command -v java &> /dev/null; then
    echo "Error: Java is required but not installed"
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

# Download OpenAPI Generator CLI JAR if not present
GENERATOR_JAR="${SCRIPT_DIR}/openapi-generator-cli.jar"
if [[ ! -f "${GENERATOR_JAR}" ]]; then
    echo "Downloading OpenAPI Generator CLI..."
    curl -L -o "${GENERATOR_JAR}" https://repo1.maven.org/maven2/org/openapitools/openapi-generator-cli/7.2.0/openapi-generator-cli-7.2.0.jar
fi

# Generate SDK using OpenAPI Generator CLI
java -jar "${GENERATOR_JAR}" generate \
    -i "${OPENAPI_ABSOLUTE_PATH}" \
    -g java \
    -o "${TEMP_OUTPUT_DIR}" \
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

# Function to update dependencies in pom.xml
update_pom_dependencies() {
    local generated_pom="${TEMP_OUTPUT_DIR}/pom.xml"
    local target_pom="${PROJECT_ROOT}/pom.xml"
    
    if [[ ! -f "${generated_pom}" ]] || [[ ! -f "${target_pom}" ]]; then
        echo "    ⚠️  Warning: Generated or target pom.xml not found, skipping dependency update"
        return
    fi
    
    echo "  Extracting and updating dependencies from generated pom.xml"
    
    # Extract dependencies from generated pom.xml (excluding test dependencies)
    local temp_deps=$(mktemp)
    sed -n '/<dependencies>/,/<\/dependencies>/p' "${generated_pom}" | \
        grep -v '<scope>test</scope>' | \
        sed -n '/<dependency>/,/<\/dependency>/p' > "${temp_deps}"
    
    if [[ -s "${temp_deps}" ]]; then
        # Create a backup of the current pom.xml
        cp "${target_pom}" "${target_pom}.bak"
        
        # Remove existing dependencies section and add new ones
        if command -v awk &> /dev/null; then
            awk '
            /<dependencies>/ { 
                print; 
                while ((getline line < "'${temp_deps}'") > 0) print line; 
                close("'${temp_deps}'");
                # Skip until end of dependencies
                while (getline && !/^[[:space:]]*<\/dependencies>/) continue;
                print;
                next;
            }
            { print }
            ' "${target_pom}" > "${target_pom}.tmp" && mv "${target_pom}.tmp" "${target_pom}"
            echo "    ✅ Updated pom.xml dependencies"
        else
            echo "    ⚠️  Warning: awk not available, could not update dependencies"
        fi
    else
        echo "    ⚠️  Warning: No dependencies found in generated pom.xml"
    fi
    
    rm -f "${temp_deps}"
}

# Function to update dependencies in build.gradle
update_gradle_dependencies() {
    local generated_gradle="${TEMP_OUTPUT_DIR}/build.gradle"
    local target_gradle="${PROJECT_ROOT}/build.gradle"
    
    if [[ ! -f "${generated_gradle}" ]] || [[ ! -f "${target_gradle}" ]]; then
        echo "    ⚠️  Warning: Generated or target build.gradle not found, skipping dependency update"
        return
    fi
    
    echo "  Extracting and updating dependencies from generated build.gradle"
    
    # Extract implementation dependencies from generated build.gradle
    local temp_deps=$(mktemp)
    sed -n '/^dependencies {/,/^}/p' "${generated_gradle}" | \
        grep -E '^\s*(implementation|api|compileOnly)\s+' | \
        grep -v 'testImplementation\|testCompileOnly' > "${temp_deps}"
    
    if [[ -s "${temp_deps}" ]]; then
        # Create a backup of the current build.gradle
        cp "${target_gradle}" "${target_gradle}.bak"
        
        # Update dependencies section
        if command -v awk &> /dev/null; then
            awk '
            /^dependencies {/ { 
                print;
                # Add new dependencies
                while ((getline line < "'${temp_deps}'") > 0) {
                    if (line !~ /testImplementation/) print "    " line;
                }
                close("'${temp_deps}'");
                # Keep existing testImplementation lines
                while (getline && !/^}/) {
                    if ($0 ~ /testImplementation/) print;
                }
                print "}";
                next;
            }
            { print }
            ' "${target_gradle}" > "${target_gradle}.tmp" && mv "${target_gradle}.tmp" "${target_gradle}"
            echo "    ✅ Updated build.gradle dependencies"
        else
            echo "    ⚠️  Warning: awk not available, could not update dependencies"
        fi
    else
        echo "    ⚠️  Warning: No implementation dependencies found in generated build.gradle"
    fi
    
    rm -f "${temp_deps}"
}

# Function to extract and update version properties
update_version_properties() {
    local generated_pom="${TEMP_OUTPUT_DIR}/pom.xml"
    local target_pom="${PROJECT_ROOT}/pom.xml"
    local generated_gradle="${TEMP_OUTPUT_DIR}/build.gradle"
    local target_gradle="${PROJECT_ROOT}/build.gradle"
    
    echo "  Updating version properties from generated files"
    
    # Update properties in pom.xml
    if [[ -f "${generated_pom}" ]] && [[ -f "${target_pom}" ]]; then
        local temp_props=$(mktemp)
        sed -n '/<properties>/,/<\/properties>/p' "${generated_pom}" | \
            grep -E '^\s*<[^>]*-version>' | \
            grep -v '<maven.compiler\|<project.build' > "${temp_props}"
        
        if [[ -s "${temp_props}" ]]; then
            # Update existing properties with new versions
            while IFS= read -r prop_line; do
                local prop_name=$(echo "${prop_line}" | sed -n 's/.*<\([^>]*\)>.*/\1/p')
                local prop_value=$(echo "${prop_line}" | sed -n 's/.*<[^>]*>\([^<]*\)<.*/\1/p')
                
                if [[ -n "${prop_name}" ]] && [[ -n "${prop_value}" ]]; then
                    if grep -q "<${prop_name}>" "${target_pom}"; then
                        if [[ "$OSTYPE" == "darwin"* ]]; then
                            sed -i '' "s|<${prop_name}>[^<]*</${prop_name}>|<${prop_name}>${prop_value}</${prop_name}>|g" "${target_pom}"
                        else
                            sed -i "s|<${prop_name}>[^<]*</${prop_name}>|<${prop_name}>${prop_value}</${prop_name}>|g" "${target_pom}"
                        fi
                    fi
                fi
            done < "${temp_props}"
            echo "    ✅ Updated version properties in pom.xml"
        fi
        rm -f "${temp_props}"
    fi
    
    # Update ext properties in build.gradle
    if [[ -f "${generated_gradle}" ]] && [[ -f "${target_gradle}" ]]; then
        local temp_ext=$(mktemp)
        sed -n '/^ext {/,/^}/p' "${generated_gradle}" | \
            grep -E '^\s*[a-zA-Z_][a-zA-Z0-9_]*\s*=' > "${temp_ext}"
        
        if [[ -s "${temp_ext}" ]]; then
            while IFS= read -r ext_line; do
                local var_name=$(echo "${ext_line}" | sed -n 's/^\s*\([a-zA-Z_][a-zA-Z0-9_]*\)\s*=.*/\1/p')
                local var_value=$(echo "${ext_line}" | sed -n 's/.*=\s*\(.*\)$/\1/p')
                
                if [[ -n "${var_name}" ]] && [[ -n "${var_value}" ]]; then
                    if grep -q "${var_name} =" "${target_gradle}"; then
                        if [[ "$OSTYPE" == "darwin"* ]]; then
                            sed -i '' "s|${var_name} = .*|${var_name} = ${var_value}|g" "${target_gradle}"
                        else
                            sed -i "s|${var_name} = .*|${var_name} = ${var_value}|g" "${target_gradle}"
                        fi
                    fi
                fi
            done < "${temp_ext}"
            echo "    ✅ Updated ext properties in build.gradle"
        fi
        rm -f "${temp_ext}"
    fi
}

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

# Update build.gradle version
GRADLE_FILE="${PROJECT_ROOT}/build.gradle"
if [[ -f "${GRADLE_FILE}" ]]; then
    echo "  Updating version in build.gradle to ${VERSION_WITHOUT_V}"
    if command -v sed &> /dev/null; then
        if [[ "$OSTYPE" == "darwin"* ]]; then
            sed -i '' "s|^version = .*|version = '${VERSION_WITHOUT_V}'|g" "${GRADLE_FILE}"
        else
            sed -i "s|^version = .*|version = '${VERSION_WITHOUT_V}'|g" "${GRADLE_FILE}"
        fi
        echo "    ✅ Updated build.gradle version to ${VERSION_WITHOUT_V}"
    else
        echo "    ⚠️  Warning: sed not available, could not update build.gradle version"
    fi
else
    echo "    ⚠️  Warning: build.gradle not found at ${GRADLE_FILE}"
fi

# Update dependencies and version properties
update_pom_dependencies
update_gradle_dependencies
update_version_properties

echo ""
echo "✅ Java SDK updated successfully!"
echo "📁 Updated directories:"
echo "   - ${API_DIR}"
echo "   - ${SRC_DIR}"
echo "   - ${DOCS_DIR}"
echo "📝 Updated version to ${VERSION_WITHOUT_V}"
echo "🔗 Updated dependencies and version properties in:"
echo "   - pom.xml"
echo "   - build.gradle"