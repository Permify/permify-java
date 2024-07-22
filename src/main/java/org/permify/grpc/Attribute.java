// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: base/v1/base.proto
// Protobuf Java Version: 4.27.2

package org.permify.grpc;

/**
 * <pre>
 * Attribute represents an attribute of an entity with a specific type and value.
 * </pre>
 *
 * Protobuf type {@code base.v1.Attribute}
 */
public final class Attribute extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:base.v1.Attribute)
    AttributeOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      Attribute.class.getName());
  }
  // Use Attribute.newBuilder() to construct.
  private Attribute(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Attribute() {
    attribute_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.permify.grpc.BaseProto.internal_static_base_v1_Attribute_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.permify.grpc.BaseProto.internal_static_base_v1_Attribute_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.permify.grpc.Attribute.class, org.permify.grpc.Attribute.Builder.class);
  }

  private int bitField0_;
  public static final int ENTITY_FIELD_NUMBER = 1;
  private org.permify.grpc.Entity entity_;
  /**
   * <code>.base.v1.Entity entity = 1 [json_name = "entity", (.validate.rules) = { ... }</code>
   * @return Whether the entity field is set.
   */
  @java.lang.Override
  public boolean hasEntity() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.base.v1.Entity entity = 1 [json_name = "entity", (.validate.rules) = { ... }</code>
   * @return The entity.
   */
  @java.lang.Override
  public org.permify.grpc.Entity getEntity() {
    return entity_ == null ? org.permify.grpc.Entity.getDefaultInstance() : entity_;
  }
  /**
   * <code>.base.v1.Entity entity = 1 [json_name = "entity", (.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public org.permify.grpc.EntityOrBuilder getEntityOrBuilder() {
    return entity_ == null ? org.permify.grpc.Entity.getDefaultInstance() : entity_;
  }

  public static final int ATTRIBUTE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object attribute_ = "";
  /**
   * <pre>
   * Name of the attribute
   * </pre>
   *
   * <code>string attribute = 2 [json_name = "attribute"];</code>
   * @return The attribute.
   */
  @java.lang.Override
  public java.lang.String getAttribute() {
    java.lang.Object ref = attribute_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      attribute_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of the attribute
   * </pre>
   *
   * <code>string attribute = 2 [json_name = "attribute"];</code>
   * @return The bytes for attribute.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAttributeBytes() {
    java.lang.Object ref = attribute_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      attribute_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUE_FIELD_NUMBER = 3;
  private com.google.protobuf.Any value_;
  /**
   * <code>.google.protobuf.Any value = 3 [json_name = "value"];</code>
   * @return Whether the value field is set.
   */
  @java.lang.Override
  public boolean hasValue() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>.google.protobuf.Any value = 3 [json_name = "value"];</code>
   * @return The value.
   */
  @java.lang.Override
  public com.google.protobuf.Any getValue() {
    return value_ == null ? com.google.protobuf.Any.getDefaultInstance() : value_;
  }
  /**
   * <code>.google.protobuf.Any value = 3 [json_name = "value"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.AnyOrBuilder getValueOrBuilder() {
    return value_ == null ? com.google.protobuf.Any.getDefaultInstance() : value_;
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
      output.writeMessage(1, getEntity());
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(attribute_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, attribute_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(3, getValue());
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
        .computeMessageSize(1, getEntity());
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(attribute_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, attribute_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getValue());
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
    if (!(obj instanceof org.permify.grpc.Attribute)) {
      return super.equals(obj);
    }
    org.permify.grpc.Attribute other = (org.permify.grpc.Attribute) obj;

    if (hasEntity() != other.hasEntity()) return false;
    if (hasEntity()) {
      if (!getEntity()
          .equals(other.getEntity())) return false;
    }
    if (!getAttribute()
        .equals(other.getAttribute())) return false;
    if (hasValue() != other.hasValue()) return false;
    if (hasValue()) {
      if (!getValue()
          .equals(other.getValue())) return false;
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
    if (hasEntity()) {
      hash = (37 * hash) + ENTITY_FIELD_NUMBER;
      hash = (53 * hash) + getEntity().hashCode();
    }
    hash = (37 * hash) + ATTRIBUTE_FIELD_NUMBER;
    hash = (53 * hash) + getAttribute().hashCode();
    if (hasValue()) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.permify.grpc.Attribute parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.Attribute parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.Attribute parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.Attribute parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.Attribute parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.Attribute parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.Attribute parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.permify.grpc.Attribute parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.permify.grpc.Attribute parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.permify.grpc.Attribute parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.permify.grpc.Attribute parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.permify.grpc.Attribute parseFrom(
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
  public static Builder newBuilder(org.permify.grpc.Attribute prototype) {
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
   * Attribute represents an attribute of an entity with a specific type and value.
   * </pre>
   *
   * Protobuf type {@code base.v1.Attribute}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:base.v1.Attribute)
      org.permify.grpc.AttributeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.permify.grpc.BaseProto.internal_static_base_v1_Attribute_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.permify.grpc.BaseProto.internal_static_base_v1_Attribute_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.permify.grpc.Attribute.class, org.permify.grpc.Attribute.Builder.class);
    }

    // Construct using org.permify.grpc.Attribute.newBuilder()
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
        getEntityFieldBuilder();
        getValueFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      entity_ = null;
      if (entityBuilder_ != null) {
        entityBuilder_.dispose();
        entityBuilder_ = null;
      }
      attribute_ = "";
      value_ = null;
      if (valueBuilder_ != null) {
        valueBuilder_.dispose();
        valueBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.permify.grpc.BaseProto.internal_static_base_v1_Attribute_descriptor;
    }

    @java.lang.Override
    public org.permify.grpc.Attribute getDefaultInstanceForType() {
      return org.permify.grpc.Attribute.getDefaultInstance();
    }

    @java.lang.Override
    public org.permify.grpc.Attribute build() {
      org.permify.grpc.Attribute result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.permify.grpc.Attribute buildPartial() {
      org.permify.grpc.Attribute result = new org.permify.grpc.Attribute(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.permify.grpc.Attribute result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.entity_ = entityBuilder_ == null
            ? entity_
            : entityBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.attribute_ = attribute_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.value_ = valueBuilder_ == null
            ? value_
            : valueBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.permify.grpc.Attribute) {
        return mergeFrom((org.permify.grpc.Attribute)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.permify.grpc.Attribute other) {
      if (other == org.permify.grpc.Attribute.getDefaultInstance()) return this;
      if (other.hasEntity()) {
        mergeEntity(other.getEntity());
      }
      if (!other.getAttribute().isEmpty()) {
        attribute_ = other.attribute_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasValue()) {
        mergeValue(other.getValue());
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
                  getEntityFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              attribute_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getValueFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private org.permify.grpc.Entity entity_;
    private com.google.protobuf.SingleFieldBuilder<
        org.permify.grpc.Entity, org.permify.grpc.Entity.Builder, org.permify.grpc.EntityOrBuilder> entityBuilder_;
    /**
     * <code>.base.v1.Entity entity = 1 [json_name = "entity", (.validate.rules) = { ... }</code>
     * @return Whether the entity field is set.
     */
    public boolean hasEntity() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.base.v1.Entity entity = 1 [json_name = "entity", (.validate.rules) = { ... }</code>
     * @return The entity.
     */
    public org.permify.grpc.Entity getEntity() {
      if (entityBuilder_ == null) {
        return entity_ == null ? org.permify.grpc.Entity.getDefaultInstance() : entity_;
      } else {
        return entityBuilder_.getMessage();
      }
    }
    /**
     * <code>.base.v1.Entity entity = 1 [json_name = "entity", (.validate.rules) = { ... }</code>
     */
    public Builder setEntity(org.permify.grpc.Entity value) {
      if (entityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        entity_ = value;
      } else {
        entityBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.base.v1.Entity entity = 1 [json_name = "entity", (.validate.rules) = { ... }</code>
     */
    public Builder setEntity(
        org.permify.grpc.Entity.Builder builderForValue) {
      if (entityBuilder_ == null) {
        entity_ = builderForValue.build();
      } else {
        entityBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.base.v1.Entity entity = 1 [json_name = "entity", (.validate.rules) = { ... }</code>
     */
    public Builder mergeEntity(org.permify.grpc.Entity value) {
      if (entityBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          entity_ != null &&
          entity_ != org.permify.grpc.Entity.getDefaultInstance()) {
          getEntityBuilder().mergeFrom(value);
        } else {
          entity_ = value;
        }
      } else {
        entityBuilder_.mergeFrom(value);
      }
      if (entity_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.base.v1.Entity entity = 1 [json_name = "entity", (.validate.rules) = { ... }</code>
     */
    public Builder clearEntity() {
      bitField0_ = (bitField0_ & ~0x00000001);
      entity_ = null;
      if (entityBuilder_ != null) {
        entityBuilder_.dispose();
        entityBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.base.v1.Entity entity = 1 [json_name = "entity", (.validate.rules) = { ... }</code>
     */
    public org.permify.grpc.Entity.Builder getEntityBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEntityFieldBuilder().getBuilder();
    }
    /**
     * <code>.base.v1.Entity entity = 1 [json_name = "entity", (.validate.rules) = { ... }</code>
     */
    public org.permify.grpc.EntityOrBuilder getEntityOrBuilder() {
      if (entityBuilder_ != null) {
        return entityBuilder_.getMessageOrBuilder();
      } else {
        return entity_ == null ?
            org.permify.grpc.Entity.getDefaultInstance() : entity_;
      }
    }
    /**
     * <code>.base.v1.Entity entity = 1 [json_name = "entity", (.validate.rules) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        org.permify.grpc.Entity, org.permify.grpc.Entity.Builder, org.permify.grpc.EntityOrBuilder> 
        getEntityFieldBuilder() {
      if (entityBuilder_ == null) {
        entityBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            org.permify.grpc.Entity, org.permify.grpc.Entity.Builder, org.permify.grpc.EntityOrBuilder>(
                getEntity(),
                getParentForChildren(),
                isClean());
        entity_ = null;
      }
      return entityBuilder_;
    }

    private java.lang.Object attribute_ = "";
    /**
     * <pre>
     * Name of the attribute
     * </pre>
     *
     * <code>string attribute = 2 [json_name = "attribute"];</code>
     * @return The attribute.
     */
    public java.lang.String getAttribute() {
      java.lang.Object ref = attribute_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        attribute_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name of the attribute
     * </pre>
     *
     * <code>string attribute = 2 [json_name = "attribute"];</code>
     * @return The bytes for attribute.
     */
    public com.google.protobuf.ByteString
        getAttributeBytes() {
      java.lang.Object ref = attribute_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        attribute_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of the attribute
     * </pre>
     *
     * <code>string attribute = 2 [json_name = "attribute"];</code>
     * @param value The attribute to set.
     * @return This builder for chaining.
     */
    public Builder setAttribute(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      attribute_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the attribute
     * </pre>
     *
     * <code>string attribute = 2 [json_name = "attribute"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAttribute() {
      attribute_ = getDefaultInstance().getAttribute();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the attribute
     * </pre>
     *
     * <code>string attribute = 2 [json_name = "attribute"];</code>
     * @param value The bytes for attribute to set.
     * @return This builder for chaining.
     */
    public Builder setAttributeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      attribute_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.Any value_;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> valueBuilder_;
    /**
     * <code>.google.protobuf.Any value = 3 [json_name = "value"];</code>
     * @return Whether the value field is set.
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.google.protobuf.Any value = 3 [json_name = "value"];</code>
     * @return The value.
     */
    public com.google.protobuf.Any getValue() {
      if (valueBuilder_ == null) {
        return value_ == null ? com.google.protobuf.Any.getDefaultInstance() : value_;
      } else {
        return valueBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Any value = 3 [json_name = "value"];</code>
     */
    public Builder setValue(com.google.protobuf.Any value) {
      if (valueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        value_ = value;
      } else {
        valueBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Any value = 3 [json_name = "value"];</code>
     */
    public Builder setValue(
        com.google.protobuf.Any.Builder builderForValue) {
      if (valueBuilder_ == null) {
        value_ = builderForValue.build();
      } else {
        valueBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Any value = 3 [json_name = "value"];</code>
     */
    public Builder mergeValue(com.google.protobuf.Any value) {
      if (valueBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          value_ != null &&
          value_ != com.google.protobuf.Any.getDefaultInstance()) {
          getValueBuilder().mergeFrom(value);
        } else {
          value_ = value;
        }
      } else {
        valueBuilder_.mergeFrom(value);
      }
      if (value_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.google.protobuf.Any value = 3 [json_name = "value"];</code>
     */
    public Builder clearValue() {
      bitField0_ = (bitField0_ & ~0x00000004);
      value_ = null;
      if (valueBuilder_ != null) {
        valueBuilder_.dispose();
        valueBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Any value = 3 [json_name = "value"];</code>
     */
    public com.google.protobuf.Any.Builder getValueBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getValueFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Any value = 3 [json_name = "value"];</code>
     */
    public com.google.protobuf.AnyOrBuilder getValueOrBuilder() {
      if (valueBuilder_ != null) {
        return valueBuilder_.getMessageOrBuilder();
      } else {
        return value_ == null ?
            com.google.protobuf.Any.getDefaultInstance() : value_;
      }
    }
    /**
     * <code>.google.protobuf.Any value = 3 [json_name = "value"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getValueFieldBuilder() {
      if (valueBuilder_ == null) {
        valueBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                getValue(),
                getParentForChildren(),
                isClean());
        value_ = null;
      }
      return valueBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:base.v1.Attribute)
  }

  // @@protoc_insertion_point(class_scope:base.v1.Attribute)
  private static final org.permify.grpc.Attribute DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.permify.grpc.Attribute();
  }

  public static org.permify.grpc.Attribute getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Attribute>
      PARSER = new com.google.protobuf.AbstractParser<Attribute>() {
    @java.lang.Override
    public Attribute parsePartialFrom(
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

  public static com.google.protobuf.Parser<Attribute> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Attribute> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.permify.grpc.Attribute getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

