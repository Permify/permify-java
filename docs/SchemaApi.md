# SchemaApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**schemasList**](SchemaApi.md#schemasList) | **POST** /v1/tenants/{tenant_id}/schemas/list | list schema |
| [**schemasPartialWrite**](SchemaApi.md#schemasPartialWrite) | **PATCH** /v1/tenants/{tenant_id}/schemas/partial-write | partially update your authorization model |
| [**schemasRead**](SchemaApi.md#schemasRead) | **POST** /v1/tenants/{tenant_id}/schemas/read | read schema |
| [**schemasWrite**](SchemaApi.md#schemasWrite) | **POST** /v1/tenants/{tenant_id}/schemas/write | write schema |



## schemasList

> SchemaListResponse schemasList(tenantId, body)

list schema

### Example

```java
// Import classes:
import org.permify.ApiClient;
import org.permify.ApiException;
import org.permify.Configuration;
import org.permify.models.*;
import org.permify.api.SchemaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SchemaApi apiInstance = new SchemaApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        SchemasListRequest body = new SchemasListRequest(); // SchemasListRequest | 
        try {
            SchemaListResponse result = apiInstance.schemasList(tenantId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SchemaApi#schemasList");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantId** | **String**| Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes. | |
| **body** | [**SchemasListRequest**](SchemasListRequest.md)|  | |

### Return type

[**SchemaListResponse**](SchemaListResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |


## schemasPartialWrite

> SchemaPartialWriteResponse schemasPartialWrite(tenantId, body)

partially update your authorization model

### Example

```java
// Import classes:
import org.permify.ApiClient;
import org.permify.ApiException;
import org.permify.Configuration;
import org.permify.models.*;
import org.permify.api.SchemaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SchemaApi apiInstance = new SchemaApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant_id is a string that identifies the tenant. It must match the pattern \"[a-zA-Z0-9-,]+\", be a maximum of 64 bytes, and must not be empty.
        ItContainsTheTenantIdToIdentifyTheTenantAndMetadataOfTheSchemaToBeEditedWithTheCorrespondingEditsToVariousEntities body = new ItContainsTheTenantIdToIdentifyTheTenantAndMetadataOfTheSchemaToBeEditedWithTheCorrespondingEditsToVariousEntities(); // ItContainsTheTenantIdToIdentifyTheTenantAndMetadataOfTheSchemaToBeEditedWithTheCorrespondingEditsToVariousEntities | 
        try {
            SchemaPartialWriteResponse result = apiInstance.schemasPartialWrite(tenantId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SchemaApi#schemasPartialWrite");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantId** | **String**| tenant_id is a string that identifies the tenant. It must match the pattern \&quot;[a-zA-Z0-9-,]+\&quot;, be a maximum of 64 bytes, and must not be empty. | |
| **body** | [**ItContainsTheTenantIdToIdentifyTheTenantAndMetadataOfTheSchemaToBeEditedWithTheCorrespondingEditsToVariousEntities**](ItContainsTheTenantIdToIdentifyTheTenantAndMetadataOfTheSchemaToBeEditedWithTheCorrespondingEditsToVariousEntities.md)|  | |

### Return type

[**SchemaPartialWriteResponse**](SchemaPartialWriteResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |


## schemasRead

> SchemaReadResponse schemasRead(tenantId, body)

read schema

### Example

```java
// Import classes:
import org.permify.ApiClient;
import org.permify.ApiException;
import org.permify.Configuration;
import org.permify.models.*;
import org.permify.api.SchemaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SchemaApi apiInstance = new SchemaApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        SchemasReadRequest body = new SchemasReadRequest(); // SchemasReadRequest | 
        try {
            SchemaReadResponse result = apiInstance.schemasRead(tenantId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SchemaApi#schemasRead");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantId** | **String**| Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes. | |
| **body** | [**SchemasReadRequest**](SchemasReadRequest.md)|  | |

### Return type

[**SchemaReadResponse**](SchemaReadResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |


## schemasWrite

> SchemaWriteResponse schemasWrite(tenantId, body)

write schema

### Example

```java
// Import classes:
import org.permify.ApiClient;
import org.permify.ApiException;
import org.permify.Configuration;
import org.permify.models.*;
import org.permify.api.SchemaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SchemaApi apiInstance = new SchemaApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        SchemasWriteRequest body = new SchemasWriteRequest(); // SchemasWriteRequest | 
        try {
            SchemaWriteResponse result = apiInstance.schemasWrite(tenantId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SchemaApi#schemasWrite");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantId** | **String**| Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes. | |
| **body** | [**SchemasWriteRequest**](SchemasWriteRequest.md)|  | |

### Return type

[**SchemaWriteResponse**](SchemaWriteResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

