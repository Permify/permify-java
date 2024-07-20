package org.permify.api;

import org.permify.ApiClient;

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
public class DataApi {
    private ApiClient apiClient;

    public DataApi() {
        this(new ApiClient());
    }

    @Autowired
    public DataApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * run bundle
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return BundleRunResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec bundleRunRequestCreation(String tenantId, BundleRunRequest body) throws WebClientResponseException {
        Object postBody = body;
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new WebClientResponseException("Missing the required parameter 'tenantId' when calling bundleRun", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new WebClientResponseException("Missing the required parameter 'body' when calling bundleRun", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<BundleRunResponse> localVarReturnType = new ParameterizedTypeReference<BundleRunResponse>() {};
        return apiClient.invokeAPI("/v1/tenants/{tenant_id}/data/run-bundle", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * run bundle
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return BundleRunResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<BundleRunResponse> bundleRun(String tenantId, BundleRunRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<BundleRunResponse> localVarReturnType = new ParameterizedTypeReference<BundleRunResponse>() {};
        return bundleRunRequestCreation(tenantId, body).bodyToMono(localVarReturnType);
    }

    /**
     * run bundle
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseEntity&lt;BundleRunResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<BundleRunResponse>> bundleRunWithHttpInfo(String tenantId, BundleRunRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<BundleRunResponse> localVarReturnType = new ParameterizedTypeReference<BundleRunResponse>() {};
        return bundleRunRequestCreation(tenantId, body).toEntity(localVarReturnType);
    }

    /**
     * run bundle
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec bundleRunWithResponseSpec(String tenantId, BundleRunRequest body) throws WebClientResponseException {
        return bundleRunRequestCreation(tenantId, body);
    }
    /**
     * read attributes
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return AttributeReadResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec dataAttributesReadRequestCreation(String tenantId, DataAttributesReadRequest body) throws WebClientResponseException {
        Object postBody = body;
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new WebClientResponseException("Missing the required parameter 'tenantId' when calling dataAttributesRead", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new WebClientResponseException("Missing the required parameter 'body' when calling dataAttributesRead", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<AttributeReadResponse> localVarReturnType = new ParameterizedTypeReference<AttributeReadResponse>() {};
        return apiClient.invokeAPI("/v1/tenants/{tenant_id}/data/attributes/read", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * read attributes
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return AttributeReadResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<AttributeReadResponse> dataAttributesRead(String tenantId, DataAttributesReadRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<AttributeReadResponse> localVarReturnType = new ParameterizedTypeReference<AttributeReadResponse>() {};
        return dataAttributesReadRequestCreation(tenantId, body).bodyToMono(localVarReturnType);
    }

    /**
     * read attributes
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseEntity&lt;AttributeReadResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<AttributeReadResponse>> dataAttributesReadWithHttpInfo(String tenantId, DataAttributesReadRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<AttributeReadResponse> localVarReturnType = new ParameterizedTypeReference<AttributeReadResponse>() {};
        return dataAttributesReadRequestCreation(tenantId, body).toEntity(localVarReturnType);
    }

    /**
     * read attributes
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec dataAttributesReadWithResponseSpec(String tenantId, DataAttributesReadRequest body) throws WebClientResponseException {
        return dataAttributesReadRequestCreation(tenantId, body);
    }
    /**
     * delete data
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return DataDeleteResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec dataDeleteRequestCreation(String tenantId, DataDeleteRequest body) throws WebClientResponseException {
        Object postBody = body;
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new WebClientResponseException("Missing the required parameter 'tenantId' when calling dataDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new WebClientResponseException("Missing the required parameter 'body' when calling dataDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DataDeleteResponse> localVarReturnType = new ParameterizedTypeReference<DataDeleteResponse>() {};
        return apiClient.invokeAPI("/v1/tenants/{tenant_id}/data/delete", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * delete data
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return DataDeleteResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DataDeleteResponse> dataDelete(String tenantId, DataDeleteRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<DataDeleteResponse> localVarReturnType = new ParameterizedTypeReference<DataDeleteResponse>() {};
        return dataDeleteRequestCreation(tenantId, body).bodyToMono(localVarReturnType);
    }

    /**
     * delete data
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseEntity&lt;DataDeleteResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<DataDeleteResponse>> dataDeleteWithHttpInfo(String tenantId, DataDeleteRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<DataDeleteResponse> localVarReturnType = new ParameterizedTypeReference<DataDeleteResponse>() {};
        return dataDeleteRequestCreation(tenantId, body).toEntity(localVarReturnType);
    }

    /**
     * delete data
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec dataDeleteWithResponseSpec(String tenantId, DataDeleteRequest body) throws WebClientResponseException {
        return dataDeleteRequestCreation(tenantId, body);
    }
    /**
     * read relationships
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return RelationshipReadResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec dataRelationshipsReadRequestCreation(String tenantId, DataRelationshipsReadRequest body) throws WebClientResponseException {
        Object postBody = body;
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new WebClientResponseException("Missing the required parameter 'tenantId' when calling dataRelationshipsRead", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new WebClientResponseException("Missing the required parameter 'body' when calling dataRelationshipsRead", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<RelationshipReadResponse> localVarReturnType = new ParameterizedTypeReference<RelationshipReadResponse>() {};
        return apiClient.invokeAPI("/v1/tenants/{tenant_id}/data/relationships/read", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * read relationships
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return RelationshipReadResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<RelationshipReadResponse> dataRelationshipsRead(String tenantId, DataRelationshipsReadRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<RelationshipReadResponse> localVarReturnType = new ParameterizedTypeReference<RelationshipReadResponse>() {};
        return dataRelationshipsReadRequestCreation(tenantId, body).bodyToMono(localVarReturnType);
    }

    /**
     * read relationships
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseEntity&lt;RelationshipReadResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<RelationshipReadResponse>> dataRelationshipsReadWithHttpInfo(String tenantId, DataRelationshipsReadRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<RelationshipReadResponse> localVarReturnType = new ParameterizedTypeReference<RelationshipReadResponse>() {};
        return dataRelationshipsReadRequestCreation(tenantId, body).toEntity(localVarReturnType);
    }

    /**
     * read relationships
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec dataRelationshipsReadWithResponseSpec(String tenantId, DataRelationshipsReadRequest body) throws WebClientResponseException {
        return dataRelationshipsReadRequestCreation(tenantId, body);
    }
    /**
     * write data
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return DataWriteResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec dataWriteRequestCreation(String tenantId, DataWriteRequest body) throws WebClientResponseException {
        Object postBody = body;
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new WebClientResponseException("Missing the required parameter 'tenantId' when calling dataWrite", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new WebClientResponseException("Missing the required parameter 'body' when calling dataWrite", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DataWriteResponse> localVarReturnType = new ParameterizedTypeReference<DataWriteResponse>() {};
        return apiClient.invokeAPI("/v1/tenants/{tenant_id}/data/write", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * write data
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return DataWriteResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DataWriteResponse> dataWrite(String tenantId, DataWriteRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<DataWriteResponse> localVarReturnType = new ParameterizedTypeReference<DataWriteResponse>() {};
        return dataWriteRequestCreation(tenantId, body).bodyToMono(localVarReturnType);
    }

    /**
     * write data
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseEntity&lt;DataWriteResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<DataWriteResponse>> dataWriteWithHttpInfo(String tenantId, DataWriteRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<DataWriteResponse> localVarReturnType = new ParameterizedTypeReference<DataWriteResponse>() {};
        return dataWriteRequestCreation(tenantId, body).toEntity(localVarReturnType);
    }

    /**
     * write data
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec dataWriteWithResponseSpec(String tenantId, DataWriteRequest body) throws WebClientResponseException {
        return dataWriteRequestCreation(tenantId, body);
    }
    /**
     * delete relationships
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return RelationshipDeleteResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec relationshipsDeleteRequestCreation(String tenantId, RelationshipDeleteRequest body) throws WebClientResponseException {
        Object postBody = body;
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new WebClientResponseException("Missing the required parameter 'tenantId' when calling relationshipsDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new WebClientResponseException("Missing the required parameter 'body' when calling relationshipsDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<RelationshipDeleteResponse> localVarReturnType = new ParameterizedTypeReference<RelationshipDeleteResponse>() {};
        return apiClient.invokeAPI("/v1/tenants/{tenant_id}/relationships/delete", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * delete relationships
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return RelationshipDeleteResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<RelationshipDeleteResponse> relationshipsDelete(String tenantId, RelationshipDeleteRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<RelationshipDeleteResponse> localVarReturnType = new ParameterizedTypeReference<RelationshipDeleteResponse>() {};
        return relationshipsDeleteRequestCreation(tenantId, body).bodyToMono(localVarReturnType);
    }

    /**
     * delete relationships
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseEntity&lt;RelationshipDeleteResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<RelationshipDeleteResponse>> relationshipsDeleteWithHttpInfo(String tenantId, RelationshipDeleteRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<RelationshipDeleteResponse> localVarReturnType = new ParameterizedTypeReference<RelationshipDeleteResponse>() {};
        return relationshipsDeleteRequestCreation(tenantId, body).toEntity(localVarReturnType);
    }

    /**
     * delete relationships
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec relationshipsDeleteWithResponseSpec(String tenantId, RelationshipDeleteRequest body) throws WebClientResponseException {
        return relationshipsDeleteRequestCreation(tenantId, body);
    }
    /**
     * write relationships
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return RelationshipWriteResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec relationshipsWriteRequestCreation(String tenantId, RelationshipsWriteRequest body) throws WebClientResponseException {
        Object postBody = body;
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new WebClientResponseException("Missing the required parameter 'tenantId' when calling relationshipsWrite", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new WebClientResponseException("Missing the required parameter 'body' when calling relationshipsWrite", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<RelationshipWriteResponse> localVarReturnType = new ParameterizedTypeReference<RelationshipWriteResponse>() {};
        return apiClient.invokeAPI("/v1/tenants/{tenant_id}/relationships/write", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * write relationships
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return RelationshipWriteResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<RelationshipWriteResponse> relationshipsWrite(String tenantId, RelationshipsWriteRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<RelationshipWriteResponse> localVarReturnType = new ParameterizedTypeReference<RelationshipWriteResponse>() {};
        return relationshipsWriteRequestCreation(tenantId, body).bodyToMono(localVarReturnType);
    }

    /**
     * write relationships
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseEntity&lt;RelationshipWriteResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<RelationshipWriteResponse>> relationshipsWriteWithHttpInfo(String tenantId, RelationshipsWriteRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<RelationshipWriteResponse> localVarReturnType = new ParameterizedTypeReference<RelationshipWriteResponse>() {};
        return relationshipsWriteRequestCreation(tenantId, body).toEntity(localVarReturnType);
    }

    /**
     * write relationships
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec relationshipsWriteWithResponseSpec(String tenantId, RelationshipsWriteRequest body) throws WebClientResponseException {
        return relationshipsWriteRequestCreation(tenantId, body);
    }
}
