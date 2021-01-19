package com.duquedotdev.cursospringboot.repositories;

import com.duquedotdev.cursospringboot.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
