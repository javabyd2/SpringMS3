package com.sda.spring.demo.Service;


import com.sda.spring.demo.exceptions.CategoryNotFoundException;
import com.sda.spring.demo.model.Category;
import com.sda.spring.demo.repozytory.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

//    @Autowired
//    public CategoryService(CategoryRepository categoryRepository) {
//        this.categoryRepository=categoryRepository;
//    }

    public List<Category>getCategory(){
        return categoryRepository.findAll();
    }

    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    public Category getCategoryById(Long id) {
        Category category = categoryRepository.findById(id).orElseThrow(()->new CategoryNotFoundException(id));
        return  category;
    }
}
