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
 * TenantListRequest is the message used for the request to list all tenants.
 */
@JsonPropertyOrder({
  TenantListRequest.JSON_PROPERTY_PAGE_SIZE,
  TenantListRequest.JSON_PROPERTY_CONTINUOUS_TOKEN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-19T12:59:35.606772+03:00[Europe/Istanbul]", comments = "Generator version: 7.7.0")
public class TenantListRequest {
  public static final String JSON_PROPERTY_PAGE_SIZE = "page_size";
  private Long pageSize;

  public static final String JSON_PROPERTY_CONTINUOUS_TOKEN = "continuous_token";
  private String continuousToken;

  public TenantListRequest() {
  }

  public TenantListRequest pageSize(Long pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

  /**
   * page_size is the number of tenants to be returned in the response. The value should be between 1 and 100.
   * @return pageSize
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPageSize() {
    return pageSize;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }

  public TenantListRequest continuousToken(String continuousToken) {
    
    this.continuousToken = continuousToken;
    return this;
  }

  /**
   * continuous_token is an optional parameter used for pagination. It should be the value received in the previous response.
   * @return continuousToken
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTINUOUS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContinuousToken() {
    return continuousToken;
  }


  @JsonProperty(JSON_PROPERTY_CONTINUOUS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContinuousToken(String continuousToken) {
    this.continuousToken = continuousToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TenantListRequest tenantListRequest = (TenantListRequest) o;
    return Objects.equals(this.pageSize, tenantListRequest.pageSize) &&
        Objects.equals(this.continuousToken, tenantListRequest.continuousToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, continuousToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TenantListRequest {\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    continuousToken: ").append(toIndentedString(continuousToken)).append("\n");
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

