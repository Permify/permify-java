

# LookupEntityBody

PermissionLookupEntityRequest is the request message for the LookupEntity method in the Permission service.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**PermissionLookupEntityRequestMetadata**](PermissionLookupEntityRequestMetadata.md) |  |  [optional] |
|**entityType** | **String** | Type of the entity to lookup, required, must start with a letter and can include alphanumeric and underscore, max 64 bytes. |  [optional] |
|**permission** | **String** | Name of the permission to check, required, must start with a letter and can include alphanumeric and underscore, max 64 bytes. |  [optional] |
|**subject** | [**Subject**](Subject.md) |  |  [optional] |
|**context** | [**Context**](Context.md) |  |  [optional] |
|**pageSize** | **Long** | page_size is the number of tenants to be returned in the response. The value should be between 1 and 100. |  [optional] |
|**continuousToken** | **String** | continuous_token is an optional parameter used for pagination. It should be the value received in the previous response. |  [optional] |



