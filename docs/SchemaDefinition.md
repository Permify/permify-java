

# SchemaDefinition

The SchemaDefinition message provides definitions for entities and rules, and includes references to clarify whether a name refers to an entity or a rule.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entityDefinitions** | [**Map&lt;String, EntityDefinition&gt;**](EntityDefinition.md) | Map of entity definitions. The key is the entity name, and the value is the corresponding EntityDefinition. |  [optional] |
|**ruleDefinitions** | [**Map&lt;String, RuleDefinition&gt;**](RuleDefinition.md) | Map of rule definitions. The key is the rule name, and the value is the corresponding RuleDefinition. |  [optional] |
|**references** | **Map&lt;String, SchemaDefinitionReference&gt;** | Map of references to signify whether a string refers to an entity or a rule. |  [optional] |



