package com.duquedotdev.cursospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.duquedotdev.cursospringboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
