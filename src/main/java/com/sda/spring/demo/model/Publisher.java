package com.sda.spring.demo.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;

    @OneToMany(mappedBy = "publisher")                         // jeden wydawca moze miec wiele ksiazek
    private Set<Book> book;

//    public Publisher( String name, String address) {
//
//        this.name = name;
//        this.address = address;
//
//    }


    public Publisher(){

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    public Set<Book> getBook() {
//        return book;
//    }

    public void setBook(Set<Book> book) {
        this.book = book;
    }
}
