# BundleApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bundleDelete**](BundleApi.md#bundleDelete) | **POST** /v1/tenants/{tenant_id}/bundle/delete | delete bundle |
| [**bundleDeleteWithHttpInfo**](BundleApi.md#bundleDeleteWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/bundle/delete | delete bundle |
| [**bundleRead**](BundleApi.md#bundleRead) | **POST** /v1/tenants/{tenant_id}/bundle/read | read bundle |
| [**bundleReadWithHttpInfo**](BundleApi.md#bundleReadWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/bundle/read | read bundle |
| [**bundleWrite**](BundleApi.md#bundleWrite) | **POST** /v1/tenants/{tenant_id}/bundle/write | write bundle |
| [**bundleWriteWithHttpInfo**](BundleApi.md#bundleWriteWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/bundle/write | write bundle |



## bundleDelete

> BundleDeleteResponse bundleDelete(tenantId, body)

delete bundle

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.BundleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        BundleApi apiInstance = new BundleApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        BundleDeleteBody body = new BundleDeleteBody(); // BundleDeleteBody | 
        try {
            BundleDeleteResponse result = apiInstance.bundleDelete(tenantId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BundleApi#bundleDelete");
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
| **body** | [**BundleDeleteBody**](BundleDeleteBody.md)|  | |

### Return type

[**BundleDeleteResponse**](BundleDeleteResponse.md)


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

## bundleDeleteWithHttpInfo

> ApiResponse<BundleDeleteResponse> bundleDelete bundleDeleteWithHttpInfo(tenantId, body)

delete bundle

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.ApiResponse;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.BundleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        BundleApi apiInstance = new BundleApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        BundleDeleteBody body = new BundleDeleteBody(); // BundleDeleteBody | 
        try {
            ApiResponse<BundleDeleteResponse> response = apiInstance.bundleDeleteWithHttpInfo(tenantId, body);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling BundleApi#bundleDelete");
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
| **body** | [**BundleDeleteBody**](BundleDeleteBody.md)|  | |

### Return type

ApiResponse<[**BundleDeleteResponse**](BundleDeleteResponse.md)>


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


## bundleRead

> BundleReadResponse bundleRead(tenantId, body)

read bundle

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.BundleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        BundleApi apiInstance = new BundleApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        BundleReadBody body = new BundleReadBody(); // BundleReadBody | 
        try {
            BundleReadResponse result = apiInstance.bundleRead(tenantId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BundleApi#bundleRead");
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
| **body** | [**BundleReadBody**](BundleReadBody.md)|  | |

### Return type

[**BundleReadResponse**](BundleReadResponse.md)


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

## bundleReadWithHttpInfo

> ApiResponse<BundleReadResponse> bundleRead bundleReadWithHttpInfo(tenantId, body)

read bundle

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.ApiResponse;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.BundleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        BundleApi apiInstance = new BundleApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        BundleReadBody body = new BundleReadBody(); // BundleReadBody | 
        try {
            ApiResponse<BundleReadResponse> response = apiInstance.bundleReadWithHttpInfo(tenantId, body);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling BundleApi#bundleRead");
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
| **body** | [**BundleReadBody**](BundleReadBody.md)|  | |

### Return type

ApiResponse<[**BundleReadResponse**](BundleReadResponse.md)>


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


## bundleWrite

> BundleWriteResponse bundleWrite(tenantId, body)

write bundle

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.BundleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        BundleApi apiInstance = new BundleApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        BundleWriteBody body = new BundleWriteBody(); // BundleWriteBody | 
        try {
            BundleWriteResponse result = apiInstance.bundleWrite(tenantId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BundleApi#bundleWrite");
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
| **body** | [**BundleWriteBody**](BundleWriteBody.md)|  | |

### Return type

[**BundleWriteResponse**](BundleWriteResponse.md)


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

## bundleWriteWithHttpInfo

> ApiResponse<BundleWriteResponse> bundleWrite bundleWriteWithHttpInfo(tenantId, body)

write bundle

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.ApiResponse;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.BundleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        BundleApi apiInstance = new BundleApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        BundleWriteBody body = new BundleWriteBody(); // BundleWriteBody | 
        try {
            ApiResponse<BundleWriteResponse> response = apiInstance.bundleWriteWithHttpInfo(tenantId, body);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling BundleApi#bundleWrite");
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
| **body** | [**BundleWriteBody**](BundleWriteBody.md)|  | |

### Return type

ApiResponse<[**BundleWriteResponse**](BundleWriteResponse.md)>


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

