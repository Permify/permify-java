# Permify Java

Permify API

- Latest API version: 1.4.2

Permify is an open source authorization service for creating fine-grained and scalable authorization systems.

  For more information, please visit [https://github.com/Permify/permify/issues](https://github.com/Permify/permify/issues)

## Requirements

Building the API client library requires:

1. Java 11+
2. Maven/Gradle

### Maven users

Add this dependency to your project's POM:

```xml
<!-- https://mvnrepository.com/artifact/co.permify/permify-java -->
<dependency>
    <groupId>co.permify</groupId>
    <artifactId>permify-java</artifactId>
    <version>${permify-java-version}</version>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
// https://mvnrepository.com/artifact/co.permify/permify-java
implementation 'co.permify:permify-java:${permify-java-version}'
```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import co.permify.sdk.client.*;
import co.permify.sdk.model.*;
import co.permify.sdk.api.BundleApi;

public class BundleApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Configure clients using the `defaultClient` object, such as
        // overriding the host and port, timeout, etc.
        BundleApi apiInstance = new BundleApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant <code>t1</code> for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
        BundleDeleteBody body = new BundleDeleteBody(); // BundleDeleteBody | 
        try {
            BundleDeleteResponse result = apiInstance.bundleDelete(tenantId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BundleApi#bundleDelete");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BundleApi* | [**bundleDelete**](docs/BundleApi.md#bundleDelete) | **POST** /v1/tenants/{tenant_id}/bundle/delete | delete bundle
*BundleApi* | [**bundleDeleteWithHttpInfo**](docs/BundleApi.md#bundleDeleteWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/bundle/delete | delete bundle
*BundleApi* | [**bundleRead**](docs/BundleApi.md#bundleRead) | **POST** /v1/tenants/{tenant_id}/bundle/read | read bundle
*BundleApi* | [**bundleReadWithHttpInfo**](docs/BundleApi.md#bundleReadWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/bundle/read | read bundle
*BundleApi* | [**bundleWrite**](docs/BundleApi.md#bundleWrite) | **POST** /v1/tenants/{tenant_id}/bundle/write | write bundle
*BundleApi* | [**bundleWriteWithHttpInfo**](docs/BundleApi.md#bundleWriteWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/bundle/write | write bundle
*DataApi* | [**bundleRun**](docs/DataApi.md#bundleRun) | **POST** /v1/tenants/{tenant_id}/data/run-bundle | run bundle
*DataApi* | [**bundleRunWithHttpInfo**](docs/DataApi.md#bundleRunWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/data/run-bundle | run bundle
*DataApi* | [**dataAttributesRead**](docs/DataApi.md#dataAttributesRead) | **POST** /v1/tenants/{tenant_id}/data/attributes/read | read attributes
*DataApi* | [**dataAttributesReadWithHttpInfo**](docs/DataApi.md#dataAttributesReadWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/data/attributes/read | read attributes
*DataApi* | [**dataDelete**](docs/DataApi.md#dataDelete) | **POST** /v1/tenants/{tenant_id}/data/delete | delete data
*DataApi* | [**dataDeleteWithHttpInfo**](docs/DataApi.md#dataDeleteWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/data/delete | delete data
*DataApi* | [**dataRelationshipsRead**](docs/DataApi.md#dataRelationshipsRead) | **POST** /v1/tenants/{tenant_id}/data/relationships/read | read relationships
*DataApi* | [**dataRelationshipsReadWithHttpInfo**](docs/DataApi.md#dataRelationshipsReadWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/data/relationships/read | read relationships
*DataApi* | [**dataWrite**](docs/DataApi.md#dataWrite) | **POST** /v1/tenants/{tenant_id}/data/write | write data
*DataApi* | [**dataWriteWithHttpInfo**](docs/DataApi.md#dataWriteWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/data/write | write data
*DataApi* | [**relationshipsDelete**](docs/DataApi.md#relationshipsDelete) | **POST** /v1/tenants/{tenant_id}/relationships/delete | delete relationships
*DataApi* | [**relationshipsDeleteWithHttpInfo**](docs/DataApi.md#relationshipsDeleteWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/relationships/delete | delete relationships
*DataApi* | [**relationshipsWrite**](docs/DataApi.md#relationshipsWrite) | **POST** /v1/tenants/{tenant_id}/relationships/write | write relationships
*DataApi* | [**relationshipsWriteWithHttpInfo**](docs/DataApi.md#relationshipsWriteWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/relationships/write | write relationships
*PermissionApi* | [**permissionsCheck**](docs/PermissionApi.md#permissionsCheck) | **POST** /v1/tenants/{tenant_id}/permissions/check | check api
*PermissionApi* | [**permissionsCheckWithHttpInfo**](docs/PermissionApi.md#permissionsCheckWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/permissions/check | check api
*PermissionApi* | [**permissionsExpand**](docs/PermissionApi.md#permissionsExpand) | **POST** /v1/tenants/{tenant_id}/permissions/expand | expand api
*PermissionApi* | [**permissionsExpandWithHttpInfo**](docs/PermissionApi.md#permissionsExpandWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/permissions/expand | expand api
*PermissionApi* | [**permissionsLookupEntity**](docs/PermissionApi.md#permissionsLookupEntity) | **POST** /v1/tenants/{tenant_id}/permissions/lookup-entity | lookup entity
*PermissionApi* | [**permissionsLookupEntityWithHttpInfo**](docs/PermissionApi.md#permissionsLookupEntityWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/permissions/lookup-entity | lookup entity
*PermissionApi* | [**permissionsLookupEntityStream**](docs/PermissionApi.md#permissionsLookupEntityStream) | **POST** /v1/tenants/{tenant_id}/permissions/lookup-entity-stream | lookup entity stream
*PermissionApi* | [**permissionsLookupEntityStreamWithHttpInfo**](docs/PermissionApi.md#permissionsLookupEntityStreamWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/permissions/lookup-entity-stream | lookup entity stream
*PermissionApi* | [**permissionsLookupSubject**](docs/PermissionApi.md#permissionsLookupSubject) | **POST** /v1/tenants/{tenant_id}/permissions/lookup-subject | lookup-subject
*PermissionApi* | [**permissionsLookupSubjectWithHttpInfo**](docs/PermissionApi.md#permissionsLookupSubjectWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/permissions/lookup-subject | lookup-subject
*PermissionApi* | [**permissionsSubjectPermission**](docs/PermissionApi.md#permissionsSubjectPermission) | **POST** /v1/tenants/{tenant_id}/permissions/subject-permission | subject permission
*PermissionApi* | [**permissionsSubjectPermissionWithHttpInfo**](docs/PermissionApi.md#permissionsSubjectPermissionWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/permissions/subject-permission | subject permission
*SchemaApi* | [**schemasList**](docs/SchemaApi.md#schemasList) | **POST** /v1/tenants/{tenant_id}/schemas/list | list schema
*SchemaApi* | [**schemasListWithHttpInfo**](docs/SchemaApi.md#schemasListWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/schemas/list | list schema
*SchemaApi* | [**schemasPartialWrite**](docs/SchemaApi.md#schemasPartialWrite) | **PATCH** /v1/tenants/{tenant_id}/schemas/partial-write | partially update your authorization model
*SchemaApi* | [**schemasPartialWriteWithHttpInfo**](docs/SchemaApi.md#schemasPartialWriteWithHttpInfo) | **PATCH** /v1/tenants/{tenant_id}/schemas/partial-write | partially update your authorization model
*SchemaApi* | [**schemasRead**](docs/SchemaApi.md#schemasRead) | **POST** /v1/tenants/{tenant_id}/schemas/read | read schema
*SchemaApi* | [**schemasReadWithHttpInfo**](docs/SchemaApi.md#schemasReadWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/schemas/read | read schema
*SchemaApi* | [**schemasWrite**](docs/SchemaApi.md#schemasWrite) | **POST** /v1/tenants/{tenant_id}/schemas/write | write schema
*SchemaApi* | [**schemasWriteWithHttpInfo**](docs/SchemaApi.md#schemasWriteWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/schemas/write | write schema
*TenancyApi* | [**tenantsCreate**](docs/TenancyApi.md#tenantsCreate) | **POST** /v1/tenants/create | create tenant
*TenancyApi* | [**tenantsCreateWithHttpInfo**](docs/TenancyApi.md#tenantsCreateWithHttpInfo) | **POST** /v1/tenants/create | create tenant
*TenancyApi* | [**tenantsDelete**](docs/TenancyApi.md#tenantsDelete) | **DELETE** /v1/tenants/{id} | delete tenant
*TenancyApi* | [**tenantsDeleteWithHttpInfo**](docs/TenancyApi.md#tenantsDeleteWithHttpInfo) | **DELETE** /v1/tenants/{id} | delete tenant
*TenancyApi* | [**tenantsList**](docs/TenancyApi.md#tenantsList) | **POST** /v1/tenants/list | list tenants
*TenancyApi* | [**tenantsListWithHttpInfo**](docs/TenancyApi.md#tenantsListWithHttpInfo) | **POST** /v1/tenants/list | list tenants
*WatchApi* | [**watchWatch**](docs/WatchApi.md#watchWatch) | **POST** /v1/tenants/{tenant_id}/watch | watch changes
*WatchApi* | [**watchWatchWithHttpInfo**](docs/WatchApi.md#watchWatchWithHttpInfo) | **POST** /v1/tenants/{tenant_id}/watch | watch changes


## Documentation for Models

 - [AbstractType](docs/AbstractType.md)
 - [Any](docs/Any.md)
 - [Argument](docs/Argument.md)
 - [Attribute](docs/Attribute.md)
 - [AttributeDefinition](docs/AttributeDefinition.md)
 - [AttributeFilter](docs/AttributeFilter.md)
 - [AttributeReadRequestMetadata](docs/AttributeReadRequestMetadata.md)
 - [AttributeReadResponse](docs/AttributeReadResponse.md)
 - [AttributeType](docs/AttributeType.md)
 - [BundleDeleteBody](docs/BundleDeleteBody.md)
 - [BundleDeleteResponse](docs/BundleDeleteResponse.md)
 - [BundleReadBody](docs/BundleReadBody.md)
 - [BundleReadResponse](docs/BundleReadResponse.md)
 - [BundleRunResponse](docs/BundleRunResponse.md)
 - [BundleWriteBody](docs/BundleWriteBody.md)
 - [BundleWriteResponse](docs/BundleWriteResponse.md)
 - [CheckBody](docs/CheckBody.md)
 - [CheckResult](docs/CheckResult.md)
 - [CheckedExpr](docs/CheckedExpr.md)
 - [Child](docs/Child.md)
 - [Comprehension](docs/Comprehension.md)
 - [ComputedAttribute](docs/ComputedAttribute.md)
 - [ComputedUserSet](docs/ComputedUserSet.md)
 - [Constant](docs/Constant.md)
 - [Context](docs/Context.md)
 - [CreateList](docs/CreateList.md)
 - [CreateStruct](docs/CreateStruct.md)
 - [DataBundle](docs/DataBundle.md)
 - [DataChange](docs/DataChange.md)
 - [DataChangeOperation](docs/DataChangeOperation.md)
 - [DataChanges](docs/DataChanges.md)
 - [DataDeleteBody](docs/DataDeleteBody.md)
 - [DataDeleteResponse](docs/DataDeleteResponse.md)
 - [DataWriteBody](docs/DataWriteBody.md)
 - [DataWriteRequestMetadata](docs/DataWriteRequestMetadata.md)
 - [DataWriteResponse](docs/DataWriteResponse.md)
 - [DeleteRelationshipsBody](docs/DeleteRelationshipsBody.md)
 - [Entity](docs/Entity.md)
 - [EntityDefinition](docs/EntityDefinition.md)
 - [EntityDefinitionReference](docs/EntityDefinitionReference.md)
 - [EntityFilter](docs/EntityFilter.md)
 - [Entry](docs/Entry.md)
 - [ExpandLeaf](docs/ExpandLeaf.md)
 - [ExpandTreeNode](docs/ExpandTreeNode.md)
 - [ExpandTreeNodeOperation](docs/ExpandTreeNodeOperation.md)
 - [Expr](docs/Expr.md)
 - [ExprCall](docs/ExprCall.md)
 - [FunctionType](docs/FunctionType.md)
 - [Ident](docs/Ident.md)
 - [Leaf](docs/Leaf.md)
 - [ListType](docs/ListType.md)
 - [LookupEntityBody](docs/LookupEntityBody.md)
 - [LookupEntityStreamBody](docs/LookupEntityStreamBody.md)
 - [LookupSubjectBody](docs/LookupSubjectBody.md)
 - [MapType](docs/MapType.md)
 - [PartialWriteBody](docs/PartialWriteBody.md)
 - [Partials](docs/Partials.md)
 - [PermissionCheckRequestMetadata](docs/PermissionCheckRequestMetadata.md)
 - [PermissionCheckResponse](docs/PermissionCheckResponse.md)
 - [PermissionCheckResponseMetadata](docs/PermissionCheckResponseMetadata.md)
 - [PermissionDefinition](docs/PermissionDefinition.md)
 - [PermissionExpandBody](docs/PermissionExpandBody.md)
 - [PermissionExpandRequestMetadata](docs/PermissionExpandRequestMetadata.md)
 - [PermissionExpandResponse](docs/PermissionExpandResponse.md)
 - [PermissionLookupEntityRequestMetadata](docs/PermissionLookupEntityRequestMetadata.md)
 - [PermissionLookupEntityResponse](docs/PermissionLookupEntityResponse.md)
 - [PermissionLookupEntityStreamResponse](docs/PermissionLookupEntityStreamResponse.md)
 - [PermissionLookupSubjectRequestMetadata](docs/PermissionLookupSubjectRequestMetadata.md)
 - [PermissionLookupSubjectResponse](docs/PermissionLookupSubjectResponse.md)
 - [PermissionSubjectPermissionRequestMetadata](docs/PermissionSubjectPermissionRequestMetadata.md)
 - [PermissionSubjectPermissionResponse](docs/PermissionSubjectPermissionResponse.md)
 - [PrimitiveType](docs/PrimitiveType.md)
 - [ReadAttributesBody](docs/ReadAttributesBody.md)
 - [ReadRelationshipsBody](docs/ReadRelationshipsBody.md)
 - [RelationDefinition](docs/RelationDefinition.md)
 - [RelationReference](docs/RelationReference.md)
 - [RelationshipDeleteResponse](docs/RelationshipDeleteResponse.md)
 - [RelationshipReadRequestMetadata](docs/RelationshipReadRequestMetadata.md)
 - [RelationshipReadResponse](docs/RelationshipReadResponse.md)
 - [RelationshipWriteRequestMetadata](docs/RelationshipWriteRequestMetadata.md)
 - [RelationshipWriteResponse](docs/RelationshipWriteResponse.md)
 - [Rewrite](docs/Rewrite.md)
 - [RewriteOperation](docs/RewriteOperation.md)
 - [RuleDefinition](docs/RuleDefinition.md)
 - [RunBundleBody](docs/RunBundleBody.md)
 - [SchemaDefinition](docs/SchemaDefinition.md)
 - [SchemaDefinitionReference](docs/SchemaDefinitionReference.md)
 - [SchemaList](docs/SchemaList.md)
 - [SchemaListBody](docs/SchemaListBody.md)
 - [SchemaListResponse](docs/SchemaListResponse.md)
 - [SchemaPartialWriteRequestMetadata](docs/SchemaPartialWriteRequestMetadata.md)
 - [SchemaPartialWriteResponse](docs/SchemaPartialWriteResponse.md)
 - [SchemaReadBody](docs/SchemaReadBody.md)
 - [SchemaReadRequestMetadata](docs/SchemaReadRequestMetadata.md)
 - [SchemaReadResponse](docs/SchemaReadResponse.md)
 - [SchemaWriteBody](docs/SchemaWriteBody.md)
 - [SchemaWriteResponse](docs/SchemaWriteResponse.md)
 - [Select](docs/Select.md)
 - [SourceInfo](docs/SourceInfo.md)
 - [Status](docs/Status.md)
 - [StreamResultOfPermissionLookupEntityStreamResponse](docs/StreamResultOfPermissionLookupEntityStreamResponse.md)
 - [StreamResultOfWatchResponse](docs/StreamResultOfWatchResponse.md)
 - [StringArrayValue](docs/StringArrayValue.md)
 - [Subject](docs/Subject.md)
 - [SubjectFilter](docs/SubjectFilter.md)
 - [SubjectPermissionBody](docs/SubjectPermissionBody.md)
 - [Subjects](docs/Subjects.md)
 - [Tenant](docs/Tenant.md)
 - [TenantCreateRequest](docs/TenantCreateRequest.md)
 - [TenantCreateResponse](docs/TenantCreateResponse.md)
 - [TenantDeleteResponse](docs/TenantDeleteResponse.md)
 - [TenantListRequest](docs/TenantListRequest.md)
 - [TenantListResponse](docs/TenantListResponse.md)
 - [Tuple](docs/Tuple.md)
 - [TupleFilter](docs/TupleFilter.md)
 - [TupleSet](docs/TupleSet.md)
 - [TupleToUserSet](docs/TupleToUserSet.md)
 - [V1Call](docs/V1Call.md)
 - [V1Expand](docs/V1Expand.md)
 - [V1Operation](docs/V1Operation.md)
 - [V1alpha1Reference](docs/V1alpha1Reference.md)
 - [V1alpha1Type](docs/V1alpha1Type.md)
 - [Values](docs/Values.md)
 - [WatchBody](docs/WatchBody.md)
 - [WatchResponse](docs/WatchResponse.md)
 - [WellKnownType](docs/WellKnownType.md)
 - [WriteRelationshipsBody](docs/WriteRelationshipsBody.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="ApiKeyAuth"></a>
### ApiKeyAuth


- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.
However, the instances of the api clients created from the `ApiClient` are thread-safe and can be re-used.

## Author

hello@permify.co

