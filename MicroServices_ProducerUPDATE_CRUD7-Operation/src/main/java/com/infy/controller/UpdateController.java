package com.infy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.model.User;
import com.infy.repository.UserDaoRepository;

@RestController
public class UpdateController {
	
	@Autowired
	UserDaoRepository udr;
	

	@PutMapping("/user")
	private ResponseEntity<String> updateData(@RequestBody User u){
		
		User u1 = udr.findByUid(u.getUid());
		if(u1!=null) {
			udr.save(u1);
			return new ResponseEntity<String>("Updated Successfully!!! ID : "+u.getUid(),HttpStatus.ACCEPTED);
		}else {
			udr.save(u1);
			return new ResponseEntity<String>("Added Successfully!!! ID : "+u.getUid(),HttpStatus.CREATED);
 
		}
	}
}
