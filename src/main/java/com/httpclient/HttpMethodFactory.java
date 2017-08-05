package com.httpclient;

public class HttpMethodFactory {

    public static HttpMethodExecutor getInstance(HttpMethods httpMethod) {
        HttpMethodExecutor httpMethodExecutor = null;
        switch (httpMethod) {
            case GET:
                httpMethodExecutor = new HttpGetExecutor();

        }
        return httpMethodExecutor;
    }
}
