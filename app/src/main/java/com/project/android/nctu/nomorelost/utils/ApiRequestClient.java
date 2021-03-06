package com.project.android.nctu.nomorelost.utils;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

/**
 * Created by chichunchen on 5/23/15.
 */
public class ApiRequestClient {

    private static final String BASE_URL = "http://52.68.136.81:3000/";
    private static AsyncHttpClient client = new AsyncHttpClient();

    // request function
    public static void get(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        //	      client.get(getAbsoluteUrl(url), params, responseHandler);
        client.get(url, params, responseHandler);
    }

    public static void post(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
//        client.post(getAbsoluteUrl(url), params, responseHandler);
        client.post(url, params, responseHandler);
    }

    private static String getAbsoluteUrl(String relativeUrl) {
        return BASE_URL + relativeUrl;
    }

}