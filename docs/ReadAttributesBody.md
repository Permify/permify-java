

# ReadAttributesBody

AttributeReadRequest defines the structure of a request for reading attributes. It includes the tenant_id, metadata, attribute filter, page size for pagination, and a continuous token for multi-page results.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**AttributeReadRequestMetadata**](AttributeReadRequestMetadata.md) |  |  [optional] |
|**filter** | [**AttributeFilter**](AttributeFilter.md) |  |  [optional] |
|**pageSize** | **Long** | page_size specifies the number of results to return in a single page. If more results are available, a continuous_token is included in the response. |  [optional] |
|**continuousToken** | **String** | continuous_token is used in case of paginated reads to get the next page of results. |  [optional] |



