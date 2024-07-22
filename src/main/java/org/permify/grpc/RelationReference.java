// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: base/v1/base.proto
// Protobuf Java Version: 4.27.2

package org.permify.grpc;

/**
 * <pre>
 * The RelationReference message provides a reference to a specific relation.
 * </pre>
 *
 * Protobuf type {@code base.v1.RelationReference}
 */
public final class RelationReference extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:base.v1.RelationReference)
    RelationReferenceOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      RelationReference.class.getName());
  }
  // Use RelationReference.newBuilder() to construct.
  private RelationReference(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private RelationReference() {
    type_ = "";
    relation_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.permify.grpc.BaseProto.internal_static_base_v1_RelationReference_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.permify.grpc.BaseProto.internal_static_base_v1_RelationReference_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.permify.grpc.RelationReference.class, org.permify.grpc.RelationReference.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object type_ = "";
  /**
   * <pre>
   * The type of the referenced entity, which follows a specific string pattern and has a maximum byte size.
   * </pre>
   *
   * <code>string type = 1 [json_name = "type", (.validate.rules) = { ... }</code>
   * @return The type.
   */
  @java.lang.Override
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The type of the referenced entity, which follows a specific string pattern and has a maximum byte size.
   * </pre>
   *
   * <code>string type = 1 [json_name = "type", (.validate.rules) = { ... }</code>
   * @return The bytes for type.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RELATION_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object relation_ = "";
  /**
   * <pre>
   * The name of the referenced relation, which follows a specific string pattern and has a maximum byte size.
   * </pre>
   *
   * <code>string relation = 2 [json_name = "relation", (.validate.rules) = { ... }</code>
   * @return The relation.
   */
  @java.lang.Override
  public java.lang.String getRelation() {
    java.lang.Object ref = relation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      relation_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the referenced relation, which follows a specific string pattern and has a maximum byte size.
   * </pre>
   *
   * <code>string relation = 2 [json_name = "relation", (.validate.rules) = { ... }</code>
   * @return The bytes for relation.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRelationBytes() {
    java.lang.Object ref = relation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      relation_ = b;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(type_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, type_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(relation_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, relation_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(type_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, type_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(relation_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, relation_);
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
    if (!(obj instanceof org.permify.grpc.RelationReference)) {
      return super.equals(obj);
    }
    org.permify.grpc.RelationReference other = (org.permify.grpc.RelationReference) obj;

    if (!getType()
        .equals(other.getType())) return false;
    if (!getRelation()
        .equals(other.getRelation())) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    hash = (37 * hash) + RELATION_FIELD_NUMBER;
    hash = (53 * hash) + getRelation().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.permify.grpc.RelationReference parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.RelationReference parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.RelationReference parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.RelationReference parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.RelationReference parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.RelationReference parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.RelationReference parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.permify.grpc.RelationReference parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.permify.grpc.RelationReference parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.permify.grpc.RelationReference parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.permify.grpc.RelationReference parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.permify.grpc.RelationReference parseFrom(
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
  public static Builder newBuilder(org.permify.grpc.RelationReference prototype) {
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
   * The RelationReference message provides a reference to a specific relation.
   * </pre>
   *
   * Protobuf type {@code base.v1.RelationReference}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:base.v1.RelationReference)
      org.permify.grpc.RelationReferenceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.permify.grpc.BaseProto.internal_static_base_v1_RelationReference_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.permify.grpc.BaseProto.internal_static_base_v1_RelationReference_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.permify.grpc.RelationReference.class, org.permify.grpc.RelationReference.Builder.class);
    }

    // Construct using org.permify.grpc.RelationReference.newBuilder()
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
      type_ = "";
      relation_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.permify.grpc.BaseProto.internal_static_base_v1_RelationReference_descriptor;
    }

    @java.lang.Override
    public org.permify.grpc.RelationReference getDefaultInstanceForType() {
      return org.permify.grpc.RelationReference.getDefaultInstance();
    }

    @java.lang.Override
    public org.permify.grpc.RelationReference build() {
      org.permify.grpc.RelationReference result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.permify.grpc.RelationReference buildPartial() {
      org.permify.grpc.RelationReference result = new org.permify.grpc.RelationReference(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.permify.grpc.RelationReference result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.relation_ = relation_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.permify.grpc.RelationReference) {
        return mergeFrom((org.permify.grpc.RelationReference)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.permify.grpc.RelationReference other) {
      if (other == org.permify.grpc.RelationReference.getDefaultInstance()) return this;
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getRelation().isEmpty()) {
        relation_ = other.relation_;
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
              type_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              relation_ = input.readStringRequireUtf8();
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

    private java.lang.Object type_ = "";
    /**
     * <pre>
     * The type of the referenced entity, which follows a specific string pattern and has a maximum byte size.
     * </pre>
     *
     * <code>string type = 1 [json_name = "type", (.validate.rules) = { ... }</code>
     * @return The type.
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The type of the referenced entity, which follows a specific string pattern and has a maximum byte size.
     * </pre>
     *
     * <code>string type = 1 [json_name = "type", (.validate.rules) = { ... }</code>
     * @return The bytes for type.
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The type of the referenced entity, which follows a specific string pattern and has a maximum byte size.
     * </pre>
     *
     * <code>string type = 1 [json_name = "type", (.validate.rules) = { ... }</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      type_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of the referenced entity, which follows a specific string pattern and has a maximum byte size.
     * </pre>
     *
     * <code>string type = 1 [json_name = "type", (.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      type_ = getDefaultInstance().getType();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of the referenced entity, which follows a specific string pattern and has a maximum byte size.
     * </pre>
     *
     * <code>string type = 1 [json_name = "type", (.validate.rules) = { ... }</code>
     * @param value The bytes for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      type_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object relation_ = "";
    /**
     * <pre>
     * The name of the referenced relation, which follows a specific string pattern and has a maximum byte size.
     * </pre>
     *
     * <code>string relation = 2 [json_name = "relation", (.validate.rules) = { ... }</code>
     * @return The relation.
     */
    public java.lang.String getRelation() {
      java.lang.Object ref = relation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        relation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the referenced relation, which follows a specific string pattern and has a maximum byte size.
     * </pre>
     *
     * <code>string relation = 2 [json_name = "relation", (.validate.rules) = { ... }</code>
     * @return The bytes for relation.
     */
    public com.google.protobuf.ByteString
        getRelationBytes() {
      java.lang.Object ref = relation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        relation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the referenced relation, which follows a specific string pattern and has a maximum byte size.
     * </pre>
     *
     * <code>string relation = 2 [json_name = "relation", (.validate.rules) = { ... }</code>
     * @param value The relation to set.
     * @return This builder for chaining.
     */
    public Builder setRelation(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      relation_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the referenced relation, which follows a specific string pattern and has a maximum byte size.
     * </pre>
     *
     * <code>string relation = 2 [json_name = "relation", (.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearRelation() {
      relation_ = getDefaultInstance().getRelation();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the referenced relation, which follows a specific string pattern and has a maximum byte size.
     * </pre>
     *
     * <code>string relation = 2 [json_name = "relation", (.validate.rules) = { ... }</code>
     * @param value The bytes for relation to set.
     * @return This builder for chaining.
     */
    public Builder setRelationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      relation_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:base.v1.RelationReference)
  }

  // @@protoc_insertion_point(class_scope:base.v1.RelationReference)
  private static final org.permify.grpc.RelationReference DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.permify.grpc.RelationReference();
  }

  public static org.permify.grpc.RelationReference getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RelationReference>
      PARSER = new com.google.protobuf.AbstractParser<RelationReference>() {
    @java.lang.Override
    public RelationReference parsePartialFrom(
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

  public static com.google.protobuf.Parser<RelationReference> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RelationReference> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.permify.grpc.RelationReference getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
