# PermissionApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**permissionsCheck**](PermissionApi.md#permissionsCheck) | **POST** /v1/tenants/{tenant_id}/permissions/check | check api |
| [**permissionsCheckWithHttpInfo**](PermissionApi.md#permissionsCheckWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/permissions/check | check api |
| [**permissionsExpand**](PermissionApi.md#permissionsExpand) | **POST** /v1/tenants/{tenant_id}/permissions/expand | expand api |
| [**permissionsExpandWithHttpInfo**](PermissionApi.md#permissionsExpandWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/permissions/expand | expand api |
| [**permissionsLookupEntity**](PermissionApi.md#permissionsLookupEntity) | **POST** /v1/tenants/{tenant_id}/permissions/lookup-entity | lookup entity |
| [**permissionsLookupEntityWithHttpInfo**](PermissionApi.md#permissionsLookupEntityWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/permissions/lookup-entity | lookup entity |
| [**permissionsLookupEntityStream**](PermissionApi.md#permissionsLookupEntityStream) | **POST** /v1/tenants/{tenant_id}/permissions/lookup-entity-stream | lookup entity stream |
| [**permissionsLookupEntityStreamWithHttpInfo**](PermissionApi.md#permissionsLookupEntityStreamWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/permissions/lookup-entity-stream | lookup entity stream |
| [**permissionsLookupSubject**](PermissionApi.md#permissionsLookupSubject) | **POST** /v1/tenants/{tenant_id}/permissions/lookup-subject | lookup-subject |
| [**permissionsLookupSubjectWithHttpInfo**](PermissionApi.md#permissionsLookupSubjectWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/permissions/lookup-subject | lookup-subject |
| [**permissionsSubjectPermission**](PermissionApi.md#permissionsSubjectPermission) | **POST** /v1/tenants/{tenant_id}/permissions/subject-permission | subject permission |
| [**permissionsSubjectPermissionWithHttpInfo**](PermissionApi.md#permissionsSubjectPermissionWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/permissions/subject-permission | subject permission |



## permissionsCheck

> PermissionCheckResponse permissionsCheck(tenantId, body)

check api

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.PermissionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PermissionApi apiInstance = new PermissionApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        CheckBody body = new CheckBody(); // CheckBody | 
        try {
            PermissionCheckResponse result = apiInstance.permissionsCheck(tenantId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PermissionApi#permissionsCheck");
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
| **body** | [**CheckBody**](CheckBody.md)|  | |

### Return type

[**PermissionCheckResponse**](PermissionCheckResponse.md)


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

## permissionsCheckWithHttpInfo

> ApiResponse<PermissionCheckResponse> permissionsCheck permissionsCheckWithHttpInfo(tenantId, body)

check api

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.ApiResponse;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.PermissionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PermissionApi apiInstance = new PermissionApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        CheckBody body = new CheckBody(); // CheckBody | 
        try {
            ApiResponse<PermissionCheckResponse> response = apiInstance.permissionsCheckWithHttpInfo(tenantId, body);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PermissionApi#permissionsCheck");
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
| **body** | [**CheckBody**](CheckBody.md)|  | |

### Return type

ApiResponse<[**PermissionCheckResponse**](PermissionCheckResponse.md)>


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


## permissionsExpand

> PermissionExpandResponse permissionsExpand(tenantId, body)

expand api

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.PermissionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PermissionApi apiInstance = new PermissionApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        PermissionExpandBody body = new PermissionExpandBody(); // PermissionExpandBody | 
        try {
            PermissionExpandResponse result = apiInstance.permissionsExpand(tenantId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PermissionApi#permissionsExpand");
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
| **body** | [**PermissionExpandBody**](PermissionExpandBody.md)|  | |

### Return type

[**PermissionExpandResponse**](PermissionExpandResponse.md)


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

## permissionsExpandWithHttpInfo

> ApiResponse<PermissionExpandResponse> permissionsExpand permissionsExpandWithHttpInfo(tenantId, body)

expand api

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.ApiResponse;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.PermissionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PermissionApi apiInstance = new PermissionApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        PermissionExpandBody body = new PermissionExpandBody(); // PermissionExpandBody | 
        try {
            ApiResponse<PermissionExpandResponse> response = apiInstance.permissionsExpandWithHttpInfo(tenantId, body);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PermissionApi#permissionsExpand");
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
| **body** | [**PermissionExpandBody**](PermissionExpandBody.md)|  | |

### Return type

ApiResponse<[**PermissionExpandResponse**](PermissionExpandResponse.md)>


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


## permissionsLookupEntity

> PermissionLookupEntityResponse permissionsLookupEntity(tenantId, body)

lookup entity

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.PermissionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PermissionApi apiInstance = new PermissionApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        LookupEntityBody body = new LookupEntityBody(); // LookupEntityBody | 
        try {
            PermissionLookupEntityResponse result = apiInstance.permissionsLookupEntity(tenantId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PermissionApi#permissionsLookupEntity");
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
| **body** | [**LookupEntityBody**](LookupEntityBody.md)|  | |

### Return type

[**PermissionLookupEntityResponse**](PermissionLookupEntityResponse.md)


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

## permissionsLookupEntityWithHttpInfo

> ApiResponse<PermissionLookupEntityResponse> permissionsLookupEntity permissionsLookupEntityWithHttpInfo(tenantId, body)

lookup entity

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.ApiResponse;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.PermissionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PermissionApi apiInstance = new PermissionApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        LookupEntityBody body = new LookupEntityBody(); // LookupEntityBody | 
        try {
            ApiResponse<PermissionLookupEntityResponse> response = apiInstance.permissionsLookupEntityWithHttpInfo(tenantId, body);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PermissionApi#permissionsLookupEntity");
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
| **body** | [**LookupEntityBody**](LookupEntityBody.md)|  | |

### Return type

ApiResponse<[**PermissionLookupEntityResponse**](PermissionLookupEntityResponse.md)>


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


## permissionsLookupEntityStream

> StreamResultOfPermissionLookupEntityStreamResponse permissionsLookupEntityStream(tenantId, body)

lookup entity stream

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.PermissionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PermissionApi apiInstance = new PermissionApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        LookupEntityStreamBody body = new LookupEntityStreamBody(); // LookupEntityStreamBody | 
        try {
            StreamResultOfPermissionLookupEntityStreamResponse result = apiInstance.permissionsLookupEntityStream(tenantId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PermissionApi#permissionsLookupEntityStream");
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
| **body** | [**LookupEntityStreamBody**](LookupEntityStreamBody.md)|  | |

### Return type

[**StreamResultOfPermissionLookupEntityStreamResponse**](StreamResultOfPermissionLookupEntityStreamResponse.md)


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

## permissionsLookupEntityStreamWithHttpInfo

> ApiResponse<StreamResultOfPermissionLookupEntityStreamResponse> permissionsLookupEntityStream permissionsLookupEntityStreamWithHttpInfo(tenantId, body)

lookup entity stream

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.ApiResponse;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.PermissionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PermissionApi apiInstance = new PermissionApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        LookupEntityStreamBody body = new LookupEntityStreamBody(); // LookupEntityStreamBody | 
        try {
            ApiResponse<StreamResultOfPermissionLookupEntityStreamResponse> response = apiInstance.permissionsLookupEntityStreamWithHttpInfo(tenantId, body);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PermissionApi#permissionsLookupEntityStream");
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
| **body** | [**LookupEntityStreamBody**](LookupEntityStreamBody.md)|  | |

### Return type

ApiResponse<[**StreamResultOfPermissionLookupEntityStreamResponse**](StreamResultOfPermissionLookupEntityStreamResponse.md)>


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


## permissionsLookupSubject

> PermissionLookupSubjectResponse permissionsLookupSubject(tenantId, body)

lookup-subject

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.PermissionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PermissionApi apiInstance = new PermissionApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        LookupSubjectBody body = new LookupSubjectBody(); // LookupSubjectBody | 
        try {
            PermissionLookupSubjectResponse result = apiInstance.permissionsLookupSubject(tenantId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PermissionApi#permissionsLookupSubject");
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
| **body** | [**LookupSubjectBody**](LookupSubjectBody.md)|  | |

### Return type

[**PermissionLookupSubjectResponse**](PermissionLookupSubjectResponse.md)


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

## permissionsLookupSubjectWithHttpInfo

> ApiResponse<PermissionLookupSubjectResponse> permissionsLookupSubject permissionsLookupSubjectWithHttpInfo(tenantId, body)

lookup-subject

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.ApiResponse;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.PermissionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PermissionApi apiInstance = new PermissionApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        LookupSubjectBody body = new LookupSubjectBody(); // LookupSubjectBody | 
        try {
            ApiResponse<PermissionLookupSubjectResponse> response = apiInstance.permissionsLookupSubjectWithHttpInfo(tenantId, body);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PermissionApi#permissionsLookupSubject");
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
| **body** | [**LookupSubjectBody**](LookupSubjectBody.md)|  | |

### Return type

ApiResponse<[**PermissionLookupSubjectResponse**](PermissionLookupSubjectResponse.md)>


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


## permissionsSubjectPermission

> PermissionSubjectPermissionResponse permissionsSubjectPermission(tenantId, body)

subject permission

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.PermissionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PermissionApi apiInstance = new PermissionApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        SubjectPermissionBody body = new SubjectPermissionBody(); // SubjectPermissionBody | 
        try {
            PermissionSubjectPermissionResponse result = apiInstance.permissionsSubjectPermission(tenantId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PermissionApi#permissionsSubjectPermission");
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
| **body** | [**SubjectPermissionBody**](SubjectPermissionBody.md)|  | |

### Return type

[**PermissionSubjectPermissionResponse**](PermissionSubjectPermissionResponse.md)


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

## permissionsSubjectPermissionWithHttpInfo

> ApiResponse<PermissionSubjectPermissionResponse> permissionsSubjectPermission permissionsSubjectPermissionWithHttpInfo(tenantId, body)

subject permission

### Example

```java
// Import classes:
import co.permify.sdk.client.ApiClient;
import co.permify.sdk.client.ApiException;
import co.permify.sdk.client.ApiResponse;
import co.permify.sdk.client.Configuration;
import co.permify.sdk.client.models.*;
import co.permify.sdk.api.PermissionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PermissionApi apiInstance = new PermissionApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        SubjectPermissionBody body = new SubjectPermissionBody(); // SubjectPermissionBody | 
        try {
            ApiResponse<PermissionSubjectPermissionResponse> response = apiInstance.permissionsSubjectPermissionWithHttpInfo(tenantId, body);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling PermissionApi#permissionsSubjectPermission");
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
| **body** | [**SubjectPermissionBody**](SubjectPermissionBody.md)|  | |

### Return type

ApiResponse<[**PermissionSubjectPermissionResponse**](PermissionSubjectPermissionResponse.md)>


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

