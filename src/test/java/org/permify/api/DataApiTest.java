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

import org.permify.model.AttributeReadResponse;
import org.permify.model.BundleRunRequest;
import org.permify.model.BundleRunResponse;
import org.permify.model.DataAttributesReadRequest;
import org.permify.model.DataDeleteRequest;
import org.permify.model.DataDeleteResponse;
import org.permify.model.DataRelationshipsReadRequest;
import org.permify.model.DataWriteRequest;
import org.permify.model.DataWriteResponse;
import org.permify.model.RelationshipDeleteRequest;
import org.permify.model.RelationshipDeleteResponse;
import org.permify.model.RelationshipReadResponse;
import org.permify.model.RelationshipWriteResponse;
import org.permify.model.RelationshipsWriteRequest;
import org.permify.model.Status;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * API tests for DataApi
 */
@Disabled
public class DataApiTest {

    private final DataApi api = new DataApi();

    
    /**
     * run bundle
     *
     * 
     */
    @Test
    public void bundleRunTest()  {
        // uncomment below to test the function
        //String tenantId = null;
        //BundleRunRequest body = null;
        //BundleRunResponse response = api.bundleRun(tenantId, body).block();

        // TODO: test validations
    }
    
    /**
     * read attributes
     *
     * 
     */
    @Test
    public void dataAttributesReadTest()  {
        // uncomment below to test the function
        //String tenantId = null;
        //DataAttributesReadRequest body = null;
        //AttributeReadResponse response = api.dataAttributesRead(tenantId, body).block();

        // TODO: test validations
    }
    
    /**
     * delete data
     *
     * 
     */
    @Test
    public void dataDeleteTest()  {
        // uncomment below to test the function
        //String tenantId = null;
        //DataDeleteRequest body = null;
        //DataDeleteResponse response = api.dataDelete(tenantId, body).block();

        // TODO: test validations
    }
    
    /**
     * read relationships
     *
     * 
     */
    @Test
    public void dataRelationshipsReadTest()  {
        // uncomment below to test the function
        //String tenantId = null;
        //DataRelationshipsReadRequest body = null;
        //RelationshipReadResponse response = api.dataRelationshipsRead(tenantId, body).block();

        // TODO: test validations
    }
    
    /**
     * write data
     *
     * 
     */
    @Test
    public void dataWriteTest()  {
        // uncomment below to test the function
        //String tenantId = null;
        //DataWriteRequest body = null;
        //DataWriteResponse response = api.dataWrite(tenantId, body).block();

        // TODO: test validations
    }
    
    /**
     * delete relationships
     *
     * 
     */
    @Test
    public void relationshipsDeleteTest()  {
        // uncomment below to test the function
        //String tenantId = null;
        //RelationshipDeleteRequest body = null;
        //RelationshipDeleteResponse response = api.relationshipsDelete(tenantId, body).block();

        // TODO: test validations
    }
    
    /**
     * write relationships
     *
     * 
     */
    @Test
    public void relationshipsWriteTest()  {
        // uncomment below to test the function
        //String tenantId = null;
        //RelationshipsWriteRequest body = null;
        //RelationshipWriteResponse response = api.relationshipsWrite(tenantId, body).block();

        // TODO: test validations
    }
    
}