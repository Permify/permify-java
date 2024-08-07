

# PermissionsCheckRequest

PermissionCheckRequest is the request message for the Check method in the Permission service.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**PermissionCheckRequestMetadata**](PermissionCheckRequestMetadata.md) |  |  [optional] |
|**entity** | [**Entity**](Entity.md) |  |  [optional] |
|**permission** | **String** | The action the user wants to perform on the resource |  [optional] |
|**subject** | [**Subject**](Subject.md) |  |  [optional] |
|**context** | [**Context**](Context.md) |  |  [optional] |
|**arguments** | [**List&lt;Argument&gt;**](Argument.md) | Additional arguments associated with this request. |  [optional] |



