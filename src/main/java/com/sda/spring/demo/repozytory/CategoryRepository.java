package com.sda.spring.demo.repozytory;

import com.sda.spring.demo.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {

    public  Category findByName(String name);

}
