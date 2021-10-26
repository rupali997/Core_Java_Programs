package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.repository.UserDaoRepository;

@RestController
public class CreateController {

	@Autowired
	UserDaoRepository udr;
	@PostMapping("/insert")
	public ResponseEntity<User> insertData(@RequestBody User u){
		return new ResponseEntity<User>(udr.save(u),HttpStatus.CREATED);
		
	}
}
