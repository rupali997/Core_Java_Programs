package com.infy.springbootjpaproducer.app.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.springbootjpaproducer.app.model.User;
import com.infy.springbootjpaproducer.app.repository.UserDaoRepository;

@RestController
public class ProducerController {

	@Autowired
	UserDaoRepository udr;
	
	@PostMapping("/all")
	public ResponseEntity<User> insertData(@RequestBody User u) {
		User u1 = udr.save(u);
		return new ResponseEntity<User>(u1,HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<User>> retirveData(){
		return new ResponseEntity<List<User>>(udr.findAll(),HttpStatus.OK);
	}
	
	@PutMapping("/all/{uid}")
	public ResponseEntity<User> updatData(@RequestBody User u,@PathVariable int uid) {
		u.setUid(uid);
		
		return new ResponseEntity<User>(udr.save(u),HttpStatus.OK);
	}
	
	@DeleteMapping("/all/{uid}")
	public ResponseEntity<String> deleteData(@PathVariable int uid) {
		udr.deleteById(uid);
		return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
	}
	

}
