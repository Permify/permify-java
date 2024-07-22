// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: base/v1/service.proto
// Protobuf Java Version: 4.27.2

package org.permify.grpc;

/**
 * <pre>
 * PermissionCheckRequestMetadata metadata for the PermissionCheckRequest.
 * </pre>
 *
 * Protobuf type {@code base.v1.PermissionCheckRequestMetadata}
 */
public final class PermissionCheckRequestMetadata extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:base.v1.PermissionCheckRequestMetadata)
    PermissionCheckRequestMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      PermissionCheckRequestMetadata.class.getName());
  }
  // Use PermissionCheckRequestMetadata.newBuilder() to construct.
  private PermissionCheckRequestMetadata(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private PermissionCheckRequestMetadata() {
    schemaVersion_ = "";
    snapToken_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.permify.grpc.ServiceProto.internal_static_base_v1_PermissionCheckRequestMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.permify.grpc.ServiceProto.internal_static_base_v1_PermissionCheckRequestMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.permify.grpc.PermissionCheckRequestMetadata.class, org.permify.grpc.PermissionCheckRequestMetadata.Builder.class);
  }

  public static final int SCHEMA_VERSION_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object schemaVersion_ = "";
  /**
   * <pre>
   * Version of the schema.
   * </pre>
   *
   * <code>string schema_version = 1 [json_name = "schema_version"];</code>
   * @return The schemaVersion.
   */
  @java.lang.Override
  public java.lang.String getSchemaVersion() {
    java.lang.Object ref = schemaVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      schemaVersion_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Version of the schema.
   * </pre>
   *
   * <code>string schema_version = 1 [json_name = "schema_version"];</code>
   * @return The bytes for schemaVersion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSchemaVersionBytes() {
    java.lang.Object ref = schemaVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      schemaVersion_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SNAP_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object snapToken_ = "";
  /**
   * <pre>
   * Token associated with the snap.
   * </pre>
   *
   * <code>string snap_token = 2 [json_name = "snap_token", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The snapToken.
   */
  @java.lang.Override
  public java.lang.String getSnapToken() {
    java.lang.Object ref = snapToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      snapToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Token associated with the snap.
   * </pre>
   *
   * <code>string snap_token = 2 [json_name = "snap_token", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for snapToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSnapTokenBytes() {
    java.lang.Object ref = snapToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      snapToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEPTH_FIELD_NUMBER = 3;
  private int depth_ = 0;
  /**
   * <pre>
   * Depth of the check, must be greater than or equal to 3.
   * </pre>
   *
   * <code>int32 depth = 3 [json_name = "depth", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The depth.
   */
  @java.lang.Override
  public int getDepth() {
    return depth_;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(schemaVersion_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, schemaVersion_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(snapToken_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, snapToken_);
    }
    if (depth_ != 0) {
      output.writeInt32(3, depth_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(schemaVersion_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, schemaVersion_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(snapToken_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, snapToken_);
    }
    if (depth_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, depth_);
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
    if (!(obj instanceof org.permify.grpc.PermissionCheckRequestMetadata)) {
      return super.equals(obj);
    }
    org.permify.grpc.PermissionCheckRequestMetadata other = (org.permify.grpc.PermissionCheckRequestMetadata) obj;

    if (!getSchemaVersion()
        .equals(other.getSchemaVersion())) return false;
    if (!getSnapToken()
        .equals(other.getSnapToken())) return false;
    if (getDepth()
        != other.getDepth()) return false;
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
    hash = (37 * hash) + SCHEMA_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getSchemaVersion().hashCode();
    hash = (37 * hash) + SNAP_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getSnapToken().hashCode();
    hash = (37 * hash) + DEPTH_FIELD_NUMBER;
    hash = (53 * hash) + getDepth();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.permify.grpc.PermissionCheckRequestMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.PermissionCheckRequestMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.PermissionCheckRequestMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.PermissionCheckRequestMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.PermissionCheckRequestMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.PermissionCheckRequestMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.PermissionCheckRequestMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.permify.grpc.PermissionCheckRequestMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.permify.grpc.PermissionCheckRequestMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.permify.grpc.PermissionCheckRequestMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.permify.grpc.PermissionCheckRequestMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.permify.grpc.PermissionCheckRequestMetadata parseFrom(
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
  public static Builder newBuilder(org.permify.grpc.PermissionCheckRequestMetadata prototype) {
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
   * PermissionCheckRequestMetadata metadata for the PermissionCheckRequest.
   * </pre>
   *
   * Protobuf type {@code base.v1.PermissionCheckRequestMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:base.v1.PermissionCheckRequestMetadata)
      org.permify.grpc.PermissionCheckRequestMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.permify.grpc.ServiceProto.internal_static_base_v1_PermissionCheckRequestMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.permify.grpc.ServiceProto.internal_static_base_v1_PermissionCheckRequestMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.permify.grpc.PermissionCheckRequestMetadata.class, org.permify.grpc.PermissionCheckRequestMetadata.Builder.class);
    }

    // Construct using org.permify.grpc.PermissionCheckRequestMetadata.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      schemaVersion_ = "";
      snapToken_ = "";
      depth_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.permify.grpc.ServiceProto.internal_static_base_v1_PermissionCheckRequestMetadata_descriptor;
    }

    @java.lang.Override
    public org.permify.grpc.PermissionCheckRequestMetadata getDefaultInstanceForType() {
      return org.permify.grpc.PermissionCheckRequestMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public org.permify.grpc.PermissionCheckRequestMetadata build() {
      org.permify.grpc.PermissionCheckRequestMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.permify.grpc.PermissionCheckRequestMetadata buildPartial() {
      org.permify.grpc.PermissionCheckRequestMetadata result = new org.permify.grpc.PermissionCheckRequestMetadata(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.permify.grpc.PermissionCheckRequestMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.schemaVersion_ = schemaVersion_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.snapToken_ = snapToken_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.depth_ = depth_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.permify.grpc.PermissionCheckRequestMetadata) {
        return mergeFrom((org.permify.grpc.PermissionCheckRequestMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.permify.grpc.PermissionCheckRequestMetadata other) {
      if (other == org.permify.grpc.PermissionCheckRequestMetadata.getDefaultInstance()) return this;
      if (!other.getSchemaVersion().isEmpty()) {
        schemaVersion_ = other.schemaVersion_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getSnapToken().isEmpty()) {
        snapToken_ = other.snapToken_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getDepth() != 0) {
        setDepth(other.getDepth());
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
              schemaVersion_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              snapToken_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              depth_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private java.lang.Object schemaVersion_ = "";
    /**
     * <pre>
     * Version of the schema.
     * </pre>
     *
     * <code>string schema_version = 1 [json_name = "schema_version"];</code>
     * @return The schemaVersion.
     */
    public java.lang.String getSchemaVersion() {
      java.lang.Object ref = schemaVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        schemaVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Version of the schema.
     * </pre>
     *
     * <code>string schema_version = 1 [json_name = "schema_version"];</code>
     * @return The bytes for schemaVersion.
     */
    public com.google.protobuf.ByteString
        getSchemaVersionBytes() {
      java.lang.Object ref = schemaVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        schemaVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Version of the schema.
     * </pre>
     *
     * <code>string schema_version = 1 [json_name = "schema_version"];</code>
     * @param value The schemaVersion to set.
     * @return This builder for chaining.
     */
    public Builder setSchemaVersion(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      schemaVersion_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Version of the schema.
     * </pre>
     *
     * <code>string schema_version = 1 [json_name = "schema_version"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSchemaVersion() {
      schemaVersion_ = getDefaultInstance().getSchemaVersion();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Version of the schema.
     * </pre>
     *
     * <code>string schema_version = 1 [json_name = "schema_version"];</code>
     * @param value The bytes for schemaVersion to set.
     * @return This builder for chaining.
     */
    public Builder setSchemaVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      schemaVersion_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object snapToken_ = "";
    /**
     * <pre>
     * Token associated with the snap.
     * </pre>
     *
     * <code>string snap_token = 2 [json_name = "snap_token", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The snapToken.
     */
    public java.lang.String getSnapToken() {
      java.lang.Object ref = snapToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        snapToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Token associated with the snap.
     * </pre>
     *
     * <code>string snap_token = 2 [json_name = "snap_token", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The bytes for snapToken.
     */
    public com.google.protobuf.ByteString
        getSnapTokenBytes() {
      java.lang.Object ref = snapToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        snapToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Token associated with the snap.
     * </pre>
     *
     * <code>string snap_token = 2 [json_name = "snap_token", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The snapToken to set.
     * @return This builder for chaining.
     */
    public Builder setSnapToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      snapToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Token associated with the snap.
     * </pre>
     *
     * <code>string snap_token = 2 [json_name = "snap_token", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearSnapToken() {
      snapToken_ = getDefaultInstance().getSnapToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Token associated with the snap.
     * </pre>
     *
     * <code>string snap_token = 2 [json_name = "snap_token", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The bytes for snapToken to set.
     * @return This builder for chaining.
     */
    public Builder setSnapTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      snapToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int depth_ ;
    /**
     * <pre>
     * Depth of the check, must be greater than or equal to 3.
     * </pre>
     *
     * <code>int32 depth = 3 [json_name = "depth", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return The depth.
     */
    @java.lang.Override
    public int getDepth() {
      return depth_;
    }
    /**
     * <pre>
     * Depth of the check, must be greater than or equal to 3.
     * </pre>
     *
     * <code>int32 depth = 3 [json_name = "depth", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The depth to set.
     * @return This builder for chaining.
     */
    public Builder setDepth(int value) {

      depth_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Depth of the check, must be greater than or equal to 3.
     * </pre>
     *
     * <code>int32 depth = 3 [json_name = "depth", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearDepth() {
      bitField0_ = (bitField0_ & ~0x00000004);
      depth_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:base.v1.PermissionCheckRequestMetadata)
  }

  // @@protoc_insertion_point(class_scope:base.v1.PermissionCheckRequestMetadata)
  private static final org.permify.grpc.PermissionCheckRequestMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.permify.grpc.PermissionCheckRequestMetadata();
  }

  public static org.permify.grpc.PermissionCheckRequestMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PermissionCheckRequestMetadata>
      PARSER = new com.google.protobuf.AbstractParser<PermissionCheckRequestMetadata>() {
    @java.lang.Override
    public PermissionCheckRequestMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<PermissionCheckRequestMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PermissionCheckRequestMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.permify.grpc.PermissionCheckRequestMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

