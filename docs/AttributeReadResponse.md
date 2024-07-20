

# AttributeReadResponse

AttributeReadResponse defines the structure of the response to an attribute read request. It includes the attributes retrieved and a continuous token for handling result pagination.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributes** | [**List&lt;Attribute&gt;**](Attribute.md) | attributes is a list of the attributes retrieved in the read operation. |  [optional] |
|**continuousToken** | **String** | continuous_token is used in the case of paginated reads to retrieve the next page of results. |  [optional] |



