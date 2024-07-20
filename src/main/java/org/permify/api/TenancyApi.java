package org.permify.api;

import org.permify.ApiClient;

import org.permify.model.Status;
import org.permify.model.TenantCreateRequest;
import org.permify.model.TenantCreateResponse;
import org.permify.model.TenantDeleteResponse;
import org.permify.model.TenantListRequest;
import org.permify.model.TenantListResponse;

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
public class TenancyApi {
    private ApiClient apiClient;

    public TenancyApi() {
        this(new ApiClient());
    }

    @Autowired
    public TenancyApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * create tenant
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param body TenantCreateRequest is the message used for the request to create a tenant.
     * @return TenantCreateResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec tenantsCreateRequestCreation(TenantCreateRequest body) throws WebClientResponseException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new WebClientResponseException("Missing the required parameter 'body' when calling tenantsCreate", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

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

        ParameterizedTypeReference<TenantCreateResponse> localVarReturnType = new ParameterizedTypeReference<TenantCreateResponse>() {};
        return apiClient.invokeAPI("/v1/tenants/create", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * create tenant
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param body TenantCreateRequest is the message used for the request to create a tenant.
     * @return TenantCreateResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TenantCreateResponse> tenantsCreate(TenantCreateRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<TenantCreateResponse> localVarReturnType = new ParameterizedTypeReference<TenantCreateResponse>() {};
        return tenantsCreateRequestCreation(body).bodyToMono(localVarReturnType);
    }

    /**
     * create tenant
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param body TenantCreateRequest is the message used for the request to create a tenant.
     * @return ResponseEntity&lt;TenantCreateResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<TenantCreateResponse>> tenantsCreateWithHttpInfo(TenantCreateRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<TenantCreateResponse> localVarReturnType = new ParameterizedTypeReference<TenantCreateResponse>() {};
        return tenantsCreateRequestCreation(body).toEntity(localVarReturnType);
    }

    /**
     * create tenant
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param body TenantCreateRequest is the message used for the request to create a tenant.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec tenantsCreateWithResponseSpec(TenantCreateRequest body) throws WebClientResponseException {
        return tenantsCreateRequestCreation(body);
    }
    /**
     * delete tenant
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param id id is the unique identifier of the tenant to be deleted.
     * @return TenantDeleteResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec tenantsDeleteRequestCreation(String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling tenantsDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<TenantDeleteResponse> localVarReturnType = new ParameterizedTypeReference<TenantDeleteResponse>() {};
        return apiClient.invokeAPI("/v1/tenants/{id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * delete tenant
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param id id is the unique identifier of the tenant to be deleted.
     * @return TenantDeleteResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TenantDeleteResponse> tenantsDelete(String id) throws WebClientResponseException {
        ParameterizedTypeReference<TenantDeleteResponse> localVarReturnType = new ParameterizedTypeReference<TenantDeleteResponse>() {};
        return tenantsDeleteRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * delete tenant
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param id id is the unique identifier of the tenant to be deleted.
     * @return ResponseEntity&lt;TenantDeleteResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<TenantDeleteResponse>> tenantsDeleteWithHttpInfo(String id) throws WebClientResponseException {
        ParameterizedTypeReference<TenantDeleteResponse> localVarReturnType = new ParameterizedTypeReference<TenantDeleteResponse>() {};
        return tenantsDeleteRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * delete tenant
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param id id is the unique identifier of the tenant to be deleted.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec tenantsDeleteWithResponseSpec(String id) throws WebClientResponseException {
        return tenantsDeleteRequestCreation(id);
    }
    /**
     * list tenants
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param body TenantListRequest is the message used for the request to list all tenants.
     * @return TenantListResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec tenantsListRequestCreation(TenantListRequest body) throws WebClientResponseException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new WebClientResponseException("Missing the required parameter 'body' when calling tenantsList", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

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

        ParameterizedTypeReference<TenantListResponse> localVarReturnType = new ParameterizedTypeReference<TenantListResponse>() {};
        return apiClient.invokeAPI("/v1/tenants/list", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * list tenants
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param body TenantListRequest is the message used for the request to list all tenants.
     * @return TenantListResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TenantListResponse> tenantsList(TenantListRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<TenantListResponse> localVarReturnType = new ParameterizedTypeReference<TenantListResponse>() {};
        return tenantsListRequestCreation(body).bodyToMono(localVarReturnType);
    }

    /**
     * list tenants
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param body TenantListRequest is the message used for the request to list all tenants.
     * @return ResponseEntity&lt;TenantListResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<TenantListResponse>> tenantsListWithHttpInfo(TenantListRequest body) throws WebClientResponseException {
        ParameterizedTypeReference<TenantListResponse> localVarReturnType = new ParameterizedTypeReference<TenantListResponse>() {};
        return tenantsListRequestCreation(body).toEntity(localVarReturnType);
    }

    /**
     * list tenants
     * 
     * <p><b>200</b> - A successful response.
     * <p><b>0</b> - An unexpected error response.
     * @param body TenantListRequest is the message used for the request to list all tenants.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec tenantsListWithResponseSpec(TenantListRequest body) throws WebClientResponseException {
        return tenantsListRequestCreation(body);
    }
}
