package org.permify.api;

import org.permify.ApiClient;

import org.permify.model.Status;
import org.permify.model.StreamResultOfWatchResponse;
import org.permify.model.WatchWatchRequest;

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
public class WatchApi {
    private ApiClient apiClient;

    public WatchApi() {
        this(new ApiClient());
    }

    @Autowired
    public WatchApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * watch changes
     * 
     * <p><b>200</b> - A successful response.(streaming responses)
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return StreamResultOfWatchResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec watchWatchRequestCreation(String tenantId, WatchWatchRequest body) throws WebClientResponseException {
        Object postBody = body;
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new WebClientResponseException("Missing the required parameter 'tenantId' when calling watchWatch", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new WebClientResponseException("Missing the required parameter 'body' when calling watchWatch", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<StreamResultOfWatchResponse> localVarReturnType = new ParameterizedTypeReference<StreamResultOfWatchResponse>() {};
        return apiClient.invokeAPI("/v1/tenants/{tenant_id}/watch", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * watch changes
     * 
     * <p><b>200</b> - A successful response.(streaming responses)
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return StreamResultOfWatchResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<StreamResultOfWatchResponse> watchWatch(String tenantId, WatchWatchRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<StreamResultOfWatchResponse> localVarReturnType = new ParameterizedTypeReference<StreamResultOfWatchResponse>() {};
        return watchWatchRequestCreation(tenantId, body).bodyToMono(localVarReturnType);
    }

    /**
     * watch changes
     * 
     * <p><b>200</b> - A successful response.(streaming responses)
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseEntity&lt;StreamResultOfWatchResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<StreamResultOfWatchResponse>> watchWatchWithHttpInfo(String tenantId, WatchWatchRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<StreamResultOfWatchResponse> localVarReturnType = new ParameterizedTypeReference<StreamResultOfWatchResponse>() {};
        return watchWatchRequestCreation(tenantId, body).toEntity(localVarReturnType);
    }

    /**
     * watch changes
     * 
     * <p><b>200</b> - A successful response.(streaming responses)
     * <p><b>0</b> - An unexpected error response.
     * @param tenantId Identifier of the tenant, if you are not using multi-tenancy (have only one tenant) use pre-inserted tenant &lt;code&gt;t1&lt;/code&gt; for this field. Required, and must match the pattern \\“[a-zA-Z0-9-,]+\\“, max 64 bytes.
     * @param body The body parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec watchWatchWithResponseSpec(String tenantId, WatchWatchRequest body) throws WebClientResponseException {
        return watchWatchRequestCreation(tenantId, body);
    }
}
