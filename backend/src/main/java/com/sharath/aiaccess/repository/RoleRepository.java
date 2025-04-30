package com.sharath.aiaccess.repository;

import com.sharath.aiaccess.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Long> {
 Optional<Role> findbyName(String name);
} 
