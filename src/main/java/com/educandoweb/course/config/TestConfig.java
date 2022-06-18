package com.educandoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.UserAccount;
import com.educandoweb.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired /* informa que a variavel a seguie é uma dependencia do projeto */
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		UserAccount u1 = new UserAccount(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		UserAccount u2 = new UserAccount(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
	
	
	
	
}
