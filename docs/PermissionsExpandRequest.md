

# PermissionsExpandRequest

PermissionExpandRequest is the request message for the Expand method in the Permission service.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**PermissionExpandRequestMetadata**](PermissionExpandRequestMetadata.md) |  |  [optional] |
|**entity** | [**Entity**](Entity.md) |  |  [optional] |
|**permission** | **String** | Name of the permission to be expanded, not required, must start with a letter and can include alphanumeric and underscore, max 64 bytes. |  [optional] |
|**context** | [**Context**](Context.md) |  |  [optional] |
|**arguments** | [**List&lt;Argument&gt;**](Argument.md) | Additional arguments associated with this request. |  [optional] |



