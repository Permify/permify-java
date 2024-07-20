/*
 * Permify API
 * Permify is an open source authorization service for creating fine-grained and scalable authorization systems.
 *
 * The version of the OpenAPI document: v0.9.9
 * Contact: hello@permify.co
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.permify.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * CEL primitive types.   - PRIMITIVE_TYPE_UNSPECIFIED: Unspecified type.  - BOOL: Boolean type.  - INT64: Int64 type.  Proto-based integer values are widened to int64.  - UINT64: Uint64 type.  Proto-based unsigned integer values are widened to uint64.  - DOUBLE: Double type.  Proto-based float values are widened to double values.  - STRING: String type.  - BYTES: Bytes type.
 */
public enum PrimitiveType {
  
  PRIMITIVE_TYPE_UNSPECIFIED("PRIMITIVE_TYPE_UNSPECIFIED"),
  
  BOOL("BOOL"),
  
  INT64("INT64"),
  
  UINT64("UINT64"),
  
  DOUBLE("DOUBLE"),
  
  STRING("STRING"),
  
  BYTES("BYTES");

  private String value;

  PrimitiveType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PrimitiveType fromValue(String value) {
    for (PrimitiveType b : PrimitiveType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

