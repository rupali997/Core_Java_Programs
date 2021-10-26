package com.infy.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.main.model.User;
import com.infy.main.servicei.HomeServiceI;

@RestController
public class UserController {
	@Autowired
	HomeServiceI hs;
	
	@RequestMapping("/user")
	public List<User> prelogin(){
		List<User> l=hs.getAllDataFromUser();
		
		
		return l;
	}
	
	@PostMapping("/user")
	public User saveData(@RequestBody User u) {
		
		User u1=hs.saveDataUser(u);
		
		return u1;
	}
	
	@DeleteMapping("/user/{uid}")
	public List deleteData(@PathVariable int uid) {
		hs.deleteDataById(uid);
		
		return hs.getAllDataFromUser();
	}
	
	@PutMapping("/user")
	public User UpdateData(@RequestBody User u) {
		User u1=hs.saveDataUser(u);
		return u1;
	}
	
	
	@GetMapping("/user/{username}/{password}")
	public List getdatabyUsbyPs(@PathVariable String username, @PathVariable String password) {
		System.out.println("Producer   :   "+username+"      "+password);
		
		List us=hs.getDataByusAndPs(username,password);
		
		return us;
		
	}
	
	
	
	
	
}
