// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: base/v1/base.proto
// Protobuf Java Version: 4.27.2

package org.permify.grpc;

public interface EntityDefinitionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:base.v1.EntityDefinition)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the entity, which follows a specific string pattern and has a maximum byte size.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name", (.validate.rules) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the entity, which follows a specific string pattern and has a maximum byte size.
   * </pre>
   *
   * <code>string name = 1 [json_name = "name", (.validate.rules) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Map of relation definitions within this entity. The key is the relation name, and the value is the RelationDefinition.
   * </pre>
   *
   * <code>map&lt;string, .base.v1.RelationDefinition&gt; relations = 2 [json_name = "relations"];</code>
   */
  int getRelationsCount();
  /**
   * <pre>
   * Map of relation definitions within this entity. The key is the relation name, and the value is the RelationDefinition.
   * </pre>
   *
   * <code>map&lt;string, .base.v1.RelationDefinition&gt; relations = 2 [json_name = "relations"];</code>
   */
  boolean containsRelations(
      java.lang.String key);
  /**
   * Use {@link #getRelationsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.permify.grpc.RelationDefinition>
  getRelations();
  /**
   * <pre>
   * Map of relation definitions within this entity. The key is the relation name, and the value is the RelationDefinition.
   * </pre>
   *
   * <code>map&lt;string, .base.v1.RelationDefinition&gt; relations = 2 [json_name = "relations"];</code>
   */
  java.util.Map<java.lang.String, org.permify.grpc.RelationDefinition>
  getRelationsMap();
  /**
   * <pre>
   * Map of relation definitions within this entity. The key is the relation name, and the value is the RelationDefinition.
   * </pre>
   *
   * <code>map&lt;string, .base.v1.RelationDefinition&gt; relations = 2 [json_name = "relations"];</code>
   */
  /* nullable */
org.permify.grpc.RelationDefinition getRelationsOrDefault(
      java.lang.String key,
      /* nullable */
org.permify.grpc.RelationDefinition defaultValue);
  /**
   * <pre>
   * Map of relation definitions within this entity. The key is the relation name, and the value is the RelationDefinition.
   * </pre>
   *
   * <code>map&lt;string, .base.v1.RelationDefinition&gt; relations = 2 [json_name = "relations"];</code>
   */
  org.permify.grpc.RelationDefinition getRelationsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Map of permission definitions within this entity. The key is the permission name, and the value is the PermissionDefinition.
   * </pre>
   *
   * <code>map&lt;string, .base.v1.PermissionDefinition&gt; permissions = 3 [json_name = "permissions"];</code>
   */
  int getPermissionsCount();
  /**
   * <pre>
   * Map of permission definitions within this entity. The key is the permission name, and the value is the PermissionDefinition.
   * </pre>
   *
   * <code>map&lt;string, .base.v1.PermissionDefinition&gt; permissions = 3 [json_name = "permissions"];</code>
   */
  boolean containsPermissions(
      java.lang.String key);
  /**
   * Use {@link #getPermissionsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.permify.grpc.PermissionDefinition>
  getPermissions();
  /**
   * <pre>
   * Map of permission definitions within this entity. The key is the permission name, and the value is the PermissionDefinition.
   * </pre>
   *
   * <code>map&lt;string, .base.v1.PermissionDefinition&gt; permissions = 3 [json_name = "permissions"];</code>
   */
  java.util.Map<java.lang.String, org.permify.grpc.PermissionDefinition>
  getPermissionsMap();
  /**
   * <pre>
   * Map of permission definitions within this entity. The key is the permission name, and the value is the PermissionDefinition.
   * </pre>
   *
   * <code>map&lt;string, .base.v1.PermissionDefinition&gt; permissions = 3 [json_name = "permissions"];</code>
   */
  /* nullable */
org.permify.grpc.PermissionDefinition getPermissionsOrDefault(
      java.lang.String key,
      /* nullable */
org.permify.grpc.PermissionDefinition defaultValue);
  /**
   * <pre>
   * Map of permission definitions within this entity. The key is the permission name, and the value is the PermissionDefinition.
   * </pre>
   *
   * <code>map&lt;string, .base.v1.PermissionDefinition&gt; permissions = 3 [json_name = "permissions"];</code>
   */
  org.permify.grpc.PermissionDefinition getPermissionsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Map of attribute definitions within this entity. The key is the attribute name, and the value is the AttributeDefinition.
   * </pre>
   *
   * <code>map&lt;string, .base.v1.AttributeDefinition&gt; attributes = 4 [json_name = "attributes"];</code>
   */
  int getAttributesCount();
  /**
   * <pre>
   * Map of attribute definitions within this entity. The key is the attribute name, and the value is the AttributeDefinition.
   * </pre>
   *
   * <code>map&lt;string, .base.v1.AttributeDefinition&gt; attributes = 4 [json_name = "attributes"];</code>
   */
  boolean containsAttributes(
      java.lang.String key);
  /**
   * Use {@link #getAttributesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.permify.grpc.AttributeDefinition>
  getAttributes();
  /**
   * <pre>
   * Map of attribute definitions within this entity. The key is the attribute name, and the value is the AttributeDefinition.
   * </pre>
   *
   * <code>map&lt;string, .base.v1.AttributeDefinition&gt; attributes = 4 [json_name = "attributes"];</code>
   */
  java.util.Map<java.lang.String, org.permify.grpc.AttributeDefinition>
  getAttributesMap();
  /**
   * <pre>
   * Map of attribute definitions within this entity. The key is the attribute name, and the value is the AttributeDefinition.
   * </pre>
   *
   * <code>map&lt;string, .base.v1.AttributeDefinition&gt; attributes = 4 [json_name = "attributes"];</code>
   */
  /* nullable */
org.permify.grpc.AttributeDefinition getAttributesOrDefault(
      java.lang.String key,
      /* nullable */
org.permify.grpc.AttributeDefinition defaultValue);
  /**
   * <pre>
   * Map of attribute definitions within this entity. The key is the attribute name, and the value is the AttributeDefinition.
   * </pre>
   *
   * <code>map&lt;string, .base.v1.AttributeDefinition&gt; attributes = 4 [json_name = "attributes"];</code>
   */
  org.permify.grpc.AttributeDefinition getAttributesOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Map of references indicating whether a string pertains to a relation, permission, or attribute.
   * </pre>
   *
   * <code>map&lt;string, .base.v1.EntityDefinition.Reference&gt; references = 5 [json_name = "references"];</code>
   */
  int getReferencesCount();
  /**
   * <pre>
   * Map of references indicating whether a string pertains to a relation, permission, or attribute.
   * </pre>
   *
   * <code>map&lt;string, .base.v1.EntityDefinition.Reference&gt; references = 5 [json_name = "references"];</code>
   */
  boolean containsReferences(
      java.lang.String key);
  /**
   * Use {@link #getReferencesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.permify.grpc.EntityDefinition.Reference>
  getReferences();
  /**
   * <pre>
   * Map of references indicating whether a string pertains to a relation, permission, or attribute.
   * </pre>
   *
   * <code>map&lt;string, .base.v1.EntityDefinition.Reference&gt; references = 5 [json_name = "references"];</code>
   */
  java.util.Map<java.lang.String, org.permify.grpc.EntityDefinition.Reference>
  getReferencesMap();
  /**
   * <pre>
   * Map of references indicating whether a string pertains to a relation, permission, or attribute.
   * </pre>
   *
   * <code>map&lt;string, .base.v1.EntityDefinition.Reference&gt; references = 5 [json_name = "references"];</code>
   */
  /* nullable */
org.permify.grpc.EntityDefinition.Reference getReferencesOrDefault(
      java.lang.String key,
      /* nullable */
org.permify.grpc.EntityDefinition.Reference         defaultValue);
  /**
   * <pre>
   * Map of references indicating whether a string pertains to a relation, permission, or attribute.
   * </pre>
   *
   * <code>map&lt;string, .base.v1.EntityDefinition.Reference&gt; references = 5 [json_name = "references"];</code>
   */
  org.permify.grpc.EntityDefinition.Reference getReferencesOrThrow(
      java.lang.String key);
  /**
   * Use {@link #getReferencesValueMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Integer>
  getReferencesValue();
  /**
   * <pre>
   * Map of references indicating whether a string pertains to a relation, permission, or attribute.
   * </pre>
   *
   * <code>map&lt;string, .base.v1.EntityDefinition.Reference&gt; references = 5 [json_name = "references"];</code>
   */
  java.util.Map<java.lang.String, java.lang.Integer>
  getReferencesValueMap();
  /**
   * <pre>
   * Map of references indicating whether a string pertains to a relation, permission, or attribute.
   * </pre>
   *
   * <code>map&lt;string, .base.v1.EntityDefinition.Reference&gt; references = 5 [json_name = "references"];</code>
   */
  int getReferencesValueOrDefault(
      java.lang.String key,
      int defaultValue);
  /**
   * <pre>
   * Map of references indicating whether a string pertains to a relation, permission, or attribute.
   * </pre>
   *
   * <code>map&lt;string, .base.v1.EntityDefinition.Reference&gt; references = 5 [json_name = "references"];</code>
   */
  int getReferencesValueOrThrow(
      java.lang.String key);
}
