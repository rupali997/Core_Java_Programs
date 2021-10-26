package com.infy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.Exception.UserNotFoundException;
import com.infy.model.User;
import com.infy.repository.UserDaoRepository;

@RestController
public class SelectController {
	
	@Autowired
	UserDaoRepository udr;

	@GetMapping("/user")
	public ResponseEntity<List<User>> getAllData(){
		return new ResponseEntity<List<User>>(udr.findAll(),HttpStatus.OK);
	}
	
	
	@GetMapping("/user/{uid}")
	public ResponseEntity<User> getAllDataID(@PathVariable int uid) throws UserNotFoundException{
		
		User u1 = udr.findByUid(uid);
		if(u1!=null) {
			return new ResponseEntity<User>(u1,HttpStatus.OK);
		}
		else {
			throw new UserNotFoundException("User does not exists in our database record!!");
		}
	}
	
	@GetMapping("/user/{username}/{password}")
	public ResponseEntity<User> getAllDataUsernameAndPassword(@PathVariable String username, @PathVariable String password){
		
		User u1 = udr.findByUsernameAndPassword(username,password);
		if(u1!=null) {
			return new ResponseEntity<User>(u1,HttpStatus.OK);

		}else {
			throw new UserNotFoundException("User does not exists in our database record!!");
		}
	}
	
	
}
