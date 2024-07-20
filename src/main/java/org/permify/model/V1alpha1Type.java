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
import org.permify.model.AbstractType;
import org.permify.model.FunctionType;
import org.permify.model.ListType;
import org.permify.model.MapType;
import org.permify.model.PrimitiveType;
import org.permify.model.WellKnownType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Represents a CEL type.
 */
@JsonPropertyOrder({
  V1alpha1Type.JSON_PROPERTY_DYN,
  V1alpha1Type.JSON_PROPERTY_NULL,
  V1alpha1Type.JSON_PROPERTY_PRIMITIVE,
  V1alpha1Type.JSON_PROPERTY_WRAPPER,
  V1alpha1Type.JSON_PROPERTY_WELL_KNOWN,
  V1alpha1Type.JSON_PROPERTY_LIST_TYPE,
  V1alpha1Type.JSON_PROPERTY_MAP_TYPE,
  V1alpha1Type.JSON_PROPERTY_FUNCTION,
  V1alpha1Type.JSON_PROPERTY_MESSAGE_TYPE,
  V1alpha1Type.JSON_PROPERTY_TYPE_PARAM,
  V1alpha1Type.JSON_PROPERTY_TYPE,
  V1alpha1Type.JSON_PROPERTY_ERROR,
  V1alpha1Type.JSON_PROPERTY_ABSTRACT_TYPE
})
@JsonTypeName("v1alpha1.Type")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-19T12:59:35.606772+03:00[Europe/Istanbul]", comments = "Generator version: 7.7.0")
public class V1alpha1Type {
  public static final String JSON_PROPERTY_DYN = "dyn";
  private Object dyn;

  public static final String JSON_PROPERTY_NULL = "null";
  private String _null;

  public static final String JSON_PROPERTY_PRIMITIVE = "primitive";
  private PrimitiveType primitive = PrimitiveType.PRIMITIVE_TYPE_UNSPECIFIED;

  public static final String JSON_PROPERTY_WRAPPER = "wrapper";
  private PrimitiveType wrapper = PrimitiveType.PRIMITIVE_TYPE_UNSPECIFIED;

  public static final String JSON_PROPERTY_WELL_KNOWN = "wellKnown";
  private WellKnownType wellKnown = WellKnownType.WELL_KNOWN_TYPE_UNSPECIFIED;

  public static final String JSON_PROPERTY_LIST_TYPE = "listType";
  private ListType listType;

  public static final String JSON_PROPERTY_MAP_TYPE = "mapType";
  private MapType mapType;

  public static final String JSON_PROPERTY_FUNCTION = "function";
  private FunctionType function;

  public static final String JSON_PROPERTY_MESSAGE_TYPE = "messageType";
  private String messageType;

  public static final String JSON_PROPERTY_TYPE_PARAM = "typeParam";
  private String typeParam;

  public static final String JSON_PROPERTY_TYPE = "type";
  private V1alpha1Type type;

  public static final String JSON_PROPERTY_ERROR = "error";
  private Object error;

  public static final String JSON_PROPERTY_ABSTRACT_TYPE = "abstractType";
  private AbstractType abstractType;

  public V1alpha1Type() {
  }

  public V1alpha1Type dyn(Object dyn) {
    
    this.dyn = dyn;
    return this;
  }

