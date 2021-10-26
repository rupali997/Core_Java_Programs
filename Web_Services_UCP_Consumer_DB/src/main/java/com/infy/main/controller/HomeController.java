package com.infy.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.infy.main.model.User;
@CrossOrigin("*")
@RestController
public class HomeController {
	
	@Bean
	RestTemplate abc() {
		
		return new RestTemplate();
	}
	
	@Autowired
	RestTemplate rsttmp;
	
	@GetMapping("/consumer")
	public List getAllData() {
		List list = rsttmp.getForObject("http://localhost:2222/user", List.class);
		
		return list;
	}
	
	@PostMapping("/consumer")
	public User saveData(@RequestBody User u) {
		User user = rsttmp.postForObject("http://localhost:2222/user", u,User.class);
		
		return user;
	}
	
	@PutMapping("/consumer")
	public List updateData(@RequestBody User u) {
		rsttmp.put("http://localhost:2525/user", u);
		
		return rsttmp.getForObject("http://localhost:2222/user", List.class);
	}
	
	
	@DeleteMapping("/consumer/{uid}")
	public List deleteData(@PathVariable int uid) {
		rsttmp.delete("http://localhost:2222/user/{uid}", uid);
		return rsttmp.getForObject("http://localhost:2525/user", List.class);
	}
	
	@GetMapping("/consumer/{username}/{password}")
	public List getDatabyUsAndPs(@PathVariable String username,@PathVariable String password) {
		System.out.println("Consumer    :  "+username   +    "      "+password);
		List u=rsttmp.getForObject("http://localhost:2222/user/{username}/{password}", List.class, username,password);
		return u;
	}
	
	

}
