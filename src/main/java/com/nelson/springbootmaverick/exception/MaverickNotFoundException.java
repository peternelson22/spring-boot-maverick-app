package com.nelson.springbootmaverick.exception;

public class MaverickNotFoundException extends RuntimeException {

    public MaverickNotFoundException(String message) {
        super(message);
    }
}
