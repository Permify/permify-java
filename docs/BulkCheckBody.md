

# BulkCheckBody

PermissionBulkCheckRequest is the request message for the BulkCheck method in the Permission service.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**PermissionCheckRequestMetadata**](PermissionCheckRequestMetadata.md) |  |  [optional] |
|**items** | [**List&lt;PermissionBulkCheckRequestItem&gt;**](PermissionBulkCheckRequestItem.md) | List of permission check requests, maximum 100 items. |  [optional] |
|**context** | [**Context**](Context.md) |  |  [optional] |
|**arguments** | [**List&lt;Argument&gt;**](Argument.md) | Additional arguments associated with this request. |  [optional] |



