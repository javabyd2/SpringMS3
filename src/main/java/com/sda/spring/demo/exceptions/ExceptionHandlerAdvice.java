package com.sda.spring.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Arrays;

@ControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(BookNotFoundException.class)
    public ResponseEntity handleException(BookNotFoundException e){
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(new ApiError(HttpStatus.NOT_FOUND,"Nie znaleziono recordu",
                Arrays.asList("test","test2")));
    }


    @ExceptionHandler(AuthorNotFoundException.class)
    public  ResponseEntity handleException(AuthorNotFoundException e){
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(new ApiError(HttpStatus.NOT_FOUND,e.getMessage(),
                        Arrays.asList("test","test2")));
    }

    @ExceptionHandler(CategoryNotFoundException.class)
    public  ResponseEntity handleException(CategoryNotFoundException e){
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(new ApiError(HttpStatus.NOT_FOUND,e.getMessage(),
                        Arrays.asList("test","test2")));
    }

}
