// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: base/v1/service.proto
// Protobuf Java Version: 4.27.2

package org.permify.grpc;

/**
 * <pre>
 * PermissionLookupEntityResponse is the response message for the LookupEntity method in the Permission service.
 * </pre>
 *
 * Protobuf type {@code base.v1.PermissionLookupEntityResponse}
 */
public final class PermissionLookupEntityResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:base.v1.PermissionLookupEntityResponse)
    PermissionLookupEntityResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      PermissionLookupEntityResponse.class.getName());
  }
  // Use PermissionLookupEntityResponse.newBuilder() to construct.
  private PermissionLookupEntityResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private PermissionLookupEntityResponse() {
    entityIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.permify.grpc.ServiceProto.internal_static_base_v1_PermissionLookupEntityResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.permify.grpc.ServiceProto.internal_static_base_v1_PermissionLookupEntityResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.permify.grpc.PermissionLookupEntityResponse.class, org.permify.grpc.PermissionLookupEntityResponse.Builder.class);
  }

  public static final int ENTITY_IDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList entityIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * List of identifiers for entities that match the lookup.
   * </pre>
   *
   * <code>repeated string entity_ids = 1 [json_name = "entity_ids"];</code>
   * @return A list containing the entityIds.
   */
  public com.google.protobuf.ProtocolStringList
      getEntityIdsList() {
    return entityIds_;
  }
  /**
   * <pre>
   * List of identifiers for entities that match the lookup.
   * </pre>
   *
   * <code>repeated string entity_ids = 1 [json_name = "entity_ids"];</code>
   * @return The count of entityIds.
   */
  public int getEntityIdsCount() {
    return entityIds_.size();
  }
  /**
   * <pre>
   * List of identifiers for entities that match the lookup.
   * </pre>
   *
   * <code>repeated string entity_ids = 1 [json_name = "entity_ids"];</code>
   * @param index The index of the element to return.
   * @return The entityIds at the given index.
   */
  public java.lang.String getEntityIds(int index) {
    return entityIds_.get(index);
  }
  /**
   * <pre>
   * List of identifiers for entities that match the lookup.
   * </pre>
   *
   * <code>repeated string entity_ids = 1 [json_name = "entity_ids"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the entityIds at the given index.
   */
  public com.google.protobuf.ByteString
      getEntityIdsBytes(int index) {
    return entityIds_.getByteString(index);
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
    for (int i = 0; i < entityIds_.size(); i++) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, entityIds_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < entityIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(entityIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getEntityIdsList().size();
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
    if (!(obj instanceof org.permify.grpc.PermissionLookupEntityResponse)) {
      return super.equals(obj);
    }
    org.permify.grpc.PermissionLookupEntityResponse other = (org.permify.grpc.PermissionLookupEntityResponse) obj;

    if (!getEntityIdsList()
        .equals(other.getEntityIdsList())) return false;
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
    if (getEntityIdsCount() > 0) {
      hash = (37 * hash) + ENTITY_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getEntityIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.permify.grpc.PermissionLookupEntityResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.PermissionLookupEntityResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.PermissionLookupEntityResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.PermissionLookupEntityResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.PermissionLookupEntityResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.PermissionLookupEntityResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.PermissionLookupEntityResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.permify.grpc.PermissionLookupEntityResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.permify.grpc.PermissionLookupEntityResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.permify.grpc.PermissionLookupEntityResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.permify.grpc.PermissionLookupEntityResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.permify.grpc.PermissionLookupEntityResponse parseFrom(
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
  public static Builder newBuilder(org.permify.grpc.PermissionLookupEntityResponse prototype) {
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
   * PermissionLookupEntityResponse is the response message for the LookupEntity method in the Permission service.
   * </pre>
   *
   * Protobuf type {@code base.v1.PermissionLookupEntityResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:base.v1.PermissionLookupEntityResponse)
      org.permify.grpc.PermissionLookupEntityResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.permify.grpc.ServiceProto.internal_static_base_v1_PermissionLookupEntityResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.permify.grpc.ServiceProto.internal_static_base_v1_PermissionLookupEntityResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.permify.grpc.PermissionLookupEntityResponse.class, org.permify.grpc.PermissionLookupEntityResponse.Builder.class);
    }

    // Construct using org.permify.grpc.PermissionLookupEntityResponse.newBuilder()
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
      entityIds_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.permify.grpc.ServiceProto.internal_static_base_v1_PermissionLookupEntityResponse_descriptor;
    }

    @java.lang.Override
    public org.permify.grpc.PermissionLookupEntityResponse getDefaultInstanceForType() {
      return org.permify.grpc.PermissionLookupEntityResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.permify.grpc.PermissionLookupEntityResponse build() {
      org.permify.grpc.PermissionLookupEntityResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.permify.grpc.PermissionLookupEntityResponse buildPartial() {
      org.permify.grpc.PermissionLookupEntityResponse result = new org.permify.grpc.PermissionLookupEntityResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.permify.grpc.PermissionLookupEntityResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        entityIds_.makeImmutable();
        result.entityIds_ = entityIds_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.permify.grpc.PermissionLookupEntityResponse) {
        return mergeFrom((org.permify.grpc.PermissionLookupEntityResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.permify.grpc.PermissionLookupEntityResponse other) {
      if (other == org.permify.grpc.PermissionLookupEntityResponse.getDefaultInstance()) return this;
      if (!other.entityIds_.isEmpty()) {
        if (entityIds_.isEmpty()) {
          entityIds_ = other.entityIds_;
          bitField0_ |= 0x00000001;
        } else {
          ensureEntityIdsIsMutable();
          entityIds_.addAll(other.entityIds_);
        }
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureEntityIdsIsMutable();
              entityIds_.add(s);
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

    private com.google.protobuf.LazyStringArrayList entityIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureEntityIdsIsMutable() {
      if (!entityIds_.isModifiable()) {
        entityIds_ = new com.google.protobuf.LazyStringArrayList(entityIds_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * List of identifiers for entities that match the lookup.
     * </pre>
     *
     * <code>repeated string entity_ids = 1 [json_name = "entity_ids"];</code>
     * @return A list containing the entityIds.
     */
    public com.google.protobuf.ProtocolStringList
        getEntityIdsList() {
      entityIds_.makeImmutable();
      return entityIds_;
    }
    /**
     * <pre>
     * List of identifiers for entities that match the lookup.
     * </pre>
     *
     * <code>repeated string entity_ids = 1 [json_name = "entity_ids"];</code>
     * @return The count of entityIds.
     */
    public int getEntityIdsCount() {
      return entityIds_.size();
    }
    /**
     * <pre>
     * List of identifiers for entities that match the lookup.
     * </pre>
     *
     * <code>repeated string entity_ids = 1 [json_name = "entity_ids"];</code>
     * @param index The index of the element to return.
     * @return The entityIds at the given index.
     */
    public java.lang.String getEntityIds(int index) {
      return entityIds_.get(index);
    }
    /**
     * <pre>
     * List of identifiers for entities that match the lookup.
     * </pre>
     *
     * <code>repeated string entity_ids = 1 [json_name = "entity_ids"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the entityIds at the given index.
     */
    public com.google.protobuf.ByteString
        getEntityIdsBytes(int index) {
      return entityIds_.getByteString(index);
    }
    /**
     * <pre>
     * List of identifiers for entities that match the lookup.
     * </pre>
     *
     * <code>repeated string entity_ids = 1 [json_name = "entity_ids"];</code>
     * @param index The index to set the value at.
     * @param value The entityIds to set.
     * @return This builder for chaining.
     */
    public Builder setEntityIds(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureEntityIdsIsMutable();
      entityIds_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of identifiers for entities that match the lookup.
     * </pre>
     *
     * <code>repeated string entity_ids = 1 [json_name = "entity_ids"];</code>
     * @param value The entityIds to add.
     * @return This builder for chaining.
     */
    public Builder addEntityIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureEntityIdsIsMutable();
      entityIds_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of identifiers for entities that match the lookup.
     * </pre>
     *
     * <code>repeated string entity_ids = 1 [json_name = "entity_ids"];</code>
     * @param values The entityIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllEntityIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureEntityIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, entityIds_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of identifiers for entities that match the lookup.
     * </pre>
     *
     * <code>repeated string entity_ids = 1 [json_name = "entity_ids"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEntityIds() {
      entityIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of identifiers for entities that match the lookup.
     * </pre>
     *
     * <code>repeated string entity_ids = 1 [json_name = "entity_ids"];</code>
     * @param value The bytes of the entityIds to add.
     * @return This builder for chaining.
     */
    public Builder addEntityIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureEntityIdsIsMutable();
      entityIds_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:base.v1.PermissionLookupEntityResponse)
  }

  // @@protoc_insertion_point(class_scope:base.v1.PermissionLookupEntityResponse)
  private static final org.permify.grpc.PermissionLookupEntityResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.permify.grpc.PermissionLookupEntityResponse();
  }

  public static org.permify.grpc.PermissionLookupEntityResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PermissionLookupEntityResponse>
      PARSER = new com.google.protobuf.AbstractParser<PermissionLookupEntityResponse>() {
    @java.lang.Override
    public PermissionLookupEntityResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<PermissionLookupEntityResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PermissionLookupEntityResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.permify.grpc.PermissionLookupEntityResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
