# TenancyApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**tenantsCreate**](TenancyApi.md#tenantsCreate) | **POST** /v1/tenants/create | create tenant |
| [**tenantsDelete**](TenancyApi.md#tenantsDelete) | **DELETE** /v1/tenants/{id} | delete tenant |
| [**tenantsList**](TenancyApi.md#tenantsList) | **POST** /v1/tenants/list | list tenants |



## tenantsCreate

> TenantCreateResponse tenantsCreate(body)

create tenant

### Example

```java
// Import classes:
import org.permify.ApiClient;
import org.permify.ApiException;
import org.permify.Configuration;
import org.permify.models.*;
import org.permify.api.TenancyApi;

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


## tenantsDelete

> TenantDeleteResponse tenantsDelete(id)

delete tenant

### Example

```java
// Import classes:
import org.permify.ApiClient;
import org.permify.ApiException;
import org.permify.Configuration;
import org.permify.models.*;
import org.permify.api.TenancyApi;

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


## tenantsList

> TenantListResponse tenantsList(body)

list tenants

### Example

```java
// Import classes:
import org.permify.ApiClient;
import org.permify.ApiException;
import org.permify.Configuration;
import org.permify.models.*;
import org.permify.api.TenancyApi;

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

