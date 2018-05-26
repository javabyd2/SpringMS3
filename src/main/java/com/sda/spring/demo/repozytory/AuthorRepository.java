package com.sda.spring.demo.repozytory;

import com.sda.spring.demo.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author,Long> {
    public List<Author> findByName(String name);
}
