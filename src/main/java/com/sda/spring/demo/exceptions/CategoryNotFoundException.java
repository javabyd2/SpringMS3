package com.sda.spring.demo.exceptions;

public class CategoryNotFoundException extends  RuntimeException{

    public CategoryNotFoundException(Long id){
        super("I can not find the Category "+ id);
    }
}
