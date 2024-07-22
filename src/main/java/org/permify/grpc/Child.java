// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: base/v1/base.proto
// Protobuf Java Version: 4.27.2

package org.permify.grpc;

/**
 * <pre>
 * Child represents a node in the permission tree.
 * </pre>
 *
 * Protobuf type {@code base.v1.Child}
 */
public final class Child extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:base.v1.Child)
    ChildOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      Child.class.getName());
  }
  // Use Child.newBuilder() to construct.
  private Child(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Child() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.permify.grpc.BaseProto.internal_static_base_v1_Child_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.permify.grpc.BaseProto.internal_static_base_v1_Child_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.permify.grpc.Child.class, org.permify.grpc.Child.Builder.class);
  }

  private int typeCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object type_;
  public enum TypeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    LEAF(1),
    REWRITE(2),
    TYPE_NOT_SET(0);
    private final int value;
    private TypeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static TypeCase forNumber(int value) {
      switch (value) {
        case 1: return LEAF;
        case 2: return REWRITE;
        case 0: return TYPE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public TypeCase
  getTypeCase() {
    return TypeCase.forNumber(
        typeCase_);
  }

  public static final int LEAF_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Leaf node in the permission tree.
   * </pre>
   *
   * <code>.base.v1.Leaf leaf = 1 [json_name = "leaf", (.validate.rules) = { ... }</code>
   * @return Whether the leaf field is set.
   */
  @java.lang.Override
  public boolean hasLeaf() {
    return typeCase_ == 1;
  }
  /**
   * <pre>
   * Leaf node in the permission tree.
   * </pre>
   *
   * <code>.base.v1.Leaf leaf = 1 [json_name = "leaf", (.validate.rules) = { ... }</code>
   * @return The leaf.
   */
  @java.lang.Override
  public org.permify.grpc.Leaf getLeaf() {
    if (typeCase_ == 1) {
       return (org.permify.grpc.Leaf) type_;
    }
    return org.permify.grpc.Leaf.getDefaultInstance();
  }
  /**
   * <pre>
   * Leaf node in the permission tree.
   * </pre>
   *
   * <code>.base.v1.Leaf leaf = 1 [json_name = "leaf", (.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public org.permify.grpc.LeafOrBuilder getLeafOrBuilder() {
    if (typeCase_ == 1) {
       return (org.permify.grpc.Leaf) type_;
    }
    return org.permify.grpc.Leaf.getDefaultInstance();
  }

  public static final int REWRITE_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Rewrite operation in the permission tree.
   * </pre>
   *
   * <code>.base.v1.Rewrite rewrite = 2 [json_name = "rewrite", (.validate.rules) = { ... }</code>
   * @return Whether the rewrite field is set.
   */
  @java.lang.Override
  public boolean hasRewrite() {
    return typeCase_ == 2;
  }
  /**
   * <pre>
   * Rewrite operation in the permission tree.
   * </pre>
   *
   * <code>.base.v1.Rewrite rewrite = 2 [json_name = "rewrite", (.validate.rules) = { ... }</code>
   * @return The rewrite.
   */
  @java.lang.Override
  public org.permify.grpc.Rewrite getRewrite() {
    if (typeCase_ == 2) {
       return (org.permify.grpc.Rewrite) type_;
    }
    return org.permify.grpc.Rewrite.getDefaultInstance();
  }
  /**
   * <pre>
   * Rewrite operation in the permission tree.
   * </pre>
   *
   * <code>.base.v1.Rewrite rewrite = 2 [json_name = "rewrite", (.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public org.permify.grpc.RewriteOrBuilder getRewriteOrBuilder() {
    if (typeCase_ == 2) {
       return (org.permify.grpc.Rewrite) type_;
    }
    return org.permify.grpc.Rewrite.getDefaultInstance();
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
    if (typeCase_ == 1) {
      output.writeMessage(1, (org.permify.grpc.Leaf) type_);
    }
    if (typeCase_ == 2) {
      output.writeMessage(2, (org.permify.grpc.Rewrite) type_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (typeCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (org.permify.grpc.Leaf) type_);
    }
    if (typeCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (org.permify.grpc.Rewrite) type_);
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
    if (!(obj instanceof org.permify.grpc.Child)) {
      return super.equals(obj);
    }
    org.permify.grpc.Child other = (org.permify.grpc.Child) obj;

    if (!getTypeCase().equals(other.getTypeCase())) return false;
    switch (typeCase_) {
      case 1:
        if (!getLeaf()
            .equals(other.getLeaf())) return false;
        break;
      case 2:
        if (!getRewrite()
            .equals(other.getRewrite())) return false;
        break;
      case 0:
      default:
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
    switch (typeCase_) {
      case 1:
        hash = (37 * hash) + LEAF_FIELD_NUMBER;
        hash = (53 * hash) + getLeaf().hashCode();
        break;
      case 2:
        hash = (37 * hash) + REWRITE_FIELD_NUMBER;
        hash = (53 * hash) + getRewrite().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.permify.grpc.Child parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.Child parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.Child parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.Child parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.Child parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.Child parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.Child parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.permify.grpc.Child parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.permify.grpc.Child parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.permify.grpc.Child parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.permify.grpc.Child parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.permify.grpc.Child parseFrom(
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
  public static Builder newBuilder(org.permify.grpc.Child prototype) {
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
   * Child represents a node in the permission tree.
   * </pre>
   *
   * Protobuf type {@code base.v1.Child}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:base.v1.Child)
      org.permify.grpc.ChildOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.permify.grpc.BaseProto.internal_static_base_v1_Child_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.permify.grpc.BaseProto.internal_static_base_v1_Child_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.permify.grpc.Child.class, org.permify.grpc.Child.Builder.class);
    }

    // Construct using org.permify.grpc.Child.newBuilder()
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
      if (leafBuilder_ != null) {
        leafBuilder_.clear();
      }
      if (rewriteBuilder_ != null) {
        rewriteBuilder_.clear();
      }
      typeCase_ = 0;
      type_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.permify.grpc.BaseProto.internal_static_base_v1_Child_descriptor;
    }

    @java.lang.Override
    public org.permify.grpc.Child getDefaultInstanceForType() {
      return org.permify.grpc.Child.getDefaultInstance();
    }

    @java.lang.Override
    public org.permify.grpc.Child build() {
      org.permify.grpc.Child result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.permify.grpc.Child buildPartial() {
      org.permify.grpc.Child result = new org.permify.grpc.Child(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(org.permify.grpc.Child result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(org.permify.grpc.Child result) {
      result.typeCase_ = typeCase_;
      result.type_ = this.type_;
      if (typeCase_ == 1 &&
          leafBuilder_ != null) {
        result.type_ = leafBuilder_.build();
      }
      if (typeCase_ == 2 &&
          rewriteBuilder_ != null) {
        result.type_ = rewriteBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.permify.grpc.Child) {
        return mergeFrom((org.permify.grpc.Child)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.permify.grpc.Child other) {
      if (other == org.permify.grpc.Child.getDefaultInstance()) return this;
      switch (other.getTypeCase()) {
        case LEAF: {
          mergeLeaf(other.getLeaf());
          break;
        }
        case REWRITE: {
          mergeRewrite(other.getRewrite());
          break;
        }
        case TYPE_NOT_SET: {
          break;
        }
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
                  getLeafFieldBuilder().getBuilder(),
                  extensionRegistry);
              typeCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getRewriteFieldBuilder().getBuilder(),
                  extensionRegistry);
              typeCase_ = 2;
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
    private int typeCase_ = 0;
    private java.lang.Object type_;
    public TypeCase
        getTypeCase() {
      return TypeCase.forNumber(
          typeCase_);
    }

    public Builder clearType() {
      typeCase_ = 0;
      type_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilder<
        org.permify.grpc.Leaf, org.permify.grpc.Leaf.Builder, org.permify.grpc.LeafOrBuilder> leafBuilder_;
    /**
     * <pre>
     * Leaf node in the permission tree.
     * </pre>
     *
     * <code>.base.v1.Leaf leaf = 1 [json_name = "leaf", (.validate.rules) = { ... }</code>
     * @return Whether the leaf field is set.
     */
    @java.lang.Override
    public boolean hasLeaf() {
      return typeCase_ == 1;
    }
    /**
     * <pre>
     * Leaf node in the permission tree.
     * </pre>
     *
     * <code>.base.v1.Leaf leaf = 1 [json_name = "leaf", (.validate.rules) = { ... }</code>
     * @return The leaf.
     */
    @java.lang.Override
    public org.permify.grpc.Leaf getLeaf() {
      if (leafBuilder_ == null) {
        if (typeCase_ == 1) {
          return (org.permify.grpc.Leaf) type_;
        }
        return org.permify.grpc.Leaf.getDefaultInstance();
      } else {
        if (typeCase_ == 1) {
          return leafBuilder_.getMessage();
        }
        return org.permify.grpc.Leaf.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Leaf node in the permission tree.
     * </pre>
     *
     * <code>.base.v1.Leaf leaf = 1 [json_name = "leaf", (.validate.rules) = { ... }</code>
     */
    public Builder setLeaf(org.permify.grpc.Leaf value) {
      if (leafBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        type_ = value;
        onChanged();
      } else {
        leafBuilder_.setMessage(value);
      }
      typeCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Leaf node in the permission tree.
     * </pre>
     *
     * <code>.base.v1.Leaf leaf = 1 [json_name = "leaf", (.validate.rules) = { ... }</code>
     */
    public Builder setLeaf(
        org.permify.grpc.Leaf.Builder builderForValue) {
      if (leafBuilder_ == null) {
        type_ = builderForValue.build();
        onChanged();
      } else {
        leafBuilder_.setMessage(builderForValue.build());
      }
      typeCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Leaf node in the permission tree.
     * </pre>
     *
     * <code>.base.v1.Leaf leaf = 1 [json_name = "leaf", (.validate.rules) = { ... }</code>
     */
    public Builder mergeLeaf(org.permify.grpc.Leaf value) {
      if (leafBuilder_ == null) {
        if (typeCase_ == 1 &&
            type_ != org.permify.grpc.Leaf.getDefaultInstance()) {
          type_ = org.permify.grpc.Leaf.newBuilder((org.permify.grpc.Leaf) type_)
              .mergeFrom(value).buildPartial();
        } else {
          type_ = value;
        }
        onChanged();
      } else {
        if (typeCase_ == 1) {
          leafBuilder_.mergeFrom(value);
        } else {
          leafBuilder_.setMessage(value);
        }
      }
      typeCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Leaf node in the permission tree.
     * </pre>
     *
     * <code>.base.v1.Leaf leaf = 1 [json_name = "leaf", (.validate.rules) = { ... }</code>
     */
    public Builder clearLeaf() {
      if (leafBuilder_ == null) {
        if (typeCase_ == 1) {
          typeCase_ = 0;
          type_ = null;
          onChanged();
        }
      } else {
        if (typeCase_ == 1) {
          typeCase_ = 0;
          type_ = null;
        }
        leafBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Leaf node in the permission tree.
     * </pre>
     *
     * <code>.base.v1.Leaf leaf = 1 [json_name = "leaf", (.validate.rules) = { ... }</code>
     */
    public org.permify.grpc.Leaf.Builder getLeafBuilder() {
      return getLeafFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Leaf node in the permission tree.
     * </pre>
     *
     * <code>.base.v1.Leaf leaf = 1 [json_name = "leaf", (.validate.rules) = { ... }</code>
     */
    @java.lang.Override
    public org.permify.grpc.LeafOrBuilder getLeafOrBuilder() {
      if ((typeCase_ == 1) && (leafBuilder_ != null)) {
        return leafBuilder_.getMessageOrBuilder();
      } else {
        if (typeCase_ == 1) {
          return (org.permify.grpc.Leaf) type_;
        }
        return org.permify.grpc.Leaf.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Leaf node in the permission tree.
     * </pre>
     *
     * <code>.base.v1.Leaf leaf = 1 [json_name = "leaf", (.validate.rules) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        org.permify.grpc.Leaf, org.permify.grpc.Leaf.Builder, org.permify.grpc.LeafOrBuilder> 
        getLeafFieldBuilder() {
      if (leafBuilder_ == null) {
        if (!(typeCase_ == 1)) {
          type_ = org.permify.grpc.Leaf.getDefaultInstance();
        }
        leafBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            org.permify.grpc.Leaf, org.permify.grpc.Leaf.Builder, org.permify.grpc.LeafOrBuilder>(
                (org.permify.grpc.Leaf) type_,
                getParentForChildren(),
                isClean());
        type_ = null;
      }
      typeCase_ = 1;
      onChanged();
      return leafBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilder<
        org.permify.grpc.Rewrite, org.permify.grpc.Rewrite.Builder, org.permify.grpc.RewriteOrBuilder> rewriteBuilder_;
    /**
     * <pre>
     * Rewrite operation in the permission tree.
     * </pre>
     *
     * <code>.base.v1.Rewrite rewrite = 2 [json_name = "rewrite", (.validate.rules) = { ... }</code>
     * @return Whether the rewrite field is set.
     */
    @java.lang.Override
    public boolean hasRewrite() {
      return typeCase_ == 2;
    }
    /**
     * <pre>
     * Rewrite operation in the permission tree.
     * </pre>
     *
     * <code>.base.v1.Rewrite rewrite = 2 [json_name = "rewrite", (.validate.rules) = { ... }</code>
     * @return The rewrite.
     */
    @java.lang.Override
    public org.permify.grpc.Rewrite getRewrite() {
      if (rewriteBuilder_ == null) {
        if (typeCase_ == 2) {
          return (org.permify.grpc.Rewrite) type_;
        }
        return org.permify.grpc.Rewrite.getDefaultInstance();
      } else {
        if (typeCase_ == 2) {
          return rewriteBuilder_.getMessage();
        }
        return org.permify.grpc.Rewrite.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Rewrite operation in the permission tree.
     * </pre>
     *
     * <code>.base.v1.Rewrite rewrite = 2 [json_name = "rewrite", (.validate.rules) = { ... }</code>
     */
    public Builder setRewrite(org.permify.grpc.Rewrite value) {
      if (rewriteBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        type_ = value;
        onChanged();
      } else {
        rewriteBuilder_.setMessage(value);
      }
      typeCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Rewrite operation in the permission tree.
     * </pre>
     *
     * <code>.base.v1.Rewrite rewrite = 2 [json_name = "rewrite", (.validate.rules) = { ... }</code>
     */
    public Builder setRewrite(
        org.permify.grpc.Rewrite.Builder builderForValue) {
      if (rewriteBuilder_ == null) {
        type_ = builderForValue.build();
        onChanged();
      } else {
        rewriteBuilder_.setMessage(builderForValue.build());
      }
      typeCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Rewrite operation in the permission tree.
     * </pre>
     *
     * <code>.base.v1.Rewrite rewrite = 2 [json_name = "rewrite", (.validate.rules) = { ... }</code>
     */
    public Builder mergeRewrite(org.permify.grpc.Rewrite value) {
      if (rewriteBuilder_ == null) {
        if (typeCase_ == 2 &&
            type_ != org.permify.grpc.Rewrite.getDefaultInstance()) {
          type_ = org.permify.grpc.Rewrite.newBuilder((org.permify.grpc.Rewrite) type_)
              .mergeFrom(value).buildPartial();
        } else {
          type_ = value;
        }
        onChanged();
      } else {
        if (typeCase_ == 2) {
          rewriteBuilder_.mergeFrom(value);
        } else {
          rewriteBuilder_.setMessage(value);
        }
      }
      typeCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Rewrite operation in the permission tree.
     * </pre>
     *
     * <code>.base.v1.Rewrite rewrite = 2 [json_name = "rewrite", (.validate.rules) = { ... }</code>
     */
    public Builder clearRewrite() {
      if (rewriteBuilder_ == null) {
        if (typeCase_ == 2) {
          typeCase_ = 0;
          type_ = null;
          onChanged();
        }
      } else {
        if (typeCase_ == 2) {
          typeCase_ = 0;
          type_ = null;
        }
        rewriteBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Rewrite operation in the permission tree.
     * </pre>
     *
     * <code>.base.v1.Rewrite rewrite = 2 [json_name = "rewrite", (.validate.rules) = { ... }</code>
     */
    public org.permify.grpc.Rewrite.Builder getRewriteBuilder() {
      return getRewriteFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Rewrite operation in the permission tree.
     * </pre>
     *
     * <code>.base.v1.Rewrite rewrite = 2 [json_name = "rewrite", (.validate.rules) = { ... }</code>
     */
    @java.lang.Override
    public org.permify.grpc.RewriteOrBuilder getRewriteOrBuilder() {
      if ((typeCase_ == 2) && (rewriteBuilder_ != null)) {
        return rewriteBuilder_.getMessageOrBuilder();
      } else {
        if (typeCase_ == 2) {
          return (org.permify.grpc.Rewrite) type_;
        }
        return org.permify.grpc.Rewrite.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Rewrite operation in the permission tree.
     * </pre>
     *
     * <code>.base.v1.Rewrite rewrite = 2 [json_name = "rewrite", (.validate.rules) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        org.permify.grpc.Rewrite, org.permify.grpc.Rewrite.Builder, org.permify.grpc.RewriteOrBuilder> 
        getRewriteFieldBuilder() {
      if (rewriteBuilder_ == null) {
        if (!(typeCase_ == 2)) {
          type_ = org.permify.grpc.Rewrite.getDefaultInstance();
        }
        rewriteBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            org.permify.grpc.Rewrite, org.permify.grpc.Rewrite.Builder, org.permify.grpc.RewriteOrBuilder>(
                (org.permify.grpc.Rewrite) type_,
                getParentForChildren(),
                isClean());
        type_ = null;
      }
      typeCase_ = 2;
      onChanged();
      return rewriteBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:base.v1.Child)
  }

  // @@protoc_insertion_point(class_scope:base.v1.Child)
  private static final org.permify.grpc.Child DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.permify.grpc.Child();
  }

  public static org.permify.grpc.Child getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Child>
      PARSER = new com.google.protobuf.AbstractParser<Child>() {
    @java.lang.Override
    public Child parsePartialFrom(
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

  public static com.google.protobuf.Parser<Child> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Child> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.permify.grpc.Child getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

