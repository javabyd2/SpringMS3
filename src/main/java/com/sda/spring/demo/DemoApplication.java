package com.sda.spring.demo;

import com.sda.spring.demo.model.Author;
import com.sda.spring.demo.model.Book;
import com.sda.spring.demo.model.Category;
import com.sda.spring.demo.repozytory.BookRepository;
import com.sda.spring.demo.repozytory.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	public BookRepository bookRepository;


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("this is a test");


		Book book4=bookRepository.findByTitle("Przygoda");


//		Book book = new Book("Przygoda","Jan Kowalski");
//		bookRepository.save(book);
//
//
//		Category category = new Category("Horror");
//		categoryRepository.save(category);

//        Set<Author> authors = new HashSet<Author>();
//        authors.add(new Author("Jan", "Kowalski"));
//        authors.add(new Author("Zbigniew", "Nowak"));
//        Category category = new Category("Lektury szkolne");
//
//        Book book = new Book("Przygoda", category, authors);
//        bookRepository.save(book);
//
//        authors.clear();
//        //Set<Author>authors1= new HashSet<Author>();
//        authors.add(new Author("Mark","Bula"));
//        authors.add(new Author("Samantha","Kiel"));
//        Category category1 = new Category("Comedy");
//
//
//        Book book2 = new Book("Holiday",category1,authors);
//        bookRepository.save(book2);
//
//        authors.clear();
//
//        authors.add(new Author("Mark","Bula"));
//        authors.add(new Author("Samantha","Kiel"));
//        Category category2 = new Category("Comedy");
//
//        Book book3 = new Book("Holiday",category2,authors);
//        bookRepository.save(book3);

	}
}
