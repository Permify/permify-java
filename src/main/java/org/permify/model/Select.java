/*
 * Permify API
 * Permify is an open source authorization service for creating fine-grained and scalable authorization systems.
 *
 * The version of the OpenAPI document: v0.9.9
 * Contact: hello@permify.co
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.permify.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.permify.model.Expr;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A field selection expression. e.g. &#x60;request.auth&#x60;.
 */
@JsonPropertyOrder({
  Select.JSON_PROPERTY_OPERAND,
  Select.JSON_PROPERTY_FIELD,
  Select.JSON_PROPERTY_TEST_ONLY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-19T12:59:35.606772+03:00[Europe/Istanbul]", comments = "Generator version: 7.7.0")
public class Select {
  public static final String JSON_PROPERTY_OPERAND = "operand";
  private Expr operand;

  public static final String JSON_PROPERTY_FIELD = "field";
  private String field;

  public static final String JSON_PROPERTY_TEST_ONLY = "testOnly";
  private Boolean testOnly;

  public Select() {
  }

  public Select operand(Expr operand) {
    
    this.operand = operand;
    return this;
  }

  /**
   * Get operand
   * @return operand
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPERAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Expr getOperand() {
    return operand;
  }


  @JsonProperty(JSON_PROPERTY_OPERAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperand(Expr operand) {
    this.operand = operand;
  }

  public Select field(String field) {
    
    this.field = field;
    return this;
  }

  /**
   * Required. The name of the field to select.  For example, in the select expression &#x60;request.auth&#x60;, the &#x60;auth&#x60; portion of the expression would be the &#x60;field&#x60;.
   * @return field
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getField() {
    return field;
  }


  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setField(String field) {
    this.field = field;
  }

  public Select testOnly(Boolean testOnly) {
    
    this.testOnly = testOnly;
    return this;
  }

  /**
   * Whether the select is to be interpreted as a field presence test.  This results from the macro &#x60;has(request.auth)&#x60;.
   * @return testOnly
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTestOnly() {
    return testOnly;
  }


  @JsonProperty(JSON_PROPERTY_TEST_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestOnly(Boolean testOnly) {
    this.testOnly = testOnly;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Select select = (Select) o;
    return Objects.equals(this.operand, select.operand) &&
        Objects.equals(this.field, select.field) &&
        Objects.equals(this.testOnly, select.testOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operand, field, testOnly);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Select {\n");
    sb.append("    operand: ").append(toIndentedString(operand)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    testOnly: ").append(toIndentedString(testOnly)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

