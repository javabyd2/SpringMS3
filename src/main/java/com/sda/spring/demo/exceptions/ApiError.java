package com.sda.spring.demo.exceptions;

import org.springframework.http.HttpStatus;

import java.util.List;

public class ApiError {

    private HttpStatus httpStatus;
    private String message;
    private List<String> error;

    public ApiError(HttpStatus httpStatus, String message, List<String> error) {
        this.httpStatus = httpStatus;
        this.message = message;
        this.error = error;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getError() {
        return error;
    }

    public void setError(List<String> error) {
        this.error = error;
    }
}
