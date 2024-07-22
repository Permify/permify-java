// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: base/v1/service.proto
// Protobuf Java Version: 4.27.2

package org.permify.grpc;

/**
 * <pre>
 * PermissionSubjectPermissionRequestMetadata metadata for the PermissionSubjectPermissionRequest.
 * </pre>
 *
 * Protobuf type {@code base.v1.PermissionSubjectPermissionRequestMetadata}
 */
public final class PermissionSubjectPermissionRequestMetadata extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:base.v1.PermissionSubjectPermissionRequestMetadata)
    PermissionSubjectPermissionRequestMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      PermissionSubjectPermissionRequestMetadata.class.getName());
  }
  // Use PermissionSubjectPermissionRequestMetadata.newBuilder() to construct.
  private PermissionSubjectPermissionRequestMetadata(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private PermissionSubjectPermissionRequestMetadata() {
    schemaVersion_ = "";
    snapToken_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.permify.grpc.ServiceProto.internal_static_base_v1_PermissionSubjectPermissionRequestMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.permify.grpc.ServiceProto.internal_static_base_v1_PermissionSubjectPermissionRequestMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.permify.grpc.PermissionSubjectPermissionRequestMetadata.class, org.permify.grpc.PermissionSubjectPermissionRequestMetadata.Builder.class);
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

  public static final int ONLY_PERMISSION_FIELD_NUMBER = 3;
  private boolean onlyPermission_ = false;
  /**
   * <pre>
   * Whether to only check permissions.
   * </pre>
   *
   * <code>bool only_permission = 3 [json_name = "only_permission"];</code>
   * @return The onlyPermission.
   */
  @java.lang.Override
  public boolean getOnlyPermission() {
    return onlyPermission_;
  }

  public static final int DEPTH_FIELD_NUMBER = 4;
  private int depth_ = 0;
  /**
   * <pre>
   * Depth of the check, must be greater than or equal to 3.
   * </pre>
   *
   * <code>int32 depth = 4 [json_name = "depth", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
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
    if (onlyPermission_ != false) {
      output.writeBool(3, onlyPermission_);
    }
    if (depth_ != 0) {
      output.writeInt32(4, depth_);
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
    if (onlyPermission_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, onlyPermission_);
    }
    if (depth_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, depth_);
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
    if (!(obj instanceof org.permify.grpc.PermissionSubjectPermissionRequestMetadata)) {
      return super.equals(obj);
    }
    org.permify.grpc.PermissionSubjectPermissionRequestMetadata other = (org.permify.grpc.PermissionSubjectPermissionRequestMetadata) obj;

    if (!getSchemaVersion()
        .equals(other.getSchemaVersion())) return false;
    if (!getSnapToken()
        .equals(other.getSnapToken())) return false;
    if (getOnlyPermission()
        != other.getOnlyPermission()) return false;
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
    hash = (37 * hash) + ONLY_PERMISSION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getOnlyPermission());
    hash = (37 * hash) + DEPTH_FIELD_NUMBER;
    hash = (53 * hash) + getDepth();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.permify.grpc.PermissionSubjectPermissionRequestMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.PermissionSubjectPermissionRequestMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.PermissionSubjectPermissionRequestMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.PermissionSubjectPermissionRequestMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.PermissionSubjectPermissionRequestMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.PermissionSubjectPermissionRequestMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.PermissionSubjectPermissionRequestMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.permify.grpc.PermissionSubjectPermissionRequestMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.permify.grpc.PermissionSubjectPermissionRequestMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.permify.grpc.PermissionSubjectPermissionRequestMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.permify.grpc.PermissionSubjectPermissionRequestMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.permify.grpc.PermissionSubjectPermissionRequestMetadata parseFrom(
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
  public static Builder newBuilder(org.permify.grpc.PermissionSubjectPermissionRequestMetadata prototype) {
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
   * PermissionSubjectPermissionRequestMetadata metadata for the PermissionSubjectPermissionRequest.
   * </pre>
   *
   * Protobuf type {@code base.v1.PermissionSubjectPermissionRequestMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:base.v1.PermissionSubjectPermissionRequestMetadata)
      org.permify.grpc.PermissionSubjectPermissionRequestMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.permify.grpc.ServiceProto.internal_static_base_v1_PermissionSubjectPermissionRequestMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.permify.grpc.ServiceProto.internal_static_base_v1_PermissionSubjectPermissionRequestMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.permify.grpc.PermissionSubjectPermissionRequestMetadata.class, org.permify.grpc.PermissionSubjectPermissionRequestMetadata.Builder.class);
    }

    // Construct using org.permify.grpc.PermissionSubjectPermissionRequestMetadata.newBuilder()
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
      onlyPermission_ = false;
      depth_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.permify.grpc.ServiceProto.internal_static_base_v1_PermissionSubjectPermissionRequestMetadata_descriptor;
    }

    @java.lang.Override
    public org.permify.grpc.PermissionSubjectPermissionRequestMetadata getDefaultInstanceForType() {
      return org.permify.grpc.PermissionSubjectPermissionRequestMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public org.permify.grpc.PermissionSubjectPermissionRequestMetadata build() {
      org.permify.grpc.PermissionSubjectPermissionRequestMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.permify.grpc.PermissionSubjectPermissionRequestMetadata buildPartial() {
      org.permify.grpc.PermissionSubjectPermissionRequestMetadata result = new org.permify.grpc.PermissionSubjectPermissionRequestMetadata(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.permify.grpc.PermissionSubjectPermissionRequestMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.schemaVersion_ = schemaVersion_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.snapToken_ = snapToken_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.onlyPermission_ = onlyPermission_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.depth_ = depth_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.permify.grpc.PermissionSubjectPermissionRequestMetadata) {
        return mergeFrom((org.permify.grpc.PermissionSubjectPermissionRequestMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.permify.grpc.PermissionSubjectPermissionRequestMetadata other) {
      if (other == org.permify.grpc.PermissionSubjectPermissionRequestMetadata.getDefaultInstance()) return this;
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
      if (other.getOnlyPermission() != false) {
        setOnlyPermission(other.getOnlyPermission());
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
              onlyPermission_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              depth_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private boolean onlyPermission_ ;
    /**
     * <pre>
     * Whether to only check permissions.
     * </pre>
     *
     * <code>bool only_permission = 3 [json_name = "only_permission"];</code>
     * @return The onlyPermission.
     */
    @java.lang.Override
    public boolean getOnlyPermission() {
      return onlyPermission_;
    }
    /**
     * <pre>
     * Whether to only check permissions.
     * </pre>
     *
     * <code>bool only_permission = 3 [json_name = "only_permission"];</code>
     * @param value The onlyPermission to set.
     * @return This builder for chaining.
     */
    public Builder setOnlyPermission(boolean value) {

      onlyPermission_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether to only check permissions.
     * </pre>
     *
     * <code>bool only_permission = 3 [json_name = "only_permission"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOnlyPermission() {
      bitField0_ = (bitField0_ & ~0x00000004);
      onlyPermission_ = false;
      onChanged();
      return this;
    }

    private int depth_ ;
    /**
     * <pre>
     * Depth of the check, must be greater than or equal to 3.
     * </pre>
     *
     * <code>int32 depth = 4 [json_name = "depth", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
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
     * <code>int32 depth = 4 [json_name = "depth", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @param value The depth to set.
     * @return This builder for chaining.
     */
    public Builder setDepth(int value) {

      depth_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Depth of the check, must be greater than or equal to 3.
     * </pre>
     *
     * <code>int32 depth = 4 [json_name = "depth", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearDepth() {
      bitField0_ = (bitField0_ & ~0x00000008);
      depth_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:base.v1.PermissionSubjectPermissionRequestMetadata)
  }

  // @@protoc_insertion_point(class_scope:base.v1.PermissionSubjectPermissionRequestMetadata)
  private static final org.permify.grpc.PermissionSubjectPermissionRequestMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.permify.grpc.PermissionSubjectPermissionRequestMetadata();
  }

  public static org.permify.grpc.PermissionSubjectPermissionRequestMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PermissionSubjectPermissionRequestMetadata>
      PARSER = new com.google.protobuf.AbstractParser<PermissionSubjectPermissionRequestMetadata>() {
    @java.lang.Override
    public PermissionSubjectPermissionRequestMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<PermissionSubjectPermissionRequestMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PermissionSubjectPermissionRequestMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.permify.grpc.PermissionSubjectPermissionRequestMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

