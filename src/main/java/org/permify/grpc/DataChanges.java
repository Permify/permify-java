// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: base/v1/base.proto
// Protobuf Java Version: 4.27.2

package org.permify.grpc;

/**
 * <pre>
 * DataChanges represent changes in data with a snap token and a list of data change objects.
 * </pre>
 *
 * Protobuf type {@code base.v1.DataChanges}
 */
public final class DataChanges extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:base.v1.DataChanges)
    DataChangesOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      DataChanges.class.getName());
  }
  // Use DataChanges.newBuilder() to construct.
  private DataChanges(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private DataChanges() {
    snapToken_ = "";
    dataChanges_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.permify.grpc.BaseProto.internal_static_base_v1_DataChanges_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.permify.grpc.BaseProto.internal_static_base_v1_DataChanges_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.permify.grpc.DataChanges.class, org.permify.grpc.DataChanges.Builder.class);
  }

  public static final int SNAP_TOKEN_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object snapToken_ = "";
  /**
   * <pre>
   * The snapshot token.
   * </pre>
   *
   * <code>string snap_token = 1 [json_name = "snap_token"];</code>
   * @return The snapToken.
   */
  @java.lang.Override
  public java.lang.String getSnapToken() {
    java.lang.Object ref = snapToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      snapToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The snapshot token.
   * </pre>
   *
   * <code>string snap_token = 1 [json_name = "snap_token"];</code>
   * @return The bytes for snapToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSnapTokenBytes() {
    java.lang.Object ref = snapToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      snapToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATA_CHANGES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<org.permify.grpc.DataChange> dataChanges_;
  /**
   * <pre>
   * The list of data changes.
   * </pre>
   *
   * <code>repeated .base.v1.DataChange data_changes = 2 [json_name = "data_changes"];</code>
   */
  @java.lang.Override
  public java.util.List<org.permify.grpc.DataChange> getDataChangesList() {
    return dataChanges_;
  }
  /**
   * <pre>
   * The list of data changes.
   * </pre>
   *
   * <code>repeated .base.v1.DataChange data_changes = 2 [json_name = "data_changes"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.permify.grpc.DataChangeOrBuilder> 
      getDataChangesOrBuilderList() {
    return dataChanges_;
  }
  /**
   * <pre>
   * The list of data changes.
   * </pre>
   *
   * <code>repeated .base.v1.DataChange data_changes = 2 [json_name = "data_changes"];</code>
   */
  @java.lang.Override
  public int getDataChangesCount() {
    return dataChanges_.size();
  }
  /**
   * <pre>
   * The list of data changes.
   * </pre>
   *
   * <code>repeated .base.v1.DataChange data_changes = 2 [json_name = "data_changes"];</code>
   */
  @java.lang.Override
  public org.permify.grpc.DataChange getDataChanges(int index) {
    return dataChanges_.get(index);
  }
  /**
   * <pre>
   * The list of data changes.
   * </pre>
   *
   * <code>repeated .base.v1.DataChange data_changes = 2 [json_name = "data_changes"];</code>
   */
  @java.lang.Override
  public org.permify.grpc.DataChangeOrBuilder getDataChangesOrBuilder(
      int index) {
    return dataChanges_.get(index);
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(snapToken_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, snapToken_);
    }
    for (int i = 0; i < dataChanges_.size(); i++) {
      output.writeMessage(2, dataChanges_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(snapToken_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, snapToken_);
    }
    for (int i = 0; i < dataChanges_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, dataChanges_.get(i));
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
    if (!(obj instanceof org.permify.grpc.DataChanges)) {
      return super.equals(obj);
    }
    org.permify.grpc.DataChanges other = (org.permify.grpc.DataChanges) obj;

    if (!getSnapToken()
        .equals(other.getSnapToken())) return false;
    if (!getDataChangesList()
        .equals(other.getDataChangesList())) return false;
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
    hash = (37 * hash) + SNAP_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getSnapToken().hashCode();
    if (getDataChangesCount() > 0) {
      hash = (37 * hash) + DATA_CHANGES_FIELD_NUMBER;
      hash = (53 * hash) + getDataChangesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.permify.grpc.DataChanges parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.DataChanges parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.DataChanges parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.DataChanges parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.DataChanges parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.DataChanges parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.DataChanges parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.permify.grpc.DataChanges parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.permify.grpc.DataChanges parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.permify.grpc.DataChanges parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.permify.grpc.DataChanges parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.permify.grpc.DataChanges parseFrom(
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
  public static Builder newBuilder(org.permify.grpc.DataChanges prototype) {
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
   * DataChanges represent changes in data with a snap token and a list of data change objects.
   * </pre>
   *
   * Protobuf type {@code base.v1.DataChanges}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:base.v1.DataChanges)
      org.permify.grpc.DataChangesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.permify.grpc.BaseProto.internal_static_base_v1_DataChanges_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.permify.grpc.BaseProto.internal_static_base_v1_DataChanges_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.permify.grpc.DataChanges.class, org.permify.grpc.DataChanges.Builder.class);
    }

    // Construct using org.permify.grpc.DataChanges.newBuilder()
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
      snapToken_ = "";
      if (dataChangesBuilder_ == null) {
        dataChanges_ = java.util.Collections.emptyList();
      } else {
        dataChanges_ = null;
        dataChangesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.permify.grpc.BaseProto.internal_static_base_v1_DataChanges_descriptor;
    }

    @java.lang.Override
    public org.permify.grpc.DataChanges getDefaultInstanceForType() {
      return org.permify.grpc.DataChanges.getDefaultInstance();
    }

    @java.lang.Override
    public org.permify.grpc.DataChanges build() {
      org.permify.grpc.DataChanges result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.permify.grpc.DataChanges buildPartial() {
      org.permify.grpc.DataChanges result = new org.permify.grpc.DataChanges(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(org.permify.grpc.DataChanges result) {
      if (dataChangesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          dataChanges_ = java.util.Collections.unmodifiableList(dataChanges_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.dataChanges_ = dataChanges_;
      } else {
        result.dataChanges_ = dataChangesBuilder_.build();
      }
    }

    private void buildPartial0(org.permify.grpc.DataChanges result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.snapToken_ = snapToken_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.permify.grpc.DataChanges) {
        return mergeFrom((org.permify.grpc.DataChanges)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.permify.grpc.DataChanges other) {
      if (other == org.permify.grpc.DataChanges.getDefaultInstance()) return this;
      if (!other.getSnapToken().isEmpty()) {
        snapToken_ = other.snapToken_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (dataChangesBuilder_ == null) {
        if (!other.dataChanges_.isEmpty()) {
          if (dataChanges_.isEmpty()) {
            dataChanges_ = other.dataChanges_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureDataChangesIsMutable();
            dataChanges_.addAll(other.dataChanges_);
          }
          onChanged();
        }
      } else {
        if (!other.dataChanges_.isEmpty()) {
          if (dataChangesBuilder_.isEmpty()) {
            dataChangesBuilder_.dispose();
            dataChangesBuilder_ = null;
            dataChanges_ = other.dataChanges_;
            bitField0_ = (bitField0_ & ~0x00000002);
            dataChangesBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getDataChangesFieldBuilder() : null;
          } else {
            dataChangesBuilder_.addAllMessages(other.dataChanges_);
          }
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
              snapToken_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              org.permify.grpc.DataChange m =
                  input.readMessage(
                      org.permify.grpc.DataChange.parser(),
                      extensionRegistry);
              if (dataChangesBuilder_ == null) {
                ensureDataChangesIsMutable();
                dataChanges_.add(m);
              } else {
                dataChangesBuilder_.addMessage(m);
              }
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

    private java.lang.Object snapToken_ = "";
    /**
     * <pre>
     * The snapshot token.
     * </pre>
     *
     * <code>string snap_token = 1 [json_name = "snap_token"];</code>
     * @return The snapToken.
     */
    public java.lang.String getSnapToken() {
      java.lang.Object ref = snapToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        snapToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The snapshot token.
     * </pre>
     *
     * <code>string snap_token = 1 [json_name = "snap_token"];</code>
     * @return The bytes for snapToken.
     */
    public com.google.protobuf.ByteString
        getSnapTokenBytes() {
      java.lang.Object ref = snapToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        snapToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The snapshot token.
     * </pre>
     *
     * <code>string snap_token = 1 [json_name = "snap_token"];</code>
     * @param value The snapToken to set.
     * @return This builder for chaining.
     */
    public Builder setSnapToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      snapToken_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The snapshot token.
     * </pre>
     *
     * <code>string snap_token = 1 [json_name = "snap_token"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSnapToken() {
      snapToken_ = getDefaultInstance().getSnapToken();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The snapshot token.
     * </pre>
     *
     * <code>string snap_token = 1 [json_name = "snap_token"];</code>
     * @param value The bytes for snapToken to set.
     * @return This builder for chaining.
     */
    public Builder setSnapTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      snapToken_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<org.permify.grpc.DataChange> dataChanges_ =
      java.util.Collections.emptyList();
    private void ensureDataChangesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        dataChanges_ = new java.util.ArrayList<org.permify.grpc.DataChange>(dataChanges_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        org.permify.grpc.DataChange, org.permify.grpc.DataChange.Builder, org.permify.grpc.DataChangeOrBuilder> dataChangesBuilder_;

    /**
     * <pre>
     * The list of data changes.
     * </pre>
     *
     * <code>repeated .base.v1.DataChange data_changes = 2 [json_name = "data_changes"];</code>
     */
    public java.util.List<org.permify.grpc.DataChange> getDataChangesList() {
      if (dataChangesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(dataChanges_);
      } else {
        return dataChangesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of data changes.
     * </pre>
     *
     * <code>repeated .base.v1.DataChange data_changes = 2 [json_name = "data_changes"];</code>
     */
    public int getDataChangesCount() {
      if (dataChangesBuilder_ == null) {
        return dataChanges_.size();
      } else {
        return dataChangesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of data changes.
     * </pre>
     *
     * <code>repeated .base.v1.DataChange data_changes = 2 [json_name = "data_changes"];</code>
     */
    public org.permify.grpc.DataChange getDataChanges(int index) {
      if (dataChangesBuilder_ == null) {
        return dataChanges_.get(index);
      } else {
        return dataChangesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of data changes.
     * </pre>
     *
     * <code>repeated .base.v1.DataChange data_changes = 2 [json_name = "data_changes"];</code>
     */
    public Builder setDataChanges(
        int index, org.permify.grpc.DataChange value) {
      if (dataChangesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataChangesIsMutable();
        dataChanges_.set(index, value);
        onChanged();
      } else {
        dataChangesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of data changes.
     * </pre>
     *
     * <code>repeated .base.v1.DataChange data_changes = 2 [json_name = "data_changes"];</code>
     */
    public Builder setDataChanges(
        int index, org.permify.grpc.DataChange.Builder builderForValue) {
      if (dataChangesBuilder_ == null) {
        ensureDataChangesIsMutable();
        dataChanges_.set(index, builderForValue.build());
        onChanged();
      } else {
        dataChangesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of data changes.
     * </pre>
     *
     * <code>repeated .base.v1.DataChange data_changes = 2 [json_name = "data_changes"];</code>
     */
    public Builder addDataChanges(org.permify.grpc.DataChange value) {
      if (dataChangesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataChangesIsMutable();
        dataChanges_.add(value);
        onChanged();
      } else {
        dataChangesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of data changes.
     * </pre>
     *
     * <code>repeated .base.v1.DataChange data_changes = 2 [json_name = "data_changes"];</code>
     */
    public Builder addDataChanges(
        int index, org.permify.grpc.DataChange value) {
      if (dataChangesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataChangesIsMutable();
        dataChanges_.add(index, value);
        onChanged();
      } else {
        dataChangesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of data changes.
     * </pre>
     *
     * <code>repeated .base.v1.DataChange data_changes = 2 [json_name = "data_changes"];</code>
     */
    public Builder addDataChanges(
        org.permify.grpc.DataChange.Builder builderForValue) {
      if (dataChangesBuilder_ == null) {
        ensureDataChangesIsMutable();
        dataChanges_.add(builderForValue.build());
        onChanged();
      } else {
        dataChangesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of data changes.
     * </pre>
     *
     * <code>repeated .base.v1.DataChange data_changes = 2 [json_name = "data_changes"];</code>
     */
    public Builder addDataChanges(
        int index, org.permify.grpc.DataChange.Builder builderForValue) {
      if (dataChangesBuilder_ == null) {
        ensureDataChangesIsMutable();
        dataChanges_.add(index, builderForValue.build());
        onChanged();
      } else {
        dataChangesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of data changes.
     * </pre>
     *
     * <code>repeated .base.v1.DataChange data_changes = 2 [json_name = "data_changes"];</code>
     */
    public Builder addAllDataChanges(
        java.lang.Iterable<? extends org.permify.grpc.DataChange> values) {
      if (dataChangesBuilder_ == null) {
        ensureDataChangesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, dataChanges_);
        onChanged();
      } else {
        dataChangesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of data changes.
     * </pre>
     *
     * <code>repeated .base.v1.DataChange data_changes = 2 [json_name = "data_changes"];</code>
     */
    public Builder clearDataChanges() {
      if (dataChangesBuilder_ == null) {
        dataChanges_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        dataChangesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of data changes.
     * </pre>
     *
     * <code>repeated .base.v1.DataChange data_changes = 2 [json_name = "data_changes"];</code>
     */
    public Builder removeDataChanges(int index) {
      if (dataChangesBuilder_ == null) {
        ensureDataChangesIsMutable();
        dataChanges_.remove(index);
        onChanged();
      } else {
        dataChangesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of data changes.
     * </pre>
     *
     * <code>repeated .base.v1.DataChange data_changes = 2 [json_name = "data_changes"];</code>
     */
    public org.permify.grpc.DataChange.Builder getDataChangesBuilder(
        int index) {
      return getDataChangesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of data changes.
     * </pre>
     *
     * <code>repeated .base.v1.DataChange data_changes = 2 [json_name = "data_changes"];</code>
     */
    public org.permify.grpc.DataChangeOrBuilder getDataChangesOrBuilder(
        int index) {
      if (dataChangesBuilder_ == null) {
        return dataChanges_.get(index);  } else {
        return dataChangesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of data changes.
     * </pre>
     *
     * <code>repeated .base.v1.DataChange data_changes = 2 [json_name = "data_changes"];</code>
     */
    public java.util.List<? extends org.permify.grpc.DataChangeOrBuilder> 
         getDataChangesOrBuilderList() {
      if (dataChangesBuilder_ != null) {
        return dataChangesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(dataChanges_);
      }
    }
    /**
     * <pre>
     * The list of data changes.
     * </pre>
     *
     * <code>repeated .base.v1.DataChange data_changes = 2 [json_name = "data_changes"];</code>
     */
    public org.permify.grpc.DataChange.Builder addDataChangesBuilder() {
      return getDataChangesFieldBuilder().addBuilder(
          org.permify.grpc.DataChange.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of data changes.
     * </pre>
     *
     * <code>repeated .base.v1.DataChange data_changes = 2 [json_name = "data_changes"];</code>
     */
    public org.permify.grpc.DataChange.Builder addDataChangesBuilder(
        int index) {
      return getDataChangesFieldBuilder().addBuilder(
          index, org.permify.grpc.DataChange.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of data changes.
     * </pre>
     *
     * <code>repeated .base.v1.DataChange data_changes = 2 [json_name = "data_changes"];</code>
     */
    public java.util.List<org.permify.grpc.DataChange.Builder> 
         getDataChangesBuilderList() {
      return getDataChangesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        org.permify.grpc.DataChange, org.permify.grpc.DataChange.Builder, org.permify.grpc.DataChangeOrBuilder> 
        getDataChangesFieldBuilder() {
      if (dataChangesBuilder_ == null) {
        dataChangesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            org.permify.grpc.DataChange, org.permify.grpc.DataChange.Builder, org.permify.grpc.DataChangeOrBuilder>(
                dataChanges_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        dataChanges_ = null;
      }
      return dataChangesBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:base.v1.DataChanges)
  }

  // @@protoc_insertion_point(class_scope:base.v1.DataChanges)
  private static final org.permify.grpc.DataChanges DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.permify.grpc.DataChanges();
  }

  public static org.permify.grpc.DataChanges getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DataChanges>
      PARSER = new com.google.protobuf.AbstractParser<DataChanges>() {
    @java.lang.Override
    public DataChanges parsePartialFrom(
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

  public static com.google.protobuf.Parser<DataChanges> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DataChanges> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.permify.grpc.DataChanges getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
