package com.sda.spring.demo.Service;


import com.sda.spring.demo.exceptions.AuthorNotFoundException;
import com.sda.spring.demo.model.Author;
import com.sda.spring.demo.model.Category;
import com.sda.spring.demo.repozytory.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;


    public List<Author> getAuthor(){
        return authorRepository.findAll();
    }

    public List<Author> getAuthorByName(String name){
        return authorRepository.findByName(name);
    }

    public Author save(Author author) {
        return authorRepository.save(author);
    }

    public Author getAuthorById(Long id) {
        Author author = authorRepository.findById(id).orElseThrow(()->new AuthorNotFoundException(id));
        return  author;
    }
}
