# DataApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bundleRun**](DataApi.md#bundleRun) | **POST** /v1/tenants/{tenant_id}/data/run-bundle | run bundle |
| [**dataAttributesRead**](DataApi.md#dataAttributesRead) | **POST** /v1/tenants/{tenant_id}/data/attributes/read | read attributes |
| [**dataDelete**](DataApi.md#dataDelete) | **POST** /v1/tenants/{tenant_id}/data/delete | delete data |
| [**dataRelationshipsRead**](DataApi.md#dataRelationshipsRead) | **POST** /v1/tenants/{tenant_id}/data/relationships/read | read relationships |
| [**dataWrite**](DataApi.md#dataWrite) | **POST** /v1/tenants/{tenant_id}/data/write | write data |
| [**relationshipsDelete**](DataApi.md#relationshipsDelete) | **POST** /v1/tenants/{tenant_id}/relationships/delete | delete relationships |
| [**relationshipsWrite**](DataApi.md#relationshipsWrite) | **POST** /v1/tenants/{tenant_id}/relationships/write | write relationships |



## bundleRun

> BundleRunResponse bundleRun(tenantId, body)

run bundle

### Example

```java
// Import classes:
import org.permify.ApiClient;
import org.permify.ApiException;
import org.permify.Configuration;
import org.permify.models.*;
import org.permify.api.DataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DataApi apiInstance = new DataApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        BundleRunRequest body = new BundleRunRequest(); // BundleRunRequest | 
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
| **body** | [**BundleRunRequest**](BundleRunRequest.md)|  | |

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


## dataAttributesRead

> AttributeReadResponse dataAttributesRead(tenantId, body)

read attributes

### Example

```java
// Import classes:
import org.permify.ApiClient;
import org.permify.ApiException;
import org.permify.Configuration;
import org.permify.models.*;
import org.permify.api.DataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DataApi apiInstance = new DataApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        DataAttributesReadRequest body = new DataAttributesReadRequest(); // DataAttributesReadRequest | 
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
| **body** | [**DataAttributesReadRequest**](DataAttributesReadRequest.md)|  | |

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


## dataDelete

> DataDeleteResponse dataDelete(tenantId, body)

delete data

### Example

```java
// Import classes:
import org.permify.ApiClient;
import org.permify.ApiException;
import org.permify.Configuration;
import org.permify.models.*;
import org.permify.api.DataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DataApi apiInstance = new DataApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        DataDeleteRequest body = new DataDeleteRequest(); // DataDeleteRequest | 
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
| **body** | [**DataDeleteRequest**](DataDeleteRequest.md)|  | |

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


## dataRelationshipsRead

> RelationshipReadResponse dataRelationshipsRead(tenantId, body)

read relationships

### Example

```java
// Import classes:
import org.permify.ApiClient;
import org.permify.ApiException;
import org.permify.Configuration;
import org.permify.models.*;
import org.permify.api.DataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DataApi apiInstance = new DataApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        DataRelationshipsReadRequest body = new DataRelationshipsReadRequest(); // DataRelationshipsReadRequest | 
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
| **body** | [**DataRelationshipsReadRequest**](DataRelationshipsReadRequest.md)|  | |

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


## dataWrite

> DataWriteResponse dataWrite(tenantId, body)

write data

### Example

```java
// Import classes:
import org.permify.ApiClient;
import org.permify.ApiException;
import org.permify.Configuration;
import org.permify.models.*;
import org.permify.api.DataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DataApi apiInstance = new DataApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        DataWriteRequest body = new DataWriteRequest(); // DataWriteRequest | 
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
| **body** | [**DataWriteRequest**](DataWriteRequest.md)|  | |

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


## relationshipsDelete

> RelationshipDeleteResponse relationshipsDelete(tenantId, body)

delete relationships

### Example

```java
// Import classes:
import org.permify.ApiClient;
import org.permify.ApiException;
import org.permify.Configuration;
import org.permify.models.*;
import org.permify.api.DataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DataApi apiInstance = new DataApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        RelationshipDeleteRequest body = new RelationshipDeleteRequest(); // RelationshipDeleteRequest | 
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
| **body** | [**RelationshipDeleteRequest**](RelationshipDeleteRequest.md)|  | |

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


## relationshipsWrite

> RelationshipWriteResponse relationshipsWrite(tenantId, body)

write relationships

### Example

```java
// Import classes:
import org.permify.ApiClient;
import org.permify.ApiException;
import org.permify.Configuration;
import org.permify.models.*;
import org.permify.api.DataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DataApi apiInstance = new DataApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        RelationshipsWriteRequest body = new RelationshipsWriteRequest(); // RelationshipsWriteRequest | 
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
| **body** | [**RelationshipsWriteRequest**](RelationshipsWriteRequest.md)|  | |

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

