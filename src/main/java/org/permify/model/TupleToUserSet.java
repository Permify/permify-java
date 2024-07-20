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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.permify.model.ComputedUserSet;
import org.permify.model.TupleSet;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * TupleToUserSet defines a mapping from tuple sets to computed user sets.
 */
@JsonPropertyOrder({
  TupleToUserSet.JSON_PROPERTY_TUPLE_SET,
  TupleToUserSet.JSON_PROPERTY_COMPUTED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-19T12:59:35.606772+03:00[Europe/Istanbul]", comments = "Generator version: 7.7.0")
public class TupleToUserSet {
  public static final String JSON_PROPERTY_TUPLE_SET = "tupleSet";
  private TupleSet tupleSet;

  public static final String JSON_PROPERTY_COMPUTED = "computed";
  private ComputedUserSet computed;

  public TupleToUserSet() {
  }

  public TupleToUserSet tupleSet(TupleSet tupleSet) {
    
    this.tupleSet = tupleSet;
    return this;
  }

  /**
   * Get tupleSet
   * @return tupleSet
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TUPLE_SET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TupleSet getTupleSet() {
    return tupleSet;
  }


  @JsonProperty(JSON_PROPERTY_TUPLE_SET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTupleSet(TupleSet tupleSet) {
    this.tupleSet = tupleSet;
  }

  public TupleToUserSet computed(ComputedUserSet computed) {
    
    this.computed = computed;
    return this;
  }

  /**
   * Get computed
   * @return computed
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPUTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ComputedUserSet getComputed() {
    return computed;
  }


  @JsonProperty(JSON_PROPERTY_COMPUTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComputed(ComputedUserSet computed) {
    this.computed = computed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TupleToUserSet tupleToUserSet = (TupleToUserSet) o;
    return Objects.equals(this.tupleSet, tupleToUserSet.tupleSet) &&
        Objects.equals(this.computed, tupleToUserSet.computed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tupleSet, computed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TupleToUserSet {\n");
    sb.append("    tupleSet: ").append(toIndentedString(tupleSet)).append("\n");
    sb.append("    computed: ").append(toIndentedString(computed)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

