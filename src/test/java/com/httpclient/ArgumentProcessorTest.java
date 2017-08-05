package com.httpclient;

import org.junit.Test;

public class ArgumentProcessorTest {

    @Test
    public void shouldAddProcessorForHttpMethods(){
        ArgumentProcessor processor = new ArgumentProcessor();
        processor.addProcessor("-m", new HttpMethodProcessor());
        processor.addProcessor("--method", new HttpMethodProcessor());
        final HttpRequestEntity httpRequestEntity = new HttpRequestEntity();
        processor.processArguments("-m:get", httpRequestEntity);
        assert HttpMethods.GET.equals(httpRequestEntity.getMethod());
    }
}
