package com.httpclient;


import java.util.Map;
import java.util.TreeMap;

public class ArgumentProcessor {
    private final Map<String, RequestArgumentProcessor> argumentProcessorMap;

    public ArgumentProcessor() {
        argumentProcessorMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    }

    public void processArguments(final String argument,
                                 final HttpRequestEntity httpRequestEntity) {
        String[] argumentTokens = argument.split(":");
        final String firstToken = argumentTokens[0];
        argumentProcessorMap.get(firstToken).process(argumentTokens[1], httpRequestEntity);

    }

    public void addProcessor(String argumentPrefix, RequestArgumentProcessor argumentProcessor) {
        argumentProcessorMap.put(argumentPrefix, argumentProcessor);
    }


}
