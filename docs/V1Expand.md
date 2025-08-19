

# V1Expand

Expand is used to define a hierarchical structure for permissions. It has an entity, permission, and arguments. The node can be either another hierarchical structure or a set of subjects.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entity** | [**Entity**](Entity.md) |  |  [optional] |
|**permission** | **String** | permission is the permission applied to the entity. |  [optional] |
|**arguments** | [**List&lt;Argument&gt;**](Argument.md) | arguments are the additional information or context used to evaluate permissions. |  [optional] |
|**expand** | [**ExpandTreeNode**](ExpandTreeNode.md) |  |  [optional] |
|**leaf** | [**ExpandLeaf**](ExpandLeaf.md) |  |  [optional] |



