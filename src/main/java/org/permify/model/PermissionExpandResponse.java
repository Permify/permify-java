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
import org.permify.model.Expand;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PermissionExpandResponse is the response message for the Expand method in the Permission service.
 */
@JsonPropertyOrder({
  PermissionExpandResponse.JSON_PROPERTY_TREE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-19T12:59:35.606772+03:00[Europe/Istanbul]", comments = "Generator version: 7.7.0")
public class PermissionExpandResponse {
  public static final String JSON_PROPERTY_TREE = "tree";
  private Expand tree;

  public PermissionExpandResponse() {
  }

  public PermissionExpandResponse tree(Expand tree) {
    
    this.tree = tree;
    return this;
  }

  /**
   * Get tree
   * @return tree
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TREE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Expand getTree() {
    return tree;
  }


  @JsonProperty(JSON_PROPERTY_TREE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTree(Expand tree) {
    this.tree = tree;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionExpandResponse permissionExpandResponse = (PermissionExpandResponse) o;
    return Objects.equals(this.tree, permissionExpandResponse.tree);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tree);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionExpandResponse {\n");
    sb.append("    tree: ").append(toIndentedString(tree)).append("\n");
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

