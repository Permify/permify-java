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
 * WatchRequest is the request message for the Watch RPC. It contains the details needed to establish a watch stream.
 */
@JsonPropertyOrder({
  WatchWatchRequest.JSON_PROPERTY_SNAP_TOKEN
})
@JsonTypeName("watch_watch_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-19T12:59:35.606772+03:00[Europe/Istanbul]", comments = "Generator version: 7.7.0")
public class WatchWatchRequest {
  public static final String JSON_PROPERTY_SNAP_TOKEN = "snap_token";
  private String snapToken;

  public WatchWatchRequest() {
  }

  public WatchWatchRequest snapToken(String snapToken) {
    
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WatchWatchRequest watchWatchRequest = (WatchWatchRequest) o;
    return Objects.equals(this.snapToken, watchWatchRequest.snapToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snapToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WatchWatchRequest {\n");
    sb.append("    snapToken: ").append(toIndentedString(snapToken)).append("\n");
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

