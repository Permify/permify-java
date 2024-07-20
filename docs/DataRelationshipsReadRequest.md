

# DataRelationshipsReadRequest

RelationshipReadRequest defines the structure of a request for reading relationships. It contains the necessary information such as tenant_id, metadata, and filter for the read operation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**RelationshipReadRequestMetadata**](RelationshipReadRequestMetadata.md) |  |  [optional] |
|**filter** | [**TupleFilter**](TupleFilter.md) |  |  [optional] |
|**pageSize** | **Long** | page_size specifies the number of results to return in a single page. If more results are available, a continuous_token is included in the response. |  [optional] |
|**continuousToken** | **String** | continuous_token is used in case of paginated reads to get the next page of results. |  [optional] |



