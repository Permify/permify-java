// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: base/v1/base.proto
// Protobuf Java Version: 4.27.2

package org.permify.grpc;

/**
 * <pre>
 * DataChange represents a single change in data, with an operation type and the actual change which could be a tuple or an attribute.
 * </pre>
 *
 * Protobuf type {@code base.v1.DataChange}
 */
public final class DataChange extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:base.v1.DataChange)
    DataChangeOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      DataChange.class.getName());
  }
  // Use DataChange.newBuilder() to construct.
  private DataChange(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private DataChange() {
    operation_ = 0;
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.permify.grpc.BaseProto.internal_static_base_v1_DataChange_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.permify.grpc.BaseProto.internal_static_base_v1_DataChange_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.permify.grpc.DataChange.class, org.permify.grpc.DataChange.Builder.class);
  }

  /**
   * Protobuf enum {@code base.v1.DataChange.Operation}
   */
  public enum Operation
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Default operation, not specified.
     * </pre>
     *
     * <code>OPERATION_UNSPECIFIED = 0;</code>
     */
    OPERATION_UNSPECIFIED(0),
    /**
     * <pre>
     * Creation operation.
     * </pre>
     *
     * <code>OPERATION_CREATE = 1;</code>
     */
    OPERATION_CREATE(1),
    /**
     * <pre>
     * Deletion operation.
     * </pre>
     *
     * <code>OPERATION_DELETE = 2;</code>
     */
    OPERATION_DELETE(2),
    UNRECOGNIZED(-1),
    ;

    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        Operation.class.getName());
    }
    /**
     * <pre>
     * Default operation, not specified.
     * </pre>
     *
     * <code>OPERATION_UNSPECIFIED = 0;</code>
     */
    public static final int OPERATION_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Creation operation.
     * </pre>
     *
     * <code>OPERATION_CREATE = 1;</code>
     */
    public static final int OPERATION_CREATE_VALUE = 1;
    /**
     * <pre>
     * Deletion operation.
     * </pre>
     *
     * <code>OPERATION_DELETE = 2;</code>
     */
    public static final int OPERATION_DELETE_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Operation valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Operation forNumber(int value) {
      switch (value) {
        case 0: return OPERATION_UNSPECIFIED;
        case 1: return OPERATION_CREATE;
        case 2: return OPERATION_DELETE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Operation>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Operation> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Operation>() {
            public Operation findValueByNumber(int number) {
              return Operation.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return org.permify.grpc.DataChange.getDescriptor().getEnumTypes().get(0);
    }

    private static final Operation[] VALUES = values();

    public static Operation valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Operation(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:base.v1.DataChange.Operation)
  }

  private int typeCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object type_;
  public enum TypeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    TUPLE(2),
    ATTRIBUTE(3),
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
        case 2: return TUPLE;
        case 3: return ATTRIBUTE;
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

  public static final int OPERATION_FIELD_NUMBER = 1;
  private int operation_ = 0;
  /**
   * <pre>
   * The operation type.
   * </pre>
   *
   * <code>.base.v1.DataChange.Operation operation = 1 [json_name = "operation"];</code>
   * @return The enum numeric value on the wire for operation.
   */
  @java.lang.Override public int getOperationValue() {
    return operation_;
  }
  /**
   * <pre>
   * The operation type.
   * </pre>
   *
   * <code>.base.v1.DataChange.Operation operation = 1 [json_name = "operation"];</code>
   * @return The operation.
   */
  @java.lang.Override public org.permify.grpc.DataChange.Operation getOperation() {
    org.permify.grpc.DataChange.Operation result = org.permify.grpc.DataChange.Operation.forNumber(operation_);
    return result == null ? org.permify.grpc.DataChange.Operation.UNRECOGNIZED : result;
  }

  public static final int TUPLE_FIELD_NUMBER = 2;
  /**
   * <pre>
   * If the change is a tuple.
   * </pre>
   *
   * <code>.base.v1.Tuple tuple = 2 [json_name = "tuple"];</code>
   * @return Whether the tuple field is set.
   */
  @java.lang.Override
  public boolean hasTuple() {
    return typeCase_ == 2;
  }
  /**
   * <pre>
   * If the change is a tuple.
   * </pre>
   *
   * <code>.base.v1.Tuple tuple = 2 [json_name = "tuple"];</code>
   * @return The tuple.
   */
  @java.lang.Override
  public org.permify.grpc.Tuple getTuple() {
    if (typeCase_ == 2) {
       return (org.permify.grpc.Tuple) type_;
    }
    return org.permify.grpc.Tuple.getDefaultInstance();
  }
  /**
   * <pre>
   * If the change is a tuple.
   * </pre>
   *
   * <code>.base.v1.Tuple tuple = 2 [json_name = "tuple"];</code>
   */
  @java.lang.Override
  public org.permify.grpc.TupleOrBuilder getTupleOrBuilder() {
    if (typeCase_ == 2) {
       return (org.permify.grpc.Tuple) type_;
    }
    return org.permify.grpc.Tuple.getDefaultInstance();
  }

  public static final int ATTRIBUTE_FIELD_NUMBER = 3;
  /**
   * <pre>
   * If the change is an attribute.
   * </pre>
   *
   * <code>.base.v1.Attribute attribute = 3 [json_name = "attribute"];</code>
   * @return Whether the attribute field is set.
   */
  @java.lang.Override
  public boolean hasAttribute() {
    return typeCase_ == 3;
  }
  /**
   * <pre>
   * If the change is an attribute.
   * </pre>
   *
   * <code>.base.v1.Attribute attribute = 3 [json_name = "attribute"];</code>
   * @return The attribute.
   */
  @java.lang.Override
  public org.permify.grpc.Attribute getAttribute() {
    if (typeCase_ == 3) {
       return (org.permify.grpc.Attribute) type_;
    }
    return org.permify.grpc.Attribute.getDefaultInstance();
  }
  /**
   * <pre>
   * If the change is an attribute.
   * </pre>
   *
   * <code>.base.v1.Attribute attribute = 3 [json_name = "attribute"];</code>
   */
  @java.lang.Override
  public org.permify.grpc.AttributeOrBuilder getAttributeOrBuilder() {
    if (typeCase_ == 3) {
       return (org.permify.grpc.Attribute) type_;
    }
    return org.permify.grpc.Attribute.getDefaultInstance();
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
    if (operation_ != org.permify.grpc.DataChange.Operation.OPERATION_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, operation_);
    }
    if (typeCase_ == 2) {
      output.writeMessage(2, (org.permify.grpc.Tuple) type_);
    }
    if (typeCase_ == 3) {
      output.writeMessage(3, (org.permify.grpc.Attribute) type_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (operation_ != org.permify.grpc.DataChange.Operation.OPERATION_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, operation_);
    }
    if (typeCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (org.permify.grpc.Tuple) type_);
    }
    if (typeCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (org.permify.grpc.Attribute) type_);
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
    if (!(obj instanceof org.permify.grpc.DataChange)) {
      return super.equals(obj);
    }
    org.permify.grpc.DataChange other = (org.permify.grpc.DataChange) obj;

    if (operation_ != other.operation_) return false;
    if (!getTypeCase().equals(other.getTypeCase())) return false;
    switch (typeCase_) {
      case 2:
        if (!getTuple()
            .equals(other.getTuple())) return false;
        break;
      case 3:
        if (!getAttribute()
            .equals(other.getAttribute())) return false;
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
    hash = (37 * hash) + OPERATION_FIELD_NUMBER;
    hash = (53 * hash) + operation_;
    switch (typeCase_) {
      case 2:
        hash = (37 * hash) + TUPLE_FIELD_NUMBER;
        hash = (53 * hash) + getTuple().hashCode();
        break;
      case 3:
        hash = (37 * hash) + ATTRIBUTE_FIELD_NUMBER;
        hash = (53 * hash) + getAttribute().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.permify.grpc.DataChange parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.DataChange parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.DataChange parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.DataChange parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.DataChange parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.DataChange parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.DataChange parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.permify.grpc.DataChange parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.permify.grpc.DataChange parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.permify.grpc.DataChange parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.permify.grpc.DataChange parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.permify.grpc.DataChange parseFrom(
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
  public static Builder newBuilder(org.permify.grpc.DataChange prototype) {
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
   * DataChange represents a single change in data, with an operation type and the actual change which could be a tuple or an attribute.
   * </pre>
   *
   * Protobuf type {@code base.v1.DataChange}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:base.v1.DataChange)
      org.permify.grpc.DataChangeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.permify.grpc.BaseProto.internal_static_base_v1_DataChange_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.permify.grpc.BaseProto.internal_static_base_v1_DataChange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.permify.grpc.DataChange.class, org.permify.grpc.DataChange.Builder.class);
    }

    // Construct using org.permify.grpc.DataChange.newBuilder()
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
      operation_ = 0;
      if (tupleBuilder_ != null) {
        tupleBuilder_.clear();
      }
      if (attributeBuilder_ != null) {
        attributeBuilder_.clear();
      }
      typeCase_ = 0;
      type_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.permify.grpc.BaseProto.internal_static_base_v1_DataChange_descriptor;
    }

    @java.lang.Override
    public org.permify.grpc.DataChange getDefaultInstanceForType() {
      return org.permify.grpc.DataChange.getDefaultInstance();
    }

    @java.lang.Override
    public org.permify.grpc.DataChange build() {
      org.permify.grpc.DataChange result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.permify.grpc.DataChange buildPartial() {
      org.permify.grpc.DataChange result = new org.permify.grpc.DataChange(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(org.permify.grpc.DataChange result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.operation_ = operation_;
      }
    }

    private void buildPartialOneofs(org.permify.grpc.DataChange result) {
      result.typeCase_ = typeCase_;
      result.type_ = this.type_;
      if (typeCase_ == 2 &&
          tupleBuilder_ != null) {
        result.type_ = tupleBuilder_.build();
      }
      if (typeCase_ == 3 &&
          attributeBuilder_ != null) {
        result.type_ = attributeBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.permify.grpc.DataChange) {
        return mergeFrom((org.permify.grpc.DataChange)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.permify.grpc.DataChange other) {
      if (other == org.permify.grpc.DataChange.getDefaultInstance()) return this;
      if (other.operation_ != 0) {
        setOperationValue(other.getOperationValue());
      }
      switch (other.getTypeCase()) {
        case TUPLE: {
          mergeTuple(other.getTuple());
          break;
        }
        case ATTRIBUTE: {
          mergeAttribute(other.getAttribute());
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
            case 8: {
              operation_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getTupleFieldBuilder().getBuilder(),
                  extensionRegistry);
              typeCase_ = 2;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getAttributeFieldBuilder().getBuilder(),
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

    private int operation_ = 0;
    /**
     * <pre>
     * The operation type.
     * </pre>
     *
     * <code>.base.v1.DataChange.Operation operation = 1 [json_name = "operation"];</code>
     * @return The enum numeric value on the wire for operation.
     */
    @java.lang.Override public int getOperationValue() {
      return operation_;
    }
    /**
     * <pre>
     * The operation type.
     * </pre>
     *
     * <code>.base.v1.DataChange.Operation operation = 1 [json_name = "operation"];</code>
     * @param value The enum numeric value on the wire for operation to set.
     * @return This builder for chaining.
     */
    public Builder setOperationValue(int value) {
      operation_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The operation type.
     * </pre>
     *
     * <code>.base.v1.DataChange.Operation operation = 1 [json_name = "operation"];</code>
     * @return The operation.
     */
    @java.lang.Override
    public org.permify.grpc.DataChange.Operation getOperation() {
      org.permify.grpc.DataChange.Operation result = org.permify.grpc.DataChange.Operation.forNumber(operation_);
      return result == null ? org.permify.grpc.DataChange.Operation.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The operation type.
     * </pre>
     *
     * <code>.base.v1.DataChange.Operation operation = 1 [json_name = "operation"];</code>
     * @param value The operation to set.
     * @return This builder for chaining.
     */
    public Builder setOperation(org.permify.grpc.DataChange.Operation value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      operation_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The operation type.
     * </pre>
     *
     * <code>.base.v1.DataChange.Operation operation = 1 [json_name = "operation"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOperation() {
      bitField0_ = (bitField0_ & ~0x00000001);
      operation_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilder<
        org.permify.grpc.Tuple, org.permify.grpc.Tuple.Builder, org.permify.grpc.TupleOrBuilder> tupleBuilder_;
    /**
     * <pre>
     * If the change is a tuple.
     * </pre>
     *
     * <code>.base.v1.Tuple tuple = 2 [json_name = "tuple"];</code>
     * @return Whether the tuple field is set.
     */
    @java.lang.Override
    public boolean hasTuple() {
      return typeCase_ == 2;
    }
    /**
     * <pre>
     * If the change is a tuple.
     * </pre>
     *
     * <code>.base.v1.Tuple tuple = 2 [json_name = "tuple"];</code>
     * @return The tuple.
     */
    @java.lang.Override
    public org.permify.grpc.Tuple getTuple() {
      if (tupleBuilder_ == null) {
        if (typeCase_ == 2) {
          return (org.permify.grpc.Tuple) type_;
        }
        return org.permify.grpc.Tuple.getDefaultInstance();
      } else {
        if (typeCase_ == 2) {
          return tupleBuilder_.getMessage();
        }
        return org.permify.grpc.Tuple.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * If the change is a tuple.
     * </pre>
     *
     * <code>.base.v1.Tuple tuple = 2 [json_name = "tuple"];</code>
     */
    public Builder setTuple(org.permify.grpc.Tuple value) {
      if (tupleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        type_ = value;
        onChanged();
      } else {
        tupleBuilder_.setMessage(value);
      }
      typeCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * If the change is a tuple.
     * </pre>
     *
     * <code>.base.v1.Tuple tuple = 2 [json_name = "tuple"];</code>
     */
    public Builder setTuple(
        org.permify.grpc.Tuple.Builder builderForValue) {
      if (tupleBuilder_ == null) {
        type_ = builderForValue.build();
        onChanged();
      } else {
        tupleBuilder_.setMessage(builderForValue.build());
      }
      typeCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * If the change is a tuple.
     * </pre>
     *
     * <code>.base.v1.Tuple tuple = 2 [json_name = "tuple"];</code>
     */
    public Builder mergeTuple(org.permify.grpc.Tuple value) {
      if (tupleBuilder_ == null) {
        if (typeCase_ == 2 &&
            type_ != org.permify.grpc.Tuple.getDefaultInstance()) {
          type_ = org.permify.grpc.Tuple.newBuilder((org.permify.grpc.Tuple) type_)
              .mergeFrom(value).buildPartial();
        } else {
          type_ = value;
        }
        onChanged();
      } else {
        if (typeCase_ == 2) {
          tupleBuilder_.mergeFrom(value);
        } else {
          tupleBuilder_.setMessage(value);
        }
      }
      typeCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * If the change is a tuple.
     * </pre>
     *
     * <code>.base.v1.Tuple tuple = 2 [json_name = "tuple"];</code>
     */
    public Builder clearTuple() {
      if (tupleBuilder_ == null) {
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
        tupleBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * If the change is a tuple.
     * </pre>
     *
     * <code>.base.v1.Tuple tuple = 2 [json_name = "tuple"];</code>
     */
    public org.permify.grpc.Tuple.Builder getTupleBuilder() {
      return getTupleFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * If the change is a tuple.
     * </pre>
     *
     * <code>.base.v1.Tuple tuple = 2 [json_name = "tuple"];</code>
     */
    @java.lang.Override
    public org.permify.grpc.TupleOrBuilder getTupleOrBuilder() {
      if ((typeCase_ == 2) && (tupleBuilder_ != null)) {
        return tupleBuilder_.getMessageOrBuilder();
      } else {
        if (typeCase_ == 2) {
          return (org.permify.grpc.Tuple) type_;
        }
        return org.permify.grpc.Tuple.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * If the change is a tuple.
     * </pre>
     *
     * <code>.base.v1.Tuple tuple = 2 [json_name = "tuple"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        org.permify.grpc.Tuple, org.permify.grpc.Tuple.Builder, org.permify.grpc.TupleOrBuilder> 
        getTupleFieldBuilder() {
      if (tupleBuilder_ == null) {
        if (!(typeCase_ == 2)) {
          type_ = org.permify.grpc.Tuple.getDefaultInstance();
        }
        tupleBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            org.permify.grpc.Tuple, org.permify.grpc.Tuple.Builder, org.permify.grpc.TupleOrBuilder>(
                (org.permify.grpc.Tuple) type_,
                getParentForChildren(),
                isClean());
        type_ = null;
      }
      typeCase_ = 2;
      onChanged();
      return tupleBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilder<
        org.permify.grpc.Attribute, org.permify.grpc.Attribute.Builder, org.permify.grpc.AttributeOrBuilder> attributeBuilder_;
    /**
     * <pre>
     * If the change is an attribute.
     * </pre>
     *
     * <code>.base.v1.Attribute attribute = 3 [json_name = "attribute"];</code>
     * @return Whether the attribute field is set.
     */
    @java.lang.Override
    public boolean hasAttribute() {
      return typeCase_ == 3;
    }
    /**
     * <pre>
     * If the change is an attribute.
     * </pre>
     *
     * <code>.base.v1.Attribute attribute = 3 [json_name = "attribute"];</code>
     * @return The attribute.
     */
    @java.lang.Override
    public org.permify.grpc.Attribute getAttribute() {
      if (attributeBuilder_ == null) {
        if (typeCase_ == 3) {
          return (org.permify.grpc.Attribute) type_;
        }
        return org.permify.grpc.Attribute.getDefaultInstance();
      } else {
        if (typeCase_ == 3) {
          return attributeBuilder_.getMessage();
        }
        return org.permify.grpc.Attribute.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * If the change is an attribute.
     * </pre>
     *
     * <code>.base.v1.Attribute attribute = 3 [json_name = "attribute"];</code>
     */
    public Builder setAttribute(org.permify.grpc.Attribute value) {
      if (attributeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        type_ = value;
        onChanged();
      } else {
        attributeBuilder_.setMessage(value);
      }
      typeCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * If the change is an attribute.
     * </pre>
     *
     * <code>.base.v1.Attribute attribute = 3 [json_name = "attribute"];</code>
     */
    public Builder setAttribute(
        org.permify.grpc.Attribute.Builder builderForValue) {
      if (attributeBuilder_ == null) {
        type_ = builderForValue.build();
        onChanged();
      } else {
        attributeBuilder_.setMessage(builderForValue.build());
      }
      typeCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * If the change is an attribute.
     * </pre>
     *
     * <code>.base.v1.Attribute attribute = 3 [json_name = "attribute"];</code>
     */
    public Builder mergeAttribute(org.permify.grpc.Attribute value) {
      if (attributeBuilder_ == null) {
        if (typeCase_ == 3 &&
            type_ != org.permify.grpc.Attribute.getDefaultInstance()) {
          type_ = org.permify.grpc.Attribute.newBuilder((org.permify.grpc.Attribute) type_)
              .mergeFrom(value).buildPartial();
        } else {
          type_ = value;
        }
        onChanged();
      } else {
        if (typeCase_ == 3) {
          attributeBuilder_.mergeFrom(value);
        } else {
          attributeBuilder_.setMessage(value);
        }
      }
      typeCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * If the change is an attribute.
     * </pre>
     *
     * <code>.base.v1.Attribute attribute = 3 [json_name = "attribute"];</code>
     */
    public Builder clearAttribute() {
      if (attributeBuilder_ == null) {
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
        attributeBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * If the change is an attribute.
     * </pre>
     *
     * <code>.base.v1.Attribute attribute = 3 [json_name = "attribute"];</code>
     */
    public org.permify.grpc.Attribute.Builder getAttributeBuilder() {
      return getAttributeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * If the change is an attribute.
     * </pre>
     *
     * <code>.base.v1.Attribute attribute = 3 [json_name = "attribute"];</code>
     */
    @java.lang.Override
    public org.permify.grpc.AttributeOrBuilder getAttributeOrBuilder() {
      if ((typeCase_ == 3) && (attributeBuilder_ != null)) {
        return attributeBuilder_.getMessageOrBuilder();
      } else {
        if (typeCase_ == 3) {
          return (org.permify.grpc.Attribute) type_;
        }
        return org.permify.grpc.Attribute.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * If the change is an attribute.
     * </pre>
     *
     * <code>.base.v1.Attribute attribute = 3 [json_name = "attribute"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        org.permify.grpc.Attribute, org.permify.grpc.Attribute.Builder, org.permify.grpc.AttributeOrBuilder> 
        getAttributeFieldBuilder() {
      if (attributeBuilder_ == null) {
        if (!(typeCase_ == 3)) {
          type_ = org.permify.grpc.Attribute.getDefaultInstance();
        }
        attributeBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            org.permify.grpc.Attribute, org.permify.grpc.Attribute.Builder, org.permify.grpc.AttributeOrBuilder>(
                (org.permify.grpc.Attribute) type_,
                getParentForChildren(),
                isClean());
        type_ = null;
      }
      typeCase_ = 3;
      onChanged();
      return attributeBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:base.v1.DataChange)
  }

  // @@protoc_insertion_point(class_scope:base.v1.DataChange)
  private static final org.permify.grpc.DataChange DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.permify.grpc.DataChange();
  }

  public static org.permify.grpc.DataChange getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DataChange>
      PARSER = new com.google.protobuf.AbstractParser<DataChange>() {
    @java.lang.Override
    public DataChange parsePartialFrom(
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

  public static com.google.protobuf.Parser<DataChange> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DataChange> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.permify.grpc.DataChange getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

