# HealthApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**healthCheck**](HealthApi.md#healthCheck) | **GET** /healthz | health api |
| [**healthCheckWithHttpInfo**](HealthApi.md#healthCheckWithHttpInfo) | **GET** /healthz | health api |



## healthCheck

> HealthResponse healthCheck()

health api

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.HealthApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        HealthApi apiInstance = new HealthApi(defaultClient);
        try {
            HealthResponse result = apiInstance.healthCheck();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HealthApi#healthCheck");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**HealthResponse**](HealthResponse.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

## healthCheckWithHttpInfo

> ApiResponse<HealthResponse> healthCheck healthCheckWithHttpInfo()

health api

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.ApiResponse;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.HealthApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        HealthApi apiInstance = new HealthApi(defaultClient);
        try {
            ApiResponse<HealthResponse> response = apiInstance.healthCheckWithHttpInfo();
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling HealthApi#healthCheck");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

ApiResponse<[**HealthResponse**](HealthResponse.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

