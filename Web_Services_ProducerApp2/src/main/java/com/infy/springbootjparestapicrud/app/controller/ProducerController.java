package com.infy.springbootjparestapicrud.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.springbootjparestapicrud.app.model.User;
import com.infy.springbootjparestapicrud.app.repository.UserDaoRepository;

@RestController
public class ProducerController {
	
	@Autowired
	UserDaoRepository ud;
	
	//1. Adding Data
	
	@PostMapping("/users")
	public User insertData(@RequestBody User u) {
		return ud.save(u);
	}

	@GetMapping("/users")
	public List<User> fetchData(){
		
		return ud.findAll();
	}
	
	@PutMapping("/users/{uid}")
	public String updateData(@RequestBody User u,@PathVariable int uid) {
		ud.save(u);
		return "Updated Successfully!!";
	}
	
	
	@DeleteMapping("/users/{uid}")
	public String deleteData(@PathVariable int uid) {
		ud.deleteById(uid);
		return "Successfully deleted!!";
	}
}
