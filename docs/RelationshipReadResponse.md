

# RelationshipReadResponse

RelationshipReadResponse defines the structure of the response after reading relationships. It includes the tuples representing the relationships and a continuous token for handling result pagination.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tuples** | [**List&lt;Tuple&gt;**](Tuple.md) | tuples is a list of the relationships retrieved in the read operation, represented as entity-relation-entity triples. |  [optional] |
|**continuousToken** | **String** | continuous_token is used in the case of paginated reads to retrieve the next page of results. |  [optional] |



