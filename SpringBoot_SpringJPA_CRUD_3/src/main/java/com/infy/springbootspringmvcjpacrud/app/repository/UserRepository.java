package com.infy.springbootspringmvcjpacrud.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infy.springbootspringmvcjpacrud.app.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	
}
