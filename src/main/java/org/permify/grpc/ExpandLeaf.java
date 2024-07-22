// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: base/v1/base.proto
// Protobuf Java Version: 4.27.2

package org.permify.grpc;

/**
 * <pre>
 * ExpandLeaf is the leaf node of an Expand tree and can be either a set of Subjects or a set of Values.
 * </pre>
 *
 * Protobuf type {@code base.v1.ExpandLeaf}
 */
public final class ExpandLeaf extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:base.v1.ExpandLeaf)
    ExpandLeafOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      ExpandLeaf.class.getName());
  }
  // Use ExpandLeaf.newBuilder() to construct.
  private ExpandLeaf(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ExpandLeaf() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.permify.grpc.BaseProto.internal_static_base_v1_ExpandLeaf_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.permify.grpc.BaseProto.internal_static_base_v1_ExpandLeaf_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.permify.grpc.ExpandLeaf.class, org.permify.grpc.ExpandLeaf.Builder.class);
  }

  private int typeCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object type_;
  public enum TypeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    SUBJECTS(1),
    VALUES(2),
    VALUE(3),
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
        case 1: return SUBJECTS;
        case 2: return VALUES;
        case 3: return VALUE;
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

  public static final int SUBJECTS_FIELD_NUMBER = 1;
  /**
   * <pre>
   * subjects are used when the leaf is a set of subjects.
   * </pre>
   *
   * <code>.base.v1.Subjects subjects = 1 [json_name = "subjects"];</code>
   * @return Whether the subjects field is set.
   */
  @java.lang.Override
  public boolean hasSubjects() {
    return typeCase_ == 1;
  }
  /**
   * <pre>
   * subjects are used when the leaf is a set of subjects.
   * </pre>
   *
   * <code>.base.v1.Subjects subjects = 1 [json_name = "subjects"];</code>
   * @return The subjects.
   */
  @java.lang.Override
  public org.permify.grpc.Subjects getSubjects() {
    if (typeCase_ == 1) {
       return (org.permify.grpc.Subjects) type_;
    }
    return org.permify.grpc.Subjects.getDefaultInstance();
  }
  /**
   * <pre>
   * subjects are used when the leaf is a set of subjects.
   * </pre>
   *
   * <code>.base.v1.Subjects subjects = 1 [json_name = "subjects"];</code>
   */
  @java.lang.Override
  public org.permify.grpc.SubjectsOrBuilder getSubjectsOrBuilder() {
    if (typeCase_ == 1) {
       return (org.permify.grpc.Subjects) type_;
    }
    return org.permify.grpc.Subjects.getDefaultInstance();
  }

  public static final int VALUES_FIELD_NUMBER = 2;
  /**
   * <pre>
   * values are used when the leaf node is a set of values.
   * </pre>
   *
   * <code>.base.v1.Values values = 2 [json_name = "values"];</code>
   * @return Whether the values field is set.
   */
  @java.lang.Override
  public boolean hasValues() {
    return typeCase_ == 2;
  }
  /**
   * <pre>
   * values are used when the leaf node is a set of values.
   * </pre>
   *
   * <code>.base.v1.Values values = 2 [json_name = "values"];</code>
   * @return The values.
   */
  @java.lang.Override
  public org.permify.grpc.Values getValues() {
    if (typeCase_ == 2) {
       return (org.permify.grpc.Values) type_;
    }
    return org.permify.grpc.Values.getDefaultInstance();
  }
  /**
   * <pre>
   * values are used when the leaf node is a set of values.
   * </pre>
   *
   * <code>.base.v1.Values values = 2 [json_name = "values"];</code>
   */
  @java.lang.Override
  public org.permify.grpc.ValuesOrBuilder getValuesOrBuilder() {
    if (typeCase_ == 2) {
       return (org.permify.grpc.Values) type_;
    }
    return org.permify.grpc.Values.getDefaultInstance();
  }

  public static final int VALUE_FIELD_NUMBER = 3;
  /**
   * <pre>
   * value is used when the leaf node is a single value.
   * </pre>
   *
   * <code>.google.protobuf.Any value = 3 [json_name = "value"];</code>
   * @return Whether the value field is set.
   */
  @java.lang.Override
  public boolean hasValue() {
    return typeCase_ == 3;
  }
  /**
   * <pre>
   * value is used when the leaf node is a single value.
   * </pre>
   *
   * <code>.google.protobuf.Any value = 3 [json_name = "value"];</code>
   * @return The value.
   */
  @java.lang.Override
  public com.google.protobuf.Any getValue() {
    if (typeCase_ == 3) {
       return (com.google.protobuf.Any) type_;
    }
    return com.google.protobuf.Any.getDefaultInstance();
  }
  /**
   * <pre>
   * value is used when the leaf node is a single value.
   * </pre>
   *
   * <code>.google.protobuf.Any value = 3 [json_name = "value"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.AnyOrBuilder getValueOrBuilder() {
    if (typeCase_ == 3) {
       return (com.google.protobuf.Any) type_;
    }
    return com.google.protobuf.Any.getDefaultInstance();
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
      output.writeMessage(1, (org.permify.grpc.Subjects) type_);
    }
    if (typeCase_ == 2) {
      output.writeMessage(2, (org.permify.grpc.Values) type_);
    }
    if (typeCase_ == 3) {
      output.writeMessage(3, (com.google.protobuf.Any) type_);
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
        .computeMessageSize(1, (org.permify.grpc.Subjects) type_);
    }
    if (typeCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (org.permify.grpc.Values) type_);
    }
    if (typeCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (com.google.protobuf.Any) type_);
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
    if (!(obj instanceof org.permify.grpc.ExpandLeaf)) {
      return super.equals(obj);
    }
    org.permify.grpc.ExpandLeaf other = (org.permify.grpc.ExpandLeaf) obj;

    if (!getTypeCase().equals(other.getTypeCase())) return false;
    switch (typeCase_) {
      case 1:
        if (!getSubjects()
            .equals(other.getSubjects())) return false;
        break;
      case 2:
        if (!getValues()
            .equals(other.getValues())) return false;
        break;
      case 3:
        if (!getValue()
            .equals(other.getValue())) return false;
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
        hash = (37 * hash) + SUBJECTS_FIELD_NUMBER;
        hash = (53 * hash) + getSubjects().hashCode();
        break;
      case 2:
        hash = (37 * hash) + VALUES_FIELD_NUMBER;
        hash = (53 * hash) + getValues().hashCode();
        break;
      case 3:
        hash = (37 * hash) + VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getValue().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.permify.grpc.ExpandLeaf parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.ExpandLeaf parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.ExpandLeaf parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.ExpandLeaf parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.ExpandLeaf parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.ExpandLeaf parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.ExpandLeaf parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.permify.grpc.ExpandLeaf parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.permify.grpc.ExpandLeaf parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.permify.grpc.ExpandLeaf parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.permify.grpc.ExpandLeaf parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.permify.grpc.ExpandLeaf parseFrom(
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
  public static Builder newBuilder(org.permify.grpc.ExpandLeaf prototype) {
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
   * ExpandLeaf is the leaf node of an Expand tree and can be either a set of Subjects or a set of Values.
   * </pre>
   *
   * Protobuf type {@code base.v1.ExpandLeaf}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:base.v1.ExpandLeaf)
      org.permify.grpc.ExpandLeafOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.permify.grpc.BaseProto.internal_static_base_v1_ExpandLeaf_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.permify.grpc.BaseProto.internal_static_base_v1_ExpandLeaf_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.permify.grpc.ExpandLeaf.class, org.permify.grpc.ExpandLeaf.Builder.class);
    }

    // Construct using org.permify.grpc.ExpandLeaf.newBuilder()
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
      if (subjectsBuilder_ != null) {
        subjectsBuilder_.clear();
      }
      if (valuesBuilder_ != null) {
        valuesBuilder_.clear();
      }
      if (valueBuilder_ != null) {
        valueBuilder_.clear();
      }
      typeCase_ = 0;
      type_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.permify.grpc.BaseProto.internal_static_base_v1_ExpandLeaf_descriptor;
    }

    @java.lang.Override
    public org.permify.grpc.ExpandLeaf getDefaultInstanceForType() {
      return org.permify.grpc.ExpandLeaf.getDefaultInstance();
    }

    @java.lang.Override
    public org.permify.grpc.ExpandLeaf build() {
      org.permify.grpc.ExpandLeaf result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.permify.grpc.ExpandLeaf buildPartial() {
      org.permify.grpc.ExpandLeaf result = new org.permify.grpc.ExpandLeaf(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(org.permify.grpc.ExpandLeaf result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(org.permify.grpc.ExpandLeaf result) {
      result.typeCase_ = typeCase_;
      result.type_ = this.type_;
      if (typeCase_ == 1 &&
          subjectsBuilder_ != null) {
        result.type_ = subjectsBuilder_.build();
      }
      if (typeCase_ == 2 &&
          valuesBuilder_ != null) {
        result.type_ = valuesBuilder_.build();
      }
      if (typeCase_ == 3 &&
          valueBuilder_ != null) {
        result.type_ = valueBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.permify.grpc.ExpandLeaf) {
        return mergeFrom((org.permify.grpc.ExpandLeaf)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.permify.grpc.ExpandLeaf other) {
      if (other == org.permify.grpc.ExpandLeaf.getDefaultInstance()) return this;
      switch (other.getTypeCase()) {
        case SUBJECTS: {
          mergeSubjects(other.getSubjects());
          break;
        }
        case VALUES: {
          mergeValues(other.getValues());
          break;
        }
        case VALUE: {
          mergeValue(other.getValue());
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
                  getSubjectsFieldBuilder().getBuilder(),
                  extensionRegistry);
              typeCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getValuesFieldBuilder().getBuilder(),
                  extensionRegistry);
              typeCase_ = 2;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getValueFieldBuilder().getBuilder(),
                  extensionRegistry);
              typeCase_ = 3;
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
        org.permify.grpc.Subjects, org.permify.grpc.Subjects.Builder, org.permify.grpc.SubjectsOrBuilder> subjectsBuilder_;
    /**
     * <pre>
     * subjects are used when the leaf is a set of subjects.
     * </pre>
     *
     * <code>.base.v1.Subjects subjects = 1 [json_name = "subjects"];</code>
     * @return Whether the subjects field is set.
     */
    @java.lang.Override
    public boolean hasSubjects() {
      return typeCase_ == 1;
    }
    /**
     * <pre>
     * subjects are used when the leaf is a set of subjects.
     * </pre>
     *
     * <code>.base.v1.Subjects subjects = 1 [json_name = "subjects"];</code>
     * @return The subjects.
     */
    @java.lang.Override
    public org.permify.grpc.Subjects getSubjects() {
      if (subjectsBuilder_ == null) {
        if (typeCase_ == 1) {
          return (org.permify.grpc.Subjects) type_;
        }
        return org.permify.grpc.Subjects.getDefaultInstance();
      } else {
        if (typeCase_ == 1) {
          return subjectsBuilder_.getMessage();
        }
        return org.permify.grpc.Subjects.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * subjects are used when the leaf is a set of subjects.
     * </pre>
     *
     * <code>.base.v1.Subjects subjects = 1 [json_name = "subjects"];</code>
     */
    public Builder setSubjects(org.permify.grpc.Subjects value) {
      if (subjectsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        type_ = value;
        onChanged();
      } else {
        subjectsBuilder_.setMessage(value);
      }
      typeCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * subjects are used when the leaf is a set of subjects.
     * </pre>
     *
     * <code>.base.v1.Subjects subjects = 1 [json_name = "subjects"];</code>
     */
    public Builder setSubjects(
        org.permify.grpc.Subjects.Builder builderForValue) {
      if (subjectsBuilder_ == null) {
        type_ = builderForValue.build();
        onChanged();
      } else {
        subjectsBuilder_.setMessage(builderForValue.build());
      }
      typeCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * subjects are used when the leaf is a set of subjects.
     * </pre>
     *
     * <code>.base.v1.Subjects subjects = 1 [json_name = "subjects"];</code>
     */
    public Builder mergeSubjects(org.permify.grpc.Subjects value) {
      if (subjectsBuilder_ == null) {
        if (typeCase_ == 1 &&
            type_ != org.permify.grpc.Subjects.getDefaultInstance()) {
          type_ = org.permify.grpc.Subjects.newBuilder((org.permify.grpc.Subjects) type_)
              .mergeFrom(value).buildPartial();
        } else {
          type_ = value;
        }
        onChanged();
      } else {
        if (typeCase_ == 1) {
          subjectsBuilder_.mergeFrom(value);
        } else {
          subjectsBuilder_.setMessage(value);
        }
      }
      typeCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * subjects are used when the leaf is a set of subjects.
     * </pre>
     *
     * <code>.base.v1.Subjects subjects = 1 [json_name = "subjects"];</code>
     */
    public Builder clearSubjects() {
      if (subjectsBuilder_ == null) {
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
        subjectsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * subjects are used when the leaf is a set of subjects.
     * </pre>
     *
     * <code>.base.v1.Subjects subjects = 1 [json_name = "subjects"];</code>
     */
    public org.permify.grpc.Subjects.Builder getSubjectsBuilder() {
      return getSubjectsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * subjects are used when the leaf is a set of subjects.
     * </pre>
     *
     * <code>.base.v1.Subjects subjects = 1 [json_name = "subjects"];</code>
     */
    @java.lang.Override
    public org.permify.grpc.SubjectsOrBuilder getSubjectsOrBuilder() {
      if ((typeCase_ == 1) && (subjectsBuilder_ != null)) {
        return subjectsBuilder_.getMessageOrBuilder();
      } else {
        if (typeCase_ == 1) {
          return (org.permify.grpc.Subjects) type_;
        }
        return org.permify.grpc.Subjects.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * subjects are used when the leaf is a set of subjects.
     * </pre>
     *
     * <code>.base.v1.Subjects subjects = 1 [json_name = "subjects"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        org.permify.grpc.Subjects, org.permify.grpc.Subjects.Builder, org.permify.grpc.SubjectsOrBuilder> 
        getSubjectsFieldBuilder() {
      if (subjectsBuilder_ == null) {
        if (!(typeCase_ == 1)) {
          type_ = org.permify.grpc.Subjects.getDefaultInstance();
        }
        subjectsBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            org.permify.grpc.Subjects, org.permify.grpc.Subjects.Builder, org.permify.grpc.SubjectsOrBuilder>(
                (org.permify.grpc.Subjects) type_,
                getParentForChildren(),
                isClean());
        type_ = null;
      }
      typeCase_ = 1;
      onChanged();
      return subjectsBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilder<
        org.permify.grpc.Values, org.permify.grpc.Values.Builder, org.permify.grpc.ValuesOrBuilder> valuesBuilder_;
    /**
     * <pre>
     * values are used when the leaf node is a set of values.
     * </pre>
     *
     * <code>.base.v1.Values values = 2 [json_name = "values"];</code>
     * @return Whether the values field is set.
     */
    @java.lang.Override
    public boolean hasValues() {
      return typeCase_ == 2;
    }
    /**
     * <pre>
     * values are used when the leaf node is a set of values.
     * </pre>
     *
     * <code>.base.v1.Values values = 2 [json_name = "values"];</code>
     * @return The values.
     */
    @java.lang.Override
    public org.permify.grpc.Values getValues() {
      if (valuesBuilder_ == null) {
        if (typeCase_ == 2) {
          return (org.permify.grpc.Values) type_;
        }
        return org.permify.grpc.Values.getDefaultInstance();
      } else {
        if (typeCase_ == 2) {
          return valuesBuilder_.getMessage();
        }
        return org.permify.grpc.Values.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * values are used when the leaf node is a set of values.
     * </pre>
     *
     * <code>.base.v1.Values values = 2 [json_name = "values"];</code>
     */
    public Builder setValues(org.permify.grpc.Values value) {
      if (valuesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        type_ = value;
        onChanged();
      } else {
        valuesBuilder_.setMessage(value);
      }
      typeCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * values are used when the leaf node is a set of values.
     * </pre>
     *
     * <code>.base.v1.Values values = 2 [json_name = "values"];</code>
     */
    public Builder setValues(
        org.permify.grpc.Values.Builder builderForValue) {
      if (valuesBuilder_ == null) {
        type_ = builderForValue.build();
        onChanged();
      } else {
        valuesBuilder_.setMessage(builderForValue.build());
      }
      typeCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * values are used when the leaf node is a set of values.
     * </pre>
     *
     * <code>.base.v1.Values values = 2 [json_name = "values"];</code>
     */
    public Builder mergeValues(org.permify.grpc.Values value) {
      if (valuesBuilder_ == null) {
        if (typeCase_ == 2 &&
            type_ != org.permify.grpc.Values.getDefaultInstance()) {
          type_ = org.permify.grpc.Values.newBuilder((org.permify.grpc.Values) type_)
              .mergeFrom(value).buildPartial();
        } else {
          type_ = value;
        }
        onChanged();
      } else {
        if (typeCase_ == 2) {
          valuesBuilder_.mergeFrom(value);
        } else {
          valuesBuilder_.setMessage(value);
        }
      }
      typeCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * values are used when the leaf node is a set of values.
     * </pre>
     *
     * <code>.base.v1.Values values = 2 [json_name = "values"];</code>
     */
    public Builder clearValues() {
      if (valuesBuilder_ == null) {
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
        valuesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * values are used when the leaf node is a set of values.
     * </pre>
     *
     * <code>.base.v1.Values values = 2 [json_name = "values"];</code>
     */
    public org.permify.grpc.Values.Builder getValuesBuilder() {
      return getValuesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * values are used when the leaf node is a set of values.
     * </pre>
     *
     * <code>.base.v1.Values values = 2 [json_name = "values"];</code>
     */
    @java.lang.Override
    public org.permify.grpc.ValuesOrBuilder getValuesOrBuilder() {
      if ((typeCase_ == 2) && (valuesBuilder_ != null)) {
        return valuesBuilder_.getMessageOrBuilder();
      } else {
        if (typeCase_ == 2) {
          return (org.permify.grpc.Values) type_;
        }
        return org.permify.grpc.Values.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * values are used when the leaf node is a set of values.
     * </pre>
     *
     * <code>.base.v1.Values values = 2 [json_name = "values"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        org.permify.grpc.Values, org.permify.grpc.Values.Builder, org.permify.grpc.ValuesOrBuilder> 
        getValuesFieldBuilder() {
      if (valuesBuilder_ == null) {
        if (!(typeCase_ == 2)) {
          type_ = org.permify.grpc.Values.getDefaultInstance();
        }
        valuesBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            org.permify.grpc.Values, org.permify.grpc.Values.Builder, org.permify.grpc.ValuesOrBuilder>(
                (org.permify.grpc.Values) type_,
                getParentForChildren(),
                isClean());
        type_ = null;
      }
      typeCase_ = 2;
      onChanged();
      return valuesBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> valueBuilder_;
    /**
     * <pre>
     * value is used when the leaf node is a single value.
     * </pre>
     *
     * <code>.google.protobuf.Any value = 3 [json_name = "value"];</code>
     * @return Whether the value field is set.
     */
    @java.lang.Override
    public boolean hasValue() {
      return typeCase_ == 3;
    }
    /**
     * <pre>
     * value is used when the leaf node is a single value.
     * </pre>
     *
     * <code>.google.protobuf.Any value = 3 [json_name = "value"];</code>
     * @return The value.
     */
    @java.lang.Override
    public com.google.protobuf.Any getValue() {
      if (valueBuilder_ == null) {
        if (typeCase_ == 3) {
          return (com.google.protobuf.Any) type_;
        }
        return com.google.protobuf.Any.getDefaultInstance();
      } else {
        if (typeCase_ == 3) {
          return valueBuilder_.getMessage();
        }
        return com.google.protobuf.Any.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * value is used when the leaf node is a single value.
     * </pre>
     *
     * <code>.google.protobuf.Any value = 3 [json_name = "value"];</code>
     */
    public Builder setValue(com.google.protobuf.Any value) {
      if (valueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        type_ = value;
        onChanged();
      } else {
        valueBuilder_.setMessage(value);
      }
      typeCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * value is used when the leaf node is a single value.
     * </pre>
     *
     * <code>.google.protobuf.Any value = 3 [json_name = "value"];</code>
     */
    public Builder setValue(
        com.google.protobuf.Any.Builder builderForValue) {
      if (valueBuilder_ == null) {
        type_ = builderForValue.build();
        onChanged();
      } else {
        valueBuilder_.setMessage(builderForValue.build());
      }
      typeCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * value is used when the leaf node is a single value.
     * </pre>
     *
     * <code>.google.protobuf.Any value = 3 [json_name = "value"];</code>
     */
    public Builder mergeValue(com.google.protobuf.Any value) {
      if (valueBuilder_ == null) {
        if (typeCase_ == 3 &&
            type_ != com.google.protobuf.Any.getDefaultInstance()) {
          type_ = com.google.protobuf.Any.newBuilder((com.google.protobuf.Any) type_)
              .mergeFrom(value).buildPartial();
        } else {
          type_ = value;
        }
        onChanged();
      } else {
        if (typeCase_ == 3) {
          valueBuilder_.mergeFrom(value);
        } else {
          valueBuilder_.setMessage(value);
        }
      }
      typeCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * value is used when the leaf node is a single value.
     * </pre>
     *
     * <code>.google.protobuf.Any value = 3 [json_name = "value"];</code>
     */
    public Builder clearValue() {
      if (valueBuilder_ == null) {
        if (typeCase_ == 3) {
          typeCase_ = 0;
          type_ = null;
          onChanged();
        }
      } else {
        if (typeCase_ == 3) {
          typeCase_ = 0;
          type_ = null;
        }
        valueBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * value is used when the leaf node is a single value.
     * </pre>
     *
     * <code>.google.protobuf.Any value = 3 [json_name = "value"];</code>
     */
    public com.google.protobuf.Any.Builder getValueBuilder() {
      return getValueFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * value is used when the leaf node is a single value.
     * </pre>
     *
     * <code>.google.protobuf.Any value = 3 [json_name = "value"];</code>
     */
    @java.lang.Override
    public com.google.protobuf.AnyOrBuilder getValueOrBuilder() {
      if ((typeCase_ == 3) && (valueBuilder_ != null)) {
        return valueBuilder_.getMessageOrBuilder();
      } else {
        if (typeCase_ == 3) {
          return (com.google.protobuf.Any) type_;
        }
        return com.google.protobuf.Any.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * value is used when the leaf node is a single value.
     * </pre>
     *
     * <code>.google.protobuf.Any value = 3 [json_name = "value"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getValueFieldBuilder() {
      if (valueBuilder_ == null) {
        if (!(typeCase_ == 3)) {
          type_ = com.google.protobuf.Any.getDefaultInstance();
        }
        valueBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                (com.google.protobuf.Any) type_,
                getParentForChildren(),
                isClean());
        type_ = null;
      }
      typeCase_ = 3;
      onChanged();
      return valueBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:base.v1.ExpandLeaf)
  }

  // @@protoc_insertion_point(class_scope:base.v1.ExpandLeaf)
  private static final org.permify.grpc.ExpandLeaf DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.permify.grpc.ExpandLeaf();
  }

  public static org.permify.grpc.ExpandLeaf getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExpandLeaf>
      PARSER = new com.google.protobuf.AbstractParser<ExpandLeaf>() {
    @java.lang.Override
    public ExpandLeaf parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExpandLeaf> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExpandLeaf> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.permify.grpc.ExpandLeaf getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
