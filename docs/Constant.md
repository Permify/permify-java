

# Constant

Represents a primitive literal.  Named 'Constant' here for backwards compatibility.  This is similar as the primitives supported in the well-known type `google.protobuf.Value`, but richer so it can represent CEL's full range of primitives.  Lists and structs are not included as constants as these aggregate types may contain [Expr][google.api.expr.v1alpha1.Expr] elements which require evaluation and are thus not constant.  Examples of literals include: `\"hello\"`, `b'bytes'`, `1u`, `4.2`, `-2`, `true`, `null`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**nullValue** | **String** | null value. |  [optional] |
|**boolValue** | **Boolean** | boolean value. |  [optional] |
|**int64Value** | **String** | int64 value. |  [optional] |
|**uint64Value** | **String** | uint64 value. |  [optional] |
|**doubleValue** | **Double** | double value. |  [optional] |
|**stringValue** | **String** | string value. |  [optional] |
|**bytesValue** | **byte[]** | bytes value. |  [optional] |
|**durationValue** | **String** | protobuf.Duration value.  Deprecated: duration is no longer considered a builtin cel type. |  [optional] |
|**timestampValue** | **OffsetDateTime** | protobuf.Timestamp value.  Deprecated: timestamp is no longer considered a builtin cel type. |  [optional] |



