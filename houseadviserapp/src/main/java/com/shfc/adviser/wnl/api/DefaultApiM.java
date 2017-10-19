package com.shfc.adviser.wnl.api;

import com.google.gson.reflect.TypeToken;
import com.shfc.adviser.wnl.wxlink.*;

import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Package api.DefaultApiM
 * @Description: TODO
 * @Company:上海房产
 * @Copyright: Copyright (c) 2016
 * Author wliao
 * @date 2017/1/3 13:58
 * version V1.0.0
 *
 * 提供十二星座查询，每个星座的今天、明天、本周、本月、本年星座运势查询。
 *
 *  * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class DefaultApiM {
    private ApiClient apiClient;

    public DefaultApiM() {
        this(Configuration.getDefaultApiClient());
    }

    public DefaultApiM(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for astro */
    private com.squareup.okhttp.Call astroCall(BigDecimal astroid, String date, String appkey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'astroid' is set
        if (astroid == null) {
            throw new ApiException("Missing the required parameter 'astroid' when calling astro(Async)");
        }

        // verify the required parameter 'date' is set
        if (date == null) {
            throw new ApiException("Missing the required parameter 'date' when calling astro(Async)");
        }

        // verify the required parameter 'appkey' is set
        if (appkey == null) {
            throw new ApiException("Missing the required parameter 'appkey' when calling astro(Async)");
        }


        // create path and map variables
        String localVarPath = "/astro".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (astroid != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "astroid", astroid));
        if (date != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "date", date));
        if (appkey != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "appkey", appkey));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
                "text/plain"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 通过星座ID和日期查询星座运势信息。
     * 通过星座ID和日期查询星座运势信息。
     * @param astroid 星座ID（星座查询接口中获取，星座查询接口不计费） (required)
     * @param date 日期 默认今天 (required)
     * @param appkey 万象平台提供的appkey (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String astro(BigDecimal astroid, String date, String appkey) throws ApiException {
        ApiResponse<String> resp = astroWithHttpInfo(astroid, date, appkey);
        return resp.getData();
    }

    /**
     * 通过星座ID和日期查询星座运势信息。
     * 通过星座ID和日期查询星座运势信息。
     * @param astroid 星座ID（星座查询接口中获取，星座查询接口不计费） (required)
     * @param date 日期 默认今天 (required)
     * @param appkey 万象平台提供的appkey (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> astroWithHttpInfo(BigDecimal astroid, String date, String appkey) throws ApiException {
        com.squareup.okhttp.Call call = astroCall(astroid, date, appkey, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 通过星座ID和日期查询星座运势信息。 (asynchronously)
     * 通过星座ID和日期查询星座运势信息。
     * @param astroid 星座ID（星座查询接口中获取，星座查询接口不计费） (required)
     * @param date 日期 默认今天 (required)
     * @param appkey 万象平台提供的appkey (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call astroAsync(BigDecimal astroid, String date, String appkey, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = astroCall(astroid, date, appkey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for astro1 */
    private com.squareup.okhttp.Call astro1Call(String appkey, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'appkey' is set
        if (appkey == null) {
            throw new ApiException("Missing the required parameter 'appkey' when calling astro1(Async)");
        }


        // create path and map variables
        String localVarPath = "/astro1".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (appkey != null)
            localVarQueryParams.addAll(apiClient.parameterToPairs("", "appkey", appkey));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
                "text/plain"
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

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 查询全部星座信息，包括星座ID、名称、日期和图片。该接口不计费。
     * 查询全部星座信息，包括星座ID、名称、日期和图片。该接口不计费。
     * @param appkey 万象平台提供的appkey (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String astro1(String appkey) throws ApiException {
        ApiResponse<String> resp = astro1WithHttpInfo(appkey);
        return resp.getData();
    }

    /**
     * 查询全部星座信息，包括星座ID、名称、日期和图片。该接口不计费。
     * 查询全部星座信息，包括星座ID、名称、日期和图片。该接口不计费。
     * @param appkey 万象平台提供的appkey (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> astro1WithHttpInfo(String appkey) throws ApiException {
        com.squareup.okhttp.Call call = astro1Call(appkey, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 查询全部星座信息，包括星座ID、名称、日期和图片。该接口不计费。 (asynchronously)
     * 查询全部星座信息，包括星座ID、名称、日期和图片。该接口不计费。
     * @param appkey 万象平台提供的appkey (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call astro1Async(String appkey, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = astro1Call(appkey, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
