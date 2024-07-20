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


package org.permify.api;

import org.permify.model.PermissionCheckResponse;
import org.permify.model.PermissionExpandResponse;
import org.permify.model.PermissionLookupEntityResponse;
import org.permify.model.PermissionLookupSubjectResponse;
import org.permify.model.PermissionSubjectPermissionResponse;
import org.permify.model.PermissionsCheckRequest;
import org.permify.model.PermissionsExpandRequest;
import org.permify.model.PermissionsLookupEntityRequest;
import org.permify.model.PermissionsLookupSubjectRequest;
import org.permify.model.PermissionsSubjectPermissionRequest;
import org.permify.model.Status;
import org.permify.model.StreamResultOfPermissionLookupEntityStreamResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * API tests for PermissionApi
 */
@Disabled
public class PermissionApiTest {

    private final PermissionApi api = new PermissionApi();

    
    /**
     * check api
     *
     * 
     */
    @Test
    public void permissionsCheckTest()  {
        // uncomment below to test the function
        //String tenantId = null;
        //PermissionsCheckRequest body = null;
        //PermissionCheckResponse response = api.permissionsCheck(tenantId, body).block();

        // TODO: test validations
    }
    
    /**
     * expand api
     *
     * 
     */
    @Test
    public void permissionsExpandTest()  {
        // uncomment below to test the function
        //String tenantId = null;
        //PermissionsExpandRequest body = null;
        //PermissionExpandResponse response = api.permissionsExpand(tenantId, body).block();

        // TODO: test validations
    }
    
    /**
     * lookup entity
     *
     * 
     */
    @Test
    public void permissionsLookupEntityTest()  {
        // uncomment below to test the function
        //String tenantId = null;
        //PermissionsLookupEntityRequest body = null;
        //PermissionLookupEntityResponse response = api.permissionsLookupEntity(tenantId, body).block();

        // TODO: test validations
    }
    
    /**
     * lookup entity stream
     *
     * 
     */
    @Test
    public void permissionsLookupEntityStreamTest()  {
        // uncomment below to test the function
        //String tenantId = null;
        //PermissionsLookupEntityRequest body = null;
        //StreamResultOfPermissionLookupEntityStreamResponse response = api.permissionsLookupEntityStream(tenantId, body).block();

        // TODO: test validations
    }
    
    /**
     * lookup-subject
     *
     * 
     */
    @Test
    public void permissionsLookupSubjectTest()  {
        // uncomment below to test the function
        //String tenantId = null;
        //PermissionsLookupSubjectRequest body = null;
        //PermissionLookupSubjectResponse response = api.permissionsLookupSubject(tenantId, body).block();

        // TODO: test validations
    }
    
    /**
     * subject permission
     *
     * 
     */
    @Test
    public void permissionsSubjectPermissionTest()  {
        // uncomment below to test the function
        //String tenantId = null;
        //PermissionsSubjectPermissionRequest body = null;
        //PermissionSubjectPermissionResponse response = api.permissionsSubjectPermission(tenantId, body).block();

        // TODO: test validations
    }
    
}