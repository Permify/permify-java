# WatchApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**watchWatch**](WatchApi.md#watchWatch) | **POST** /v1/tenants/{tenant_id}/watch | watch changes |



## watchWatch

> StreamResultOfWatchResponse watchWatch(tenantId, body)

watch changes

### Example

```java
// Import classes:
import org.permify.ApiClient;
import org.permify.ApiException;
import org.permify.Configuration;
import org.permify.models.*;
import org.permify.api.WatchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        WatchApi apiInstance = new WatchApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        WatchWatchRequest body = new WatchWatchRequest(); // WatchWatchRequest | 
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
| **body** | [**WatchWatchRequest**](WatchWatchRequest.md)|  | |

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

