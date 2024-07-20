

# CreateStruct

A map or message creation expression.  Maps are constructed as `{'key_name': 'value'}`. Message construction is similar, but prefixed with a type name and composed of field ids: `types.MyType{field_id: 'value'}`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**messageName** | **String** | The type name of the message to be created, empty when creating map literals. |  [optional] |
|**entries** | [**List&lt;Entry&gt;**](Entry.md) | The entries in the creation expression. |  [optional] |



