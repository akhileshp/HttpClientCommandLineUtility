package com.httpclient;

public enum HttpMethods {

    GET("get");

    private String method;

    HttpMethods(String method) {
        this.method = method;
    }

    public static HttpMethods getMethod(String methodType) {
        for (final HttpMethods httpMethods : HttpMethods.values()) {
            if (httpMethods.getMethod().equalsIgnoreCase(methodType)) {
                return httpMethods;
            }
        }
        throw new RuntimeException("Method not supported : " + methodType);
    }

    public String getMethod() {
        return method;
    }
}
