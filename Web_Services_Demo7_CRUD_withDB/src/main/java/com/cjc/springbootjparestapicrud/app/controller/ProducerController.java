package com.cjc.springbootjparestapicrud.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.springbootjparestapicrud.app.model.User;
import com.cjc.springbootjparestapicrud.app.repository.UserDaoRepository;

@RestController
public class ProducerController {
	
	@Autowired
	UserDaoRepository ud;

	//1 --> Insert Data
	
	@PostMapping("/users")
	public User insertData(@RequestBody User u) {
		
		return ud.save(u);
	}
	
	//2 --> Retrieve Data
	
	@GetMapping("/users")
	public List<User> retriveData(){
		return ud.findAll();
	}
	
	//3 --> Update Data
	
	@PutMapping("/users/{uid}")
	public String updateData(@RequestBody User u,@PathVariable int uid) {
		u.setUid(uid);
		ud.save(u);
		return "Data Updated Successfully!!";
	}
	
	//4 -->  Delete Data
	
	@DeleteMapping("/users/{uid}")
	public String deleteData(@PathVariable int uid) {
		ud.deleteById(uid);
		return "Data Deleted successfully";
	}
	
	
}
