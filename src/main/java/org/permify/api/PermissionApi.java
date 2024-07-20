package org.permify.api;

import org.permify.ApiClient;

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
public class PermissionApi {
    private ApiClient apiClient;

    public PermissionApi() {
        this(new ApiClient());
    }

    @Autowired
    public PermissionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * check api
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return PermissionCheckResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec permissionsCheckRequestCreation(String tenantId, PermissionsCheckRequest body) throws WebClientResponseException {
        Object postBody = body;
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new WebClientResponseException("Missing the required parameter 'tenantId' when calling permissionsCheck", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new WebClientResponseException("Missing the required parameter 'body' when calling permissionsCheck", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<PermissionCheckResponse> localVarReturnType = new ParameterizedTypeReference<PermissionCheckResponse>() {};
        return apiClient.invokeAPI("/v1/tenants/{tenant_id}/permissions/check", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * check api
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return PermissionCheckResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PermissionCheckResponse> permissionsCheck(String tenantId, PermissionsCheckRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<PermissionCheckResponse> localVarReturnType = new ParameterizedTypeReference<PermissionCheckResponse>() {};
        return permissionsCheckRequestCreation(tenantId, body).bodyToMono(localVarReturnType);
    }

    /**
     * check api
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseEntity&lt;PermissionCheckResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<PermissionCheckResponse>> permissionsCheckWithHttpInfo(String tenantId, PermissionsCheckRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<PermissionCheckResponse> localVarReturnType = new ParameterizedTypeReference<PermissionCheckResponse>() {};
        return permissionsCheckRequestCreation(tenantId, body).toEntity(localVarReturnType);
    }

    /**
     * check api
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec permissionsCheckWithResponseSpec(String tenantId, PermissionsCheckRequest body) throws WebClientResponseException {
        return permissionsCheckRequestCreation(tenantId, body);
    }
    /**
     * expand api
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return PermissionExpandResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec permissionsExpandRequestCreation(String tenantId, PermissionsExpandRequest body) throws WebClientResponseException {
        Object postBody = body;
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new WebClientResponseException("Missing the required parameter 'tenantId' when calling permissionsExpand", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new WebClientResponseException("Missing the required parameter 'body' when calling permissionsExpand", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<PermissionExpandResponse> localVarReturnType = new ParameterizedTypeReference<PermissionExpandResponse>() {};
        return apiClient.invokeAPI("/v1/tenants/{tenant_id}/permissions/expand", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * expand api
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return PermissionExpandResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PermissionExpandResponse> permissionsExpand(String tenantId, PermissionsExpandRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<PermissionExpandResponse> localVarReturnType = new ParameterizedTypeReference<PermissionExpandResponse>() {};
        return permissionsExpandRequestCreation(tenantId, body).bodyToMono(localVarReturnType);
    }

    /**
     * expand api
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseEntity&lt;PermissionExpandResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<PermissionExpandResponse>> permissionsExpandWithHttpInfo(String tenantId, PermissionsExpandRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<PermissionExpandResponse> localVarReturnType = new ParameterizedTypeReference<PermissionExpandResponse>() {};
        return permissionsExpandRequestCreation(tenantId, body).toEntity(localVarReturnType);
    }

    /**
     * expand api
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec permissionsExpandWithResponseSpec(String tenantId, PermissionsExpandRequest body) throws WebClientResponseException {
        return permissionsExpandRequestCreation(tenantId, body);
    }
    /**
     * lookup entity
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return PermissionLookupEntityResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec permissionsLookupEntityRequestCreation(String tenantId, PermissionsLookupEntityRequest body) throws WebClientResponseException {
        Object postBody = body;
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new WebClientResponseException("Missing the required parameter 'tenantId' when calling permissionsLookupEntity", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new WebClientResponseException("Missing the required parameter 'body' when calling permissionsLookupEntity", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<PermissionLookupEntityResponse> localVarReturnType = new ParameterizedTypeReference<PermissionLookupEntityResponse>() {};
        return apiClient.invokeAPI("/v1/tenants/{tenant_id}/permissions/lookup-entity", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * lookup entity
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return PermissionLookupEntityResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PermissionLookupEntityResponse> permissionsLookupEntity(String tenantId, PermissionsLookupEntityRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<PermissionLookupEntityResponse> localVarReturnType = new ParameterizedTypeReference<PermissionLookupEntityResponse>() {};
        return permissionsLookupEntityRequestCreation(tenantId, body).bodyToMono(localVarReturnType);
    }

    /**
     * lookup entity
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseEntity&lt;PermissionLookupEntityResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<PermissionLookupEntityResponse>> permissionsLookupEntityWithHttpInfo(String tenantId, PermissionsLookupEntityRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<PermissionLookupEntityResponse> localVarReturnType = new ParameterizedTypeReference<PermissionLookupEntityResponse>() {};
        return permissionsLookupEntityRequestCreation(tenantId, body).toEntity(localVarReturnType);
    }

    /**
     * lookup entity
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec permissionsLookupEntityWithResponseSpec(String tenantId, PermissionsLookupEntityRequest body) throws WebClientResponseException {
        return permissionsLookupEntityRequestCreation(tenantId, body);
    }
    /**
     * lookup entity stream
     * 
     * <p><b>200</b> - A successful response.(streaming responses)
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return StreamResultOfPermissionLookupEntityStreamResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec permissionsLookupEntityStreamRequestCreation(String tenantId, PermissionsLookupEntityRequest body) throws WebClientResponseException {
        Object postBody = body;
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new WebClientResponseException("Missing the required parameter 'tenantId' when calling permissionsLookupEntityStream", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new WebClientResponseException("Missing the required parameter 'body' when calling permissionsLookupEntityStream", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<StreamResultOfPermissionLookupEntityStreamResponse> localVarReturnType = new ParameterizedTypeReference<StreamResultOfPermissionLookupEntityStreamResponse>() {};
        return apiClient.invokeAPI("/v1/tenants/{tenant_id}/permissions/lookup-entity-stream", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * lookup entity stream
     * 
     * <p><b>200</b> - A successful response.(streaming responses)
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return StreamResultOfPermissionLookupEntityStreamResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<StreamResultOfPermissionLookupEntityStreamResponse> permissionsLookupEntityStream(String tenantId, PermissionsLookupEntityRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<StreamResultOfPermissionLookupEntityStreamResponse> localVarReturnType = new ParameterizedTypeReference<StreamResultOfPermissionLookupEntityStreamResponse>() {};
        return permissionsLookupEntityStreamRequestCreation(tenantId, body).bodyToMono(localVarReturnType);
    }

    /**
     * lookup entity stream
     * 
     * <p><b>200</b> - A successful response.(streaming responses)
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseEntity&lt;StreamResultOfPermissionLookupEntityStreamResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<StreamResultOfPermissionLookupEntityStreamResponse>> permissionsLookupEntityStreamWithHttpInfo(String tenantId, PermissionsLookupEntityRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<StreamResultOfPermissionLookupEntityStreamResponse> localVarReturnType = new ParameterizedTypeReference<StreamResultOfPermissionLookupEntityStreamResponse>() {};
        return permissionsLookupEntityStreamRequestCreation(tenantId, body).toEntity(localVarReturnType);
    }

    /**
     * lookup entity stream
     * 
     * <p><b>200</b> - A successful response.(streaming responses)
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec permissionsLookupEntityStreamWithResponseSpec(String tenantId, PermissionsLookupEntityRequest body) throws WebClientResponseException {
        return permissionsLookupEntityStreamRequestCreation(tenantId, body);
    }
    /**
     * lookup-subject
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return PermissionLookupSubjectResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec permissionsLookupSubjectRequestCreation(String tenantId, PermissionsLookupSubjectRequest body) throws WebClientResponseException {
        Object postBody = body;
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new WebClientResponseException("Missing the required parameter 'tenantId' when calling permissionsLookupSubject", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new WebClientResponseException("Missing the required parameter 'body' when calling permissionsLookupSubject", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<PermissionLookupSubjectResponse> localVarReturnType = new ParameterizedTypeReference<PermissionLookupSubjectResponse>() {};
        return apiClient.invokeAPI("/v1/tenants/{tenant_id}/permissions/lookup-subject", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * lookup-subject
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return PermissionLookupSubjectResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PermissionLookupSubjectResponse> permissionsLookupSubject(String tenantId, PermissionsLookupSubjectRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<PermissionLookupSubjectResponse> localVarReturnType = new ParameterizedTypeReference<PermissionLookupSubjectResponse>() {};
        return permissionsLookupSubjectRequestCreation(tenantId, body).bodyToMono(localVarReturnType);
    }

    /**
     * lookup-subject
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseEntity&lt;PermissionLookupSubjectResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<PermissionLookupSubjectResponse>> permissionsLookupSubjectWithHttpInfo(String tenantId, PermissionsLookupSubjectRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<PermissionLookupSubjectResponse> localVarReturnType = new ParameterizedTypeReference<PermissionLookupSubjectResponse>() {};
        return permissionsLookupSubjectRequestCreation(tenantId, body).toEntity(localVarReturnType);
    }

    /**
     * lookup-subject
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec permissionsLookupSubjectWithResponseSpec(String tenantId, PermissionsLookupSubjectRequest body) throws WebClientResponseException {
        return permissionsLookupSubjectRequestCreation(tenantId, body);
    }
    /**
     * subject permission
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return PermissionSubjectPermissionResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec permissionsSubjectPermissionRequestCreation(String tenantId, PermissionsSubjectPermissionRequest body) throws WebClientResponseException {
        Object postBody = body;
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new WebClientResponseException("Missing the required parameter 'tenantId' when calling permissionsSubjectPermission", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new WebClientResponseException("Missing the required parameter 'body' when calling permissionsSubjectPermission", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<PermissionSubjectPermissionResponse> localVarReturnType = new ParameterizedTypeReference<PermissionSubjectPermissionResponse>() {};
        return apiClient.invokeAPI("/v1/tenants/{tenant_id}/permissions/subject-permission", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * subject permission
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return PermissionSubjectPermissionResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PermissionSubjectPermissionResponse> permissionsSubjectPermission(String tenantId, PermissionsSubjectPermissionRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<PermissionSubjectPermissionResponse> localVarReturnType = new ParameterizedTypeReference<PermissionSubjectPermissionResponse>() {};
        return permissionsSubjectPermissionRequestCreation(tenantId, body).bodyToMono(localVarReturnType);
    }

    /**
     * subject permission
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseEntity&lt;PermissionSubjectPermissionResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<PermissionSubjectPermissionResponse>> permissionsSubjectPermissionWithHttpInfo(String tenantId, PermissionsSubjectPermissionRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<PermissionSubjectPermissionResponse> localVarReturnType = new ParameterizedTypeReference<PermissionSubjectPermissionResponse>() {};
        return permissionsSubjectPermissionRequestCreation(tenantId, body).toEntity(localVarReturnType);
    }

    /**
     * subject permission
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec permissionsSubjectPermissionWithResponseSpec(String tenantId, PermissionsSubjectPermissionRequest body) throws WebClientResponseException {
        return permissionsSubjectPermissionRequestCreation(tenantId, body);
    }
}
