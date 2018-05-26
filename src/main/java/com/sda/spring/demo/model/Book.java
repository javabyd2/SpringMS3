package com.sda.spring.demo.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_book")
    private  Long id;
    private String title;
    //private String author;
    //private int isbn;


    @ManyToOne(cascade = CascadeType.MERGE)
    private Category bookCategory;

    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(joinColumns =
    @JoinColumn(name = "book_id"),
            inverseJoinColumns =
            @JoinColumn(name = "author_id"))
    private Set<Author> bookAuthors;


    @ManyToOne
    private Publisher publisher;

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Category getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(Category bookCategory) {
        this.bookCategory = bookCategory;
    }

    public Set<Author> getBookAuthors() {
        return bookAuthors;
    }

    public void setBookAuthors(Set<Author> bookAuthors) {
        this.bookAuthors = bookAuthors;
    }

    public Book(String title, Category bookCategory, Set<Author> bookAuthors) {
        this.title = title;
        this.bookCategory = bookCategory;
        this.bookAuthors = bookAuthors;

    }

//    public int getIsbn() {
//        return isbn;
//    }
//
//    public void setIsbn(int isbn) {
//        this.isbn = isbn;
//    }

    public Book(){

    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }

}
