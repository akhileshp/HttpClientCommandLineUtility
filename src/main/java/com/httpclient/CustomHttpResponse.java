package com.httpclient;

public class CustomHttpResponse {

    public CustomHttpResponse(int statusCode) {
        this.statusCode = statusCode;
    }

    private int statusCode;

    public int getStatusCode() {
        return statusCode;
    }
}
