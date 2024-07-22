// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: base/v1/base.proto
// Protobuf Java Version: 4.27.2

package org.permify.grpc;

/**
 * <pre>
 * TupleToUserSet defines a mapping from tuple sets to computed user sets.
 * </pre>
 *
 * Protobuf type {@code base.v1.TupleToUserSet}
 */
public final class TupleToUserSet extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:base.v1.TupleToUserSet)
    TupleToUserSetOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      TupleToUserSet.class.getName());
  }
  // Use TupleToUserSet.newBuilder() to construct.
  private TupleToUserSet(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private TupleToUserSet() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.permify.grpc.BaseProto.internal_static_base_v1_TupleToUserSet_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.permify.grpc.BaseProto.internal_static_base_v1_TupleToUserSet_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.permify.grpc.TupleToUserSet.class, org.permify.grpc.TupleToUserSet.Builder.class);
  }

  private int bitField0_;
  public static final int TUPLESET_FIELD_NUMBER = 1;
  private org.permify.grpc.TupleSet tupleSet_;
  /**
   * <pre>
   * The tuple set
   * </pre>
   *
   * <code>.base.v1.TupleSet tupleSet = 1 [json_name = "tupleSet"];</code>
   * @return Whether the tupleSet field is set.
   */
  @java.lang.Override
  public boolean hasTupleSet() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The tuple set
   * </pre>
   *
   * <code>.base.v1.TupleSet tupleSet = 1 [json_name = "tupleSet"];</code>
   * @return The tupleSet.
   */
  @java.lang.Override
  public org.permify.grpc.TupleSet getTupleSet() {
    return tupleSet_ == null ? org.permify.grpc.TupleSet.getDefaultInstance() : tupleSet_;
  }
  /**
   * <pre>
   * The tuple set
   * </pre>
   *
   * <code>.base.v1.TupleSet tupleSet = 1 [json_name = "tupleSet"];</code>
   */
  @java.lang.Override
  public org.permify.grpc.TupleSetOrBuilder getTupleSetOrBuilder() {
    return tupleSet_ == null ? org.permify.grpc.TupleSet.getDefaultInstance() : tupleSet_;
  }

  public static final int COMPUTED_FIELD_NUMBER = 2;
  private org.permify.grpc.ComputedUserSet computed_;
  /**
   * <pre>
   * The computed user set
   * </pre>
   *
   * <code>.base.v1.ComputedUserSet computed = 2 [json_name = "computed"];</code>
   * @return Whether the computed field is set.
   */
  @java.lang.Override
  public boolean hasComputed() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The computed user set
   * </pre>
   *
   * <code>.base.v1.ComputedUserSet computed = 2 [json_name = "computed"];</code>
   * @return The computed.
   */
  @java.lang.Override
  public org.permify.grpc.ComputedUserSet getComputed() {
    return computed_ == null ? org.permify.grpc.ComputedUserSet.getDefaultInstance() : computed_;
  }
  /**
   * <pre>
   * The computed user set
   * </pre>
   *
   * <code>.base.v1.ComputedUserSet computed = 2 [json_name = "computed"];</code>
   */
  @java.lang.Override
  public org.permify.grpc.ComputedUserSetOrBuilder getComputedOrBuilder() {
    return computed_ == null ? org.permify.grpc.ComputedUserSet.getDefaultInstance() : computed_;
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
      output.writeMessage(1, getTupleSet());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getComputed());
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
        .computeMessageSize(1, getTupleSet());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getComputed());
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
    if (!(obj instanceof org.permify.grpc.TupleToUserSet)) {
      return super.equals(obj);
    }
    org.permify.grpc.TupleToUserSet other = (org.permify.grpc.TupleToUserSet) obj;

    if (hasTupleSet() != other.hasTupleSet()) return false;
    if (hasTupleSet()) {
      if (!getTupleSet()
          .equals(other.getTupleSet())) return false;
    }
    if (hasComputed() != other.hasComputed()) return false;
    if (hasComputed()) {
      if (!getComputed()
          .equals(other.getComputed())) return false;
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
    if (hasTupleSet()) {
      hash = (37 * hash) + TUPLESET_FIELD_NUMBER;
      hash = (53 * hash) + getTupleSet().hashCode();
    }
    if (hasComputed()) {
      hash = (37 * hash) + COMPUTED_FIELD_NUMBER;
      hash = (53 * hash) + getComputed().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.permify.grpc.TupleToUserSet parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.TupleToUserSet parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.TupleToUserSet parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.TupleToUserSet parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.TupleToUserSet parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.TupleToUserSet parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.TupleToUserSet parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.permify.grpc.TupleToUserSet parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.permify.grpc.TupleToUserSet parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.permify.grpc.TupleToUserSet parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.permify.grpc.TupleToUserSet parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.permify.grpc.TupleToUserSet parseFrom(
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
  public static Builder newBuilder(org.permify.grpc.TupleToUserSet prototype) {
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
   * TupleToUserSet defines a mapping from tuple sets to computed user sets.
   * </pre>
   *
   * Protobuf type {@code base.v1.TupleToUserSet}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:base.v1.TupleToUserSet)
      org.permify.grpc.TupleToUserSetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.permify.grpc.BaseProto.internal_static_base_v1_TupleToUserSet_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.permify.grpc.BaseProto.internal_static_base_v1_TupleToUserSet_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.permify.grpc.TupleToUserSet.class, org.permify.grpc.TupleToUserSet.Builder.class);
    }

    // Construct using org.permify.grpc.TupleToUserSet.newBuilder()
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
        getTupleSetFieldBuilder();
        getComputedFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      tupleSet_ = null;
      if (tupleSetBuilder_ != null) {
        tupleSetBuilder_.dispose();
        tupleSetBuilder_ = null;
      }
      computed_ = null;
      if (computedBuilder_ != null) {
        computedBuilder_.dispose();
        computedBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.permify.grpc.BaseProto.internal_static_base_v1_TupleToUserSet_descriptor;
    }

    @java.lang.Override
    public org.permify.grpc.TupleToUserSet getDefaultInstanceForType() {
      return org.permify.grpc.TupleToUserSet.getDefaultInstance();
    }

    @java.lang.Override
    public org.permify.grpc.TupleToUserSet build() {
      org.permify.grpc.TupleToUserSet result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.permify.grpc.TupleToUserSet buildPartial() {
      org.permify.grpc.TupleToUserSet result = new org.permify.grpc.TupleToUserSet(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.permify.grpc.TupleToUserSet result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.tupleSet_ = tupleSetBuilder_ == null
            ? tupleSet_
            : tupleSetBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.computed_ = computedBuilder_ == null
            ? computed_
            : computedBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.permify.grpc.TupleToUserSet) {
        return mergeFrom((org.permify.grpc.TupleToUserSet)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.permify.grpc.TupleToUserSet other) {
      if (other == org.permify.grpc.TupleToUserSet.getDefaultInstance()) return this;
      if (other.hasTupleSet()) {
        mergeTupleSet(other.getTupleSet());
      }
      if (other.hasComputed()) {
        mergeComputed(other.getComputed());
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
                  getTupleSetFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getComputedFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private org.permify.grpc.TupleSet tupleSet_;
    private com.google.protobuf.SingleFieldBuilder<
        org.permify.grpc.TupleSet, org.permify.grpc.TupleSet.Builder, org.permify.grpc.TupleSetOrBuilder> tupleSetBuilder_;
    /**
     * <pre>
     * The tuple set
     * </pre>
     *
     * <code>.base.v1.TupleSet tupleSet = 1 [json_name = "tupleSet"];</code>
     * @return Whether the tupleSet field is set.
     */
    public boolean hasTupleSet() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The tuple set
     * </pre>
     *
     * <code>.base.v1.TupleSet tupleSet = 1 [json_name = "tupleSet"];</code>
     * @return The tupleSet.
     */
    public org.permify.grpc.TupleSet getTupleSet() {
      if (tupleSetBuilder_ == null) {
        return tupleSet_ == null ? org.permify.grpc.TupleSet.getDefaultInstance() : tupleSet_;
      } else {
        return tupleSetBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The tuple set
     * </pre>
     *
     * <code>.base.v1.TupleSet tupleSet = 1 [json_name = "tupleSet"];</code>
     */
    public Builder setTupleSet(org.permify.grpc.TupleSet value) {
      if (tupleSetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tupleSet_ = value;
      } else {
        tupleSetBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The tuple set
     * </pre>
     *
     * <code>.base.v1.TupleSet tupleSet = 1 [json_name = "tupleSet"];</code>
     */
    public Builder setTupleSet(
        org.permify.grpc.TupleSet.Builder builderForValue) {
      if (tupleSetBuilder_ == null) {
        tupleSet_ = builderForValue.build();
      } else {
        tupleSetBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The tuple set
     * </pre>
     *
     * <code>.base.v1.TupleSet tupleSet = 1 [json_name = "tupleSet"];</code>
     */
    public Builder mergeTupleSet(org.permify.grpc.TupleSet value) {
      if (tupleSetBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          tupleSet_ != null &&
          tupleSet_ != org.permify.grpc.TupleSet.getDefaultInstance()) {
          getTupleSetBuilder().mergeFrom(value);
        } else {
          tupleSet_ = value;
        }
      } else {
        tupleSetBuilder_.mergeFrom(value);
      }
      if (tupleSet_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The tuple set
     * </pre>
     *
     * <code>.base.v1.TupleSet tupleSet = 1 [json_name = "tupleSet"];</code>
     */
    public Builder clearTupleSet() {
      bitField0_ = (bitField0_ & ~0x00000001);
      tupleSet_ = null;
      if (tupleSetBuilder_ != null) {
        tupleSetBuilder_.dispose();
        tupleSetBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The tuple set
     * </pre>
     *
     * <code>.base.v1.TupleSet tupleSet = 1 [json_name = "tupleSet"];</code>
     */
    public org.permify.grpc.TupleSet.Builder getTupleSetBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTupleSetFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The tuple set
     * </pre>
     *
     * <code>.base.v1.TupleSet tupleSet = 1 [json_name = "tupleSet"];</code>
     */
    public org.permify.grpc.TupleSetOrBuilder getTupleSetOrBuilder() {
      if (tupleSetBuilder_ != null) {
        return tupleSetBuilder_.getMessageOrBuilder();
      } else {
        return tupleSet_ == null ?
            org.permify.grpc.TupleSet.getDefaultInstance() : tupleSet_;
      }
    }
    /**
     * <pre>
     * The tuple set
     * </pre>
     *
     * <code>.base.v1.TupleSet tupleSet = 1 [json_name = "tupleSet"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        org.permify.grpc.TupleSet, org.permify.grpc.TupleSet.Builder, org.permify.grpc.TupleSetOrBuilder> 
        getTupleSetFieldBuilder() {
      if (tupleSetBuilder_ == null) {
        tupleSetBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            org.permify.grpc.TupleSet, org.permify.grpc.TupleSet.Builder, org.permify.grpc.TupleSetOrBuilder>(
                getTupleSet(),
                getParentForChildren(),
                isClean());
        tupleSet_ = null;
      }
      return tupleSetBuilder_;
    }

    private org.permify.grpc.ComputedUserSet computed_;
    private com.google.protobuf.SingleFieldBuilder<
        org.permify.grpc.ComputedUserSet, org.permify.grpc.ComputedUserSet.Builder, org.permify.grpc.ComputedUserSetOrBuilder> computedBuilder_;
    /**
     * <pre>
     * The computed user set
     * </pre>
     *
     * <code>.base.v1.ComputedUserSet computed = 2 [json_name = "computed"];</code>
     * @return Whether the computed field is set.
     */
    public boolean hasComputed() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The computed user set
     * </pre>
     *
     * <code>.base.v1.ComputedUserSet computed = 2 [json_name = "computed"];</code>
     * @return The computed.
     */
    public org.permify.grpc.ComputedUserSet getComputed() {
      if (computedBuilder_ == null) {
        return computed_ == null ? org.permify.grpc.ComputedUserSet.getDefaultInstance() : computed_;
      } else {
        return computedBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The computed user set
     * </pre>
     *
     * <code>.base.v1.ComputedUserSet computed = 2 [json_name = "computed"];</code>
     */
    public Builder setComputed(org.permify.grpc.ComputedUserSet value) {
      if (computedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        computed_ = value;
      } else {
        computedBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The computed user set
     * </pre>
     *
     * <code>.base.v1.ComputedUserSet computed = 2 [json_name = "computed"];</code>
     */
    public Builder setComputed(
        org.permify.grpc.ComputedUserSet.Builder builderForValue) {
      if (computedBuilder_ == null) {
        computed_ = builderForValue.build();
      } else {
        computedBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The computed user set
     * </pre>
     *
     * <code>.base.v1.ComputedUserSet computed = 2 [json_name = "computed"];</code>
     */
    public Builder mergeComputed(org.permify.grpc.ComputedUserSet value) {
      if (computedBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          computed_ != null &&
          computed_ != org.permify.grpc.ComputedUserSet.getDefaultInstance()) {
          getComputedBuilder().mergeFrom(value);
        } else {
          computed_ = value;
        }
      } else {
        computedBuilder_.mergeFrom(value);
      }
      if (computed_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The computed user set
     * </pre>
     *
     * <code>.base.v1.ComputedUserSet computed = 2 [json_name = "computed"];</code>
     */
    public Builder clearComputed() {
      bitField0_ = (bitField0_ & ~0x00000002);
      computed_ = null;
      if (computedBuilder_ != null) {
        computedBuilder_.dispose();
        computedBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The computed user set
     * </pre>
     *
     * <code>.base.v1.ComputedUserSet computed = 2 [json_name = "computed"];</code>
     */
    public org.permify.grpc.ComputedUserSet.Builder getComputedBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getComputedFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The computed user set
     * </pre>
     *
     * <code>.base.v1.ComputedUserSet computed = 2 [json_name = "computed"];</code>
     */
    public org.permify.grpc.ComputedUserSetOrBuilder getComputedOrBuilder() {
      if (computedBuilder_ != null) {
        return computedBuilder_.getMessageOrBuilder();
      } else {
        return computed_ == null ?
            org.permify.grpc.ComputedUserSet.getDefaultInstance() : computed_;
      }
    }
    /**
     * <pre>
     * The computed user set
     * </pre>
     *
     * <code>.base.v1.ComputedUserSet computed = 2 [json_name = "computed"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        org.permify.grpc.ComputedUserSet, org.permify.grpc.ComputedUserSet.Builder, org.permify.grpc.ComputedUserSetOrBuilder> 
        getComputedFieldBuilder() {
      if (computedBuilder_ == null) {
        computedBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            org.permify.grpc.ComputedUserSet, org.permify.grpc.ComputedUserSet.Builder, org.permify.grpc.ComputedUserSetOrBuilder>(
                getComputed(),
                getParentForChildren(),
                isClean());
        computed_ = null;
      }
      return computedBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:base.v1.TupleToUserSet)
  }

  // @@protoc_insertion_point(class_scope:base.v1.TupleToUserSet)
  private static final org.permify.grpc.TupleToUserSet DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.permify.grpc.TupleToUserSet();
  }

  public static org.permify.grpc.TupleToUserSet getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TupleToUserSet>
      PARSER = new com.google.protobuf.AbstractParser<TupleToUserSet>() {
    @java.lang.Override
    public TupleToUserSet parsePartialFrom(
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

  public static com.google.protobuf.Parser<TupleToUserSet> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TupleToUserSet> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.permify.grpc.TupleToUserSet getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

