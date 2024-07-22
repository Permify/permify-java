// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: base/v1/service.proto
// Protobuf Java Version: 4.27.2

package org.permify.grpc;

public interface TenantCreateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:base.v1.TenantCreateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * id is a unique identifier for the tenant.
   * </pre>
   *
   * <code>string id = 1 [json_name = "id", (.validate.rules) = { ... }</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * id is a unique identifier for the tenant.
   * </pre>
   *
   * <code>string id = 1 [json_name = "id", (.validate.rules) = { ... }</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * name is the name of the tenant.
   * </pre>
   *
   * <code>string name = 2 [json_name = "name", (.validate.rules) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * name is the name of the tenant.
   * </pre>
   *
   * <code>string name = 2 [json_name = "name", (.validate.rules) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
