package com.sda.spring.demo.repozytory;

import com.sda.spring.demo.model.Book;
import com.sda.spring.demo.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
    public Book findByTitle(String title);

}
