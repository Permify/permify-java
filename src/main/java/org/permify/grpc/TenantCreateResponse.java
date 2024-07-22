// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: base/v1/service.proto
// Protobuf Java Version: 4.27.2

package org.permify.grpc;

/**
 * <pre>
 * TenantCreateResponse is the message returned from the request to create a tenant.
 * </pre>
 *
 * Protobuf type {@code base.v1.TenantCreateResponse}
 */
public final class TenantCreateResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:base.v1.TenantCreateResponse)
    TenantCreateResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      TenantCreateResponse.class.getName());
  }
  // Use TenantCreateResponse.newBuilder() to construct.
  private TenantCreateResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private TenantCreateResponse() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.permify.grpc.ServiceProto.internal_static_base_v1_TenantCreateResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.permify.grpc.ServiceProto.internal_static_base_v1_TenantCreateResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.permify.grpc.TenantCreateResponse.class, org.permify.grpc.TenantCreateResponse.Builder.class);
  }

  private int bitField0_;
  public static final int TENANT_FIELD_NUMBER = 1;
  private org.permify.grpc.Tenant tenant_;
  /**
   * <pre>
   * tenant is the created tenant information.
   * </pre>
   *
   * <code>.base.v1.Tenant tenant = 1 [json_name = "tenant"];</code>
   * @return Whether the tenant field is set.
   */
  @java.lang.Override
  public boolean hasTenant() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * tenant is the created tenant information.
   * </pre>
   *
   * <code>.base.v1.Tenant tenant = 1 [json_name = "tenant"];</code>
   * @return The tenant.
   */
  @java.lang.Override
  public org.permify.grpc.Tenant getTenant() {
    return tenant_ == null ? org.permify.grpc.Tenant.getDefaultInstance() : tenant_;
  }
  /**
   * <pre>
   * tenant is the created tenant information.
   * </pre>
   *
   * <code>.base.v1.Tenant tenant = 1 [json_name = "tenant"];</code>
   */
  @java.lang.Override
  public org.permify.grpc.TenantOrBuilder getTenantOrBuilder() {
    return tenant_ == null ? org.permify.grpc.Tenant.getDefaultInstance() : tenant_;
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
      output.writeMessage(1, getTenant());
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
        .computeMessageSize(1, getTenant());
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
    if (!(obj instanceof org.permify.grpc.TenantCreateResponse)) {
      return super.equals(obj);
    }
    org.permify.grpc.TenantCreateResponse other = (org.permify.grpc.TenantCreateResponse) obj;

    if (hasTenant() != other.hasTenant()) return false;
    if (hasTenant()) {
      if (!getTenant()
          .equals(other.getTenant())) return false;
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
    if (hasTenant()) {
      hash = (37 * hash) + TENANT_FIELD_NUMBER;
      hash = (53 * hash) + getTenant().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.permify.grpc.TenantCreateResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.TenantCreateResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.TenantCreateResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.TenantCreateResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.TenantCreateResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.TenantCreateResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.TenantCreateResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.permify.grpc.TenantCreateResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.permify.grpc.TenantCreateResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.permify.grpc.TenantCreateResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.permify.grpc.TenantCreateResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.permify.grpc.TenantCreateResponse parseFrom(
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
  public static Builder newBuilder(org.permify.grpc.TenantCreateResponse prototype) {
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
   * TenantCreateResponse is the message returned from the request to create a tenant.
   * </pre>
   *
   * Protobuf type {@code base.v1.TenantCreateResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:base.v1.TenantCreateResponse)
      org.permify.grpc.TenantCreateResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.permify.grpc.ServiceProto.internal_static_base_v1_TenantCreateResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.permify.grpc.ServiceProto.internal_static_base_v1_TenantCreateResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.permify.grpc.TenantCreateResponse.class, org.permify.grpc.TenantCreateResponse.Builder.class);
    }

    // Construct using org.permify.grpc.TenantCreateResponse.newBuilder()
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
        getTenantFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      tenant_ = null;
      if (tenantBuilder_ != null) {
        tenantBuilder_.dispose();
        tenantBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.permify.grpc.ServiceProto.internal_static_base_v1_TenantCreateResponse_descriptor;
    }

    @java.lang.Override
    public org.permify.grpc.TenantCreateResponse getDefaultInstanceForType() {
      return org.permify.grpc.TenantCreateResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.permify.grpc.TenantCreateResponse build() {
      org.permify.grpc.TenantCreateResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.permify.grpc.TenantCreateResponse buildPartial() {
      org.permify.grpc.TenantCreateResponse result = new org.permify.grpc.TenantCreateResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.permify.grpc.TenantCreateResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.tenant_ = tenantBuilder_ == null
            ? tenant_
            : tenantBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.permify.grpc.TenantCreateResponse) {
        return mergeFrom((org.permify.grpc.TenantCreateResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.permify.grpc.TenantCreateResponse other) {
      if (other == org.permify.grpc.TenantCreateResponse.getDefaultInstance()) return this;
      if (other.hasTenant()) {
        mergeTenant(other.getTenant());
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
                  getTenantFieldBuilder().getBuilder(),
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

    private org.permify.grpc.Tenant tenant_;
    private com.google.protobuf.SingleFieldBuilder<
        org.permify.grpc.Tenant, org.permify.grpc.Tenant.Builder, org.permify.grpc.TenantOrBuilder> tenantBuilder_;
    /**
     * <pre>
     * tenant is the created tenant information.
     * </pre>
     *
     * <code>.base.v1.Tenant tenant = 1 [json_name = "tenant"];</code>
     * @return Whether the tenant field is set.
     */
    public boolean hasTenant() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * tenant is the created tenant information.
     * </pre>
     *
     * <code>.base.v1.Tenant tenant = 1 [json_name = "tenant"];</code>
     * @return The tenant.
     */
    public org.permify.grpc.Tenant getTenant() {
      if (tenantBuilder_ == null) {
        return tenant_ == null ? org.permify.grpc.Tenant.getDefaultInstance() : tenant_;
      } else {
        return tenantBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * tenant is the created tenant information.
     * </pre>
     *
     * <code>.base.v1.Tenant tenant = 1 [json_name = "tenant"];</code>
     */
    public Builder setTenant(org.permify.grpc.Tenant value) {
      if (tenantBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tenant_ = value;
      } else {
        tenantBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * tenant is the created tenant information.
     * </pre>
     *
     * <code>.base.v1.Tenant tenant = 1 [json_name = "tenant"];</code>
     */
    public Builder setTenant(
        org.permify.grpc.Tenant.Builder builderForValue) {
      if (tenantBuilder_ == null) {
        tenant_ = builderForValue.build();
      } else {
        tenantBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * tenant is the created tenant information.
     * </pre>
     *
     * <code>.base.v1.Tenant tenant = 1 [json_name = "tenant"];</code>
     */
    public Builder mergeTenant(org.permify.grpc.Tenant value) {
      if (tenantBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          tenant_ != null &&
          tenant_ != org.permify.grpc.Tenant.getDefaultInstance()) {
          getTenantBuilder().mergeFrom(value);
        } else {
          tenant_ = value;
        }
      } else {
        tenantBuilder_.mergeFrom(value);
      }
      if (tenant_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * tenant is the created tenant information.
     * </pre>
     *
     * <code>.base.v1.Tenant tenant = 1 [json_name = "tenant"];</code>
     */
    public Builder clearTenant() {
      bitField0_ = (bitField0_ & ~0x00000001);
      tenant_ = null;
      if (tenantBuilder_ != null) {
        tenantBuilder_.dispose();
        tenantBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * tenant is the created tenant information.
     * </pre>
     *
     * <code>.base.v1.Tenant tenant = 1 [json_name = "tenant"];</code>
     */
    public org.permify.grpc.Tenant.Builder getTenantBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTenantFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * tenant is the created tenant information.
     * </pre>
     *
     * <code>.base.v1.Tenant tenant = 1 [json_name = "tenant"];</code>
     */
    public org.permify.grpc.TenantOrBuilder getTenantOrBuilder() {
      if (tenantBuilder_ != null) {
        return tenantBuilder_.getMessageOrBuilder();
      } else {
        return tenant_ == null ?
            org.permify.grpc.Tenant.getDefaultInstance() : tenant_;
      }
    }
    /**
     * <pre>
     * tenant is the created tenant information.
     * </pre>
     *
     * <code>.base.v1.Tenant tenant = 1 [json_name = "tenant"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        org.permify.grpc.Tenant, org.permify.grpc.Tenant.Builder, org.permify.grpc.TenantOrBuilder> 
        getTenantFieldBuilder() {
      if (tenantBuilder_ == null) {
        tenantBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            org.permify.grpc.Tenant, org.permify.grpc.Tenant.Builder, org.permify.grpc.TenantOrBuilder>(
                getTenant(),
                getParentForChildren(),
                isClean());
        tenant_ = null;
      }
      return tenantBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:base.v1.TenantCreateResponse)
  }

  // @@protoc_insertion_point(class_scope:base.v1.TenantCreateResponse)
  private static final org.permify.grpc.TenantCreateResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.permify.grpc.TenantCreateResponse();
  }

  public static org.permify.grpc.TenantCreateResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TenantCreateResponse>
      PARSER = new com.google.protobuf.AbstractParser<TenantCreateResponse>() {
    @java.lang.Override
    public TenantCreateResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<TenantCreateResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TenantCreateResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.permify.grpc.TenantCreateResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
