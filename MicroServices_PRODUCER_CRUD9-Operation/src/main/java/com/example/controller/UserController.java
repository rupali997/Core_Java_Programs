package com.example.controller;

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

import com.example.Exception.UserNotFoundException;
import com.example.model.User;
import com.example.repository.UserDaoRepository;

@RestController
public class UserController {
	
	@Autowired
	UserDaoRepository udr;

	//1--->>Inserting Data
	
	@PostMapping("/user")
	public ResponseEntity<User> insertData(@RequestBody User u){
		return new ResponseEntity<User>(udr.save(u),HttpStatus.CREATED);
	}
	
	//2--->>Retrieve All Data
	
	@GetMapping("/user")
	public ResponseEntity<List<User>> getAllData(){
		return new ResponseEntity<List<User>>(udr.findAll(),HttpStatus.OK);
	}
	
	//3--->>Retrieve single Data by using uid

	@GetMapping("user/{uid}")
	public ResponseEntity<User> getSingleData(@PathVariable int uid) throws UserNotFoundException{
		User u1 = udr.findByUid(uid);
		if(u1==null){
			throw new UserNotFoundException("User does not exists!!");
		}
		else {
			return new ResponseEntity<User>(u1,HttpStatus.FOUND);
		}
	}
	
	//4--->>Retrieve single Data using username/password

	@GetMapping("/user/{username}/{password}")
	public ResponseEntity<User> getSingleData(@PathVariable String username,@PathVariable String password) throws UserNotFoundException{
		User u1 = udr.findByUsernameAndPassword(username,password);
		if(u1==null){
			throw new UserNotFoundException("User does not exists!!");
		}
		else {
			return new ResponseEntity<User>(u1,HttpStatus.FOUND);
		}
	}
	
	//5--->>Update single Data

	@PutMapping("/user")
	public ResponseEntity<User> updateData(@RequestBody User u){
		User u1 = udr.findByUid(u.getUid());
		if(u1==null) {
			return new ResponseEntity<User>(udr.save(u),HttpStatus.CREATED);
		}
		else {
			return new ResponseEntity<User>(udr.save(u),HttpStatus.ACCEPTED);

		}
	}
	
	//6--->>Delete Data

	@DeleteMapping("/{uid}")
	public ResponseEntity<String> deleteData(@PathVariable int uid){
		User u1 = udr.findByUid(uid);
		if(u1==null){
			throw new UserNotFoundException("User does not exists!!");
		}
		else {
			udr.delete(u1);
			return new ResponseEntity<String>("Delete Successfully!!",HttpStatus.NOT_FOUND);
		}
		
	}
}
