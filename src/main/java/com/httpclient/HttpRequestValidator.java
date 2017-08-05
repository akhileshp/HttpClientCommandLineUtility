package com.httpclient;

public final class HttpRequestValidator {
    public static boolean isValid(String[] arguments) {
        return arguments != null && arguments.length > 0;

    }
}
