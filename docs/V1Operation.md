

# V1Operation

Operation is a message representing a series of operations that can be performed. It includes fields for writing and deleting relationships and attributes.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**relationshipsWrite** | **List&lt;String&gt;** | &#39;relationships_write&#39; is a repeated string field for storing relationship keys that are to be written or created. |  [optional] |
|**relationshipsDelete** | **List&lt;String&gt;** | &#39;relationships_delete&#39; is a repeated string field for storing relationship keys that are to be deleted or removed. |  [optional] |
|**attributesWrite** | **List&lt;String&gt;** | &#39;attributes_write&#39; is a repeated string field for storing attribute keys that are to be written or created. |  [optional] |
|**attributesDelete** | **List&lt;String&gt;** | &#39;attributes_delete&#39; is a repeated string field for storing attribute keys that are to be deleted or removed. |  [optional] |



