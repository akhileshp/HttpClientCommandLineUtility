package com.httpclient;

public interface RequestArgumentProcessor {

    void process(String argumentToken, final HttpRequestEntity httpRequestEntity);
}
