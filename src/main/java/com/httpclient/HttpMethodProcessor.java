package com.httpclient;

public class HttpMethodProcessor implements RequestArgumentProcessor {
    public void process(String argumentToken, final HttpRequestEntity httpRequestEntity) {
        httpRequestEntity.setMethod(HttpMethods.getMethod(argumentToken));
    }
}