  /**
   * Dynamic type.
   * @return dyn
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DYN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getDyn() {
    return dyn;
  }


  @JsonProperty(JSON_PROPERTY_DYN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDyn(Object dyn) {
    this.dyn = dyn;
  }

  public V1alpha1Type _null(String _null) {
    
    this._null = _null;
    return this;
  }

  /**
   * Null value.
   * @return _null
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NULL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNull() {
    return _null;
  }


  @JsonProperty(JSON_PROPERTY_NULL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNull(String _null) {
    this._null = _null;
  }

  public V1alpha1Type primitive(PrimitiveType primitive) {
    
    this.primitive = primitive;
    return this;
  }

  /**
   * Get primitive
   * @return primitive
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIMITIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PrimitiveType getPrimitive() {
    return primitive;
  }


  @JsonProperty(JSON_PROPERTY_PRIMITIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimitive(PrimitiveType primitive) {
    this.primitive = primitive;
  }

  public V1alpha1Type wrapper(PrimitiveType wrapper) {
    
    this.wrapper = wrapper;
    return this;
  }

  /**
   * Get wrapper
   * @return wrapper
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WRAPPER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PrimitiveType getWrapper() {
    return wrapper;
  }


  @JsonProperty(JSON_PROPERTY_WRAPPER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWrapper(PrimitiveType wrapper) {
    this.wrapper = wrapper;
  }

  public V1alpha1Type wellKnown(WellKnownType wellKnown) {
    
    this.wellKnown = wellKnown;
    return this;
  }

  /**
   * Get wellKnown
   * @return wellKnown
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WELL_KNOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WellKnownType getWellKnown() {
    return wellKnown;
  }


  @JsonProperty(JSON_PROPERTY_WELL_KNOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWellKnown(WellKnownType wellKnown) {
    this.wellKnown = wellKnown;
  }

  public V1alpha1Type listType(ListType listType) {
    
    this.listType = listType;
    return this;
  }

  /**
   * Get listType
   * @return listType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ListType getListType() {
    return listType;
  }


  @JsonProperty(JSON_PROPERTY_LIST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setListType(ListType listType) {
    this.listType = listType;
  }

  public V1alpha1Type mapType(MapType mapType) {
    
    this.mapType = mapType;
    return this;
  }

  /**
   * Get mapType
   * @return mapType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MAP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MapType getMapType() {
    return mapType;
  }


  @JsonProperty(JSON_PROPERTY_MAP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMapType(MapType mapType) {
    this.mapType = mapType;
  }

  public V1alpha1Type function(FunctionType function) {
    
    this.function = function;
    return this;
  }

  /**
   * Get function
   * @return function
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FUNCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FunctionType getFunction() {
    return function;
  }


  @JsonProperty(JSON_PROPERTY_FUNCTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFunction(FunctionType function) {
    this.function = function;
  }

  public V1alpha1Type messageType(String messageType) {
    
    this.messageType = messageType;
    return this;
  }

  /**
   * Protocol buffer message type.  The &#x60;message_type&#x60; string specifies the qualified message type name. For example, &#x60;google.plus.Profile&#x60;.
   * @return messageType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessageType() {
    return messageType;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessageType(String messageType) {
    this.messageType = messageType;
  }

  public V1alpha1Type typeParam(String typeParam) {
    
    this.typeParam = typeParam;
    return this;
  }

  /**
   * Type param type.  The &#x60;type_param&#x60; string specifies the type parameter name, e.g. &#x60;list&lt;E&gt;&#x60; would be a &#x60;list_type&#x60; whose element type was a &#x60;type_param&#x60; type named &#x60;E&#x60;.
   * @return typeParam
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE_PARAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTypeParam() {
    return typeParam;
  }


  @JsonProperty(JSON_PROPERTY_TYPE_PARAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypeParam(String typeParam) {
    this.typeParam = typeParam;
  }

  public V1alpha1Type type(V1alpha1Type type) {
    
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public V1alpha1Type getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(V1alpha1Type type) {
    this.type = type;
  }

  public V1alpha1Type error(Object error) {
    
    this.error = error;
    return this;
  }

  /**
   * Error type.  During type-checking if an expression is an error, its type is propagated as the &#x60;ERROR&#x60; type. This permits the type-checker to discover other errors present in the expression.
   * @return error
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getError() {
    return error;
  }


  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setError(Object error) {
    this.error = error;
  }

  public V1alpha1Type abstractType(AbstractType abstractType) {
    
    this.abstractType = abstractType;
    return this;
  }

  /**
   * Get abstractType
   * @return abstractType
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ABSTRACT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AbstractType getAbstractType() {
    return abstractType;
  }


  @JsonProperty(JSON_PROPERTY_ABSTRACT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAbstractType(AbstractType abstractType) {
    this.abstractType = abstractType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1Type v1alpha1Type = (V1alpha1Type) o;
    return Objects.equals(this.dyn, v1alpha1Type.dyn) &&
        Objects.equals(this._null, v1alpha1Type._null) &&
        Objects.equals(this.primitive, v1alpha1Type.primitive) &&
        Objects.equals(this.wrapper, v1alpha1Type.wrapper) &&
        Objects.equals(this.wellKnown, v1alpha1Type.wellKnown) &&
        Objects.equals(this.listType, v1alpha1Type.listType) &&
        Objects.equals(this.mapType, v1alpha1Type.mapType) &&
        Objects.equals(this.function, v1alpha1Type.function) &&
        Objects.equals(this.messageType, v1alpha1Type.messageType) &&
        Objects.equals(this.typeParam, v1alpha1Type.typeParam) &&
        Objects.equals(this.type, v1alpha1Type.type) &&
        Objects.equals(this.error, v1alpha1Type.error) &&
        Objects.equals(this.abstractType, v1alpha1Type.abstractType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dyn, _null, primitive, wrapper, wellKnown, listType, mapType, function, messageType, typeParam, type, error, abstractType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1Type {\n");
    sb.append("    dyn: ").append(toIndentedString(dyn)).append("\n");
    sb.append("    _null: ").append(toIndentedString(_null)).append("\n");
    sb.append("    primitive: ").append(toIndentedString(primitive)).append("\n");
    sb.append("    wrapper: ").append(toIndentedString(wrapper)).append("\n");
    sb.append("    wellKnown: ").append(toIndentedString(wellKnown)).append("\n");
    sb.append("    listType: ").append(toIndentedString(listType)).append("\n");
    sb.append("    mapType: ").append(toIndentedString(mapType)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    typeParam: ").append(toIndentedString(typeParam)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    abstractType: ").append(toIndentedString(abstractType)).append("\n");
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
