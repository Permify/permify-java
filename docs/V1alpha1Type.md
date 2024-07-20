

# V1alpha1Type

Represents a CEL type.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dyn** | **Object** | Dynamic type. |  [optional] |
|**_null** | **String** | Null value. |  [optional] |
|**primitive** | **PrimitiveType** |  |  [optional] |
|**wrapper** | **PrimitiveType** |  |  [optional] |
|**wellKnown** | **WellKnownType** |  |  [optional] |
|**listType** | [**ListType**](ListType.md) |  |  [optional] |
|**mapType** | [**MapType**](MapType.md) |  |  [optional] |
|**function** | [**FunctionType**](FunctionType.md) |  |  [optional] |
|**messageType** | **String** | Protocol buffer message type.  The &#x60;message_type&#x60; string specifies the qualified message type name. For example, &#x60;google.plus.Profile&#x60;. |  [optional] |
|**typeParam** | **String** | Type param type.  The &#x60;type_param&#x60; string specifies the type parameter name, e.g. &#x60;list&lt;E&gt;&#x60; would be a &#x60;list_type&#x60; whose element type was a &#x60;type_param&#x60; type named &#x60;E&#x60;. |  [optional] |
|**type** | [**V1alpha1Type**](V1alpha1Type.md) |  |  [optional] |
|**error** | **Object** | Error type.  During type-checking if an expression is an error, its type is propagated as the &#x60;ERROR&#x60; type. This permits the type-checker to discover other errors present in the expression. |  [optional] |
|**abstractType** | [**AbstractType**](AbstractType.md) |  |  [optional] |



