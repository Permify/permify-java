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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.permify.model.Constant;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes a resolved reference to a declaration.
 */
@JsonPropertyOrder({
  V1alpha1Reference.JSON_PROPERTY_NAME,
  V1alpha1Reference.JSON_PROPERTY_OVERLOAD_ID,
  V1alpha1Reference.JSON_PROPERTY_VALUE
})
@JsonTypeName("v1alpha1.Reference")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-19T12:59:35.606772+03:00[Europe/Istanbul]", comments = "Generator version: 7.7.0")
public class V1alpha1Reference {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OVERLOAD_ID = "overloadId";
  private List<String> overloadId = new ArrayList<>();

  public static final String JSON_PROPERTY_VALUE = "value";
  private Constant value;

  public V1alpha1Reference() {
  }

  public V1alpha1Reference name(String name) {
    
    this.name = name;
    return this;
  }

  /**
   * The fully qualified name of the declaration.
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }

  public V1alpha1Reference overloadId(List<String> overloadId) {
    
    this.overloadId = overloadId;
    return this;
  }

  public V1alpha1Reference addOverloadIdItem(String overloadIdItem) {
    if (this.overloadId == null) {
      this.overloadId = new ArrayList<>();
    }
    this.overloadId.add(overloadIdItem);
    return this;
  }

  /**
   * For references to functions, this is a list of &#x60;Overload.overload_id&#x60; values which match according to typing rules.  If the list has more than one element, overload resolution among the presented candidates must happen at runtime because of dynamic types. The type checker attempts to narrow down this list as much as possible.  Empty if this is not a reference to a [Decl.FunctionDecl][google.api.expr.v1alpha1.Decl.FunctionDecl].
   * @return overloadId
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OVERLOAD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getOverloadId() {
    return overloadId;
  }


  @JsonProperty(JSON_PROPERTY_OVERLOAD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOverloadId(List<String> overloadId) {
    this.overloadId = overloadId;
  }

  public V1alpha1Reference value(Constant value) {
    
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Constant getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(Constant value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1Reference v1alpha1Reference = (V1alpha1Reference) o;
    return Objects.equals(this.name, v1alpha1Reference.name) &&
        Objects.equals(this.overloadId, v1alpha1Reference.overloadId) &&
        Objects.equals(this.value, v1alpha1Reference.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, overloadId, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1Reference {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    overloadId: ").append(toIndentedString(overloadId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

