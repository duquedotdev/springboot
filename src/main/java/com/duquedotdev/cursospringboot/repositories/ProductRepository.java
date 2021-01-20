package com.duquedotdev.cursospringboot.repositories;

import com.duquedotdev.cursospringboot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
