package com.sda.spring.demo.model;


import javax.persistence.*;
import java.util.Set;

@Entity
public class Author {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastname;

    @ManyToMany(mappedBy = "bookAuthors")
    private Set<Book> books;

//    public Set<Book> getBooks() {
//        return books;
//    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Author(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public Author(){

    }
}
