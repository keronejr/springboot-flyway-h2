package com.keopsdev.demospringflywayh2.persistence.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.keopsdev.demospringflywayh2.persistence.models.User;

public interface UserRepository extends CrudRepository<User, Long> {

	  List<User> findAll();
	  
	  List<User> findByName(String name);
 
	  User findById(long id);
	}
