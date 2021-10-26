package com.infy.springbootjpaproducer.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.springbootjpaproducer.app.model.User;

@Repository
public interface UserDaoRepository  extends JpaRepository<User, Integer>{

	
	
}
