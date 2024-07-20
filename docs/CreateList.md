

# CreateList

A list creation expression.  Lists may either be homogenous, e.g. `[1, 2, 3]`, or heterogeneous, e.g. `dyn([1, 'hello', 2.0])`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**elements** | [**List&lt;Expr&gt;**](Expr.md) | The elements part of the list. |  [optional] |
|**optionalIndices** | **List&lt;Integer&gt;** | The indices within the elements list which are marked as optional elements.  When an optional-typed value is present, the value it contains is included in the list. If the optional-typed value is absent, the list element is omitted from the CreateList result. |  [optional] |



