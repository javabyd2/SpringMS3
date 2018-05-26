package com.sda.spring.demo.controller;


import com.sda.spring.demo.Service.AuthorService;
import com.sda.spring.demo.Service.BookService;
import com.sda.spring.demo.Service.RoleService;
import com.sda.spring.demo.Service.UserService;
import com.sda.spring.demo.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class webController {

    @Autowired
    private AuthorService authorService;

    @Autowired
    private UserService userService;

    @Autowired
    private BookService bookService;

    @Autowired
    private RoleService roleService;

    @GetMapping(value = "/index")
    public ModelAndView index(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @GetMapping(value ="/web/authors")
    public  ModelAndView authors(){


        ModelAndView modelAndView = new ModelAndView();
        modelAndView.                                                //adds list of authors
                addObject(
                        "authorsList",
                        authorService.getAuthor()
                );
        modelAndView.setViewName("authors");
        return  modelAndView;
    }


    @GetMapping(value = "/web/users")
    public ModelAndView users(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.
                addObject("usersList",
                        userService.getUsers()
                );
        modelAndView.setViewName("users");
        return modelAndView;
    }


    @GetMapping(value = "/web/books")
    public  ModelAndView books(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.
                addObject("booksList",
                        bookService.getBooks()
                        );
        modelAndView.setViewName("books");
        return modelAndView;
    }

    @PostMapping(value = "/web/addRole")
    public String addRole(@ModelAttribute("role")Role role,
                          RedirectAttributes redirectAttributes){
        roleService.save(role);
        redirectAttributes.addFlashAttribute("message","added successfully");

        return "redirect:/web/roleForm";
    }

    @GetMapping(value = "/web/roleForm")
    public  ModelAndView roleForm(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("roleForm");
        modelAndView.addObject("role",new Role());

        return modelAndView;
    }


}
