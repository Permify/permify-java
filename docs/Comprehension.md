

# Comprehension

A comprehension expression applied to a list or map.  Comprehensions are not part of the core syntax, but enabled with macros. A macro matches a specific call signature within a parsed AST and replaces the call with an alternate AST block. Macro expansion happens at parse time.  The following macros are supported within CEL:  Aggregate type macros may be applied to all elements in a list or all keys in a map:  *  `all`, `exists`, `exists_one` -  test a predicate expression against    the inputs and return `true` if the predicate is satisfied for all,    any, or only one value `list.all(x, x < 10)`. *  `filter` - test a predicate expression against the inputs and return    the subset of elements which satisfy the predicate:    `payments.filter(p, p > 1000)`. *  `map` - apply an expression to all elements in the input and return the    output aggregate type: `[1, 2, 3].map(i, i * i)`.  The `has(m.x)` macro tests whether the property `x` is present in struct `m`. The semantics of this macro depend on the type of `m`. For proto2 messages `has(m.x)` is defined as 'defined, but not set`. For proto3, the macro tests whether the property is set to its default. For map and struct types, the macro tests whether the property `x` is defined on `m`.  Comprehensions for the standard environment macros evaluation can be best visualized as the following pseudocode:  ``` let `accu_var` = `accu_init` for (let `iter_var` in `iter_range`) {   if (!`loop_condition`) {     break   }   `accu_var` = `loop_step` } return `result` ```  Comprehensions for the optional V2 macros which support map-to-map translation differ slightly from the standard environment macros in that they expose both the key or index in addition to the value for each list or map entry:  ``` let `accu_var` = `accu_init` for (let `iter_var`, `iter_var2` in `iter_range`) {   if (!`loop_condition`) {     break   }   `accu_var` = `loop_step` } return `result` ```

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**iterVar** | **String** | The name of the first iteration variable. When the iter_range is a list, this variable is the list element. When the iter_range is a map, this variable is the map entry key. |  [optional] |
|**iterVar2** | **String** | The name of the second iteration variable, empty if not set. When the iter_range is a list, this variable is the integer index. When the iter_range is a map, this variable is the map entry value. This field is only set for comprehension v2 macros. |  [optional] |
|**iterRange** | [**Expr**](Expr.md) |  |  [optional] |
|**accuVar** | **String** | The name of the variable used for accumulation of the result. |  [optional] |
|**accuInit** | [**Expr**](Expr.md) |  |  [optional] |
|**loopCondition** | [**Expr**](Expr.md) |  |  [optional] |
|**loopStep** | [**Expr**](Expr.md) |  |  [optional] |
|**result** | [**Expr**](Expr.md) |  |  [optional] |



