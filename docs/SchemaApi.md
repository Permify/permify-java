# SchemaApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**schemasList**](SchemaApi.md#schemasList) | **POST** /v1/tenants/{tenant_id}/schemas/list | list schema |
| [**schemasListWithHttpInfo**](SchemaApi.md#schemasListWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/schemas/list | list schema |
| [**schemasPartialWrite**](SchemaApi.md#schemasPartialWrite) | **PATCH** /v1/tenants/{tenant_id}/schemas/partial-write | partially update your authorization model |
| [**schemasPartialWriteWithHttpInfo**](SchemaApi.md#schemasPartialWriteWithHttpInfo) | **PATCH** /v1/tenants/{tenant_id}/schemas/partial-write | partially update your authorization model |
| [**schemasRead**](SchemaApi.md#schemasRead) | **POST** /v1/tenants/{tenant_id}/schemas/read | read schema |
| [**schemasReadWithHttpInfo**](SchemaApi.md#schemasReadWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/schemas/read | read schema |
| [**schemasWrite**](SchemaApi.md#schemasWrite) | **POST** /v1/tenants/{tenant_id}/schemas/write | write schema |
| [**schemasWriteWithHttpInfo**](SchemaApi.md#schemasWriteWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/schemas/write | write schema |



## schemasList

> SchemaListResponse schemasList(tenantId, body)

list schema

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.SchemaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SchemaApi apiInstance = new SchemaApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        SchemaListBody body = new SchemaListBody(); // SchemaListBody | 
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
| **body** | [**SchemaListBody**](SchemaListBody.md)|  | |

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

## schemasListWithHttpInfo

> ApiResponse<SchemaListResponse> schemasList schemasListWithHttpInfo(tenantId, body)

list schema

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.ApiResponse;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.SchemaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SchemaApi apiInstance = new SchemaApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        SchemaListBody body = new SchemaListBody(); // SchemaListBody | 
        try {
            ApiResponse<SchemaListResponse> response = apiInstance.schemasListWithHttpInfo(tenantId, body);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SchemaApi#schemasList");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantId** | **String**| Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes. | |
| **body** | [**SchemaListBody**](SchemaListBody.md)|  | |

### Return type

ApiResponse<[**SchemaListResponse**](SchemaListResponse.md)>


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
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.SchemaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SchemaApi apiInstance = new SchemaApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant_id is a string that identifies the tenant. It must match the pattern \"[a-zA-Z0-9-,]+\", be a maximum of 64 bytes, and must not be empty.
        PartialWriteBody body = new PartialWriteBody(); // PartialWriteBody | 
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
| **body** | [**PartialWriteBody**](PartialWriteBody.md)|  | |

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

## schemasPartialWriteWithHttpInfo

> ApiResponse<SchemaPartialWriteResponse> schemasPartialWrite schemasPartialWriteWithHttpInfo(tenantId, body)

partially update your authorization model

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.ApiResponse;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.SchemaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SchemaApi apiInstance = new SchemaApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant_id is a string that identifies the tenant. It must match the pattern \"[a-zA-Z0-9-,]+\", be a maximum of 64 bytes, and must not be empty.
        PartialWriteBody body = new PartialWriteBody(); // PartialWriteBody | 
        try {
            ApiResponse<SchemaPartialWriteResponse> response = apiInstance.schemasPartialWriteWithHttpInfo(tenantId, body);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SchemaApi#schemasPartialWrite");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantId** | **String**| tenant_id is a string that identifies the tenant. It must match the pattern \&quot;[a-zA-Z0-9-,]+\&quot;, be a maximum of 64 bytes, and must not be empty. | |
| **body** | [**PartialWriteBody**](PartialWriteBody.md)|  | |

### Return type

ApiResponse<[**SchemaPartialWriteResponse**](SchemaPartialWriteResponse.md)>


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
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.SchemaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SchemaApi apiInstance = new SchemaApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        SchemaReadBody body = new SchemaReadBody(); // SchemaReadBody | 
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
| **body** | [**SchemaReadBody**](SchemaReadBody.md)|  | |

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

## schemasReadWithHttpInfo

> ApiResponse<SchemaReadResponse> schemasRead schemasReadWithHttpInfo(tenantId, body)

read schema

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.ApiResponse;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.SchemaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SchemaApi apiInstance = new SchemaApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        SchemaReadBody body = new SchemaReadBody(); // SchemaReadBody | 
        try {
            ApiResponse<SchemaReadResponse> response = apiInstance.schemasReadWithHttpInfo(tenantId, body);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SchemaApi#schemasRead");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantId** | **String**| Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes. | |
| **body** | [**SchemaReadBody**](SchemaReadBody.md)|  | |

### Return type

ApiResponse<[**SchemaReadResponse**](SchemaReadResponse.md)>


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
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.SchemaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SchemaApi apiInstance = new SchemaApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        SchemaWriteBody body = new SchemaWriteBody(); // SchemaWriteBody | 
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
| **body** | [**SchemaWriteBody**](SchemaWriteBody.md)|  | |

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

## schemasWriteWithHttpInfo

> ApiResponse<SchemaWriteResponse> schemasWrite schemasWriteWithHttpInfo(tenantId, body)

write schema

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.ApiResponse;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.SchemaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        SchemaApi apiInstance = new SchemaApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        SchemaWriteBody body = new SchemaWriteBody(); // SchemaWriteBody | 
        try {
            ApiResponse<SchemaWriteResponse> response = apiInstance.schemasWriteWithHttpInfo(tenantId, body);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SchemaApi#schemasWrite");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantId** | **String**| Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes. | |
| **body** | [**SchemaWriteBody**](SchemaWriteBody.md)|  | |

### Return type

ApiResponse<[**SchemaWriteResponse**](SchemaWriteResponse.md)>


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

