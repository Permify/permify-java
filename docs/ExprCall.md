

# ExprCall

A call expression, including calls to predefined functions and operators.  For example, `value == 10`, `size(map_value)`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**target** | **Object** | An abstract representation of a common expression.  Expressions are abstractly represented as a collection of identifiers, select statements, function calls, literals, and comprehensions. All operators with the exception of the &#39;.&#39; operator are modelled as function calls. This makes it easy to represent new operators into the existing AST.  All references within expressions must resolve to a [Decl][google.api.expr.v1alpha1.Decl] provided at type-check for an expression to be valid. A reference may either be a bare identifier &#x60;name&#x60; or a qualified identifier &#x60;google.api.name&#x60;. References may either refer to a value or a function declaration.  For example, the expression &#x60;google.api.name.startsWith(&#39;expr&#39;)&#x60; references the declaration &#x60;google.api.name&#x60; within a [Expr.Select][google.api.expr.v1alpha1.Expr.Select] expression, and the function declaration &#x60;startsWith&#x60;. |  [optional] |
|**function** | **String** | Required. The name of the function or method being called. |  [optional] |
|**args** | **List&lt;Object&gt;** | The arguments. |  [optional] |



