package com.duquedotdev.cursospringboot.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.duquedotdev.cursospringboot.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Felipe Duque", "felipe@duque.dev", "999", "3PAYDE75fd");
		return ResponseEntity.ok().body(u);
	}
	
}
