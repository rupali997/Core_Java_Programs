package com.infy.springbootjpaproducer.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
public class UserController {
	
	@Autowired
	UserDaoRepository ud;

	@PostMapping("/users")//http://localhost:8989/users
	public User insertData(@RequestBody User u) {
		return ud.save(u);
		}
	
	
	@GetMapping("/users")//http://localhost:8989/users
	public List<User> fetchData(){
		return ud.findAll();
	}
	
	@PutMapping("/users/{uid}")//http://localhost:8989/users/103
	public User updateData(@PathVariable int uid,@RequestBody User u) {
		u.setUid(uid);
		
		return ud.save(u);
		
	}
	
	@DeleteMapping("/users/{uid}")//http://localhost:8989/users/103
	public String deleteUser(@PathVariable int uid) {
		ud.deleteById(uid);
		return "Deleted successfully!";
		
	}
}
