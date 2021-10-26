package com.infy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.infy.repository.UserDaoRepository;

@RestController
public class DeleteController {
	@Autowired
	UserDaoRepository udr;

	@DeleteMapping("/user/{uid}")
	public ResponseEntity<String> deleteData(@PathVariable int uid){
		 udr.deleteById(uid);
		
		return new ResponseEntity<String>("Delete Successfully!!",HttpStatus.NO_CONTENT);
	}
	
}
