package com.httpclient;

import org.junit.Test;

public class HttpEntityProcessorTest {

    @Test
    public void shouldBuildHttpEntityWithMethodName() {

        final String url = "www.google.com";
        ArgumentProcessor processor = new ArgumentProcessor();
        processor.addProcessor("-m", new HttpMethodProcessor());
        processor.addProcessor("--method", new HttpMethodProcessor());
        final HttpRequestEntity httpRequestEntity =
                HttpRequestEntityProcessor.process(new String[]{url, "-m:get"}, processor);
        assert url.equals(httpRequestEntity.getUrl());
        assert HttpMethods.GET.equals(httpRequestEntity.getMethod());
    }

    @Test
    public void shouldBuildHttpEntityWithMethods() {

        final String url = "www.google.com";
        ArgumentProcessor processor = new ArgumentProcessor();
        processor.addProcessor("-m", new HttpMethodProcessor());
        processor.addProcessor("--method", new HttpMethodProcessor());
        final HttpRequestEntity httpRequestEntity =
                HttpRequestEntityProcessor.process(new String[]{url, "--method:get"}, processor);
        assert url.equals(httpRequestEntity.getUrl());
        assert HttpMethods.GET.equals(httpRequestEntity.getMethod());
    }
}
