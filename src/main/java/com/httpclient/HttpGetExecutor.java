package com.httpclient;

public class HttpGetExecutor implements HttpMethodExecutor {
    public CustomHttpResponse execute(String url) {
        return new CustomHttpResponse(200);
    }
}
