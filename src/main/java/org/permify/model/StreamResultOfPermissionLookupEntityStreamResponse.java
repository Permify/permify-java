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
import org.permify.model.PermissionLookupEntityStreamResponse;
import org.permify.model.Status;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * StreamResultOfPermissionLookupEntityStreamResponse
 */
@JsonPropertyOrder({
  StreamResultOfPermissionLookupEntityStreamResponse.JSON_PROPERTY_RESULT,
  StreamResultOfPermissionLookupEntityStreamResponse.JSON_PROPERTY_ERROR
})
@JsonTypeName("Stream_result_of_PermissionLookupEntityStreamResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-19T12:59:35.606772+03:00[Europe/Istanbul]", comments = "Generator version: 7.7.0")
public class StreamResultOfPermissionLookupEntityStreamResponse {
  public static final String JSON_PROPERTY_RESULT = "result";
  private PermissionLookupEntityStreamResponse result;

  public static final String JSON_PROPERTY_ERROR = "error";
  private Status error;

  public StreamResultOfPermissionLookupEntityStreamResponse() {
  }

  public StreamResultOfPermissionLookupEntityStreamResponse result(PermissionLookupEntityStreamResponse result) {
    
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PermissionLookupEntityStreamResponse getResult() {
    return result;
  }


  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResult(PermissionLookupEntityStreamResponse result) {
    this.result = result;
  }

  public StreamResultOfPermissionLookupEntityStreamResponse error(Status error) {
    
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Status getError() {
    return error;
  }


  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setError(Status error) {
    this.error = error;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamResultOfPermissionLookupEntityStreamResponse streamResultOfPermissionLookupEntityStreamResponse = (StreamResultOfPermissionLookupEntityStreamResponse) o;
    return Objects.equals(this.result, streamResultOfPermissionLookupEntityStreamResponse.result) &&
        Objects.equals(this.error, streamResultOfPermissionLookupEntityStreamResponse.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamResultOfPermissionLookupEntityStreamResponse {\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

