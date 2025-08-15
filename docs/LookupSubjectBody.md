

# LookupSubjectBody

PermissionLookupSubjectRequest is the request message for the LookupSubject method in the Permission service.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**metadata** | [**PermissionLookupSubjectRequestMetadata**](PermissionLookupSubjectRequestMetadata.md) |  |  [optional] |
|**entity** | [**Entity**](Entity.md) |  |  [optional] |
|**permission** | **String** | Permission to be checked, can be a permission or relation. Required, and must match the pattern \&quot;^([a-zA-Z][a-zA-Z0-9_]{1,62}[a-zA-Z0-9])$\&quot;, max 64 bytes. |  [optional] |
|**subjectReference** | [**RelationReference**](RelationReference.md) |  |  [optional] |
|**context** | [**Context**](Context.md) |  |  [optional] |
|**pageSize** | **Long** | page_size is the number of tenants to be returned in the response. The value should be between 1 and 100. |  [optional] |
|**continuousToken** | **String** | continuous_token is an optional parameter used for pagination. It should be the value received in the previous response. |  [optional] |



