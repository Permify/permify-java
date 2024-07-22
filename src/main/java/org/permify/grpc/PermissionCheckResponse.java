// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: base/v1/service.proto
// Protobuf Java Version: 4.27.2

package org.permify.grpc;

/**
 * <pre>
 * PermissionCheckResponse is the response message for the Check method in the Permission service.
 * </pre>
 *
 * Protobuf type {@code base.v1.PermissionCheckResponse}
 */
public final class PermissionCheckResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:base.v1.PermissionCheckResponse)
    PermissionCheckResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      PermissionCheckResponse.class.getName());
  }
  // Use PermissionCheckResponse.newBuilder() to construct.
  private PermissionCheckResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private PermissionCheckResponse() {
    can_ = 0;
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.permify.grpc.ServiceProto.internal_static_base_v1_PermissionCheckResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.permify.grpc.ServiceProto.internal_static_base_v1_PermissionCheckResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.permify.grpc.PermissionCheckResponse.class, org.permify.grpc.PermissionCheckResponse.Builder.class);
  }

  private int bitField0_;
  public static final int CAN_FIELD_NUMBER = 1;
  private int can_ = 0;
  /**
   * <pre>
   * Result of the permission check.
   * </pre>
   *
   * <code>.base.v1.CheckResult can = 1 [json_name = "can"];</code>
   * @return The enum numeric value on the wire for can.
   */
  @java.lang.Override public int getCanValue() {
    return can_;
  }
  /**
   * <pre>
   * Result of the permission check.
   * </pre>
   *
   * <code>.base.v1.CheckResult can = 1 [json_name = "can"];</code>
   * @return The can.
   */
  @java.lang.Override public org.permify.grpc.CheckResult getCan() {
    org.permify.grpc.CheckResult result = org.permify.grpc.CheckResult.forNumber(can_);
    return result == null ? org.permify.grpc.CheckResult.UNRECOGNIZED : result;
  }

  public static final int METADATA_FIELD_NUMBER = 2;
  private org.permify.grpc.PermissionCheckResponseMetadata metadata_;
  /**
   * <pre>
   * Metadata associated with this response.
   * </pre>
   *
   * <code>.base.v1.PermissionCheckResponseMetadata metadata = 2 [json_name = "metadata"];</code>
   * @return Whether the metadata field is set.
   */
  @java.lang.Override
  public boolean hasMetadata() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Metadata associated with this response.
   * </pre>
   *
   * <code>.base.v1.PermissionCheckResponseMetadata metadata = 2 [json_name = "metadata"];</code>
   * @return The metadata.
   */
  @java.lang.Override
  public org.permify.grpc.PermissionCheckResponseMetadata getMetadata() {
    return metadata_ == null ? org.permify.grpc.PermissionCheckResponseMetadata.getDefaultInstance() : metadata_;
  }
  /**
   * <pre>
   * Metadata associated with this response.
   * </pre>
   *
   * <code>.base.v1.PermissionCheckResponseMetadata metadata = 2 [json_name = "metadata"];</code>
   */
  @java.lang.Override
  public org.permify.grpc.PermissionCheckResponseMetadataOrBuilder getMetadataOrBuilder() {
    return metadata_ == null ? org.permify.grpc.PermissionCheckResponseMetadata.getDefaultInstance() : metadata_;
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
    if (can_ != org.permify.grpc.CheckResult.CHECK_RESULT_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, can_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getMetadata());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (can_ != org.permify.grpc.CheckResult.CHECK_RESULT_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, can_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMetadata());
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
    if (!(obj instanceof org.permify.grpc.PermissionCheckResponse)) {
      return super.equals(obj);
    }
    org.permify.grpc.PermissionCheckResponse other = (org.permify.grpc.PermissionCheckResponse) obj;

    if (can_ != other.can_) return false;
    if (hasMetadata() != other.hasMetadata()) return false;
    if (hasMetadata()) {
      if (!getMetadata()
          .equals(other.getMetadata())) return false;
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
    hash = (37 * hash) + CAN_FIELD_NUMBER;
    hash = (53 * hash) + can_;
    if (hasMetadata()) {
      hash = (37 * hash) + METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getMetadata().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.permify.grpc.PermissionCheckResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.PermissionCheckResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.PermissionCheckResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.PermissionCheckResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.PermissionCheckResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.PermissionCheckResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.PermissionCheckResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.permify.grpc.PermissionCheckResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.permify.grpc.PermissionCheckResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.permify.grpc.PermissionCheckResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.permify.grpc.PermissionCheckResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.permify.grpc.PermissionCheckResponse parseFrom(
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
  public static Builder newBuilder(org.permify.grpc.PermissionCheckResponse prototype) {
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
   * PermissionCheckResponse is the response message for the Check method in the Permission service.
   * </pre>
   *
   * Protobuf type {@code base.v1.PermissionCheckResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:base.v1.PermissionCheckResponse)
      org.permify.grpc.PermissionCheckResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.permify.grpc.ServiceProto.internal_static_base_v1_PermissionCheckResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.permify.grpc.ServiceProto.internal_static_base_v1_PermissionCheckResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.permify.grpc.PermissionCheckResponse.class, org.permify.grpc.PermissionCheckResponse.Builder.class);
    }

    // Construct using org.permify.grpc.PermissionCheckResponse.newBuilder()
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
        getMetadataFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      can_ = 0;
      metadata_ = null;
      if (metadataBuilder_ != null) {
        metadataBuilder_.dispose();
        metadataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.permify.grpc.ServiceProto.internal_static_base_v1_PermissionCheckResponse_descriptor;
    }

    @java.lang.Override
    public org.permify.grpc.PermissionCheckResponse getDefaultInstanceForType() {
      return org.permify.grpc.PermissionCheckResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.permify.grpc.PermissionCheckResponse build() {
      org.permify.grpc.PermissionCheckResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.permify.grpc.PermissionCheckResponse buildPartial() {
      org.permify.grpc.PermissionCheckResponse result = new org.permify.grpc.PermissionCheckResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.permify.grpc.PermissionCheckResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.can_ = can_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.metadata_ = metadataBuilder_ == null
            ? metadata_
            : metadataBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.permify.grpc.PermissionCheckResponse) {
        return mergeFrom((org.permify.grpc.PermissionCheckResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.permify.grpc.PermissionCheckResponse other) {
      if (other == org.permify.grpc.PermissionCheckResponse.getDefaultInstance()) return this;
      if (other.can_ != 0) {
        setCanValue(other.getCanValue());
      }
      if (other.hasMetadata()) {
        mergeMetadata(other.getMetadata());
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
            case 8: {
              can_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getMetadataFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private int can_ = 0;
    /**
     * <pre>
     * Result of the permission check.
     * </pre>
     *
     * <code>.base.v1.CheckResult can = 1 [json_name = "can"];</code>
     * @return The enum numeric value on the wire for can.
     */
    @java.lang.Override public int getCanValue() {
      return can_;
    }
    /**
     * <pre>
     * Result of the permission check.
     * </pre>
     *
     * <code>.base.v1.CheckResult can = 1 [json_name = "can"];</code>
     * @param value The enum numeric value on the wire for can to set.
     * @return This builder for chaining.
     */
    public Builder setCanValue(int value) {
      can_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Result of the permission check.
     * </pre>
     *
     * <code>.base.v1.CheckResult can = 1 [json_name = "can"];</code>
     * @return The can.
     */
    @java.lang.Override
    public org.permify.grpc.CheckResult getCan() {
      org.permify.grpc.CheckResult result = org.permify.grpc.CheckResult.forNumber(can_);
      return result == null ? org.permify.grpc.CheckResult.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Result of the permission check.
     * </pre>
     *
     * <code>.base.v1.CheckResult can = 1 [json_name = "can"];</code>
     * @param value The can to set.
     * @return This builder for chaining.
     */
    public Builder setCan(org.permify.grpc.CheckResult value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      can_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Result of the permission check.
     * </pre>
     *
     * <code>.base.v1.CheckResult can = 1 [json_name = "can"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCan() {
      bitField0_ = (bitField0_ & ~0x00000001);
      can_ = 0;
      onChanged();
      return this;
    }

    private org.permify.grpc.PermissionCheckResponseMetadata metadata_;
    private com.google.protobuf.SingleFieldBuilder<
        org.permify.grpc.PermissionCheckResponseMetadata, org.permify.grpc.PermissionCheckResponseMetadata.Builder, org.permify.grpc.PermissionCheckResponseMetadataOrBuilder> metadataBuilder_;
    /**
     * <pre>
     * Metadata associated with this response.
     * </pre>
     *
     * <code>.base.v1.PermissionCheckResponseMetadata metadata = 2 [json_name = "metadata"];</code>
     * @return Whether the metadata field is set.
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Metadata associated with this response.
     * </pre>
     *
     * <code>.base.v1.PermissionCheckResponseMetadata metadata = 2 [json_name = "metadata"];</code>
     * @return The metadata.
     */
    public org.permify.grpc.PermissionCheckResponseMetadata getMetadata() {
      if (metadataBuilder_ == null) {
        return metadata_ == null ? org.permify.grpc.PermissionCheckResponseMetadata.getDefaultInstance() : metadata_;
      } else {
        return metadataBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Metadata associated with this response.
     * </pre>
     *
     * <code>.base.v1.PermissionCheckResponseMetadata metadata = 2 [json_name = "metadata"];</code>
     */
    public Builder setMetadata(org.permify.grpc.PermissionCheckResponseMetadata value) {
      if (metadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metadata_ = value;
      } else {
        metadataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Metadata associated with this response.
     * </pre>
     *
     * <code>.base.v1.PermissionCheckResponseMetadata metadata = 2 [json_name = "metadata"];</code>
     */
    public Builder setMetadata(
        org.permify.grpc.PermissionCheckResponseMetadata.Builder builderForValue) {
      if (metadataBuilder_ == null) {
        metadata_ = builderForValue.build();
      } else {
        metadataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Metadata associated with this response.
     * </pre>
     *
     * <code>.base.v1.PermissionCheckResponseMetadata metadata = 2 [json_name = "metadata"];</code>
     */
    public Builder mergeMetadata(org.permify.grpc.PermissionCheckResponseMetadata value) {
      if (metadataBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          metadata_ != null &&
          metadata_ != org.permify.grpc.PermissionCheckResponseMetadata.getDefaultInstance()) {
          getMetadataBuilder().mergeFrom(value);
        } else {
          metadata_ = value;
        }
      } else {
        metadataBuilder_.mergeFrom(value);
      }
      if (metadata_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Metadata associated with this response.
     * </pre>
     *
     * <code>.base.v1.PermissionCheckResponseMetadata metadata = 2 [json_name = "metadata"];</code>
     */
    public Builder clearMetadata() {
      bitField0_ = (bitField0_ & ~0x00000002);
      metadata_ = null;
      if (metadataBuilder_ != null) {
        metadataBuilder_.dispose();
        metadataBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Metadata associated with this response.
     * </pre>
     *
     * <code>.base.v1.PermissionCheckResponseMetadata metadata = 2 [json_name = "metadata"];</code>
     */
    public org.permify.grpc.PermissionCheckResponseMetadata.Builder getMetadataBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getMetadataFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Metadata associated with this response.
     * </pre>
     *
     * <code>.base.v1.PermissionCheckResponseMetadata metadata = 2 [json_name = "metadata"];</code>
     */
    public org.permify.grpc.PermissionCheckResponseMetadataOrBuilder getMetadataOrBuilder() {
      if (metadataBuilder_ != null) {
        return metadataBuilder_.getMessageOrBuilder();
      } else {
        return metadata_ == null ?
            org.permify.grpc.PermissionCheckResponseMetadata.getDefaultInstance() : metadata_;
      }
    }
    /**
     * <pre>
     * Metadata associated with this response.
     * </pre>
     *
     * <code>.base.v1.PermissionCheckResponseMetadata metadata = 2 [json_name = "metadata"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        org.permify.grpc.PermissionCheckResponseMetadata, org.permify.grpc.PermissionCheckResponseMetadata.Builder, org.permify.grpc.PermissionCheckResponseMetadataOrBuilder> 
        getMetadataFieldBuilder() {
      if (metadataBuilder_ == null) {
        metadataBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            org.permify.grpc.PermissionCheckResponseMetadata, org.permify.grpc.PermissionCheckResponseMetadata.Builder, org.permify.grpc.PermissionCheckResponseMetadataOrBuilder>(
                getMetadata(),
                getParentForChildren(),
                isClean());
        metadata_ = null;
      }
      return metadataBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:base.v1.PermissionCheckResponse)
  }

  // @@protoc_insertion_point(class_scope:base.v1.PermissionCheckResponse)
  private static final org.permify.grpc.PermissionCheckResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.permify.grpc.PermissionCheckResponse();
  }

  public static org.permify.grpc.PermissionCheckResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PermissionCheckResponse>
      PARSER = new com.google.protobuf.AbstractParser<PermissionCheckResponse>() {
    @java.lang.Override
    public PermissionCheckResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<PermissionCheckResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PermissionCheckResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.permify.grpc.PermissionCheckResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
