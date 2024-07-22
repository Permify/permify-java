// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: base/v1/service.proto
// Protobuf Java Version: 4.27.2

package org.permify.grpc;

public interface PermissionLookupSubjectResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:base.v1.PermissionLookupSubjectResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of identifiers for subjects that match the lookup.
   * </pre>
   *
   * <code>repeated string subject_ids = 1 [json_name = "subject_ids"];</code>
   * @return A list containing the subjectIds.
   */
  java.util.List<java.lang.String>
      getSubjectIdsList();
  /**
   * <pre>
   * List of identifiers for subjects that match the lookup.
   * </pre>
   *
   * <code>repeated string subject_ids = 1 [json_name = "subject_ids"];</code>
   * @return The count of subjectIds.
   */
  int getSubjectIdsCount();
  /**
   * <pre>
   * List of identifiers for subjects that match the lookup.
   * </pre>
   *
   * <code>repeated string subject_ids = 1 [json_name = "subject_ids"];</code>
   * @param index The index of the element to return.
   * @return The subjectIds at the given index.
   */
  java.lang.String getSubjectIds(int index);
  /**
   * <pre>
   * List of identifiers for subjects that match the lookup.
   * </pre>
   *
   * <code>repeated string subject_ids = 1 [json_name = "subject_ids"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the subjectIds at the given index.
   */
  com.google.protobuf.ByteString
      getSubjectIdsBytes(int index);
}