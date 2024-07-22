// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: base/v1/service.proto
// Protobuf Java Version: 4.27.2

package org.permify.grpc;

/**
 * <pre>
 * TenantListResponse is the message returned from the request to list all tenants.
 * </pre>
 *
 * Protobuf type {@code base.v1.TenantListResponse}
 */
public final class TenantListResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:base.v1.TenantListResponse)
    TenantListResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      TenantListResponse.class.getName());
  }
  // Use TenantListResponse.newBuilder() to construct.
  private TenantListResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private TenantListResponse() {
    tenants_ = java.util.Collections.emptyList();
    continuousToken_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.permify.grpc.ServiceProto.internal_static_base_v1_TenantListResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.permify.grpc.ServiceProto.internal_static_base_v1_TenantListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.permify.grpc.TenantListResponse.class, org.permify.grpc.TenantListResponse.Builder.class);
  }

  public static final int TENANTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<org.permify.grpc.Tenant> tenants_;
  /**
   * <pre>
   * tenants is a list of tenants.
   * </pre>
   *
   * <code>repeated .base.v1.Tenant tenants = 1 [json_name = "tenants"];</code>
   */
  @java.lang.Override
  public java.util.List<org.permify.grpc.Tenant> getTenantsList() {
    return tenants_;
  }
  /**
   * <pre>
   * tenants is a list of tenants.
   * </pre>
   *
   * <code>repeated .base.v1.Tenant tenants = 1 [json_name = "tenants"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.permify.grpc.TenantOrBuilder> 
      getTenantsOrBuilderList() {
    return tenants_;
  }
  /**
   * <pre>
   * tenants is a list of tenants.
   * </pre>
   *
   * <code>repeated .base.v1.Tenant tenants = 1 [json_name = "tenants"];</code>
   */
  @java.lang.Override
  public int getTenantsCount() {
    return tenants_.size();
  }
  /**
   * <pre>
   * tenants is a list of tenants.
   * </pre>
   *
   * <code>repeated .base.v1.Tenant tenants = 1 [json_name = "tenants"];</code>
   */
  @java.lang.Override
  public org.permify.grpc.Tenant getTenants(int index) {
    return tenants_.get(index);
  }
  /**
   * <pre>
   * tenants is a list of tenants.
   * </pre>
   *
   * <code>repeated .base.v1.Tenant tenants = 1 [json_name = "tenants"];</code>
   */
  @java.lang.Override
  public org.permify.grpc.TenantOrBuilder getTenantsOrBuilder(
      int index) {
    return tenants_.get(index);
  }

  public static final int CONTINUOUS_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object continuousToken_ = "";
  /**
   * <pre>
   * continuous_token is a string that can be used to paginate and retrieve the next set of results.
   * </pre>
   *
   * <code>string continuous_token = 2 [json_name = "continuous_token"];</code>
   * @return The continuousToken.
   */
  @java.lang.Override
  public java.lang.String getContinuousToken() {
    java.lang.Object ref = continuousToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      continuousToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * continuous_token is a string that can be used to paginate and retrieve the next set of results.
   * </pre>
   *
   * <code>string continuous_token = 2 [json_name = "continuous_token"];</code>
   * @return The bytes for continuousToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getContinuousTokenBytes() {
    java.lang.Object ref = continuousToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      continuousToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < tenants_.size(); i++) {
      output.writeMessage(1, tenants_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(continuousToken_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, continuousToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < tenants_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, tenants_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(continuousToken_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, continuousToken_);
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
    if (!(obj instanceof org.permify.grpc.TenantListResponse)) {
      return super.equals(obj);
    }
    org.permify.grpc.TenantListResponse other = (org.permify.grpc.TenantListResponse) obj;

    if (!getTenantsList()
        .equals(other.getTenantsList())) return false;
    if (!getContinuousToken()
        .equals(other.getContinuousToken())) return false;
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
    if (getTenantsCount() > 0) {
      hash = (37 * hash) + TENANTS_FIELD_NUMBER;
      hash = (53 * hash) + getTenantsList().hashCode();
    }
    hash = (37 * hash) + CONTINUOUS_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getContinuousToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.permify.grpc.TenantListResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.TenantListResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.TenantListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.TenantListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.TenantListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.TenantListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.TenantListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.permify.grpc.TenantListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.permify.grpc.TenantListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.permify.grpc.TenantListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.permify.grpc.TenantListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.permify.grpc.TenantListResponse parseFrom(
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
  public static Builder newBuilder(org.permify.grpc.TenantListResponse prototype) {
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
   * TenantListResponse is the message returned from the request to list all tenants.
   * </pre>
   *
   * Protobuf type {@code base.v1.TenantListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:base.v1.TenantListResponse)
      org.permify.grpc.TenantListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.permify.grpc.ServiceProto.internal_static_base_v1_TenantListResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.permify.grpc.ServiceProto.internal_static_base_v1_TenantListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.permify.grpc.TenantListResponse.class, org.permify.grpc.TenantListResponse.Builder.class);
    }

    // Construct using org.permify.grpc.TenantListResponse.newBuilder()
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
      if (tenantsBuilder_ == null) {
        tenants_ = java.util.Collections.emptyList();
      } else {
        tenants_ = null;
        tenantsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      continuousToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.permify.grpc.ServiceProto.internal_static_base_v1_TenantListResponse_descriptor;
    }

    @java.lang.Override
    public org.permify.grpc.TenantListResponse getDefaultInstanceForType() {
      return org.permify.grpc.TenantListResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.permify.grpc.TenantListResponse build() {
      org.permify.grpc.TenantListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.permify.grpc.TenantListResponse buildPartial() {
      org.permify.grpc.TenantListResponse result = new org.permify.grpc.TenantListResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(org.permify.grpc.TenantListResponse result) {
      if (tenantsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          tenants_ = java.util.Collections.unmodifiableList(tenants_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.tenants_ = tenants_;
      } else {
        result.tenants_ = tenantsBuilder_.build();
      }
    }

    private void buildPartial0(org.permify.grpc.TenantListResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.continuousToken_ = continuousToken_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.permify.grpc.TenantListResponse) {
        return mergeFrom((org.permify.grpc.TenantListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.permify.grpc.TenantListResponse other) {
      if (other == org.permify.grpc.TenantListResponse.getDefaultInstance()) return this;
      if (tenantsBuilder_ == null) {
        if (!other.tenants_.isEmpty()) {
          if (tenants_.isEmpty()) {
            tenants_ = other.tenants_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTenantsIsMutable();
            tenants_.addAll(other.tenants_);
          }
          onChanged();
        }
      } else {
        if (!other.tenants_.isEmpty()) {
          if (tenantsBuilder_.isEmpty()) {
            tenantsBuilder_.dispose();
            tenantsBuilder_ = null;
            tenants_ = other.tenants_;
            bitField0_ = (bitField0_ & ~0x00000001);
            tenantsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getTenantsFieldBuilder() : null;
          } else {
            tenantsBuilder_.addAllMessages(other.tenants_);
          }
        }
      }
      if (!other.getContinuousToken().isEmpty()) {
        continuousToken_ = other.continuousToken_;
        bitField0_ |= 0x00000002;
        onChanged();
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
              org.permify.grpc.Tenant m =
                  input.readMessage(
                      org.permify.grpc.Tenant.parser(),
                      extensionRegistry);
              if (tenantsBuilder_ == null) {
                ensureTenantsIsMutable();
                tenants_.add(m);
              } else {
                tenantsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              continuousToken_ = input.readStringRequireUtf8();
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

    private java.util.List<org.permify.grpc.Tenant> tenants_ =
      java.util.Collections.emptyList();
    private void ensureTenantsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        tenants_ = new java.util.ArrayList<org.permify.grpc.Tenant>(tenants_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        org.permify.grpc.Tenant, org.permify.grpc.Tenant.Builder, org.permify.grpc.TenantOrBuilder> tenantsBuilder_;

    /**
     * <pre>
     * tenants is a list of tenants.
     * </pre>
     *
     * <code>repeated .base.v1.Tenant tenants = 1 [json_name = "tenants"];</code>
     */
    public java.util.List<org.permify.grpc.Tenant> getTenantsList() {
      if (tenantsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(tenants_);
      } else {
        return tenantsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * tenants is a list of tenants.
     * </pre>
     *
     * <code>repeated .base.v1.Tenant tenants = 1 [json_name = "tenants"];</code>
     */
    public int getTenantsCount() {
      if (tenantsBuilder_ == null) {
        return tenants_.size();
      } else {
        return tenantsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * tenants is a list of tenants.
     * </pre>
     *
     * <code>repeated .base.v1.Tenant tenants = 1 [json_name = "tenants"];</code>
     */
    public org.permify.grpc.Tenant getTenants(int index) {
      if (tenantsBuilder_ == null) {
        return tenants_.get(index);
      } else {
        return tenantsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * tenants is a list of tenants.
     * </pre>
     *
     * <code>repeated .base.v1.Tenant tenants = 1 [json_name = "tenants"];</code>
     */
    public Builder setTenants(
        int index, org.permify.grpc.Tenant value) {
      if (tenantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTenantsIsMutable();
        tenants_.set(index, value);
        onChanged();
      } else {
        tenantsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * tenants is a list of tenants.
     * </pre>
     *
     * <code>repeated .base.v1.Tenant tenants = 1 [json_name = "tenants"];</code>
     */
    public Builder setTenants(
        int index, org.permify.grpc.Tenant.Builder builderForValue) {
      if (tenantsBuilder_ == null) {
        ensureTenantsIsMutable();
        tenants_.set(index, builderForValue.build());
        onChanged();
      } else {
        tenantsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * tenants is a list of tenants.
     * </pre>
     *
     * <code>repeated .base.v1.Tenant tenants = 1 [json_name = "tenants"];</code>
     */
    public Builder addTenants(org.permify.grpc.Tenant value) {
      if (tenantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTenantsIsMutable();
        tenants_.add(value);
        onChanged();
      } else {
        tenantsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * tenants is a list of tenants.
     * </pre>
     *
     * <code>repeated .base.v1.Tenant tenants = 1 [json_name = "tenants"];</code>
     */
    public Builder addTenants(
        int index, org.permify.grpc.Tenant value) {
      if (tenantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTenantsIsMutable();
        tenants_.add(index, value);
        onChanged();
      } else {
        tenantsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * tenants is a list of tenants.
     * </pre>
     *
     * <code>repeated .base.v1.Tenant tenants = 1 [json_name = "tenants"];</code>
     */
    public Builder addTenants(
        org.permify.grpc.Tenant.Builder builderForValue) {
      if (tenantsBuilder_ == null) {
        ensureTenantsIsMutable();
        tenants_.add(builderForValue.build());
        onChanged();
      } else {
        tenantsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * tenants is a list of tenants.
     * </pre>
     *
     * <code>repeated .base.v1.Tenant tenants = 1 [json_name = "tenants"];</code>
     */
    public Builder addTenants(
        int index, org.permify.grpc.Tenant.Builder builderForValue) {
      if (tenantsBuilder_ == null) {
        ensureTenantsIsMutable();
        tenants_.add(index, builderForValue.build());
        onChanged();
      } else {
        tenantsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * tenants is a list of tenants.
     * </pre>
     *
     * <code>repeated .base.v1.Tenant tenants = 1 [json_name = "tenants"];</code>
     */
    public Builder addAllTenants(
        java.lang.Iterable<? extends org.permify.grpc.Tenant> values) {
      if (tenantsBuilder_ == null) {
        ensureTenantsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, tenants_);
        onChanged();
      } else {
        tenantsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * tenants is a list of tenants.
     * </pre>
     *
     * <code>repeated .base.v1.Tenant tenants = 1 [json_name = "tenants"];</code>
     */
    public Builder clearTenants() {
      if (tenantsBuilder_ == null) {
        tenants_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        tenantsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * tenants is a list of tenants.
     * </pre>
     *
     * <code>repeated .base.v1.Tenant tenants = 1 [json_name = "tenants"];</code>
     */
    public Builder removeTenants(int index) {
      if (tenantsBuilder_ == null) {
        ensureTenantsIsMutable();
        tenants_.remove(index);
        onChanged();
      } else {
        tenantsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * tenants is a list of tenants.
     * </pre>
     *
     * <code>repeated .base.v1.Tenant tenants = 1 [json_name = "tenants"];</code>
     */
    public org.permify.grpc.Tenant.Builder getTenantsBuilder(
        int index) {
      return getTenantsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * tenants is a list of tenants.
     * </pre>
     *
     * <code>repeated .base.v1.Tenant tenants = 1 [json_name = "tenants"];</code>
     */
    public org.permify.grpc.TenantOrBuilder getTenantsOrBuilder(
        int index) {
      if (tenantsBuilder_ == null) {
        return tenants_.get(index);  } else {
        return tenantsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * tenants is a list of tenants.
     * </pre>
     *
     * <code>repeated .base.v1.Tenant tenants = 1 [json_name = "tenants"];</code>
     */
    public java.util.List<? extends org.permify.grpc.TenantOrBuilder> 
         getTenantsOrBuilderList() {
      if (tenantsBuilder_ != null) {
        return tenantsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(tenants_);
      }
    }
    /**
     * <pre>
     * tenants is a list of tenants.
     * </pre>
     *
     * <code>repeated .base.v1.Tenant tenants = 1 [json_name = "tenants"];</code>
     */
    public org.permify.grpc.Tenant.Builder addTenantsBuilder() {
      return getTenantsFieldBuilder().addBuilder(
          org.permify.grpc.Tenant.getDefaultInstance());
    }
    /**
     * <pre>
     * tenants is a list of tenants.
     * </pre>
     *
     * <code>repeated .base.v1.Tenant tenants = 1 [json_name = "tenants"];</code>
     */
    public org.permify.grpc.Tenant.Builder addTenantsBuilder(
        int index) {
      return getTenantsFieldBuilder().addBuilder(
          index, org.permify.grpc.Tenant.getDefaultInstance());
    }
    /**
     * <pre>
     * tenants is a list of tenants.
     * </pre>
     *
     * <code>repeated .base.v1.Tenant tenants = 1 [json_name = "tenants"];</code>
     */
    public java.util.List<org.permify.grpc.Tenant.Builder> 
         getTenantsBuilderList() {
      return getTenantsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        org.permify.grpc.Tenant, org.permify.grpc.Tenant.Builder, org.permify.grpc.TenantOrBuilder> 
        getTenantsFieldBuilder() {
      if (tenantsBuilder_ == null) {
        tenantsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            org.permify.grpc.Tenant, org.permify.grpc.Tenant.Builder, org.permify.grpc.TenantOrBuilder>(
                tenants_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        tenants_ = null;
      }
      return tenantsBuilder_;
    }

    private java.lang.Object continuousToken_ = "";
    /**
     * <pre>
     * continuous_token is a string that can be used to paginate and retrieve the next set of results.
     * </pre>
     *
     * <code>string continuous_token = 2 [json_name = "continuous_token"];</code>
     * @return The continuousToken.
     */
    public java.lang.String getContinuousToken() {
      java.lang.Object ref = continuousToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        continuousToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * continuous_token is a string that can be used to paginate and retrieve the next set of results.
     * </pre>
     *
     * <code>string continuous_token = 2 [json_name = "continuous_token"];</code>
     * @return The bytes for continuousToken.
     */
    public com.google.protobuf.ByteString
        getContinuousTokenBytes() {
      java.lang.Object ref = continuousToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        continuousToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * continuous_token is a string that can be used to paginate and retrieve the next set of results.
     * </pre>
     *
     * <code>string continuous_token = 2 [json_name = "continuous_token"];</code>
     * @param value The continuousToken to set.
     * @return This builder for chaining.
     */
    public Builder setContinuousToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      continuousToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * continuous_token is a string that can be used to paginate and retrieve the next set of results.
     * </pre>
     *
     * <code>string continuous_token = 2 [json_name = "continuous_token"];</code>
     * @return This builder for chaining.
     */
    public Builder clearContinuousToken() {
      continuousToken_ = getDefaultInstance().getContinuousToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * continuous_token is a string that can be used to paginate and retrieve the next set of results.
     * </pre>
     *
     * <code>string continuous_token = 2 [json_name = "continuous_token"];</code>
     * @param value The bytes for continuousToken to set.
     * @return This builder for chaining.
     */
    public Builder setContinuousTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      continuousToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:base.v1.TenantListResponse)
  }

  // @@protoc_insertion_point(class_scope:base.v1.TenantListResponse)
  private static final org.permify.grpc.TenantListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.permify.grpc.TenantListResponse();
  }

  public static org.permify.grpc.TenantListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TenantListResponse>
      PARSER = new com.google.protobuf.AbstractParser<TenantListResponse>() {
    @java.lang.Override
    public TenantListResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<TenantListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TenantListResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.permify.grpc.TenantListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
