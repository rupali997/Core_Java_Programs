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
import org.springframework.web.client.RestTemplate;

import com.infy.springbootjparestapicrud.app.model.User;

@RestController

public class ConsumerController {
	
	@Autowired
	RestTemplate restTemp;
	
	
	
	@GetMapping("/getConsumer")
	public List<User> fetchData(){
		String url = "http://localhost:8787/users";
		List<User> ulist = restTemp.getForObject(url, List.class);
		return ulist;
	}
	
	
	@PostMapping("/insertConsumer")
	public User saveData(@RequestBody User u) {
		
		String url = "http://localhost:8787/users";
		
		User u1 = restTemp.postForObject(url, u, User.class);
		return u1;
		
	}

	@PutMapping("/updateData/{uid}")
	public String upateData(@RequestBody User u, @PathVariable int uid) {
		String url = "http://localhost:8787/users/"+uid+"";
		restTemp.put(url, u, User.class);
		
		return "Updated Successfully!!";
		
			
	}
	
	@DeleteMapping("/deleteData/{uid}")
	public String deleteData(@PathVariable int uid){
		String url = "http://localhost:8787/users/"+uid+"";
		restTemp.delete(url);
		return "Successfully Deleted Data!!";
	}
	
	
	
	
	
}
