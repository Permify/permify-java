// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: base/v1/base.proto
// Protobuf Java Version: 4.27.2

package org.permify.grpc;

public interface TupleFilterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:base.v1.TupleFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.base.v1.EntityFilter entity = 1 [json_name = "entity"];</code>
   * @return Whether the entity field is set.
   */
  boolean hasEntity();
  /**
   * <code>.base.v1.EntityFilter entity = 1 [json_name = "entity"];</code>
   * @return The entity.
   */
  org.permify.grpc.EntityFilter getEntity();
  /**
   * <code>.base.v1.EntityFilter entity = 1 [json_name = "entity"];</code>
   */
  org.permify.grpc.EntityFilterOrBuilder getEntityOrBuilder();

  /**
   * <code>string relation = 2 [json_name = "relation", (.validate.rules) = { ... }</code>
   * @return The relation.
   */
  java.lang.String getRelation();
  /**
   * <code>string relation = 2 [json_name = "relation", (.validate.rules) = { ... }</code>
   * @return The bytes for relation.
   */
  com.google.protobuf.ByteString
      getRelationBytes();

  /**
   * <pre>
   * The subject filter
   * </pre>
   *
   * <code>.base.v1.SubjectFilter subject = 3 [json_name = "subject"];</code>
   * @return Whether the subject field is set.
   */
  boolean hasSubject();
  /**
   * <pre>
   * The subject filter
   * </pre>
   *
   * <code>.base.v1.SubjectFilter subject = 3 [json_name = "subject"];</code>
   * @return The subject.
   */
  org.permify.grpc.SubjectFilter getSubject();
  /**
   * <pre>
   * The subject filter
   * </pre>
   *
   * <code>.base.v1.SubjectFilter subject = 3 [json_name = "subject"];</code>
   */
  org.permify.grpc.SubjectFilterOrBuilder getSubjectOrBuilder();
}