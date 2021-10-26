package com.infy.springbootjpacrud.consumerapp.controller;

import java.util.List;

import org.assertj.core.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.infy.springbootjpacrud.consumerapp.model.User;

@CrossOrigin("*")
@RestController
public class ConsumerController {

	@Autowired
	private RestTemplate restTemp;
	
	@GetMapping("/fetchAllData")
	public List<User> retriveData(){
//		String url = "http://localhost:8282/all";
		
		List<User> lis = restTemp.getForObject("http://localhost:8282/all", List.class);
		return lis;
	}
	
	
	@PostMapping("/addData")
	public User insertData(@RequestBody User u) {
		
		User u1 =  restTemp.postForObject("http://localhost:8282/all", u, User.class);
		return u1;
	}
	
	@PutMapping("/updateData/{uid}")
	public String updateData(@RequestBody User u,@PathVariable int uid) {
		restTemp.put("http://localhost:8282/all/"+uid+"", u, User.class);
		return "Updated SuccessFully!";
	}
	
	@DeleteMapping("/deleteData/{uid}")
	public String deleteData(@PathVariable int uid) {
		restTemp.delete("http://localhost:8282/all/"+uid+"");
		return "Delete Data Successfully!!";
	}
}
