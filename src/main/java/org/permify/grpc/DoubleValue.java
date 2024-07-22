// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: base/v1/base.proto
// Protobuf Java Version: 4.27.2

package org.permify.grpc;

/**
 * <pre>
 * Wrapper for a single double precision floating point value.
 * </pre>
 *
 * Protobuf type {@code base.v1.DoubleValue}
 */
public final class DoubleValue extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:base.v1.DoubleValue)
    DoubleValueOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      DoubleValue.class.getName());
  }
  // Use DoubleValue.newBuilder() to construct.
  private DoubleValue(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private DoubleValue() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.permify.grpc.BaseProto.internal_static_base_v1_DoubleValue_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.permify.grpc.BaseProto.internal_static_base_v1_DoubleValue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.permify.grpc.DoubleValue.class, org.permify.grpc.DoubleValue.Builder.class);
  }

  public static final int DATA_FIELD_NUMBER = 1;
  private double data_ = 0D;
  /**
   * <pre>
   * The double value.
   * </pre>
   *
   * <code>double data = 1 [json_name = "data"];</code>
   * @return The data.
   */
  @java.lang.Override
  public double getData() {
    return data_;
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
    if (java.lang.Double.doubleToRawLongBits(data_) != 0) {
      output.writeDouble(1, data_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Double.doubleToRawLongBits(data_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, data_);
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
    if (!(obj instanceof org.permify.grpc.DoubleValue)) {
      return super.equals(obj);
    }
    org.permify.grpc.DoubleValue other = (org.permify.grpc.DoubleValue) obj;

    if (java.lang.Double.doubleToLongBits(getData())
        != java.lang.Double.doubleToLongBits(
            other.getData())) return false;
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
    hash = (37 * hash) + DATA_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getData()));
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.permify.grpc.DoubleValue parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.DoubleValue parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.DoubleValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.DoubleValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.DoubleValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.DoubleValue parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.DoubleValue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.permify.grpc.DoubleValue parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.permify.grpc.DoubleValue parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.permify.grpc.DoubleValue parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.permify.grpc.DoubleValue parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.permify.grpc.DoubleValue parseFrom(
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
  public static Builder newBuilder(org.permify.grpc.DoubleValue prototype) {
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
   * Wrapper for a single double precision floating point value.
   * </pre>
   *
   * Protobuf type {@code base.v1.DoubleValue}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:base.v1.DoubleValue)
      org.permify.grpc.DoubleValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.permify.grpc.BaseProto.internal_static_base_v1_DoubleValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.permify.grpc.BaseProto.internal_static_base_v1_DoubleValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.permify.grpc.DoubleValue.class, org.permify.grpc.DoubleValue.Builder.class);
    }

    // Construct using org.permify.grpc.DoubleValue.newBuilder()
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
      data_ = 0D;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.permify.grpc.BaseProto.internal_static_base_v1_DoubleValue_descriptor;
    }

    @java.lang.Override
    public org.permify.grpc.DoubleValue getDefaultInstanceForType() {
      return org.permify.grpc.DoubleValue.getDefaultInstance();
    }

    @java.lang.Override
    public org.permify.grpc.DoubleValue build() {
      org.permify.grpc.DoubleValue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.permify.grpc.DoubleValue buildPartial() {
      org.permify.grpc.DoubleValue result = new org.permify.grpc.DoubleValue(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.permify.grpc.DoubleValue result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.data_ = data_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.permify.grpc.DoubleValue) {
        return mergeFrom((org.permify.grpc.DoubleValue)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.permify.grpc.DoubleValue other) {
      if (other == org.permify.grpc.DoubleValue.getDefaultInstance()) return this;
      if (other.getData() != 0D) {
        setData(other.getData());
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
            case 9: {
              data_ = input.readDouble();
              bitField0_ |= 0x00000001;
              break;
            } // case 9
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

    private double data_ ;
    /**
     * <pre>
     * The double value.
     * </pre>
     *
     * <code>double data = 1 [json_name = "data"];</code>
     * @return The data.
     */
    @java.lang.Override
    public double getData() {
      return data_;
    }
    /**
     * <pre>
     * The double value.
     * </pre>
     *
     * <code>double data = 1 [json_name = "data"];</code>
     * @param value The data to set.
     * @return This builder for chaining.
     */
    public Builder setData(double value) {

      data_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The double value.
     * </pre>
     *
     * <code>double data = 1 [json_name = "data"];</code>
     * @return This builder for chaining.
     */
    public Builder clearData() {
      bitField0_ = (bitField0_ & ~0x00000001);
      data_ = 0D;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:base.v1.DoubleValue)
  }

  // @@protoc_insertion_point(class_scope:base.v1.DoubleValue)
  private static final org.permify.grpc.DoubleValue DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.permify.grpc.DoubleValue();
  }

  public static org.permify.grpc.DoubleValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DoubleValue>
      PARSER = new com.google.protobuf.AbstractParser<DoubleValue>() {
    @java.lang.Override
    public DoubleValue parsePartialFrom(
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

  public static com.google.protobuf.Parser<DoubleValue> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DoubleValue> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.permify.grpc.DoubleValue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

