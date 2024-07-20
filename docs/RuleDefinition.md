

# RuleDefinition

The RuleDefinition message provides detailed information about a specific rule.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the rule, which follows a specific string pattern and has a maximum byte size. |  [optional] |
|**arguments** | **Map&lt;String, AttributeType&gt;** | Map of arguments for this rule. The key is the attribute name, and the value is the AttributeType. |  [optional] |
|**expression** | [**CheckedExpr**](CheckedExpr.md) |  |  [optional] |



