package com.grosstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.grosstore.domain.User;

public interface UserRepository extends CrudRepository <User, Long>{
	
	User findByUsername(String username);

}
