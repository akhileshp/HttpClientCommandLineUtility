package com.httpclient;

public class HttpRequestEntity {
    private HttpMethods method;
    private String url;

    public void setMethod(HttpMethods method) {
        this.method = method;
    }

    public HttpMethods getMethod() {
        return method;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
