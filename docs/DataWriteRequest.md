

# DataWriteRequest

DataWriteRequest defines the structure of a request for writing data. It contains the necessary information such as tenant_id, metadata, tuples and attributes for the write operation.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**DataWriteRequestMetadata**](DataWriteRequestMetadata.md) |  |  [optional] |
|**tuples** | [**List&lt;Tuple&gt;**](Tuple.md) | tuples contains the list of tuples (entity-relation-entity triples) that need to be written. |  [optional] |
|**attributes** | [**List&lt;Attribute&gt;**](Attribute.md) | attributes contains the list of attributes (entity-attribute-value triples) that need to be written. |  [optional] |



