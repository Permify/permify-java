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
 * Operation enum includes potential rewrite operations. OPERATION_UNION: Represents a union operation. OPERATION_INTERSECTION: Represents an intersection operation. OPERATION_EXCLUSION: Represents an exclusion operation.   - OPERATION_UNSPECIFIED: Default, unspecified operation.  - OPERATION_UNION: Represents a union operation.  - OPERATION_INTERSECTION: Represents an intersection operation.  - OPERATION_EXCLUSION: Represents an exclusion operation.
 */
public enum RewriteOperation {
  
  UNSPECIFIED("OPERATION_UNSPECIFIED"),
  
  UNION("OPERATION_UNION"),
  
  INTERSECTION("OPERATION_INTERSECTION"),
  
  EXCLUSION("OPERATION_EXCLUSION");

  private String value;

  RewriteOperation(String value) {
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
  public static RewriteOperation fromValue(String value) {
    for (RewriteOperation b : RewriteOperation.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
