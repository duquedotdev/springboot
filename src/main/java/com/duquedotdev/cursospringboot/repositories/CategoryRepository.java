package com.duquedotdev.cursospringboot.repositories;

import com.duquedotdev.cursospringboot.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
