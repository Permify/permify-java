// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: base/v1/base.proto
// Protobuf Java Version: 4.27.2

package org.permify.grpc;

public interface SubjectFilterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:base.v1.SubjectFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Type of the subject
   * </pre>
   *
   * <code>string type = 1 [json_name = "type"];</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   * Type of the subject
   * </pre>
   *
   * <code>string type = 1 [json_name = "type"];</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * List of subject IDs
   * </pre>
   *
   * <code>repeated string ids = 2 [json_name = "ids"];</code>
   * @return A list containing the ids.
   */
  java.util.List<java.lang.String>
      getIdsList();
  /**
   * <pre>
   * List of subject IDs
   * </pre>
   *
   * <code>repeated string ids = 2 [json_name = "ids"];</code>
   * @return The count of ids.
   */
  int getIdsCount();
  /**
   * <pre>
   * List of subject IDs
   * </pre>
   *
   * <code>repeated string ids = 2 [json_name = "ids"];</code>
   * @param index The index of the element to return.
   * @return The ids at the given index.
   */
  java.lang.String getIds(int index);
  /**
   * <pre>
   * List of subject IDs
   * </pre>
   *
   * <code>repeated string ids = 2 [json_name = "ids"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the ids at the given index.
   */
  com.google.protobuf.ByteString
      getIdsBytes(int index);

  /**
   * <code>string relation = 3 [json_name = "relation", (.validate.rules) = { ... }</code>
   * @return The relation.
   */
  java.lang.String getRelation();
  /**
   * <code>string relation = 3 [json_name = "relation", (.validate.rules) = { ... }</code>
   * @return The bytes for relation.
   */
  com.google.protobuf.ByteString
      getRelationBytes();
}