package com.sda.spring.demo.exceptions;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(Long id){
        super("I can not find the book "+ id);
    }
}
