package com.httpclient;

import org.junit.Test;

public class HttpRequestValidatorTest {

    @Test
    public void shouldNotAllowWithNullArguments(){
        boolean isValid = HttpRequestValidator.isValid(null);
        assert !isValid;
    }

    @Test
    public void shouldNotAllowWithZeroArguments(){
        boolean isValid = HttpRequestValidator.isValid(new String[] {});
        assert !isValid;
    }

    @Test
    public void shouldAllowWithOneArguments(){
        boolean isValid = HttpRequestValidator.isValid(new String[] {"www.google.com"});
        assert isValid;
    }
}
