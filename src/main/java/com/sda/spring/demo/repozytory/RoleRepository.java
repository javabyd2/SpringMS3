package com.sda.spring.demo.repozytory;

import com.sda.spring.demo.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
