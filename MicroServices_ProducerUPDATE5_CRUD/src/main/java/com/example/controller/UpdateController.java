package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.exception.UserNotFoundException;
import com.example.model.User;
import com.example.repository.UserDaoRepository;

@RestController
public class UpdateController {
	
	@Autowired
	UserDaoRepository udr;
	
//	@PutMapping("/update/{uid}")
//	public ResponseEntity<User> updateData(@RequestBody User u,@PathVariable int uid) throws UserNotFoundException{
//		
//		User u1 = udr.findAllUserByUid(uid);
//		if(u1!=null) {
//			u.setUid(uid);
//			return new ResponseEntity<User>(udr.save(u),HttpStatus.OK);
//		}
//		else {
//			return new ResponseEntity<User>(udr.save(u),HttpStatus.CREATED);
//		}
//	
	@PutMapping("/update")
	public ResponseEntity<User> updateData(@RequestBody User u){
	
		User user = udr.findAllUserByUid(u.getUid());
		if(user!=null) {
			user.setUid(u.getUid());
			return new ResponseEntity<User>(udr.save(u),HttpStatus.OK);
		}
		else {

					return new ResponseEntity<User>(udr.save(u),HttpStatus.CREATED);
		}

		
		
		
		
		
	
	// @formatter:on
}
	

}
