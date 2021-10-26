package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;

@RestController
public class HomeController {
	
	@RequestMapping("/getAllData")
	public User preLogin() {
		
		User u = new User();
		u.setUid(101);
		u.setName("Rupali");
		u.setAddress("pune");
		return u;
	}

	 
}
