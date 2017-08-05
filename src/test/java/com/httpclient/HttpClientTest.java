package com.httpclient;

import org.junit.Test;

public class HttpClientTest {

    @Test
    public void shouldAcceptHttpGetRequestAndReturnSuccessResponse() {
        CustomHttpClient customHttpClient = new CustomHttpClient(new String[]{"http://www.google.com"});
        CustomHttpResponse response = customHttpClient.execute();
        assert response.getStatusCode() == 200;
    }

    @Test
    public void shouldAcceptHttpMethodFromArgsWithPrefixAndReturnSuccessResponse() {
        CustomHttpClient customHttpClient = new CustomHttpClient(new String[]{"http://www.google.com", "-m:get"});
        CustomHttpResponse response = customHttpClient.execute();
        assert response.getStatusCode() == 200;
    }

    @Test
    public void shouldAcceptHttpMethodFromArgsWithFullNameAndReturnSuccessResponse() {
        CustomHttpClient customHttpClient = new CustomHttpClient(new String[]{"http://www.google.com", "--method:get"});
        CustomHttpResponse response = customHttpClient.execute();
        assert response.getStatusCode() == 200;
    }

}
