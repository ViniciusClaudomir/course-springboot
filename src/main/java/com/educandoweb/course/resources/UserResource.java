package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.UserAccount;
import com.educandoweb.course.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource  {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public ResponseEntity<List<UserAccount>> findAll() {
		
		List<UserAccount> listWithAllUsers = userService.findAll();
		
		return ResponseEntity.ok().body(listWithAllUsers);
	}
	
	@GetMapping
	@RequestMapping(value = "/{id}")
	public ResponseEntity<UserAccount> findById(@PathVariable Long id) {
		
		UserAccount UserProvideDatabase = userService.findByid(id);
		
		return ResponseEntity.ok().body(UserProvideDatabase);
	}
}
