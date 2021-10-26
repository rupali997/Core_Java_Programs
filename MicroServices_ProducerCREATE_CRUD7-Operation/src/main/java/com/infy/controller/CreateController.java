package com.infy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.model.User;
import com.infy.repository.UserDaoRepository;

@RestController
public class CreateController {
	
	@Autowired
	UserDaoRepository udr;

	@PostMapping("/user")
	public ResponseEntity<String> addData(@RequestBody List<User> lis){
		
		udr.saveAll(lis);
		return new ResponseEntity<String>("Number of Data Added : "+lis.size(),HttpStatus.CREATED);	
		
	}
}
