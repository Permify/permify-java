

# Expr

An abstract representation of a common expression.  Expressions are abstractly represented as a collection of identifiers, select statements, function calls, literals, and comprehensions. All operators with the exception of the '.' operator are modelled as function calls. This makes it easy to represent new operators into the existing AST.  All references within expressions must resolve to a [Decl][google.api.expr.v1alpha1.Decl] provided at type-check for an expression to be valid. A reference may either be a bare identifier `name` or a qualified identifier `google.api.name`. References may either refer to a value or a function declaration.  For example, the expression `google.api.name.startsWith('expr')` references the declaration `google.api.name` within a [Expr.Select][google.api.expr.v1alpha1.Expr.Select] expression, and the function declaration `startsWith`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Required. An id assigned to this node by the parser which is unique in a given expression tree. This is used to associate type information and other attributes to a node in the parse tree. |  [optional] |
|**constExpr** | [**Constant**](Constant.md) |  |  [optional] |
|**identExpr** | [**Ident**](Ident.md) |  |  [optional] |
|**selectExpr** | [**Select**](Select.md) |  |  [optional] |
|**callExpr** | [**ExprCall**](ExprCall.md) |  |  [optional] |
|**listExpr** | [**CreateList**](CreateList.md) |  |  [optional] |
|**structExpr** | [**CreateStruct**](CreateStruct.md) |  |  [optional] |
|**comprehensionExpr** | [**Comprehension**](Comprehension.md) |  |  [optional] |



