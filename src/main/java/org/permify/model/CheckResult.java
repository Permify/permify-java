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
 * Enumerates results of a check operation.   - CHECK_RESULT_UNSPECIFIED: Not specified check result. This is the default value.  - CHECK_RESULT_ALLOWED: Represents a successful check (the check allowed the operation).  - CHECK_RESULT_DENIED: Represents a failed check (the check denied the operation).
 */
public enum CheckResult {
  
  UNSPECIFIED("CHECK_RESULT_UNSPECIFIED"),
  
  ALLOWED("CHECK_RESULT_ALLOWED"),
  
  DENIED("CHECK_RESULT_DENIED");

  private String value;

  CheckResult(String value) {
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
  public static CheckResult fromValue(String value) {
    for (CheckResult b : CheckResult.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

