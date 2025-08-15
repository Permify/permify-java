# TenancyApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**tenantsCreate**](TenancyApi.md#tenantsCreate) | **POST** /v1/tenants/create | create tenant |
| [**tenantsCreateWithHttpInfo**](TenancyApi.md#tenantsCreateWithHttpInfo) | **POST** /v1/tenants/create | create tenant |
| [**tenantsDelete**](TenancyApi.md#tenantsDelete) | **DELETE** /v1/tenants/{id} | delete tenant |
| [**tenantsDeleteWithHttpInfo**](TenancyApi.md#tenantsDeleteWithHttpInfo) | **DELETE** /v1/tenants/{id} | delete tenant |
| [**tenantsList**](TenancyApi.md#tenantsList) | **POST** /v1/tenants/list | list tenants |
| [**tenantsListWithHttpInfo**](TenancyApi.md#tenantsListWithHttpInfo) | **POST** /v1/tenants/list | list tenants |



## tenantsCreate

> TenantCreateResponse tenantsCreate(body)

create tenant

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.TenancyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TenancyApi apiInstance = new TenancyApi(defaultClient);
        TenantCreateRequest body = new TenantCreateRequest(); // TenantCreateRequest | TenantCreateRequest is the message used for the request to create a tenant.
        try {
            TenantCreateResponse result = apiInstance.tenantsCreate(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TenancyApi#tenantsCreate");
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
| **body** | [**TenantCreateRequest**](TenantCreateRequest.md)| TenantCreateRequest is the message used for the request to create a tenant. | |

### Return type

[**TenantCreateResponse**](TenantCreateResponse.md)


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

## tenantsCreateWithHttpInfo

> ApiResponse<TenantCreateResponse> tenantsCreate tenantsCreateWithHttpInfo(body)

create tenant

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.ApiResponse;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.TenancyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TenancyApi apiInstance = new TenancyApi(defaultClient);
        TenantCreateRequest body = new TenantCreateRequest(); // TenantCreateRequest | TenantCreateRequest is the message used for the request to create a tenant.
        try {
            ApiResponse<TenantCreateResponse> response = apiInstance.tenantsCreateWithHttpInfo(body);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TenancyApi#tenantsCreate");
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
| **body** | [**TenantCreateRequest**](TenantCreateRequest.md)| TenantCreateRequest is the message used for the request to create a tenant. | |

### Return type

ApiResponse<[**TenantCreateResponse**](TenantCreateResponse.md)>


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


## tenantsDelete

> TenantDeleteResponse tenantsDelete(id)

delete tenant

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.TenancyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TenancyApi apiInstance = new TenancyApi(defaultClient);
        String id = "id_example"; // String | id is the unique identifier of the tenant to be deleted.
        try {
            TenantDeleteResponse result = apiInstance.tenantsDelete(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TenancyApi#tenantsDelete");
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
| **id** | **String**| id is the unique identifier of the tenant to be deleted. | |

### Return type

[**TenantDeleteResponse**](TenantDeleteResponse.md)


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

## tenantsDeleteWithHttpInfo

> ApiResponse<TenantDeleteResponse> tenantsDelete tenantsDeleteWithHttpInfo(id)

delete tenant

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.ApiResponse;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.TenancyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TenancyApi apiInstance = new TenancyApi(defaultClient);
        String id = "id_example"; // String | id is the unique identifier of the tenant to be deleted.
        try {
            ApiResponse<TenantDeleteResponse> response = apiInstance.tenantsDeleteWithHttpInfo(id);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TenancyApi#tenantsDelete");
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
| **id** | **String**| id is the unique identifier of the tenant to be deleted. | |

### Return type

ApiResponse<[**TenantDeleteResponse**](TenantDeleteResponse.md)>


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


## tenantsList

> TenantListResponse tenantsList(body)

list tenants

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.TenancyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TenancyApi apiInstance = new TenancyApi(defaultClient);
        TenantListRequest body = new TenantListRequest(); // TenantListRequest | TenantListRequest is the message used for the request to list all tenants.
        try {
            TenantListResponse result = apiInstance.tenantsList(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TenancyApi#tenantsList");
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
| **body** | [**TenantListRequest**](TenantListRequest.md)| TenantListRequest is the message used for the request to list all tenants. | |

### Return type

[**TenantListResponse**](TenantListResponse.md)


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

## tenantsListWithHttpInfo

> ApiResponse<TenantListResponse> tenantsList tenantsListWithHttpInfo(body)

list tenants

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.ApiResponse;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.TenancyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        TenancyApi apiInstance = new TenancyApi(defaultClient);
        TenantListRequest body = new TenantListRequest(); // TenantListRequest | TenantListRequest is the message used for the request to list all tenants.
        try {
            ApiResponse<TenantListResponse> response = apiInstance.tenantsListWithHttpInfo(body);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling TenancyApi#tenantsList");
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
| **body** | [**TenantListRequest**](TenantListRequest.md)| TenantListRequest is the message used for the request to list all tenants. | |

### Return type

ApiResponse<[**TenantListResponse**](TenantListResponse.md)>


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

