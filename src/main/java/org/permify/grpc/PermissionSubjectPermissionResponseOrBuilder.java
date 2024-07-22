// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: base/v1/service.proto
// Protobuf Java Version: 4.27.2

package org.permify.grpc;

public interface PermissionSubjectPermissionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:base.v1.PermissionSubjectPermissionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Map of results for each permission check.
   * </pre>
   *
   * <code>map&lt;string, .base.v1.CheckResult&gt; results = 1 [json_name = "results"];</code>
   */
  int getResultsCount();
  /**
   * <pre>
   * Map of results for each permission check.
   * </pre>
   *
   * <code>map&lt;string, .base.v1.CheckResult&gt; results = 1 [json_name = "results"];</code>
   */
  boolean containsResults(
      java.lang.String key);
  /**
   * Use {@link #getResultsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.permify.grpc.CheckResult>
  getResults();
  /**
   * <pre>
   * Map of results for each permission check.
   * </pre>
   *
   * <code>map&lt;string, .base.v1.CheckResult&gt; results = 1 [json_name = "results"];</code>
   */
  java.util.Map<java.lang.String, org.permify.grpc.CheckResult>
  getResultsMap();
  /**
   * <pre>
   * Map of results for each permission check.
   * </pre>
   *
   * <code>map&lt;string, .base.v1.CheckResult&gt; results = 1 [json_name = "results"];</code>
   */
  /* nullable */
org.permify.grpc.CheckResult getResultsOrDefault(
      java.lang.String key,
      /* nullable */
org.permify.grpc.CheckResult         defaultValue);
  /**
   * <pre>
   * Map of results for each permission check.
   * </pre>
   *
   * <code>map&lt;string, .base.v1.CheckResult&gt; results = 1 [json_name = "results"];</code>
   */
  org.permify.grpc.CheckResult getResultsOrThrow(
      java.lang.String key);
  /**
   * Use {@link #getResultsValueMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Integer>
  getResultsValue();
  /**
   * <pre>
   * Map of results for each permission check.
   * </pre>
   *
   * <code>map&lt;string, .base.v1.CheckResult&gt; results = 1 [json_name = "results"];</code>
   */
  java.util.Map<java.lang.String, java.lang.Integer>
  getResultsValueMap();
  /**
   * <pre>
   * Map of results for each permission check.
   * </pre>
   *
   * <code>map&lt;string, .base.v1.CheckResult&gt; results = 1 [json_name = "results"];</code>
   */
  int getResultsValueOrDefault(
      java.lang.String key,
      int defaultValue);
  /**
   * <pre>
   * Map of results for each permission check.
   * </pre>
   *
   * <code>map&lt;string, .base.v1.CheckResult&gt; results = 1 [json_name = "results"];</code>
   */
  int getResultsValueOrThrow(
      java.lang.String key);
}
