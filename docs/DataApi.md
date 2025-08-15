# DataApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bundleRun**](DataApi.md#bundleRun) | **POST** /v1/tenants/{tenant_id}/data/run-bundle | run bundle |
| [**bundleRunWithHttpInfo**](DataApi.md#bundleRunWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/data/run-bundle | run bundle |
| [**dataAttributesRead**](DataApi.md#dataAttributesRead) | **POST** /v1/tenants/{tenant_id}/data/attributes/read | read attributes |
| [**dataAttributesReadWithHttpInfo**](DataApi.md#dataAttributesReadWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/data/attributes/read | read attributes |
| [**dataDelete**](DataApi.md#dataDelete) | **POST** /v1/tenants/{tenant_id}/data/delete | delete data |
| [**dataDeleteWithHttpInfo**](DataApi.md#dataDeleteWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/data/delete | delete data |
| [**dataRelationshipsRead**](DataApi.md#dataRelationshipsRead) | **POST** /v1/tenants/{tenant_id}/data/relationships/read | read relationships |
| [**dataRelationshipsReadWithHttpInfo**](DataApi.md#dataRelationshipsReadWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/data/relationships/read | read relationships |
| [**dataWrite**](DataApi.md#dataWrite) | **POST** /v1/tenants/{tenant_id}/data/write | write data |
| [**dataWriteWithHttpInfo**](DataApi.md#dataWriteWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/data/write | write data |
| [**relationshipsDelete**](DataApi.md#relationshipsDelete) | **POST** /v1/tenants/{tenant_id}/relationships/delete | delete relationships |
| [**relationshipsDeleteWithHttpInfo**](DataApi.md#relationshipsDeleteWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/relationships/delete | delete relationships |
| [**relationshipsWrite**](DataApi.md#relationshipsWrite) | **POST** /v1/tenants/{tenant_id}/relationships/write | write relationships |
| [**relationshipsWriteWithHttpInfo**](DataApi.md#relationshipsWriteWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/relationships/write | write relationships |



## bundleRun

> BundleRunResponse bundleRun(tenantId, body)

run bundle

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.DataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DataApi apiInstance = new DataApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        RunBundleBody body = new RunBundleBody(); // RunBundleBody | 
        try {
            BundleRunResponse result = apiInstance.bundleRun(tenantId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataApi#bundleRun");
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
| **body** | [**RunBundleBody**](RunBundleBody.md)|  | |

### Return type

[**BundleRunResponse**](BundleRunResponse.md)


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

## bundleRunWithHttpInfo

> ApiResponse<BundleRunResponse> bundleRun bundleRunWithHttpInfo(tenantId, body)

run bundle

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.ApiResponse;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.DataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DataApi apiInstance = new DataApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        RunBundleBody body = new RunBundleBody(); // RunBundleBody | 
        try {
            ApiResponse<BundleRunResponse> response = apiInstance.bundleRunWithHttpInfo(tenantId, body);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DataApi#bundleRun");
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
| **body** | [**RunBundleBody**](RunBundleBody.md)|  | |

### Return type

ApiResponse<[**BundleRunResponse**](BundleRunResponse.md)>


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


## dataAttributesRead

> AttributeReadResponse dataAttributesRead(tenantId, body)

read attributes

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.DataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DataApi apiInstance = new DataApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        ReadAttributesBody body = new ReadAttributesBody(); // ReadAttributesBody | 
        try {
            AttributeReadResponse result = apiInstance.dataAttributesRead(tenantId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataApi#dataAttributesRead");
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
| **body** | [**ReadAttributesBody**](ReadAttributesBody.md)|  | |

### Return type

[**AttributeReadResponse**](AttributeReadResponse.md)


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

## dataAttributesReadWithHttpInfo

> ApiResponse<AttributeReadResponse> dataAttributesRead dataAttributesReadWithHttpInfo(tenantId, body)

read attributes

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.ApiResponse;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.DataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DataApi apiInstance = new DataApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        ReadAttributesBody body = new ReadAttributesBody(); // ReadAttributesBody | 
        try {
            ApiResponse<AttributeReadResponse> response = apiInstance.dataAttributesReadWithHttpInfo(tenantId, body);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DataApi#dataAttributesRead");
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
| **body** | [**ReadAttributesBody**](ReadAttributesBody.md)|  | |

### Return type

ApiResponse<[**AttributeReadResponse**](AttributeReadResponse.md)>


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


## dataDelete

> DataDeleteResponse dataDelete(tenantId, body)

delete data

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.DataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DataApi apiInstance = new DataApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        DataDeleteBody body = new DataDeleteBody(); // DataDeleteBody | 
        try {
            DataDeleteResponse result = apiInstance.dataDelete(tenantId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataApi#dataDelete");
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
| **body** | [**DataDeleteBody**](DataDeleteBody.md)|  | |

### Return type

[**DataDeleteResponse**](DataDeleteResponse.md)


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

## dataDeleteWithHttpInfo

> ApiResponse<DataDeleteResponse> dataDelete dataDeleteWithHttpInfo(tenantId, body)

delete data

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.ApiResponse;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.DataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DataApi apiInstance = new DataApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        DataDeleteBody body = new DataDeleteBody(); // DataDeleteBody | 
        try {
            ApiResponse<DataDeleteResponse> response = apiInstance.dataDeleteWithHttpInfo(tenantId, body);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DataApi#dataDelete");
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
| **body** | [**DataDeleteBody**](DataDeleteBody.md)|  | |

### Return type

ApiResponse<[**DataDeleteResponse**](DataDeleteResponse.md)>


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


## dataRelationshipsRead

> RelationshipReadResponse dataRelationshipsRead(tenantId, body)

read relationships

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.DataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DataApi apiInstance = new DataApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        ReadRelationshipsBody body = new ReadRelationshipsBody(); // ReadRelationshipsBody | 
        try {
            RelationshipReadResponse result = apiInstance.dataRelationshipsRead(tenantId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataApi#dataRelationshipsRead");
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
| **body** | [**ReadRelationshipsBody**](ReadRelationshipsBody.md)|  | |

### Return type

[**RelationshipReadResponse**](RelationshipReadResponse.md)


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

## dataRelationshipsReadWithHttpInfo

> ApiResponse<RelationshipReadResponse> dataRelationshipsRead dataRelationshipsReadWithHttpInfo(tenantId, body)

read relationships

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.ApiResponse;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.DataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DataApi apiInstance = new DataApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        ReadRelationshipsBody body = new ReadRelationshipsBody(); // ReadRelationshipsBody | 
        try {
            ApiResponse<RelationshipReadResponse> response = apiInstance.dataRelationshipsReadWithHttpInfo(tenantId, body);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DataApi#dataRelationshipsRead");
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
| **body** | [**ReadRelationshipsBody**](ReadRelationshipsBody.md)|  | |

### Return type

ApiResponse<[**RelationshipReadResponse**](RelationshipReadResponse.md)>


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


## dataWrite

> DataWriteResponse dataWrite(tenantId, body)

write data

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.DataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DataApi apiInstance = new DataApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        DataWriteBody body = new DataWriteBody(); // DataWriteBody | 
        try {
            DataWriteResponse result = apiInstance.dataWrite(tenantId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataApi#dataWrite");
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
| **body** | [**DataWriteBody**](DataWriteBody.md)|  | |

### Return type

[**DataWriteResponse**](DataWriteResponse.md)


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

## dataWriteWithHttpInfo

> ApiResponse<DataWriteResponse> dataWrite dataWriteWithHttpInfo(tenantId, body)

write data

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.ApiResponse;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.DataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DataApi apiInstance = new DataApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        DataWriteBody body = new DataWriteBody(); // DataWriteBody | 
        try {
            ApiResponse<DataWriteResponse> response = apiInstance.dataWriteWithHttpInfo(tenantId, body);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DataApi#dataWrite");
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
| **body** | [**DataWriteBody**](DataWriteBody.md)|  | |

### Return type

ApiResponse<[**DataWriteResponse**](DataWriteResponse.md)>


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


## relationshipsDelete

> RelationshipDeleteResponse relationshipsDelete(tenantId, body)

delete relationships

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.DataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DataApi apiInstance = new DataApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        DeleteRelationshipsBody body = new DeleteRelationshipsBody(); // DeleteRelationshipsBody | 
        try {
            RelationshipDeleteResponse result = apiInstance.relationshipsDelete(tenantId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataApi#relationshipsDelete");
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
| **body** | [**DeleteRelationshipsBody**](DeleteRelationshipsBody.md)|  | |

### Return type

[**RelationshipDeleteResponse**](RelationshipDeleteResponse.md)


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

## relationshipsDeleteWithHttpInfo

> ApiResponse<RelationshipDeleteResponse> relationshipsDelete relationshipsDeleteWithHttpInfo(tenantId, body)

delete relationships

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.ApiResponse;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.DataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DataApi apiInstance = new DataApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        DeleteRelationshipsBody body = new DeleteRelationshipsBody(); // DeleteRelationshipsBody | 
        try {
            ApiResponse<RelationshipDeleteResponse> response = apiInstance.relationshipsDeleteWithHttpInfo(tenantId, body);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DataApi#relationshipsDelete");
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
| **body** | [**DeleteRelationshipsBody**](DeleteRelationshipsBody.md)|  | |

### Return type

ApiResponse<[**RelationshipDeleteResponse**](RelationshipDeleteResponse.md)>


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


## relationshipsWrite

> RelationshipWriteResponse relationshipsWrite(tenantId, body)

write relationships

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.DataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DataApi apiInstance = new DataApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        WriteRelationshipsBody body = new WriteRelationshipsBody(); // WriteRelationshipsBody | 
        try {
            RelationshipWriteResponse result = apiInstance.relationshipsWrite(tenantId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataApi#relationshipsWrite");
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
| **body** | [**WriteRelationshipsBody**](WriteRelationshipsBody.md)|  | |

### Return type

[**RelationshipWriteResponse**](RelationshipWriteResponse.md)


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

## relationshipsWriteWithHttpInfo

> ApiResponse<RelationshipWriteResponse> relationshipsWrite relationshipsWriteWithHttpInfo(tenantId, body)

write relationships

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.ApiResponse;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.DataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DataApi apiInstance = new DataApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        WriteRelationshipsBody body = new WriteRelationshipsBody(); // WriteRelationshipsBody | 
        try {
            ApiResponse<RelationshipWriteResponse> response = apiInstance.relationshipsWriteWithHttpInfo(tenantId, body);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling DataApi#relationshipsWrite");
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
| **body** | [**WriteRelationshipsBody**](WriteRelationshipsBody.md)|  | |

### Return type

ApiResponse<[**RelationshipWriteResponse**](RelationshipWriteResponse.md)>


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

