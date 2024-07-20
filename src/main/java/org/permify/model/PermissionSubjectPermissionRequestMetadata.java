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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PermissionSubjectPermissionRequestMetadata metadata for the PermissionSubjectPermissionRequest.
 */
@JsonPropertyOrder({
  PermissionSubjectPermissionRequestMetadata.JSON_PROPERTY_SCHEMA_VERSION,
  PermissionSubjectPermissionRequestMetadata.JSON_PROPERTY_SNAP_TOKEN,
  PermissionSubjectPermissionRequestMetadata.JSON_PROPERTY_ONLY_PERMISSION,
  PermissionSubjectPermissionRequestMetadata.JSON_PROPERTY_DEPTH
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-19T12:59:35.606772+03:00[Europe/Istanbul]", comments = "Generator version: 7.7.0")
public class PermissionSubjectPermissionRequestMetadata {
  public static final String JSON_PROPERTY_SCHEMA_VERSION = "schema_version";
  private String schemaVersion;

  public static final String JSON_PROPERTY_SNAP_TOKEN = "snap_token";
  private String snapToken;

  public static final String JSON_PROPERTY_ONLY_PERMISSION = "only_permission";
  private Boolean onlyPermission;

  public static final String JSON_PROPERTY_DEPTH = "depth";
  private Integer depth;

  public PermissionSubjectPermissionRequestMetadata() {
  }

  public PermissionSubjectPermissionRequestMetadata schemaVersion(String schemaVersion) {
    
    this.schemaVersion = schemaVersion;
    return this;
  }

  /**
   * Version of the schema.
   * @return schemaVersion
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEMA_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSchemaVersion() {
    return schemaVersion;
  }


  @JsonProperty(JSON_PROPERTY_SCHEMA_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchemaVersion(String schemaVersion) {
    this.schemaVersion = schemaVersion;
  }

  public PermissionSubjectPermissionRequestMetadata snapToken(String snapToken) {
    
    this.snapToken = snapToken;
    return this;
  }

  /**
   * The snap token to avoid stale cache, see more details on [Snap Tokens](../../operations/snap-tokens).
   * @return snapToken
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SNAP_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSnapToken() {
    return snapToken;
  }


  @JsonProperty(JSON_PROPERTY_SNAP_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSnapToken(String snapToken) {
    this.snapToken = snapToken;
  }

  public PermissionSubjectPermissionRequestMetadata onlyPermission(Boolean onlyPermission) {
    
    this.onlyPermission = onlyPermission;
    return this;
  }

  /**
   * Whether to only check permissions.
   * @return onlyPermission
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ONLY_PERMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOnlyPermission() {
    return onlyPermission;
  }


  @JsonProperty(JSON_PROPERTY_ONLY_PERMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOnlyPermission(Boolean onlyPermission) {
    this.onlyPermission = onlyPermission;
  }

  public PermissionSubjectPermissionRequestMetadata depth(Integer depth) {
    
    this.depth = depth;
    return this;
  }

  /**
   * Query limit when if recursive database queries got in loop.
   * @return depth
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEPTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDepth() {
    return depth;
  }


  @JsonProperty(JSON_PROPERTY_DEPTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDepth(Integer depth) {
    this.depth = depth;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionSubjectPermissionRequestMetadata permissionSubjectPermissionRequestMetadata = (PermissionSubjectPermissionRequestMetadata) o;
    return Objects.equals(this.schemaVersion, permissionSubjectPermissionRequestMetadata.schemaVersion) &&
        Objects.equals(this.snapToken, permissionSubjectPermissionRequestMetadata.snapToken) &&
        Objects.equals(this.onlyPermission, permissionSubjectPermissionRequestMetadata.onlyPermission) &&
        Objects.equals(this.depth, permissionSubjectPermissionRequestMetadata.depth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemaVersion, snapToken, onlyPermission, depth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionSubjectPermissionRequestMetadata {\n");
    sb.append("    schemaVersion: ").append(toIndentedString(schemaVersion)).append("\n");
    sb.append("    snapToken: ").append(toIndentedString(snapToken)).append("\n");
    sb.append("    onlyPermission: ").append(toIndentedString(onlyPermission)).append("\n");
    sb.append("    depth: ").append(toIndentedString(depth)).append("\n");
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

