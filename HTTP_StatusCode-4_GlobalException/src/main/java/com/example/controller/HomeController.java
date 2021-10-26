package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.service_Interface.UserService;

@RestController
public class HomeController {
	
	@Autowired
	UserService us;

	@PostMapping("/users")
	public ResponseEntity<User> insertData(@RequestBody User u){
		return us.inserdata(u);
	}
}
