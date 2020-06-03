package com.keopsdev.demospringflywayh2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.keopsdev.demospringflywayh2.persistence.models.User;
import com.keopsdev.demospringflywayh2.persistence.repositories.UserRepository;

@RestController
public class FlywayController {

	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/sayHello")
	public String sayHello() {
		return "Helloooooooo!";
	}

	@GetMapping("findUsers")
	public List<User> findUsers() {
		return userRepository.findAll(); 
	}
	
}
