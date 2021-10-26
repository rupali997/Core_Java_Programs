package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.exception.UserNotFoundException;
import com.example.model.User;
import com.example.repository.UserDaoRepository;

@RestController
public class SelectController {

	@Autowired
	UserDaoRepository udr;
	
	@GetMapping("/retrive")
	public ResponseEntity<List<User>> getData(){
		
		List<User> lis = udr.findAll();
		if(lis.size()<=0) {
			
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return new ResponseEntity<List<User>>(udr.findAll(),HttpStatus.OK);
	}
	
	@GetMapping("/retrive/{uid}")
	public ResponseEntity<User> getSingleData(@PathVariable int uid) throws UserNotFoundException{
		
		User u1 = udr.findAllUserByUid(uid);
		if(u1!=null) {
			return new ResponseEntity<User>(u1,HttpStatus.OK);
		}
		else {
			throw new UserNotFoundException("User does not exists!!");
		}
	}
	
	@ExceptionHandler
	public ResponseEntity<String> userExceptionHandler(UserNotFoundException e) {
		System.out.println("User not found handler method!");
		return new ResponseEntity<String>(e.getMessage(),HttpStatus.NOT_FOUND);
	}
}
