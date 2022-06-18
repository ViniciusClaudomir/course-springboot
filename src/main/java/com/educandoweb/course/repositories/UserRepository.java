package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.UserAccount;

public interface UserRepository extends JpaRepository<UserAccount, Long>{

	
	
	
	
}
