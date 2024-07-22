// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: base/v1/service.proto
// Protobuf Java Version: 4.27.2

package org.permify.grpc;

/**
 * <pre>
 * WatchResponse is the response message for the Watch RPC. It contains the
 * changes in the data that are being watched.
 * </pre>
 *
 * Protobuf type {@code base.v1.WatchResponse}
 */
public final class WatchResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:base.v1.WatchResponse)
    WatchResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      WatchResponse.class.getName());
  }
  // Use WatchResponse.newBuilder() to construct.
  private WatchResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private WatchResponse() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.permify.grpc.ServiceProto.internal_static_base_v1_WatchResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.permify.grpc.ServiceProto.internal_static_base_v1_WatchResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.permify.grpc.WatchResponse.class, org.permify.grpc.WatchResponse.Builder.class);
  }

  private int bitField0_;
  public static final int CHANGES_FIELD_NUMBER = 1;
  private org.permify.grpc.DataChanges changes_;
  /**
   * <pre>
   * Changes in the data.
   * </pre>
   *
   * <code>.base.v1.DataChanges changes = 1 [json_name = "changes"];</code>
   * @return Whether the changes field is set.
   */
  @java.lang.Override
  public boolean hasChanges() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Changes in the data.
   * </pre>
   *
   * <code>.base.v1.DataChanges changes = 1 [json_name = "changes"];</code>
   * @return The changes.
   */
  @java.lang.Override
  public org.permify.grpc.DataChanges getChanges() {
    return changes_ == null ? org.permify.grpc.DataChanges.getDefaultInstance() : changes_;
  }
  /**
   * <pre>
   * Changes in the data.
   * </pre>
   *
   * <code>.base.v1.DataChanges changes = 1 [json_name = "changes"];</code>
   */
  @java.lang.Override
  public org.permify.grpc.DataChangesOrBuilder getChangesOrBuilder() {
    return changes_ == null ? org.permify.grpc.DataChanges.getDefaultInstance() : changes_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getChanges());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getChanges());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.permify.grpc.WatchResponse)) {
      return super.equals(obj);
    }
    org.permify.grpc.WatchResponse other = (org.permify.grpc.WatchResponse) obj;

    if (hasChanges() != other.hasChanges()) return false;
    if (hasChanges()) {
      if (!getChanges()
          .equals(other.getChanges())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasChanges()) {
      hash = (37 * hash) + CHANGES_FIELD_NUMBER;
      hash = (53 * hash) + getChanges().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.permify.grpc.WatchResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.WatchResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.WatchResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.WatchResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.WatchResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.WatchResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.WatchResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.permify.grpc.WatchResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.permify.grpc.WatchResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.permify.grpc.WatchResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.permify.grpc.WatchResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.permify.grpc.WatchResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.permify.grpc.WatchResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * WatchResponse is the response message for the Watch RPC. It contains the
   * changes in the data that are being watched.
   * </pre>
   *
   * Protobuf type {@code base.v1.WatchResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:base.v1.WatchResponse)
      org.permify.grpc.WatchResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.permify.grpc.ServiceProto.internal_static_base_v1_WatchResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.permify.grpc.ServiceProto.internal_static_base_v1_WatchResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.permify.grpc.WatchResponse.class, org.permify.grpc.WatchResponse.Builder.class);
    }

    // Construct using org.permify.grpc.WatchResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getChangesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      changes_ = null;
      if (changesBuilder_ != null) {
        changesBuilder_.dispose();
        changesBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.permify.grpc.ServiceProto.internal_static_base_v1_WatchResponse_descriptor;
    }

    @java.lang.Override
    public org.permify.grpc.WatchResponse getDefaultInstanceForType() {
      return org.permify.grpc.WatchResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.permify.grpc.WatchResponse build() {
      org.permify.grpc.WatchResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.permify.grpc.WatchResponse buildPartial() {
      org.permify.grpc.WatchResponse result = new org.permify.grpc.WatchResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.permify.grpc.WatchResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.changes_ = changesBuilder_ == null
            ? changes_
            : changesBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.permify.grpc.WatchResponse) {
        return mergeFrom((org.permify.grpc.WatchResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.permify.grpc.WatchResponse other) {
      if (other == org.permify.grpc.WatchResponse.getDefaultInstance()) return this;
      if (other.hasChanges()) {
        mergeChanges(other.getChanges());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getChangesFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private org.permify.grpc.DataChanges changes_;
    private com.google.protobuf.SingleFieldBuilder<
        org.permify.grpc.DataChanges, org.permify.grpc.DataChanges.Builder, org.permify.grpc.DataChangesOrBuilder> changesBuilder_;
    /**
     * <pre>
     * Changes in the data.
     * </pre>
     *
     * <code>.base.v1.DataChanges changes = 1 [json_name = "changes"];</code>
     * @return Whether the changes field is set.
     */
    public boolean hasChanges() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Changes in the data.
     * </pre>
     *
     * <code>.base.v1.DataChanges changes = 1 [json_name = "changes"];</code>
     * @return The changes.
     */
    public org.permify.grpc.DataChanges getChanges() {
      if (changesBuilder_ == null) {
        return changes_ == null ? org.permify.grpc.DataChanges.getDefaultInstance() : changes_;
      } else {
        return changesBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Changes in the data.
     * </pre>
     *
     * <code>.base.v1.DataChanges changes = 1 [json_name = "changes"];</code>
     */
    public Builder setChanges(org.permify.grpc.DataChanges value) {
      if (changesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        changes_ = value;
      } else {
        changesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Changes in the data.
     * </pre>
     *
     * <code>.base.v1.DataChanges changes = 1 [json_name = "changes"];</code>
     */
    public Builder setChanges(
        org.permify.grpc.DataChanges.Builder builderForValue) {
      if (changesBuilder_ == null) {
        changes_ = builderForValue.build();
      } else {
        changesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Changes in the data.
     * </pre>
     *
     * <code>.base.v1.DataChanges changes = 1 [json_name = "changes"];</code>
     */
    public Builder mergeChanges(org.permify.grpc.DataChanges value) {
      if (changesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          changes_ != null &&
          changes_ != org.permify.grpc.DataChanges.getDefaultInstance()) {
          getChangesBuilder().mergeFrom(value);
        } else {
          changes_ = value;
        }
      } else {
        changesBuilder_.mergeFrom(value);
      }
      if (changes_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Changes in the data.
     * </pre>
     *
     * <code>.base.v1.DataChanges changes = 1 [json_name = "changes"];</code>
     */
    public Builder clearChanges() {
      bitField0_ = (bitField0_ & ~0x00000001);
      changes_ = null;
      if (changesBuilder_ != null) {
        changesBuilder_.dispose();
        changesBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Changes in the data.
     * </pre>
     *
     * <code>.base.v1.DataChanges changes = 1 [json_name = "changes"];</code>
     */
    public org.permify.grpc.DataChanges.Builder getChangesBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getChangesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Changes in the data.
     * </pre>
     *
     * <code>.base.v1.DataChanges changes = 1 [json_name = "changes"];</code>
     */
    public org.permify.grpc.DataChangesOrBuilder getChangesOrBuilder() {
      if (changesBuilder_ != null) {
        return changesBuilder_.getMessageOrBuilder();
      } else {
        return changes_ == null ?
            org.permify.grpc.DataChanges.getDefaultInstance() : changes_;
      }
    }
    /**
     * <pre>
     * Changes in the data.
     * </pre>
     *
     * <code>.base.v1.DataChanges changes = 1 [json_name = "changes"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        org.permify.grpc.DataChanges, org.permify.grpc.DataChanges.Builder, org.permify.grpc.DataChangesOrBuilder> 
        getChangesFieldBuilder() {
      if (changesBuilder_ == null) {
        changesBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            org.permify.grpc.DataChanges, org.permify.grpc.DataChanges.Builder, org.permify.grpc.DataChangesOrBuilder>(
                getChanges(),
                getParentForChildren(),
                isClean());
        changes_ = null;
      }
      return changesBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:base.v1.WatchResponse)
  }

  // @@protoc_insertion_point(class_scope:base.v1.WatchResponse)
  private static final org.permify.grpc.WatchResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.permify.grpc.WatchResponse();
  }

  public static org.permify.grpc.WatchResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WatchResponse>
      PARSER = new com.google.protobuf.AbstractParser<WatchResponse>() {
    @java.lang.Override
    public WatchResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<WatchResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WatchResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.permify.grpc.WatchResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

