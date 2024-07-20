

# DataBundle

DataBundle is a message representing a bundle of data, which includes a name, a list of arguments, and a series of operations.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | &#39;name&#39; is a simple string field representing the name of the DataBundle. |  [optional] |
|**arguments** | **List&lt;String&gt;** | &#39;arguments&#39; is a repeated field, which means it can contain multiple strings. These are used to store a list of arguments related to the DataBundle. |  [optional] |
|**operations** | [**List&lt;V1Operation&gt;**](V1Operation.md) | &#39;operations&#39; is a repeated field containing multiple Operation messages. Each Operation represents a specific action or set of actions to be performed. |  [optional] |



