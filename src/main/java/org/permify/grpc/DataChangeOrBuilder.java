// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: base/v1/base.proto
// Protobuf Java Version: 4.27.2

package org.permify.grpc;

public interface DataChangeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:base.v1.DataChange)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The operation type.
   * </pre>
   *
   * <code>.base.v1.DataChange.Operation operation = 1 [json_name = "operation"];</code>
   * @return The enum numeric value on the wire for operation.
   */
  int getOperationValue();
  /**
   * <pre>
   * The operation type.
   * </pre>
   *
   * <code>.base.v1.DataChange.Operation operation = 1 [json_name = "operation"];</code>
   * @return The operation.
   */
  org.permify.grpc.DataChange.Operation getOperation();

  /**
   * <pre>
   * If the change is a tuple.
   * </pre>
   *
   * <code>.base.v1.Tuple tuple = 2 [json_name = "tuple"];</code>
   * @return Whether the tuple field is set.
   */
  boolean hasTuple();
  /**
   * <pre>
   * If the change is a tuple.
   * </pre>
   *
   * <code>.base.v1.Tuple tuple = 2 [json_name = "tuple"];</code>
   * @return The tuple.
   */
  org.permify.grpc.Tuple getTuple();
  /**
   * <pre>
   * If the change is a tuple.
   * </pre>
   *
   * <code>.base.v1.Tuple tuple = 2 [json_name = "tuple"];</code>
   */
  org.permify.grpc.TupleOrBuilder getTupleOrBuilder();

  /**
   * <pre>
   * If the change is an attribute.
   * </pre>
   *
   * <code>.base.v1.Attribute attribute = 3 [json_name = "attribute"];</code>
   * @return Whether the attribute field is set.
   */
  boolean hasAttribute();
  /**
   * <pre>
   * If the change is an attribute.
   * </pre>
   *
   * <code>.base.v1.Attribute attribute = 3 [json_name = "attribute"];</code>
   * @return The attribute.
   */
  org.permify.grpc.Attribute getAttribute();
  /**
   * <pre>
   * If the change is an attribute.
   * </pre>
   *
   * <code>.base.v1.Attribute attribute = 3 [json_name = "attribute"];</code>
   */
  org.permify.grpc.AttributeOrBuilder getAttributeOrBuilder();

  org.permify.grpc.DataChange.TypeCase getTypeCase();
}