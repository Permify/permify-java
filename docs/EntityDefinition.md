

# EntityDefinition

The EntityDefinition message provides detailed information about a specific entity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the entity, which follows a specific string pattern and has a maximum byte size. |  [optional] |
|**relations** | [**Map&lt;String, RelationDefinition&gt;**](RelationDefinition.md) | Map of relation definitions within this entity. The key is the relation name, and the value is the RelationDefinition. |  [optional] |
|**permissions** | [**Map&lt;String, PermissionDefinition&gt;**](PermissionDefinition.md) | Map of permission definitions within this entity. The key is the permission name, and the value is the PermissionDefinition. |  [optional] |
|**attributes** | [**Map&lt;String, AttributeDefinition&gt;**](AttributeDefinition.md) | Map of attribute definitions within this entity. The key is the attribute name, and the value is the AttributeDefinition. |  [optional] |
|**references** | **Map&lt;String, EntityDefinitionReference&gt;** | Map of references indicating whether a string pertains to a relation, permission, or attribute. |  [optional] |



