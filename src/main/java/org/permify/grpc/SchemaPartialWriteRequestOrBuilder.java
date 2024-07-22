// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: base/v1/service.proto
// Protobuf Java Version: 4.27.2

package org.permify.grpc;

public interface SchemaPartialWriteRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:base.v1.SchemaPartialWriteRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * tenant_id is a string that identifies the tenant. It must match the pattern "[a-zA-Z0-9-,]+",
   * be a maximum of 64 bytes, and must not be empty.
   * </pre>
   *
   * <code>string tenant_id = 1 [json_name = "tenant_id", (.validate.rules) = { ... }</code>
   * @return The tenantId.
   */
  java.lang.String getTenantId();
  /**
   * <pre>
   * tenant_id is a string that identifies the tenant. It must match the pattern "[a-zA-Z0-9-,]+",
   * be a maximum of 64 bytes, and must not be empty.
   * </pre>
   *
   * <code>string tenant_id = 1 [json_name = "tenant_id", (.validate.rules) = { ... }</code>
   * @return The bytes for tenantId.
   */
  com.google.protobuf.ByteString
      getTenantIdBytes();

  /**
   * <pre>
   * metadata is the additional information needed for the Partial Write request.
   * </pre>
   *
   * <code>.base.v1.SchemaPartialWriteRequestMetadata metadata = 2 [json_name = "metadata", (.validate.rules) = { ... }</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <pre>
   * metadata is the additional information needed for the Partial Write request.
   * </pre>
   *
   * <code>.base.v1.SchemaPartialWriteRequestMetadata metadata = 2 [json_name = "metadata", (.validate.rules) = { ... }</code>
   * @return The metadata.
   */
  org.permify.grpc.SchemaPartialWriteRequestMetadata getMetadata();
  /**
   * <pre>
   * metadata is the additional information needed for the Partial Write request.
   * </pre>
   *
   * <code>.base.v1.SchemaPartialWriteRequestMetadata metadata = 2 [json_name = "metadata", (.validate.rules) = { ... }</code>
   */
  org.permify.grpc.SchemaPartialWriteRequestMetadataOrBuilder getMetadataOrBuilder();

  /**
   * <pre>
   * Map of entity name with the values needed to be updated
   * </pre>
   *
   * <code>map&lt;string, .base.v1.Partials&gt; partials = 3 [json_name = "partials"];</code>
   */
  int getPartialsCount();
  /**
   * <pre>
   * Map of entity name with the values needed to be updated
   * </pre>
   *
   * <code>map&lt;string, .base.v1.Partials&gt; partials = 3 [json_name = "partials"];</code>
   */
  boolean containsPartials(
      java.lang.String key);
  /**
   * Use {@link #getPartialsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.permify.grpc.Partials>
  getPartials();
  /**
   * <pre>
   * Map of entity name with the values needed to be updated
   * </pre>
   *
   * <code>map&lt;string, .base.v1.Partials&gt; partials = 3 [json_name = "partials"];</code>
   */
  java.util.Map<java.lang.String, org.permify.grpc.Partials>
  getPartialsMap();
  /**
   * <pre>
   * Map of entity name with the values needed to be updated
   * </pre>
   *
   * <code>map&lt;string, .base.v1.Partials&gt; partials = 3 [json_name = "partials"];</code>
   */
  /* nullable */
org.permify.grpc.Partials getPartialsOrDefault(
      java.lang.String key,
      /* nullable */
org.permify.grpc.Partials defaultValue);
  /**
   * <pre>
   * Map of entity name with the values needed to be updated
   * </pre>
   *
   * <code>map&lt;string, .base.v1.Partials&gt; partials = 3 [json_name = "partials"];</code>
   */
  org.permify.grpc.Partials getPartialsOrThrow(
      java.lang.String key);
}
