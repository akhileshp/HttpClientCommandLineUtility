package com.httpclient;

public final class HttpRequestEntityProcessor {

    public static HttpRequestEntity process(final String[] arguments, ArgumentProcessor argumentProcessor) {
        final HttpRequestEntity httpRequestEntity = new HttpRequestEntity();
        httpRequestEntity.setUrl(arguments[0]);
        if (arguments.length > 1) {
            for (int index = 1; index < arguments.length; index++) {
                argumentProcessor.processArguments(arguments[index], httpRequestEntity);
            }

        } else {
            httpRequestEntity.setMethod(HttpMethods.GET);
        }
        return httpRequestEntity;
    }
}
