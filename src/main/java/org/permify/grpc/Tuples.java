// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: base/v1/base.proto
// Protobuf Java Version: 4.27.2

package org.permify.grpc;

/**
 * <pre>
 * Tuples is a collection of tuples.
 * </pre>
 *
 * Protobuf type {@code base.v1.Tuples}
 */
public final class Tuples extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:base.v1.Tuples)
    TuplesOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      Tuples.class.getName());
  }
  // Use Tuples.newBuilder() to construct.
  private Tuples(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Tuples() {
    tuples_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.permify.grpc.BaseProto.internal_static_base_v1_Tuples_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.permify.grpc.BaseProto.internal_static_base_v1_Tuples_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.permify.grpc.Tuples.class, org.permify.grpc.Tuples.Builder.class);
  }

  public static final int TUPLES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<org.permify.grpc.Tuple> tuples_;
  /**
   * <code>repeated .base.v1.Tuple tuples = 1 [json_name = "tuples"];</code>
   */
  @java.lang.Override
  public java.util.List<org.permify.grpc.Tuple> getTuplesList() {
    return tuples_;
  }
  /**
   * <code>repeated .base.v1.Tuple tuples = 1 [json_name = "tuples"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.permify.grpc.TupleOrBuilder> 
      getTuplesOrBuilderList() {
    return tuples_;
  }
  /**
   * <code>repeated .base.v1.Tuple tuples = 1 [json_name = "tuples"];</code>
   */
  @java.lang.Override
  public int getTuplesCount() {
    return tuples_.size();
  }
  /**
   * <code>repeated .base.v1.Tuple tuples = 1 [json_name = "tuples"];</code>
   */
  @java.lang.Override
  public org.permify.grpc.Tuple getTuples(int index) {
    return tuples_.get(index);
  }
  /**
   * <code>repeated .base.v1.Tuple tuples = 1 [json_name = "tuples"];</code>
   */
  @java.lang.Override
  public org.permify.grpc.TupleOrBuilder getTuplesOrBuilder(
      int index) {
    return tuples_.get(index);
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
    for (int i = 0; i < tuples_.size(); i++) {
      output.writeMessage(1, tuples_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < tuples_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, tuples_.get(i));
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
    if (!(obj instanceof org.permify.grpc.Tuples)) {
      return super.equals(obj);
    }
    org.permify.grpc.Tuples other = (org.permify.grpc.Tuples) obj;

    if (!getTuplesList()
        .equals(other.getTuplesList())) return false;
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
    if (getTuplesCount() > 0) {
      hash = (37 * hash) + TUPLES_FIELD_NUMBER;
      hash = (53 * hash) + getTuplesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.permify.grpc.Tuples parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.Tuples parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.Tuples parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.Tuples parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.Tuples parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.permify.grpc.Tuples parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.permify.grpc.Tuples parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.permify.grpc.Tuples parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.permify.grpc.Tuples parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.permify.grpc.Tuples parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.permify.grpc.Tuples parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.permify.grpc.Tuples parseFrom(
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
  public static Builder newBuilder(org.permify.grpc.Tuples prototype) {
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
   * Tuples is a collection of tuples.
   * </pre>
   *
   * Protobuf type {@code base.v1.Tuples}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:base.v1.Tuples)
      org.permify.grpc.TuplesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.permify.grpc.BaseProto.internal_static_base_v1_Tuples_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.permify.grpc.BaseProto.internal_static_base_v1_Tuples_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.permify.grpc.Tuples.class, org.permify.grpc.Tuples.Builder.class);
    }

    // Construct using org.permify.grpc.Tuples.newBuilder()
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
      if (tuplesBuilder_ == null) {
        tuples_ = java.util.Collections.emptyList();
      } else {
        tuples_ = null;
        tuplesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.permify.grpc.BaseProto.internal_static_base_v1_Tuples_descriptor;
    }

    @java.lang.Override
    public org.permify.grpc.Tuples getDefaultInstanceForType() {
      return org.permify.grpc.Tuples.getDefaultInstance();
    }

    @java.lang.Override
    public org.permify.grpc.Tuples build() {
      org.permify.grpc.Tuples result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.permify.grpc.Tuples buildPartial() {
      org.permify.grpc.Tuples result = new org.permify.grpc.Tuples(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(org.permify.grpc.Tuples result) {
      if (tuplesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          tuples_ = java.util.Collections.unmodifiableList(tuples_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.tuples_ = tuples_;
      } else {
        result.tuples_ = tuplesBuilder_.build();
      }
    }

    private void buildPartial0(org.permify.grpc.Tuples result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.permify.grpc.Tuples) {
        return mergeFrom((org.permify.grpc.Tuples)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.permify.grpc.Tuples other) {
      if (other == org.permify.grpc.Tuples.getDefaultInstance()) return this;
      if (tuplesBuilder_ == null) {
        if (!other.tuples_.isEmpty()) {
          if (tuples_.isEmpty()) {
            tuples_ = other.tuples_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTuplesIsMutable();
            tuples_.addAll(other.tuples_);
          }
          onChanged();
        }
      } else {
        if (!other.tuples_.isEmpty()) {
          if (tuplesBuilder_.isEmpty()) {
            tuplesBuilder_.dispose();
            tuplesBuilder_ = null;
            tuples_ = other.tuples_;
            bitField0_ = (bitField0_ & ~0x00000001);
            tuplesBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getTuplesFieldBuilder() : null;
          } else {
            tuplesBuilder_.addAllMessages(other.tuples_);
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
              org.permify.grpc.Tuple m =
                  input.readMessage(
                      org.permify.grpc.Tuple.parser(),
                      extensionRegistry);
              if (tuplesBuilder_ == null) {
                ensureTuplesIsMutable();
                tuples_.add(m);
              } else {
                tuplesBuilder_.addMessage(m);
              }
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

    private java.util.List<org.permify.grpc.Tuple> tuples_ =
      java.util.Collections.emptyList();
    private void ensureTuplesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        tuples_ = new java.util.ArrayList<org.permify.grpc.Tuple>(tuples_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        org.permify.grpc.Tuple, org.permify.grpc.Tuple.Builder, org.permify.grpc.TupleOrBuilder> tuplesBuilder_;

    /**
     * <code>repeated .base.v1.Tuple tuples = 1 [json_name = "tuples"];</code>
     */
    public java.util.List<org.permify.grpc.Tuple> getTuplesList() {
      if (tuplesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(tuples_);
      } else {
        return tuplesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .base.v1.Tuple tuples = 1 [json_name = "tuples"];</code>
     */
    public int getTuplesCount() {
      if (tuplesBuilder_ == null) {
        return tuples_.size();
      } else {
        return tuplesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .base.v1.Tuple tuples = 1 [json_name = "tuples"];</code>
     */
    public org.permify.grpc.Tuple getTuples(int index) {
      if (tuplesBuilder_ == null) {
        return tuples_.get(index);
      } else {
        return tuplesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .base.v1.Tuple tuples = 1 [json_name = "tuples"];</code>
     */
    public Builder setTuples(
        int index, org.permify.grpc.Tuple value) {
      if (tuplesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTuplesIsMutable();
        tuples_.set(index, value);
        onChanged();
      } else {
        tuplesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .base.v1.Tuple tuples = 1 [json_name = "tuples"];</code>
     */
    public Builder setTuples(
        int index, org.permify.grpc.Tuple.Builder builderForValue) {
      if (tuplesBuilder_ == null) {
        ensureTuplesIsMutable();
        tuples_.set(index, builderForValue.build());
        onChanged();
      } else {
        tuplesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .base.v1.Tuple tuples = 1 [json_name = "tuples"];</code>
     */
    public Builder addTuples(org.permify.grpc.Tuple value) {
      if (tuplesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTuplesIsMutable();
        tuples_.add(value);
        onChanged();
      } else {
        tuplesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .base.v1.Tuple tuples = 1 [json_name = "tuples"];</code>
     */
    public Builder addTuples(
        int index, org.permify.grpc.Tuple value) {
      if (tuplesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTuplesIsMutable();
        tuples_.add(index, value);
        onChanged();
      } else {
        tuplesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .base.v1.Tuple tuples = 1 [json_name = "tuples"];</code>
     */
    public Builder addTuples(
        org.permify.grpc.Tuple.Builder builderForValue) {
      if (tuplesBuilder_ == null) {
        ensureTuplesIsMutable();
        tuples_.add(builderForValue.build());
        onChanged();
      } else {
        tuplesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .base.v1.Tuple tuples = 1 [json_name = "tuples"];</code>
     */
    public Builder addTuples(
        int index, org.permify.grpc.Tuple.Builder builderForValue) {
      if (tuplesBuilder_ == null) {
        ensureTuplesIsMutable();
        tuples_.add(index, builderForValue.build());
        onChanged();
      } else {
        tuplesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .base.v1.Tuple tuples = 1 [json_name = "tuples"];</code>
     */
    public Builder addAllTuples(
        java.lang.Iterable<? extends org.permify.grpc.Tuple> values) {
      if (tuplesBuilder_ == null) {
        ensureTuplesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, tuples_);
        onChanged();
      } else {
        tuplesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .base.v1.Tuple tuples = 1 [json_name = "tuples"];</code>
     */
    public Builder clearTuples() {
      if (tuplesBuilder_ == null) {
        tuples_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        tuplesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .base.v1.Tuple tuples = 1 [json_name = "tuples"];</code>
     */
    public Builder removeTuples(int index) {
      if (tuplesBuilder_ == null) {
        ensureTuplesIsMutable();
        tuples_.remove(index);
        onChanged();
      } else {
        tuplesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .base.v1.Tuple tuples = 1 [json_name = "tuples"];</code>
     */
    public org.permify.grpc.Tuple.Builder getTuplesBuilder(
        int index) {
      return getTuplesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .base.v1.Tuple tuples = 1 [json_name = "tuples"];</code>
     */
    public org.permify.grpc.TupleOrBuilder getTuplesOrBuilder(
        int index) {
      if (tuplesBuilder_ == null) {
        return tuples_.get(index);  } else {
        return tuplesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .base.v1.Tuple tuples = 1 [json_name = "tuples"];</code>
     */
    public java.util.List<? extends org.permify.grpc.TupleOrBuilder> 
         getTuplesOrBuilderList() {
      if (tuplesBuilder_ != null) {
        return tuplesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(tuples_);
      }
    }
    /**
     * <code>repeated .base.v1.Tuple tuples = 1 [json_name = "tuples"];</code>
     */
    public org.permify.grpc.Tuple.Builder addTuplesBuilder() {
      return getTuplesFieldBuilder().addBuilder(
          org.permify.grpc.Tuple.getDefaultInstance());
    }
    /**
     * <code>repeated .base.v1.Tuple tuples = 1 [json_name = "tuples"];</code>
     */
    public org.permify.grpc.Tuple.Builder addTuplesBuilder(
        int index) {
      return getTuplesFieldBuilder().addBuilder(
          index, org.permify.grpc.Tuple.getDefaultInstance());
    }
    /**
     * <code>repeated .base.v1.Tuple tuples = 1 [json_name = "tuples"];</code>
     */
    public java.util.List<org.permify.grpc.Tuple.Builder> 
         getTuplesBuilderList() {
      return getTuplesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        org.permify.grpc.Tuple, org.permify.grpc.Tuple.Builder, org.permify.grpc.TupleOrBuilder> 
        getTuplesFieldBuilder() {
      if (tuplesBuilder_ == null) {
        tuplesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            org.permify.grpc.Tuple, org.permify.grpc.Tuple.Builder, org.permify.grpc.TupleOrBuilder>(
                tuples_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        tuples_ = null;
      }
      return tuplesBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:base.v1.Tuples)
  }

  // @@protoc_insertion_point(class_scope:base.v1.Tuples)
  private static final org.permify.grpc.Tuples DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.permify.grpc.Tuples();
  }

  public static org.permify.grpc.Tuples getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Tuples>
      PARSER = new com.google.protobuf.AbstractParser<Tuples>() {
    @java.lang.Override
    public Tuples parsePartialFrom(
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

  public static com.google.protobuf.Parser<Tuples> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Tuples> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.permify.grpc.Tuples getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

