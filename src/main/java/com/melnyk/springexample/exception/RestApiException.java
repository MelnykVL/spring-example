package com.melnyk.springexample.exception;

public class RestApiException extends RuntimeException {
    public RestApiException(String message) {
        super(message);
    }
}
