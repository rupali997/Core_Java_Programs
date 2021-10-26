package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.model.User;

@RestController
public class UserController {

	@Autowired
	RestTemplate restTemp;
	
	
	//GetMapping
	@GetMapping("/getConsumerData")
	public List<User> getAllUser(){
		String url ="http://localhost:8989/users";
		List<User> elist = restTemp.getForObject(url, List.class);
		return elist;
	}
	
	@PostMapping("/saveConsumerData")
	public User saveData(@RequestBody User u) {
		String url ="http://localhost:8989/users";
		User us = restTemp.postForObject(url, u, User.class);
		return us;
	}
	
	@DeleteMapping("/deleteConsumerData/{uid}")
	public String deleteUser(@PathVariable int uid) {
		String url = "http://localhost:8989/users/"+uid+"";
		 restTemp.delete(url, uid);
		 return "deleted success!!";
	}
	
	@PutMapping("/updateConsumerData/{uid}")
	public String updateUser(@RequestBody User u,@PathVariable int uid) {
		String url = "http://localhost:8989/users/"+uid+"";
		
		restTemp.put(url, u, User.class);
		return "updated successfully!!";
		

	}
	
}
