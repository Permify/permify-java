# Permify Java SDK

This repository contains a sample usage for the Java SDK for Permify.

## Getting Started

### Prerequisites

Ensure you have the following installed:
- Java
- Maven

### Building the Project

Navigate to the root directory of the project and run the following commands to build and install the SDK:

```sh
mvn clean install
```

### Running the Application

After successfully building the project, you can run the application using the following command:

```sh
java -jar target/your-artifact-name-0.0.1.jar
```

Replace your-artifact-name-0.0.1.jar with the actual name of the jar file generated after the build.

## For your own Projects

To use the Permify SDK in your project, add the following dependency to your pom.xml file:

```xml
<dependency>
  <groupId>co.permify</groupId>
  <artifactId>permify</artifactId>
  <version>0.0.1</version>
</dependency>
```

Here is a simple permify client:

```java

  public static void main(String[] args) {
    String baseUrl = "http://localhost:3476";
    ApiClient apiClient = new ApiClient();
    apiClient.setBasePath(baseUrl);
  }
  
```
