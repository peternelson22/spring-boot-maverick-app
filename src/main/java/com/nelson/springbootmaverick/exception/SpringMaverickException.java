package com.nelson.springbootmaverick.exception;

public class SpringMaverickException extends RuntimeException {

    public SpringMaverickException(String exMessage, Exception exception) {
        super(exMessage, exception);
    }

    public SpringMaverickException(String exMessage) {
        super(exMessage);
    }
}
