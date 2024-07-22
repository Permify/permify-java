// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: base/v1/service.proto
// Protobuf Java Version: 4.27.2

package org.permify.grpc;

/**
 * <pre>
 * SchemaListResponse is the response message for the List method in the Schema service.
 * It returns a paginated list of schemas
 * </pre>
 *
 * Protobuf type {@code base.v1.SchemaListResponse}
 */
public final class SchemaListResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:base.v1.SchemaListResponse)
    SchemaListResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      SchemaListResponse.class.getName());
  }
  // Use SchemaListResponse.newBuilder() to construct.
  private SchemaListResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private SchemaListResponse() {
    head_ = "";
    schemas_ = java.util.Collections.emptyList();
    continuousToken_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.permify.grpc.ServiceProto.internal_static_base_v1_SchemaListResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.permify.grpc.ServiceProto.internal_static_base_v1_SchemaListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.permify.grpc.SchemaListResponse.class, org.permify.grpc.SchemaListResponse.Builder.class);
  }

  public static final int HEAD_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object head_ = "";
  /**
   * <pre>
   * head of the schemas is the latest version available for the tenant
   * </pre>
   *
   * <code>string head = 1 [json_name = "head"];</code>
   * @return The head.
   */
  @java.lang.Override
  public java.lang.String getHead() {
    java.lang.Object ref = head_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      head_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * head of the schemas is the latest version available for the tenant
   * </pre>
   *
   * <code>string head = 1 [json_name = "head"];</code>
   * @return The bytes for head.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHeadBytes() {
    java.lang.Object ref = head_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      head_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SCHEMAS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<org.permify.grpc.SchemaList> schemas_;
  /**
   * <pre>
   * list of schema versions with creation timestamps
   * </pre>
   *
   * <code>repeated .base.v1.SchemaList schemas = 2 [json_name = "schemas"];</code>
   */
  @java.lang.Override
  public java.util.List<org.permify.grpc.SchemaList> getSchemasList() {
    return schemas_;
  }
  /**
   * <pre>
   * list of schema versions with creation timestamps
   * </pre>
   *
   * <code>repeated .base.v1.SchemaList schemas = 2 [json_name = "schemas"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.permify.grpc.SchemaListOrBuilder> 
      getSchemasOrBuilderList() {
    return schemas_;
  }
  /**
   * <pre>
   * list of schema versions with creation timestamps
   * </pre>
   *
   * <code>repeated .base.v1.SchemaList schemas = 2 [json_name = "schemas"];</code>
   */
  @java.lang.Override
  public int getSchemasCount() {
    return schemas_.size();
  }
  /**
   * <pre>
   * list of schema versions with creation timestamps
   * </pre>
   *
   * <code>repeated .base.v1.SchemaList schemas = 2 [json_name = "schemas"];</code>
   */
  @java.lang.Override
  public org.permify.grpc.SchemaList getSchemas(int index) {
    return schemas_.get(index);
  }
  /**
   * <pre>
   * list of schema versions with creation timestamps
   * </pre>
   *
   * <code>repeated .base.v1.SchemaList schemas = 2 [json_name = "schemas"];</code>
   */
  @java.lang.Override
  public org.permify.grpc.SchemaListOrBuilder getSchemasOrBuilder(
      int index) {
    return schemas_.get(index);
  }

  public static final int CONTINUOUS_TOKEN_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object continuousToken_ = "";
  /**
   * <pre>
   * continuous_token is a string that can be used to paginate and retrieve the next set of results.
   * </pre>
   *
   * <code>string continuous_token = 3 [json_name = "continuous_token"];</code>
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
   * <code>string continuous_token = 3 [json_name = "continuous_token"];</code>
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(head_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, head_);
    }
    for (int i = 0; i < schemas_.size(); i++) {
      output.writeMessage(2, schemas_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(continuousToken_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, continuousToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(head_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, head_);
    }
    for (int i = 0; i < schemas_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, schemas_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(continuousToken_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, continuousToken_);
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
    if (!(obj instanceof org.permify.grpc.SchemaListResponse)) {
      return super.equals(obj);
    }
    org.permify.grpc.SchemaListResponse other = (org.permify.grpc.SchemaListResponse) obj;

    if (!getHead()
        .equals(other.getHead())) return false;
    if (!getSchemasList()
        .equals(other.getSchemasList())) return false;
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
    hash = (37 * hash) + HEAD_FIELD_NUMBER;
    hash = (53 * hash) + getHead().hashCode();
    if (getSchemasCount() > 0) {
      hash = (37 * hash) + SCHEMAS_FIELD_NUMBER;
      hash = (53 * hash) + getSchemasList().hashCode();
    }
    hash = (37 * hash) + CONTINUOUS_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getContinuousToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.permify.grpc.SchemaListResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.SchemaListResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.SchemaListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.SchemaListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.SchemaListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.SchemaListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.SchemaListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.permify.grpc.SchemaListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.permify.grpc.SchemaListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.permify.grpc.SchemaListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.permify.grpc.SchemaListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.permify.grpc.SchemaListResponse parseFrom(
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
  public static Builder newBuilder(org.permify.grpc.SchemaListResponse prototype) {
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
   * SchemaListResponse is the response message for the List method in the Schema service.
   * It returns a paginated list of schemas
   * </pre>
   *
   * Protobuf type {@code base.v1.SchemaListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:base.v1.SchemaListResponse)
      org.permify.grpc.SchemaListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.permify.grpc.ServiceProto.internal_static_base_v1_SchemaListResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.permify.grpc.ServiceProto.internal_static_base_v1_SchemaListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.permify.grpc.SchemaListResponse.class, org.permify.grpc.SchemaListResponse.Builder.class);
    }

    // Construct using org.permify.grpc.SchemaListResponse.newBuilder()
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
      head_ = "";
      if (schemasBuilder_ == null) {
        schemas_ = java.util.Collections.emptyList();
      } else {
        schemas_ = null;
        schemasBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      continuousToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.permify.grpc.ServiceProto.internal_static_base_v1_SchemaListResponse_descriptor;
    }

    @java.lang.Override
    public org.permify.grpc.SchemaListResponse getDefaultInstanceForType() {
      return org.permify.grpc.SchemaListResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.permify.grpc.SchemaListResponse build() {
      org.permify.grpc.SchemaListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.permify.grpc.SchemaListResponse buildPartial() {
      org.permify.grpc.SchemaListResponse result = new org.permify.grpc.SchemaListResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(org.permify.grpc.SchemaListResponse result) {
      if (schemasBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          schemas_ = java.util.Collections.unmodifiableList(schemas_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.schemas_ = schemas_;
      } else {
        result.schemas_ = schemasBuilder_.build();
      }
    }

    private void buildPartial0(org.permify.grpc.SchemaListResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.head_ = head_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.continuousToken_ = continuousToken_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.permify.grpc.SchemaListResponse) {
        return mergeFrom((org.permify.grpc.SchemaListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.permify.grpc.SchemaListResponse other) {
      if (other == org.permify.grpc.SchemaListResponse.getDefaultInstance()) return this;
      if (!other.getHead().isEmpty()) {
        head_ = other.head_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (schemasBuilder_ == null) {
        if (!other.schemas_.isEmpty()) {
          if (schemas_.isEmpty()) {
            schemas_ = other.schemas_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureSchemasIsMutable();
            schemas_.addAll(other.schemas_);
          }
          onChanged();
        }
      } else {
        if (!other.schemas_.isEmpty()) {
          if (schemasBuilder_.isEmpty()) {
            schemasBuilder_.dispose();
            schemasBuilder_ = null;
            schemas_ = other.schemas_;
            bitField0_ = (bitField0_ & ~0x00000002);
            schemasBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getSchemasFieldBuilder() : null;
          } else {
            schemasBuilder_.addAllMessages(other.schemas_);
          }
        }
      }
      if (!other.getContinuousToken().isEmpty()) {
        continuousToken_ = other.continuousToken_;
        bitField0_ |= 0x00000004;
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
              head_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              org.permify.grpc.SchemaList m =
                  input.readMessage(
                      org.permify.grpc.SchemaList.parser(),
                      extensionRegistry);
              if (schemasBuilder_ == null) {
                ensureSchemasIsMutable();
                schemas_.add(m);
              } else {
                schemasBuilder_.addMessage(m);
              }
              break;
            } // case 18
            case 26: {
              continuousToken_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private java.lang.Object head_ = "";
    /**
     * <pre>
     * head of the schemas is the latest version available for the tenant
     * </pre>
     *
     * <code>string head = 1 [json_name = "head"];</code>
     * @return The head.
     */
    public java.lang.String getHead() {
      java.lang.Object ref = head_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        head_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * head of the schemas is the latest version available for the tenant
     * </pre>
     *
     * <code>string head = 1 [json_name = "head"];</code>
     * @return The bytes for head.
     */
    public com.google.protobuf.ByteString
        getHeadBytes() {
      java.lang.Object ref = head_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        head_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * head of the schemas is the latest version available for the tenant
     * </pre>
     *
     * <code>string head = 1 [json_name = "head"];</code>
     * @param value The head to set.
     * @return This builder for chaining.
     */
    public Builder setHead(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      head_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * head of the schemas is the latest version available for the tenant
     * </pre>
     *
     * <code>string head = 1 [json_name = "head"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHead() {
      head_ = getDefaultInstance().getHead();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * head of the schemas is the latest version available for the tenant
     * </pre>
     *
     * <code>string head = 1 [json_name = "head"];</code>
     * @param value The bytes for head to set.
     * @return This builder for chaining.
     */
    public Builder setHeadBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      head_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<org.permify.grpc.SchemaList> schemas_ =
      java.util.Collections.emptyList();
    private void ensureSchemasIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        schemas_ = new java.util.ArrayList<org.permify.grpc.SchemaList>(schemas_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        org.permify.grpc.SchemaList, org.permify.grpc.SchemaList.Builder, org.permify.grpc.SchemaListOrBuilder> schemasBuilder_;

    /**
     * <pre>
     * list of schema versions with creation timestamps
     * </pre>
     *
     * <code>repeated .base.v1.SchemaList schemas = 2 [json_name = "schemas"];</code>
     */
    public java.util.List<org.permify.grpc.SchemaList> getSchemasList() {
      if (schemasBuilder_ == null) {
        return java.util.Collections.unmodifiableList(schemas_);
      } else {
        return schemasBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * list of schema versions with creation timestamps
     * </pre>
     *
     * <code>repeated .base.v1.SchemaList schemas = 2 [json_name = "schemas"];</code>
     */
    public int getSchemasCount() {
      if (schemasBuilder_ == null) {
        return schemas_.size();
      } else {
        return schemasBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * list of schema versions with creation timestamps
     * </pre>
     *
     * <code>repeated .base.v1.SchemaList schemas = 2 [json_name = "schemas"];</code>
     */
    public org.permify.grpc.SchemaList getSchemas(int index) {
      if (schemasBuilder_ == null) {
        return schemas_.get(index);
      } else {
        return schemasBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * list of schema versions with creation timestamps
     * </pre>
     *
     * <code>repeated .base.v1.SchemaList schemas = 2 [json_name = "schemas"];</code>
     */
    public Builder setSchemas(
        int index, org.permify.grpc.SchemaList value) {
      if (schemasBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSchemasIsMutable();
        schemas_.set(index, value);
        onChanged();
      } else {
        schemasBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * list of schema versions with creation timestamps
     * </pre>
     *
     * <code>repeated .base.v1.SchemaList schemas = 2 [json_name = "schemas"];</code>
     */
    public Builder setSchemas(
        int index, org.permify.grpc.SchemaList.Builder builderForValue) {
      if (schemasBuilder_ == null) {
        ensureSchemasIsMutable();
        schemas_.set(index, builderForValue.build());
        onChanged();
      } else {
        schemasBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of schema versions with creation timestamps
     * </pre>
     *
     * <code>repeated .base.v1.SchemaList schemas = 2 [json_name = "schemas"];</code>
     */
    public Builder addSchemas(org.permify.grpc.SchemaList value) {
      if (schemasBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSchemasIsMutable();
        schemas_.add(value);
        onChanged();
      } else {
        schemasBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * list of schema versions with creation timestamps
     * </pre>
     *
     * <code>repeated .base.v1.SchemaList schemas = 2 [json_name = "schemas"];</code>
     */
    public Builder addSchemas(
        int index, org.permify.grpc.SchemaList value) {
      if (schemasBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSchemasIsMutable();
        schemas_.add(index, value);
        onChanged();
      } else {
        schemasBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * list of schema versions with creation timestamps
     * </pre>
     *
     * <code>repeated .base.v1.SchemaList schemas = 2 [json_name = "schemas"];</code>
     */
    public Builder addSchemas(
        org.permify.grpc.SchemaList.Builder builderForValue) {
      if (schemasBuilder_ == null) {
        ensureSchemasIsMutable();
        schemas_.add(builderForValue.build());
        onChanged();
      } else {
        schemasBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of schema versions with creation timestamps
     * </pre>
     *
     * <code>repeated .base.v1.SchemaList schemas = 2 [json_name = "schemas"];</code>
     */
    public Builder addSchemas(
        int index, org.permify.grpc.SchemaList.Builder builderForValue) {
      if (schemasBuilder_ == null) {
        ensureSchemasIsMutable();
        schemas_.add(index, builderForValue.build());
        onChanged();
      } else {
        schemasBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * list of schema versions with creation timestamps
     * </pre>
     *
     * <code>repeated .base.v1.SchemaList schemas = 2 [json_name = "schemas"];</code>
     */
    public Builder addAllSchemas(
        java.lang.Iterable<? extends org.permify.grpc.SchemaList> values) {
      if (schemasBuilder_ == null) {
        ensureSchemasIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, schemas_);
        onChanged();
      } else {
        schemasBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * list of schema versions with creation timestamps
     * </pre>
     *
     * <code>repeated .base.v1.SchemaList schemas = 2 [json_name = "schemas"];</code>
     */
    public Builder clearSchemas() {
      if (schemasBuilder_ == null) {
        schemas_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        schemasBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * list of schema versions with creation timestamps
     * </pre>
     *
     * <code>repeated .base.v1.SchemaList schemas = 2 [json_name = "schemas"];</code>
     */
    public Builder removeSchemas(int index) {
      if (schemasBuilder_ == null) {
        ensureSchemasIsMutable();
        schemas_.remove(index);
        onChanged();
      } else {
        schemasBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * list of schema versions with creation timestamps
     * </pre>
     *
     * <code>repeated .base.v1.SchemaList schemas = 2 [json_name = "schemas"];</code>
     */
    public org.permify.grpc.SchemaList.Builder getSchemasBuilder(
        int index) {
      return getSchemasFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * list of schema versions with creation timestamps
     * </pre>
     *
     * <code>repeated .base.v1.SchemaList schemas = 2 [json_name = "schemas"];</code>
     */
    public org.permify.grpc.SchemaListOrBuilder getSchemasOrBuilder(
        int index) {
      if (schemasBuilder_ == null) {
        return schemas_.get(index);  } else {
        return schemasBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * list of schema versions with creation timestamps
     * </pre>
     *
     * <code>repeated .base.v1.SchemaList schemas = 2 [json_name = "schemas"];</code>
     */
    public java.util.List<? extends org.permify.grpc.SchemaListOrBuilder> 
         getSchemasOrBuilderList() {
      if (schemasBuilder_ != null) {
        return schemasBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(schemas_);
      }
    }
    /**
     * <pre>
     * list of schema versions with creation timestamps
     * </pre>
     *
     * <code>repeated .base.v1.SchemaList schemas = 2 [json_name = "schemas"];</code>
     */
    public org.permify.grpc.SchemaList.Builder addSchemasBuilder() {
      return getSchemasFieldBuilder().addBuilder(
          org.permify.grpc.SchemaList.getDefaultInstance());
    }
    /**
     * <pre>
     * list of schema versions with creation timestamps
     * </pre>
     *
     * <code>repeated .base.v1.SchemaList schemas = 2 [json_name = "schemas"];</code>
     */
    public org.permify.grpc.SchemaList.Builder addSchemasBuilder(
        int index) {
      return getSchemasFieldBuilder().addBuilder(
          index, org.permify.grpc.SchemaList.getDefaultInstance());
    }
    /**
     * <pre>
     * list of schema versions with creation timestamps
     * </pre>
     *
     * <code>repeated .base.v1.SchemaList schemas = 2 [json_name = "schemas"];</code>
     */
    public java.util.List<org.permify.grpc.SchemaList.Builder> 
         getSchemasBuilderList() {
      return getSchemasFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        org.permify.grpc.SchemaList, org.permify.grpc.SchemaList.Builder, org.permify.grpc.SchemaListOrBuilder> 
        getSchemasFieldBuilder() {
      if (schemasBuilder_ == null) {
        schemasBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            org.permify.grpc.SchemaList, org.permify.grpc.SchemaList.Builder, org.permify.grpc.SchemaListOrBuilder>(
                schemas_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        schemas_ = null;
      }
      return schemasBuilder_;
    }

    private java.lang.Object continuousToken_ = "";
    /**
     * <pre>
     * continuous_token is a string that can be used to paginate and retrieve the next set of results.
     * </pre>
     *
     * <code>string continuous_token = 3 [json_name = "continuous_token"];</code>
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
     * <code>string continuous_token = 3 [json_name = "continuous_token"];</code>
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
     * <code>string continuous_token = 3 [json_name = "continuous_token"];</code>
     * @param value The continuousToken to set.
     * @return This builder for chaining.
     */
    public Builder setContinuousToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      continuousToken_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * continuous_token is a string that can be used to paginate and retrieve the next set of results.
     * </pre>
     *
     * <code>string continuous_token = 3 [json_name = "continuous_token"];</code>
     * @return This builder for chaining.
     */
    public Builder clearContinuousToken() {
      continuousToken_ = getDefaultInstance().getContinuousToken();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * continuous_token is a string that can be used to paginate and retrieve the next set of results.
     * </pre>
     *
     * <code>string continuous_token = 3 [json_name = "continuous_token"];</code>
     * @param value The bytes for continuousToken to set.
     * @return This builder for chaining.
     */
    public Builder setContinuousTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      continuousToken_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:base.v1.SchemaListResponse)
  }

  // @@protoc_insertion_point(class_scope:base.v1.SchemaListResponse)
  private static final org.permify.grpc.SchemaListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.permify.grpc.SchemaListResponse();
  }

  public static org.permify.grpc.SchemaListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SchemaListResponse>
      PARSER = new com.google.protobuf.AbstractParser<SchemaListResponse>() {
    @java.lang.Override
    public SchemaListResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SchemaListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SchemaListResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.permify.grpc.SchemaListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
