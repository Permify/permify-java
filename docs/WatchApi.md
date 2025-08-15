# WatchApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**watchWatch**](WatchApi.md#watchWatch) | **POST** /v1/tenants/{tenant_id}/watch | watch changes |
| [**watchWatchWithHttpInfo**](WatchApi.md#watchWatchWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/watch | watch changes |



## watchWatch

> StreamResultOfWatchResponse watchWatch(tenantId, body)

watch changes

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.WatchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        WatchApi apiInstance = new WatchApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        WatchBody body = new WatchBody(); // WatchBody | 
        try {
            StreamResultOfWatchResponse result = apiInstance.watchWatch(tenantId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WatchApi#watchWatch");
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
| **body** | [**WatchBody**](WatchBody.md)|  | |

### Return type

[**StreamResultOfWatchResponse**](StreamResultOfWatchResponse.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response.(streaming responses) |  -  |
| **0** | An unexpected error response. |  -  |

## watchWatchWithHttpInfo

> ApiResponse<StreamResultOfWatchResponse> watchWatch watchWatchWithHttpInfo(tenantId, body)

watch changes

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.ApiResponse;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.WatchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        WatchApi apiInstance = new WatchApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        WatchBody body = new WatchBody(); // WatchBody | 
        try {
            ApiResponse<StreamResultOfWatchResponse> response = apiInstance.watchWatchWithHttpInfo(tenantId, body);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling WatchApi#watchWatch");
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
| **body** | [**WatchBody**](WatchBody.md)|  | |

### Return type

ApiResponse<[**StreamResultOfWatchResponse**](StreamResultOfWatchResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response.(streaming responses) |  -  |
| **0** | An unexpected error response. |  -  |

