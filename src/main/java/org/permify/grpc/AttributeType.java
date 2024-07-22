// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: base/v1/base.proto
// Protobuf Java Version: 4.27.2

package org.permify.grpc;

/**
 * <pre>
 * Enumerates the types of attribute.
 * </pre>
 *
 * Protobuf enum {@code base.v1.AttributeType}
 */
public enum AttributeType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Not specified attribute type. This is the default value.
   * </pre>
   *
   * <code>ATTRIBUTE_TYPE_UNSPECIFIED = 0;</code>
   */
  ATTRIBUTE_TYPE_UNSPECIFIED(0),
  /**
   * <pre>
   * A boolean attribute type.
   * </pre>
   *
   * <code>ATTRIBUTE_TYPE_BOOLEAN = 1;</code>
   */
  ATTRIBUTE_TYPE_BOOLEAN(1),
  /**
   * <pre>
   * A boolean array attribute type.
   * </pre>
   *
   * <code>ATTRIBUTE_TYPE_BOOLEAN_ARRAY = 2;</code>
   */
  ATTRIBUTE_TYPE_BOOLEAN_ARRAY(2),
  /**
   * <pre>
   * A string attribute type.
   * </pre>
   *
   * <code>ATTRIBUTE_TYPE_STRING = 3;</code>
   */
  ATTRIBUTE_TYPE_STRING(3),
  /**
   * <pre>
   * A string array attribute type.
   * </pre>
   *
   * <code>ATTRIBUTE_TYPE_STRING_ARRAY = 4;</code>
   */
  ATTRIBUTE_TYPE_STRING_ARRAY(4),
  /**
   * <pre>
   * An integer attribute type.
   * </pre>
   *
   * <code>ATTRIBUTE_TYPE_INTEGER = 5;</code>
   */
  ATTRIBUTE_TYPE_INTEGER(5),
  /**
   * <pre>
   * An integer array attribute type.
   * </pre>
   *
   * <code>ATTRIBUTE_TYPE_INTEGER_ARRAY = 6;</code>
   */
  ATTRIBUTE_TYPE_INTEGER_ARRAY(6),
  /**
   * <pre>
   * A double attribute type.
   * </pre>
   *
   * <code>ATTRIBUTE_TYPE_DOUBLE = 7;</code>
   */
  ATTRIBUTE_TYPE_DOUBLE(7),
  /**
   * <pre>
   * A double array attribute type.
   * </pre>
   *
   * <code>ATTRIBUTE_TYPE_DOUBLE_ARRAY = 8;</code>
   */
  ATTRIBUTE_TYPE_DOUBLE_ARRAY(8),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      AttributeType.class.getName());
  }
  /**
   * <pre>
   * Not specified attribute type. This is the default value.
   * </pre>
   *
   * <code>ATTRIBUTE_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int ATTRIBUTE_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * A boolean attribute type.
   * </pre>
   *
   * <code>ATTRIBUTE_TYPE_BOOLEAN = 1;</code>
   */
  public static final int ATTRIBUTE_TYPE_BOOLEAN_VALUE = 1;
  /**
   * <pre>
   * A boolean array attribute type.
   * </pre>
   *
   * <code>ATTRIBUTE_TYPE_BOOLEAN_ARRAY = 2;</code>
   */
  public static final int ATTRIBUTE_TYPE_BOOLEAN_ARRAY_VALUE = 2;
  /**
   * <pre>
   * A string attribute type.
   * </pre>
   *
   * <code>ATTRIBUTE_TYPE_STRING = 3;</code>
   */
  public static final int ATTRIBUTE_TYPE_STRING_VALUE = 3;
  /**
   * <pre>
   * A string array attribute type.
   * </pre>
   *
   * <code>ATTRIBUTE_TYPE_STRING_ARRAY = 4;</code>
   */
  public static final int ATTRIBUTE_TYPE_STRING_ARRAY_VALUE = 4;
  /**
   * <pre>
   * An integer attribute type.
   * </pre>
   *
   * <code>ATTRIBUTE_TYPE_INTEGER = 5;</code>
   */
  public static final int ATTRIBUTE_TYPE_INTEGER_VALUE = 5;
  /**
   * <pre>
   * An integer array attribute type.
   * </pre>
   *
   * <code>ATTRIBUTE_TYPE_INTEGER_ARRAY = 6;</code>
   */
  public static final int ATTRIBUTE_TYPE_INTEGER_ARRAY_VALUE = 6;
  /**
   * <pre>
   * A double attribute type.
   * </pre>
   *
   * <code>ATTRIBUTE_TYPE_DOUBLE = 7;</code>
   */
  public static final int ATTRIBUTE_TYPE_DOUBLE_VALUE = 7;
  /**
   * <pre>
   * A double array attribute type.
   * </pre>
   *
   * <code>ATTRIBUTE_TYPE_DOUBLE_ARRAY = 8;</code>
   */
  public static final int ATTRIBUTE_TYPE_DOUBLE_ARRAY_VALUE = 8;


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
  public static AttributeType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AttributeType forNumber(int value) {
    switch (value) {
      case 0: return ATTRIBUTE_TYPE_UNSPECIFIED;
      case 1: return ATTRIBUTE_TYPE_BOOLEAN;
      case 2: return ATTRIBUTE_TYPE_BOOLEAN_ARRAY;
      case 3: return ATTRIBUTE_TYPE_STRING;
      case 4: return ATTRIBUTE_TYPE_STRING_ARRAY;
      case 5: return ATTRIBUTE_TYPE_INTEGER;
      case 6: return ATTRIBUTE_TYPE_INTEGER_ARRAY;
      case 7: return ATTRIBUTE_TYPE_DOUBLE;
      case 8: return ATTRIBUTE_TYPE_DOUBLE_ARRAY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AttributeType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AttributeType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AttributeType>() {
          public AttributeType findValueByNumber(int number) {
            return AttributeType.forNumber(number);
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
    return org.permify.grpc.BaseProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final AttributeType[] VALUES = values();

  public static AttributeType valueOf(
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

  private AttributeType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:base.v1.AttributeType)
}
