package com.sda.spring.demo.Service;


import com.sda.spring.demo.exceptions.BookNotFoundException;
import com.sda.spring.demo.model.Book;
import com.sda.spring.demo.repozytory.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> getBooks(){

//        dodatkowa logika
        return bookRepository.findAll();
    }

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public  Book getBookById(Long id) {
        Book  book = bookRepository.findById(id).orElseThrow(()->new BookNotFoundException(id));

        return book;
    }



}
