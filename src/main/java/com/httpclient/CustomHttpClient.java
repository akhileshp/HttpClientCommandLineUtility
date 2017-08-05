package com.httpclient;

public class CustomHttpClient {

    final String[] arguments;

    public CustomHttpClient(String[] arguments) {
        this.arguments = arguments;
    }

    public CustomHttpResponse execute() {
        if (HttpRequestValidator.isValid(arguments)) {
            final String url = arguments[0];
            final HttpMethods httpMethod;
            if (arguments.length == 1) {
                httpMethod = HttpMethods.GET;
            } else {
                httpMethod = HttpMethods.getMethod(arguments[1].trim());
            }
            HttpMethodExecutor httpMethodExecutor = HttpMethodFactory.getInstance(httpMethod);
            return httpMethodExecutor.execute(url);
        }
        return null;

    }


    public static void main(String[] args) {
        CustomHttpResponse customHttpResponse = new CustomHttpClient(args).execute();
        System.out.println(customHttpResponse.getStatusCode());
    }


}
