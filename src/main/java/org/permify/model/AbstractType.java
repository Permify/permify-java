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
import org.permify.model.V1alpha1Type;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Application defined abstract type.
 */
@JsonPropertyOrder({
  AbstractType.JSON_PROPERTY_NAME,
  AbstractType.JSON_PROPERTY_PARAMETER_TYPES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-19T12:59:35.606772+03:00[Europe/Istanbul]", comments = "Generator version: 7.7.0")
public class AbstractType {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PARAMETER_TYPES = "parameterTypes";
  private List<V1alpha1Type> parameterTypes = new ArrayList<>();

  public AbstractType() {
  }

  public AbstractType name(String name) {
    
    this.name = name;
    return this;
  }

  /**
   * The fully qualified name of this abstract type.
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

  public AbstractType parameterTypes(List<V1alpha1Type> parameterTypes) {
    
    this.parameterTypes = parameterTypes;
    return this;
  }

  public AbstractType addParameterTypesItem(V1alpha1Type parameterTypesItem) {
    if (this.parameterTypes == null) {
      this.parameterTypes = new ArrayList<>();
    }
    this.parameterTypes.add(parameterTypesItem);
    return this;
  }

  /**
   * Parameter types for this abstract type.
   * @return parameterTypes
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARAMETER_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<V1alpha1Type> getParameterTypes() {
    return parameterTypes;
  }


  @JsonProperty(JSON_PROPERTY_PARAMETER_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParameterTypes(List<V1alpha1Type> parameterTypes) {
    this.parameterTypes = parameterTypes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbstractType abstractType = (AbstractType) o;
    return Objects.equals(this.name, abstractType.name) &&
        Objects.equals(this.parameterTypes, abstractType.parameterTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, parameterTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractType {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parameterTypes: ").append(toIndentedString(parameterTypes)).append("\n");
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

