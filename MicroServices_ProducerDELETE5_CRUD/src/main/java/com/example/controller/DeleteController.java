package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.repository.UserDaoRepository;

@RestController
public class DeleteController {

	@Autowired
	UserDaoRepository udr;
	
	@DeleteMapping("/delete/{uid}")
	public ResponseEntity<String> deleteData(@PathVariable int uid){
		udr.deleteById(uid);
		return new ResponseEntity<String>("Deleted SuccessFully!!",HttpStatus.NO_CONTENT);
	}
}
