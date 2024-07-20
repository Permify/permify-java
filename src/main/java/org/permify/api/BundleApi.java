package org.permify.api;

import org.permify.ApiClient;

import org.permify.model.BundleDeleteRequest;
import org.permify.model.BundleDeleteResponse;
import org.permify.model.BundleReadRequest;
import org.permify.model.BundleReadResponse;
import org.permify.model.BundleWriteRequest;
import org.permify.model.BundleWriteResponse;
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
public class BundleApi {
    private ApiClient apiClient;

    public BundleApi() {
        this(new ApiClient());
    }

    @Autowired
    public BundleApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * delete bundle
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return BundleDeleteResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec bundleDeleteRequestCreation(String tenantId, BundleDeleteRequest body) throws WebClientResponseException {
        Object postBody = body;
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new WebClientResponseException("Missing the required parameter 'tenantId' when calling bundleDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new WebClientResponseException("Missing the required parameter 'body' when calling bundleDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<BundleDeleteResponse> localVarReturnType = new ParameterizedTypeReference<BundleDeleteResponse>() {};
        return apiClient.invokeAPI("/v1/tenants/{tenant_id}/bundle/delete", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * delete bundle
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return BundleDeleteResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<BundleDeleteResponse> bundleDelete(String tenantId, BundleDeleteRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<BundleDeleteResponse> localVarReturnType = new ParameterizedTypeReference<BundleDeleteResponse>() {};
        return bundleDeleteRequestCreation(tenantId, body).bodyToMono(localVarReturnType);
    }

    /**
     * delete bundle
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseEntity&lt;BundleDeleteResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<BundleDeleteResponse>> bundleDeleteWithHttpInfo(String tenantId, BundleDeleteRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<BundleDeleteResponse> localVarReturnType = new ParameterizedTypeReference<BundleDeleteResponse>() {};
        return bundleDeleteRequestCreation(tenantId, body).toEntity(localVarReturnType);
    }

    /**
     * delete bundle
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec bundleDeleteWithResponseSpec(String tenantId, BundleDeleteRequest body) throws WebClientResponseException {
        return bundleDeleteRequestCreation(tenantId, body);
    }
    /**
     * read bundle
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return BundleReadResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec bundleReadRequestCreation(String tenantId, BundleReadRequest body) throws WebClientResponseException {
        Object postBody = body;
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new WebClientResponseException("Missing the required parameter 'tenantId' when calling bundleRead", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new WebClientResponseException("Missing the required parameter 'body' when calling bundleRead", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<BundleReadResponse> localVarReturnType = new ParameterizedTypeReference<BundleReadResponse>() {};
        return apiClient.invokeAPI("/v1/tenants/{tenant_id}/bundle/read", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * read bundle
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return BundleReadResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<BundleReadResponse> bundleRead(String tenantId, BundleReadRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<BundleReadResponse> localVarReturnType = new ParameterizedTypeReference<BundleReadResponse>() {};
        return bundleReadRequestCreation(tenantId, body).bodyToMono(localVarReturnType);
    }

    /**
     * read bundle
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseEntity&lt;BundleReadResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<BundleReadResponse>> bundleReadWithHttpInfo(String tenantId, BundleReadRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<BundleReadResponse> localVarReturnType = new ParameterizedTypeReference<BundleReadResponse>() {};
        return bundleReadRequestCreation(tenantId, body).toEntity(localVarReturnType);
    }

    /**
     * read bundle
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec bundleReadWithResponseSpec(String tenantId, BundleReadRequest body) throws WebClientResponseException {
        return bundleReadRequestCreation(tenantId, body);
    }
    /**
     * write bundle
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return BundleWriteResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec bundleWriteRequestCreation(String tenantId, BundleWriteRequest body) throws WebClientResponseException {
        Object postBody = body;
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new WebClientResponseException("Missing the required parameter 'tenantId' when calling bundleWrite", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new WebClientResponseException("Missing the required parameter 'body' when calling bundleWrite", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<BundleWriteResponse> localVarReturnType = new ParameterizedTypeReference<BundleWriteResponse>() {};
        return apiClient.invokeAPI("/v1/tenants/{tenant_id}/bundle/write", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * write bundle
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return BundleWriteResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<BundleWriteResponse> bundleWrite(String tenantId, BundleWriteRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<BundleWriteResponse> localVarReturnType = new ParameterizedTypeReference<BundleWriteResponse>() {};
        return bundleWriteRequestCreation(tenantId, body).bodyToMono(localVarReturnType);
    }

    /**
     * write bundle
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseEntity&lt;BundleWriteResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<BundleWriteResponse>> bundleWriteWithHttpInfo(String tenantId, BundleWriteRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<BundleWriteResponse> localVarReturnType = new ParameterizedTypeReference<BundleWriteResponse>() {};
        return bundleWriteRequestCreation(tenantId, body).toEntity(localVarReturnType);
    }

    /**
     * write bundle
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec bundleWriteWithResponseSpec(String tenantId, BundleWriteRequest body) throws WebClientResponseException {
        return bundleWriteRequestCreation(tenantId, body);
    }
}
