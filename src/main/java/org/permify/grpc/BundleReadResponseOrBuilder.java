// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: base/v1/service.proto
// Protobuf Java Version: 4.27.2

package org.permify.grpc;

public interface BundleReadResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:base.v1.BundleReadResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.base.v1.DataBundle bundle = 1 [json_name = "bundle"];</code>
   * @return Whether the bundle field is set.
   */
  boolean hasBundle();
  /**
   * <code>.base.v1.DataBundle bundle = 1 [json_name = "bundle"];</code>
   * @return The bundle.
   */
  org.permify.grpc.DataBundle getBundle();
  /**
   * <code>.base.v1.DataBundle bundle = 1 [json_name = "bundle"];</code>
   */
  org.permify.grpc.DataBundleOrBuilder getBundleOrBuilder();
}