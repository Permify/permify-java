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
 * The Reference enum helps distinguish whether a name corresponds to an entity or a rule.   - REFERENCE_UNSPECIFIED: Default, unspecified reference.  - REFERENCE_ENTITY: Indicates that the name refers to an entity.  - REFERENCE_RULE: Indicates that the name refers to a rule.
 */
public enum SchemaDefinitionReference {
  
  UNSPECIFIED("REFERENCE_UNSPECIFIED"),
  
  ENTITY("REFERENCE_ENTITY"),
  
  RULE("REFERENCE_RULE");

  private String value;

  SchemaDefinitionReference(String value) {
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
  public static SchemaDefinitionReference fromValue(String value) {
    for (SchemaDefinitionReference b : SchemaDefinitionReference.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

