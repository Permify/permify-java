package org.permify.api;

import org.permify.ApiClient;

import org.permify.model.ItContainsTheTenantIdToIdentifyTheTenantAndMetadataOfTheSchemaToBeEditedWithTheCorrespondingEditsToVariousEntities;
import org.permify.model.SchemaListResponse;
import org.permify.model.SchemaPartialWriteResponse;
import org.permify.model.SchemaReadResponse;
import org.permify.model.SchemaWriteResponse;
import org.permify.model.SchemasListRequest;
import org.permify.model.SchemasReadRequest;
import org.permify.model.SchemasWriteRequest;
import org.permify.model.Status;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-19T12:59:35.606772+03:00[Europe/Istanbul]", comments = "Generator version: 7.7.0")
public class SchemaApi {
    private ApiClient apiClient;

    public SchemaApi() {
        this(new ApiClient());
    }

    @Autowired
    public SchemaApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * list schema
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return SchemaListResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec schemasListRequestCreation(String tenantId, SchemasListRequest body) throws WebClientResponseException {
        Object postBody = body;
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new WebClientResponseException("Missing the required parameter 'tenantId' when calling schemasList", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new WebClientResponseException("Missing the required parameter 'body' when calling schemasList", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("tenant_id", tenantId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<SchemaListResponse> localVarReturnType = new ParameterizedTypeReference<SchemaListResponse>() {};
        return apiClient.invokeAPI("/v1/tenants/{tenant_id}/schemas/list", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * list schema
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return SchemaListResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SchemaListResponse> schemasList(String tenantId, SchemasListRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<SchemaListResponse> localVarReturnType = new ParameterizedTypeReference<SchemaListResponse>() {};
        return schemasListRequestCreation(tenantId, body).bodyToMono(localVarReturnType);
    }

    /**
     * list schema
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseEntity&lt;SchemaListResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<SchemaListResponse>> schemasListWithHttpInfo(String tenantId, SchemasListRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<SchemaListResponse> localVarReturnType = new ParameterizedTypeReference<SchemaListResponse>() {};
        return schemasListRequestCreation(tenantId, body).toEntity(localVarReturnType);
    }

    /**
     * list schema
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec schemasListWithResponseSpec(String tenantId, SchemasListRequest body) throws WebClientResponseException {
        return schemasListRequestCreation(tenantId, body);
    }
    /**
     * partially update your authorization model
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId tenant_id is a string that identifies the tenant. It must match the pattern \&quot;[a-zA-Z0-9-,]+\&quot;, be a maximum of 64 bytes, and must not be empty.
     * @param body The body parameter
     * @return SchemaPartialWriteResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec schemasPartialWriteRequestCreation(String tenantId, ItContainsTheTenantIdToIdentifyTheTenantAndMetadataOfTheSchemaToBeEditedWithTheCorrespondingEditsToVariousEntities body) throws WebClientResponseException {
        Object postBody = body;
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new WebClientResponseException("Missing the required parameter 'tenantId' when calling schemasPartialWrite", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new WebClientResponseException("Missing the required parameter 'body' when calling schemasPartialWrite", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("tenant_id", tenantId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<SchemaPartialWriteResponse> localVarReturnType = new ParameterizedTypeReference<SchemaPartialWriteResponse>() {};
        return apiClient.invokeAPI("/v1/tenants/{tenant_id}/schemas/partial-write", HttpMethod.PATCH, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * partially update your authorization model
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId tenant_id is a string that identifies the tenant. It must match the pattern \&quot;[a-zA-Z0-9-,]+\&quot;, be a maximum of 64 bytes, and must not be empty.
     * @param body The body parameter
     * @return SchemaPartialWriteResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SchemaPartialWriteResponse> schemasPartialWrite(String tenantId, ItContainsTheTenantIdToIdentifyTheTenantAndMetadataOfTheSchemaToBeEditedWithTheCorrespondingEditsToVariousEntities body) throws WebClientResponseException {
        ParameterizedTypeReference<SchemaPartialWriteResponse> localVarReturnType = new ParameterizedTypeReference<SchemaPartialWriteResponse>() {};
        return schemasPartialWriteRequestCreation(tenantId, body).bodyToMono(localVarReturnType);
    }

    /**
     * partially update your authorization model
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId tenant_id is a string that identifies the tenant. It must match the pattern \&quot;[a-zA-Z0-9-,]+\&quot;, be a maximum of 64 bytes, and must not be empty.
     * @param body The body parameter
     * @return ResponseEntity&lt;SchemaPartialWriteResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<SchemaPartialWriteResponse>> schemasPartialWriteWithHttpInfo(String tenantId, ItContainsTheTenantIdToIdentifyTheTenantAndMetadataOfTheSchemaToBeEditedWithTheCorrespondingEditsToVariousEntities body) throws WebClientResponseException {
        ParameterizedTypeReference<SchemaPartialWriteResponse> localVarReturnType = new ParameterizedTypeReference<SchemaPartialWriteResponse>() {};
        return schemasPartialWriteRequestCreation(tenantId, body).toEntity(localVarReturnType);
    }

    /**
     * partially update your authorization model
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId tenant_id is a string that identifies the tenant. It must match the pattern \&quot;[a-zA-Z0-9-,]+\&quot;, be a maximum of 64 bytes, and must not be empty.
     * @param body The body parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec schemasPartialWriteWithResponseSpec(String tenantId, ItContainsTheTenantIdToIdentifyTheTenantAndMetadataOfTheSchemaToBeEditedWithTheCorrespondingEditsToVariousEntities body) throws WebClientResponseException {
        return schemasPartialWriteRequestCreation(tenantId, body);
    }
    /**
     * read schema
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return SchemaReadResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec schemasReadRequestCreation(String tenantId, SchemasReadRequest body) throws WebClientResponseException {
        Object postBody = body;
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new WebClientResponseException("Missing the required parameter 'tenantId' when calling schemasRead", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new WebClientResponseException("Missing the required parameter 'body' when calling schemasRead", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("tenant_id", tenantId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<SchemaReadResponse> localVarReturnType = new ParameterizedTypeReference<SchemaReadResponse>() {};
        return apiClient.invokeAPI("/v1/tenants/{tenant_id}/schemas/read", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * read schema
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return SchemaReadResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SchemaReadResponse> schemasRead(String tenantId, SchemasReadRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<SchemaReadResponse> localVarReturnType = new ParameterizedTypeReference<SchemaReadResponse>() {};
        return schemasReadRequestCreation(tenantId, body).bodyToMono(localVarReturnType);
    }

    /**
     * read schema
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseEntity&lt;SchemaReadResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<SchemaReadResponse>> schemasReadWithHttpInfo(String tenantId, SchemasReadRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<SchemaReadResponse> localVarReturnType = new ParameterizedTypeReference<SchemaReadResponse>() {};
        return schemasReadRequestCreation(tenantId, body).toEntity(localVarReturnType);
    }

    /**
     * read schema
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec schemasReadWithResponseSpec(String tenantId, SchemasReadRequest body) throws WebClientResponseException {
        return schemasReadRequestCreation(tenantId, body);
    }
    /**
     * write schema
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return SchemaWriteResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec schemasWriteRequestCreation(String tenantId, SchemasWriteRequest body) throws WebClientResponseException {
        Object postBody = body;
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new WebClientResponseException("Missing the required parameter 'tenantId' when calling schemasWrite", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new WebClientResponseException("Missing the required parameter 'body' when calling schemasWrite", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("tenant_id", tenantId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<SchemaWriteResponse> localVarReturnType = new ParameterizedTypeReference<SchemaWriteResponse>() {};
        return apiClient.invokeAPI("/v1/tenants/{tenant_id}/schemas/write", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * write schema
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return SchemaWriteResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SchemaWriteResponse> schemasWrite(String tenantId, SchemasWriteRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<SchemaWriteResponse> localVarReturnType = new ParameterizedTypeReference<SchemaWriteResponse>() {};
        return schemasWriteRequestCreation(tenantId, body).bodyToMono(localVarReturnType);
    }

    /**
     * write schema
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseEntity&lt;SchemaWriteResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<SchemaWriteResponse>> schemasWriteWithHttpInfo(String tenantId, SchemasWriteRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<SchemaWriteResponse> localVarReturnType = new ParameterizedTypeReference<SchemaWriteResponse>() {};
        return schemasWriteRequestCreation(tenantId, body).toEntity(localVarReturnType);
    }

    /**
     * write schema
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec schemasWriteWithResponseSpec(String tenantId, SchemasWriteRequest body) throws WebClientResponseException {
        return schemasWriteRequestCreation(tenantId, body);
    }
}
