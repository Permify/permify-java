// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: base/v1/service.proto
// Protobuf Java Version: 4.27.2

package org.permify.grpc;

public interface AttributeReadRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:base.v1.AttributeReadRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * tenant_id represents the unique identifier of the tenant from which the attributes are being read.
   * </pre>
   *
   * <code>string tenant_id = 1 [json_name = "tenant_id", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The tenantId.
   */
  java.lang.String getTenantId();
  /**
   * <pre>
   * tenant_id represents the unique identifier of the tenant from which the attributes are being read.
   * </pre>
   *
   * <code>string tenant_id = 1 [json_name = "tenant_id", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for tenantId.
   */
  com.google.protobuf.ByteString
      getTenantIdBytes();

  /**
   * <pre>
   * metadata holds additional information related to the request.
   * </pre>
   *
   * <code>.base.v1.AttributeReadRequestMetadata metadata = 2 [json_name = "metadata", (.validate.rules) = { ... }</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <pre>
   * metadata holds additional information related to the request.
   * </pre>
   *
   * <code>.base.v1.AttributeReadRequestMetadata metadata = 2 [json_name = "metadata", (.validate.rules) = { ... }</code>
   * @return The metadata.
   */
  org.permify.grpc.AttributeReadRequestMetadata getMetadata();
  /**
   * <pre>
   * metadata holds additional information related to the request.
   * </pre>
   *
   * <code>.base.v1.AttributeReadRequestMetadata metadata = 2 [json_name = "metadata", (.validate.rules) = { ... }</code>
   */
  org.permify.grpc.AttributeReadRequestMetadataOrBuilder getMetadataOrBuilder();

  /**
   * <pre>
   * filter specifies the criteria used to select the attributes that should be returned.
   * </pre>
   *
   * <code>.base.v1.AttributeFilter filter = 3 [json_name = "filter", (.validate.rules) = { ... }</code>
   * @return Whether the filter field is set.
   */
  boolean hasFilter();
  /**
   * <pre>
   * filter specifies the criteria used to select the attributes that should be returned.
   * </pre>
   *
   * <code>.base.v1.AttributeFilter filter = 3 [json_name = "filter", (.validate.rules) = { ... }</code>
   * @return The filter.
   */
  org.permify.grpc.AttributeFilter getFilter();
  /**
   * <pre>
   * filter specifies the criteria used to select the attributes that should be returned.
   * </pre>
   *
   * <code>.base.v1.AttributeFilter filter = 3 [json_name = "filter", (.validate.rules) = { ... }</code>
   */
  org.permify.grpc.AttributeFilterOrBuilder getFilterOrBuilder();

  /**
   * <pre>
   * page_size specifies the number of results to return in a single page.
   * If more results are available, a continuous_token is included in the response.
   * </pre>
   *
   * <code>uint32 page_size = 4 [json_name = "page_size", (.validate.rules) = { ... }</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * continuous_token is used in case of paginated reads to get the next page of results.
   * </pre>
   *
   * <code>string continuous_token = 5 [json_name = "continuous_token", (.validate.rules) = { ... }</code>
   * @return The continuousToken.
   */
  java.lang.String getContinuousToken();
  /**
   * <pre>
   * continuous_token is used in case of paginated reads to get the next page of results.
   * </pre>
   *
   * <code>string continuous_token = 5 [json_name = "continuous_token", (.validate.rules) = { ... }</code>
   * @return The bytes for continuousToken.
   */
  com.google.protobuf.ByteString
      getContinuousTokenBytes();
}
