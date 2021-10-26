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
public class ProducerController {

	@Autowired
	UserDaoRepository udr;
	
	@PostMapping("/all")
	public User insertData(@RequestBody User u) {
		
		return udr.save(u);
	}
	
	@GetMapping("/all")
	public List<User> retirveData(){
		return udr.findAll();
	}
	
	@PutMapping("/all/{uid}")
	public String updatData(@RequestBody User u,@PathVariable int uid) {
		u.setUid(uid);
		udr.save(u);
		return "updated Successfully!!";
	}
	
	@DeleteMapping("/all/{uid}")
	public String deleteData(@PathVariable int uid) {
		udr.deleteById(uid);
		return "Deleted Successfully!!";
	}
}
