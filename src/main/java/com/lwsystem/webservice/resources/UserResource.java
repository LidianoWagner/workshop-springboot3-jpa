package com.lwsystem.webservice.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lwsystem.webservice.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> finAll(){
		User u = new User(1L, "Lidiano", "lidiano@gmail.com", "47984284669", "1q2w3e4rL");
		return ResponseEntity.ok().body(u);
	}
}
