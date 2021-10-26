package com.springbootjparestapicrud.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootjparestapicrud.app.model.User;
import com.springbootjparestapicrud.app.service_Interface.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService us;

	@PostMapping("/users")
	public User insertData(@RequestBody User u) {
		return us.saveData(u);
		
	}
	
	@GetMapping("/users")
	public List<User> fetchData(){
		return us.getAllUser();
		
	}
	
	@GetMapping("/users/{uid}")
	public User fetchSingleData(@PathVariable int uid) {
		return us.getSingleUser(uid);
	}
}
