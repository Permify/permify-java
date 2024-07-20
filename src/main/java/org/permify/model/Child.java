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
import org.permify.model.Leaf;
import org.permify.model.Rewrite;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Child represents a node in the permission tree.
 */
@JsonPropertyOrder({
  Child.JSON_PROPERTY_LEAF,
  Child.JSON_PROPERTY_REWRITE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-19T12:59:35.606772+03:00[Europe/Istanbul]", comments = "Generator version: 7.7.0")
public class Child {
  public static final String JSON_PROPERTY_LEAF = "leaf";
  private Leaf leaf;

  public static final String JSON_PROPERTY_REWRITE = "rewrite";
  private Rewrite rewrite;

  public Child() {
  }

  public Child leaf(Leaf leaf) {
    
    this.leaf = leaf;
    return this;
  }

  /**
   * Get leaf
   * @return leaf
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEAF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Leaf getLeaf() {
    return leaf;
  }


  @JsonProperty(JSON_PROPERTY_LEAF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLeaf(Leaf leaf) {
    this.leaf = leaf;
  }

  public Child rewrite(Rewrite rewrite) {
    
    this.rewrite = rewrite;
    return this;
  }

  /**
   * Get rewrite
   * @return rewrite
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REWRITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Rewrite getRewrite() {
    return rewrite;
  }


  @JsonProperty(JSON_PROPERTY_REWRITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRewrite(Rewrite rewrite) {
    this.rewrite = rewrite;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Child child = (Child) o;
    return Objects.equals(this.leaf, child.leaf) &&
        Objects.equals(this.rewrite, child.rewrite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leaf, rewrite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Child {\n");
    sb.append("    leaf: ").append(toIndentedString(leaf)).append("\n");
    sb.append("    rewrite: ").append(toIndentedString(rewrite)).append("\n");
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

