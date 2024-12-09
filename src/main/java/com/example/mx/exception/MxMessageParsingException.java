package com.example.mx.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Custom exception for handling message parsing errors.
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class MxMessageParsingException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * Constructor with detail message.
     *
     * @param message the detail message
     */
    public MxMessageParsingException(String message) {
        super(message);
    }

    /**
     * Constructor with detail message and cause.
     *
     * @param message the detail message
     * @param cause   the cause of the exception
     */
    public MxMessageParsingException(String message, Throwable cause) {
        super(message, cause);
    }
}