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
import org.permify.model.Expr;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A list creation expression.  Lists may either be homogenous, e.g. &#x60;[1, 2, 3]&#x60;, or heterogeneous, e.g. &#x60;dyn([1, &#39;hello&#39;, 2.0])&#x60;
 */
@JsonPropertyOrder({
  CreateList.JSON_PROPERTY_ELEMENTS,
  CreateList.JSON_PROPERTY_OPTIONAL_INDICES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-19T12:59:35.606772+03:00[Europe/Istanbul]", comments = "Generator version: 7.7.0")
public class CreateList {
  public static final String JSON_PROPERTY_ELEMENTS = "elements";
  private List<Expr> elements = new ArrayList<>();

  public static final String JSON_PROPERTY_OPTIONAL_INDICES = "optionalIndices";
  private List<Integer> optionalIndices = new ArrayList<>();

  public CreateList() {
  }

  public CreateList elements(List<Expr> elements) {
    
    this.elements = elements;
    return this;
  }

  public CreateList addElementsItem(Expr elementsItem) {
    if (this.elements == null) {
      this.elements = new ArrayList<>();
    }
    this.elements.add(elementsItem);
    return this;
  }

  /**
   * The elements part of the list.
   * @return elements
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ELEMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Expr> getElements() {
    return elements;
  }


  @JsonProperty(JSON_PROPERTY_ELEMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setElements(List<Expr> elements) {
    this.elements = elements;
  }

  public CreateList optionalIndices(List<Integer> optionalIndices) {
    
    this.optionalIndices = optionalIndices;
    return this;
  }

  public CreateList addOptionalIndicesItem(Integer optionalIndicesItem) {
    if (this.optionalIndices == null) {
      this.optionalIndices = new ArrayList<>();
    }
    this.optionalIndices.add(optionalIndicesItem);
    return this;
  }

  /**
   * The indices within the elements list which are marked as optional elements.  When an optional-typed value is present, the value it contains is included in the list. If the optional-typed value is absent, the list element is omitted from the CreateList result.
   * @return optionalIndices
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPTIONAL_INDICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getOptionalIndices() {
    return optionalIndices;
  }


  @JsonProperty(JSON_PROPERTY_OPTIONAL_INDICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptionalIndices(List<Integer> optionalIndices) {
    this.optionalIndices = optionalIndices;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateList createList = (CreateList) o;
    return Objects.equals(this.elements, createList.elements) &&
        Objects.equals(this.optionalIndices, createList.optionalIndices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elements, optionalIndices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateList {\n");
    sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
    sb.append("    optionalIndices: ").append(toIndentedString(optionalIndices)).append("\n");
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

