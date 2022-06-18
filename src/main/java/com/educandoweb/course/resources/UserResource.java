package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.UserAccount;

@RestController
@RequestMapping(value = "/users")
public class UserResource  {
	
	@GetMapping
	public ResponseEntity<UserAccount> findAll() {
		
		UserAccount u = new UserAccount(1L, "Maria", "maria@gmail.com", "999999999", "12345");
		
		return ResponseEntity.ok().body(u);
	}
}
