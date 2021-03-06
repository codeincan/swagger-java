/*
 * IBM Watson IoT Platform Organization Information Management REST APIs
 * The Information Management APIs can be used to access device event data as well as  get and update device location and obtain weather information for that location. For information on this API, and how to use Watson IoT Platform APIs generally see  [the API documentation](https://console.ng.bluemix.net/docs/services/IoT/reference/api.html).  version: \"0002\" 
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.ibm.wiotp.sdk.swagger.api;

import com.google.gson.reflect.TypeToken;
import com.ibm.wiotp.sdk.swagger.ApiCallback;
import com.ibm.wiotp.sdk.swagger.ApiClient;
import com.ibm.wiotp.sdk.swagger.ApiException;
import com.ibm.wiotp.sdk.swagger.ApiResponse;
import com.ibm.wiotp.sdk.swagger.Configuration;
import com.ibm.wiotp.sdk.swagger.Pair;
import com.ibm.wiotp.sdk.swagger.ProgressRequestBody;
import com.ibm.wiotp.sdk.swagger.ProgressResponseBody;
import com.ibm.wiotp.sdk.swagger.model.ErrorMessage;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeviceLocationWeatherApi {
    private ApiClient apiClient;

    public DeviceLocationWeatherApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DeviceLocationWeatherApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deviceTypesTypeIdDevicesDeviceIdExtsTwcOpsGeocodeGet
     * @param typeId Device type ID (required)
     * @param deviceId Device ID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deviceTypesTypeIdDevicesDeviceIdExtsTwcOpsGeocodeGetCall(String typeId, String deviceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/device/types/{typeId}/devices/{deviceId}/exts/twc/ops/geocode"
            .replaceAll("\\{" + "typeId" + "\\}", apiClient.escapeString(typeId.toString()))
            .replaceAll("\\{" + "deviceId" + "\\}", apiClient.escapeString(deviceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "ApiKey" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deviceTypesTypeIdDevicesDeviceIdExtsTwcOpsGeocodeGetValidateBeforeCall(String typeId, String deviceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'typeId' is set
        if (typeId == null) {
            throw new ApiException("Missing the required parameter 'typeId' when calling deviceTypesTypeIdDevicesDeviceIdExtsTwcOpsGeocodeGet(Async)");
        }
        
        // verify the required parameter 'deviceId' is set
        if (deviceId == null) {
            throw new ApiException("Missing the required parameter 'deviceId' when calling deviceTypesTypeIdDevicesDeviceIdExtsTwcOpsGeocodeGet(Async)");
        }
        

        com.squareup.okhttp.Call call = deviceTypesTypeIdDevicesDeviceIdExtsTwcOpsGeocodeGetCall(typeId, deviceId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieve current meteorological observations for the location associated with your device
     * 
     * @param typeId Device type ID (required)
     * @param deviceId Device ID (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object deviceTypesTypeIdDevicesDeviceIdExtsTwcOpsGeocodeGet(String typeId, String deviceId) throws ApiException {
        ApiResponse<Object> resp = deviceTypesTypeIdDevicesDeviceIdExtsTwcOpsGeocodeGetWithHttpInfo(typeId, deviceId);
        return resp.getData();
    }

    /**
     * Retrieve current meteorological observations for the location associated with your device
     * 
     * @param typeId Device type ID (required)
     * @param deviceId Device ID (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> deviceTypesTypeIdDevicesDeviceIdExtsTwcOpsGeocodeGetWithHttpInfo(String typeId, String deviceId) throws ApiException {
        com.squareup.okhttp.Call call = deviceTypesTypeIdDevicesDeviceIdExtsTwcOpsGeocodeGetValidateBeforeCall(typeId, deviceId, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve current meteorological observations for the location associated with your device (asynchronously)
     * 
     * @param typeId Device type ID (required)
     * @param deviceId Device ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deviceTypesTypeIdDevicesDeviceIdExtsTwcOpsGeocodeGetAsync(String typeId, String deviceId, final ApiCallback<Object> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deviceTypesTypeIdDevicesDeviceIdExtsTwcOpsGeocodeGetValidateBeforeCall(typeId, deviceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
