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
import java.util.HashMap;
import java.util.Map;
import org.permify.model.Partials;
import org.permify.model.SchemaPartialWriteRequestMetadata;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ItContainsTheTenantIdToIdentifyTheTenantAndMetadataOfTheSchemaToBeEditedWithTheCorrespondingEditsToVariousEntities
 */
@JsonPropertyOrder({
  ItContainsTheTenantIdToIdentifyTheTenantAndMetadataOfTheSchemaToBeEditedWithTheCorrespondingEditsToVariousEntities.JSON_PROPERTY_METADATA,
  ItContainsTheTenantIdToIdentifyTheTenantAndMetadataOfTheSchemaToBeEditedWithTheCorrespondingEditsToVariousEntities.JSON_PROPERTY_PARTIALS
})
@JsonTypeName("It_contains_the_tenant_id_to_identify_the_tenant_and_metadata_of_the_schema_to_be_edited__with_the_corresponding_edits_to_various_entities")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-19T12:59:35.606772+03:00[Europe/Istanbul]", comments = "Generator version: 7.7.0")
public class ItContainsTheTenantIdToIdentifyTheTenantAndMetadataOfTheSchemaToBeEditedWithTheCorrespondingEditsToVariousEntities {
  public static final String JSON_PROPERTY_METADATA = "metadata";
  private SchemaPartialWriteRequestMetadata metadata;

  public static final String JSON_PROPERTY_PARTIALS = "partials";
  private Map<String, Partials> partials = new HashMap<>();

  public ItContainsTheTenantIdToIdentifyTheTenantAndMetadataOfTheSchemaToBeEditedWithTheCorrespondingEditsToVariousEntities() {
  }

  public ItContainsTheTenantIdToIdentifyTheTenantAndMetadataOfTheSchemaToBeEditedWithTheCorrespondingEditsToVariousEntities metadata(SchemaPartialWriteRequestMetadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SchemaPartialWriteRequestMetadata getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(SchemaPartialWriteRequestMetadata metadata) {
    this.metadata = metadata;
  }

  public ItContainsTheTenantIdToIdentifyTheTenantAndMetadataOfTheSchemaToBeEditedWithTheCorrespondingEditsToVariousEntities partials(Map<String, Partials> partials) {
    
    this.partials = partials;
    return this;
  }

  public ItContainsTheTenantIdToIdentifyTheTenantAndMetadataOfTheSchemaToBeEditedWithTheCorrespondingEditsToVariousEntities putPartialsItem(String key, Partials partialsItem) {
    if (this.partials == null) {
      this.partials = new HashMap<>();
    }
    this.partials.put(key, partialsItem);
    return this;
  }

  /**
   * Get partials
   * @return partials
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARTIALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Partials> getPartials() {
    return partials;
  }


  @JsonProperty(JSON_PROPERTY_PARTIALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPartials(Map<String, Partials> partials) {
    this.partials = partials;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItContainsTheTenantIdToIdentifyTheTenantAndMetadataOfTheSchemaToBeEditedWithTheCorrespondingEditsToVariousEntities itContainsTheTenantIdToIdentifyTheTenantAndMetadataOfTheSchemaToBeEditedWithTheCorrespondingEditsToVariousEntities = (ItContainsTheTenantIdToIdentifyTheTenantAndMetadataOfTheSchemaToBeEditedWithTheCorrespondingEditsToVariousEntities) o;
    return Objects.equals(this.metadata, itContainsTheTenantIdToIdentifyTheTenantAndMetadataOfTheSchemaToBeEditedWithTheCorrespondingEditsToVariousEntities.metadata) &&
        Objects.equals(this.partials, itContainsTheTenantIdToIdentifyTheTenantAndMetadataOfTheSchemaToBeEditedWithTheCorrespondingEditsToVariousEntities.partials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, partials);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItContainsTheTenantIdToIdentifyTheTenantAndMetadataOfTheSchemaToBeEditedWithTheCorrespondingEditsToVariousEntities {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    partials: ").append(toIndentedString(partials)).append("\n");
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

