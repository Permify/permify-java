// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: base/v1/service.proto
// Protobuf Java Version: 4.27.2

package org.permify.grpc;

public interface SchemaPartialWriteRequestMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:base.v1.SchemaPartialWriteRequestMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * schema_version is the string that identifies the version of the schema to be read.
   * </pre>
   *
   * <code>string schema_version = 1 [json_name = "schema_version"];</code>
   * @return The schemaVersion.
   */
  java.lang.String getSchemaVersion();
  /**
   * <pre>
   * schema_version is the string that identifies the version of the schema to be read.
   * </pre>
   *
   * <code>string schema_version = 1 [json_name = "schema_version"];</code>
   * @return The bytes for schemaVersion.
   */
  com.google.protobuf.ByteString
      getSchemaVersionBytes();
}
