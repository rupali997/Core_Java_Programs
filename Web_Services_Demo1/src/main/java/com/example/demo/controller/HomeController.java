package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service_Interface.UserService;

@RestController
public class HomeController {
	@Autowired
	UserService us;

	@RequestMapping("/")
	public List<User> preLogin() {
		List<User> lis = new ArrayList<>();
		lis.add(new User(101,"Rupali","Pune"));
		lis.add(new User(102,"Daksha","Pune"));
		
		return lis;
	}
	
	@RequestMapping("/api/data")
	public List<User> userData(@ModelAttribute User u) {
		User u1 = new User();
		u1.setUid(101);
		u1.setUname("kalash");
		u1.setAddress("Nagpur");
		List<User> lis = new ArrayList<>();
		lis.add(u1);
		
		return lis;
	}
}
