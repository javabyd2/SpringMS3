package com.sda.spring.demo.controller;

import com.sda.spring.demo.Service.*;
import com.sda.spring.demo.dto.UserDTO;
import com.sda.spring.demo.dto.UserPropDTO;
import com.sda.spring.demo.model.*;
import com.sda.spring.demo.repozytory.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;


@RestController
public class Controller {

    @Autowired
    private BookService bookService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private AuthorService authorService;

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;




    @RequestMapping(value = "/",method = RequestMethod.GET)
    public  String hello(){
        return "Hello world";
    }

    @RequestMapping(value = "/next",method =RequestMethod.GET)
    public List<Integer>myList(){

        List<Integer>newOne = new ArrayList<>();

        for(int i =0; i<550;i++){
            newOne.add(i);
        }
        return newOne;
    }

    @RequestMapping(value = "/number",method = RequestMethod.GET)
    public int compute(){
        Random random = new Random(30);
      return random.nextInt();
    }

    @RequestMapping(value = "/books",method = RequestMethod.GET)
    public List<Book>showBookList(){
        return bookService.getBooks();
    }

    @RequestMapping(value = "/category",method = RequestMethod.GET)
    public List<Category>showCategoriesList(){
        return categoryService.getCategory();
    }

    @RequestMapping(value = "/author",method = RequestMethod.GET)
    public  List<Author>showAuthor(){
        return authorService.getAuthor();
    }

    @RequestMapping(value = "/authors",method = RequestMethod.GET)
    public  List<Author>showAuthorByName(@RequestParam(value = "name")String name){
        return authorService.getAuthorByName(name);
    }

    @RequestMapping(value = "/category",method = RequestMethod.POST)
    public Category addCategory(@RequestBody Category category){
        return categoryService.save(category);

    }

    @RequestMapping(value = "/author",method = RequestMethod.POST)
    public Author addAuthor(@RequestBody Author author){
        return authorService.save(author);

    }

    @RequestMapping(value = "/book",method = RequestMethod.POST)
    public Book addBook(@RequestBody Book book){
        return bookService.save(book);

    }

    @RequestMapping(value = "/books/{id}",method = RequestMethod.GET)
    public ResponseEntity<Book> getBookById(@PathVariable Long id){
        return  ResponseEntity.status(HttpStatus.OK).body(bookService.getBookById(id));
    }

    @RequestMapping(value = "/author/{id}",method = RequestMethod.GET)
    public ResponseEntity<Author> getAuthorById(@PathVariable Long id){
        return  ResponseEntity.status(HttpStatus.OK).body(authorService.getAuthorById(id));
    }


    @RequestMapping(value = "/category/{id}",method = RequestMethod.GET)
    public  ResponseEntity<Category>getCategoryById(@PathVariable Long id){
        return  ResponseEntity.status(HttpStatus.OK).body(categoryService.getCategoryById(id));
    }


    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public List<User>showUserList(){
        return  userService.getUser();
    }

    @RequestMapping(value = "/roles",method = RequestMethod.GET)
    public List<Role>showRoleList(){
        return  roleService.getRole();
    }

    @RequestMapping(value = "/role",method = RequestMethod.POST)
    public Role addRole(@RequestBody Role role){
        return roleService.save(role);

    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public User addUser(@RequestBody User user){
        return userService.save(user);

    }


    @RequestMapping(value = "/users/{id}",method = RequestMethod.GET)
    public  ResponseEntity<UserDTO>getUserById(@PathVariable Long id){
        return  ResponseEntity.status(HttpStatus.OK).body(userService.getUserById(id));
    }


    @RequestMapping(value = "/usersNew",method = RequestMethod.GET)
    public List<UserPropDTO>showUsersProp(){
        return userService.getUsers();
    }

}
