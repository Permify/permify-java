

# CheckedExpr

A CEL expression which has been successfully type checked.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**referenceMap** | [**Map&lt;String, V1alpha1Reference&gt;**](V1alpha1Reference.md) | A map from expression ids to resolved references.  The following entries are in this table:  - An Ident or Select expression is represented here if it resolves to a   declaration. For instance, if &#x60;a.b.c&#x60; is represented by   &#x60;select(select(id(a), b), c)&#x60;, and &#x60;a.b&#x60; resolves to a declaration,   while &#x60;c&#x60; is a field selection, then the reference is attached to the   nested select expression (but not to the id or or the outer select).   In turn, if &#x60;a&#x60; resolves to a declaration and &#x60;b.c&#x60; are field selections,   the reference is attached to the ident expression. - Every Call expression has an entry here, identifying the function being   called. - Every CreateStruct expression for a message has an entry, identifying   the message. |  [optional] |
|**typeMap** | [**Map&lt;String, V1alpha1Type&gt;**](V1alpha1Type.md) | A map from expression ids to types.  Every expression node which has a type different than DYN has a mapping here. If an expression has type DYN, it is omitted from this map to save space. |  [optional] |
|**sourceInfo** | [**SourceInfo**](SourceInfo.md) |  |  [optional] |
|**exprVersion** | **String** | The expr version indicates the major / minor version number of the &#x60;expr&#x60; representation.  The most common reason for a version change will be to indicate to the CEL runtimes that transformations have been performed on the expr during static analysis. In some cases, this will save the runtime the work of applying the same or similar transformations prior to evaluation. |  [optional] |
|**expr** | **Object** | An abstract representation of a common expression.  Expressions are abstractly represented as a collection of identifiers, select statements, function calls, literals, and comprehensions. All operators with the exception of the &#39;.&#39; operator are modelled as function calls. This makes it easy to represent new operators into the existing AST.  All references within expressions must resolve to a [Decl][google.api.expr.v1alpha1.Decl] provided at type-check for an expression to be valid. A reference may either be a bare identifier &#x60;name&#x60; or a qualified identifier &#x60;google.api.name&#x60;. References may either refer to a value or a function declaration.  For example, the expression &#x60;google.api.name.startsWith(&#39;expr&#39;)&#x60; references the declaration &#x60;google.api.name&#x60; within a [Expr.Select][google.api.expr.v1alpha1.Expr.Select] expression, and the function declaration &#x60;startsWith&#x60;. |  [optional] |



