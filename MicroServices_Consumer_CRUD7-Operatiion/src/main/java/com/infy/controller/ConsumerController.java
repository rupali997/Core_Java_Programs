package com.infy.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.infy.Exception.UserNotFoundException;
import com.infy.model.User;

@RestController
public class ConsumerController {
	
	@LoadBalanced
	@Bean
	public RestTemplate rt() {
		return new RestTemplate();
	}
	
	

	@Autowired
	RestTemplate rt;
	
	@PostMapping("/concreate")
	public ResponseEntity<String> addData(@RequestBody List<User> lis){
		List u1 = rt.postForObject("http://localhost:2222/user",lis, List.class);
		return new ResponseEntity<String>("data added :"+u1.size(),HttpStatus.CREATED);
	}
	
	
	@PostMapping("/consume")
	public ResponseEntity<User> insertData(@RequestBody User u){
		
	User u1 = rt.postForObject("http://localhost:2222/user",u,User.class);
	return new ResponseEntity<User>(u1,HttpStatus.CREATED);
	}
	
	@GetMapping("/confetch")
	public ResponseEntity<List<User>> getData(){
		
		return new ResponseEntity<List<User>>(rt.getForObject("http://localhost:1111/user", List.class),HttpStatus.OK);
	}
	
	@GetMapping("/confetch/{uid}")
	public ResponseEntity<User> getSingleData(@PathVariable int uid){
		
		User u1 = rt.getForObject("http://localhost:1111/user/"+uid+"",User.class);
		if(u1==null) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}else {
			return new ResponseEntity<User>(u1,HttpStatus.FOUND);
		}
		
	}
	
	@PutMapping("/conupdate")
	public ResponseEntity<String> updateData(@RequestBody User u){
		User u1 = rt.getForObject("http://localhost:1111/user/{uid}",User.class,u.getUid());
		if(u1!=null) {
			rt.put("http://localhost:3333/user", u);
			return new ResponseEntity<String>("Data Updated for UID : "+u.getUid(),HttpStatus.ACCEPTED );
		}
		else {
			rt.put("http://localhost:3333/user", u);
			return new ResponseEntity<String>("Data Added of UID : "+u.getUid(),HttpStatus.CREATED );

		}

	}
	
	@DeleteMapping("/condelete/{uid}")
	public ResponseEntity<String> deleteData(@PathVariable int uid){
		User u1 = rt.getForObject("http://localhost:1111/user/{uid}",User.class,uid);
		if(u1!=null) {
			Map<String,String> param = new HashMap<>();
			param.put("id", "uid");
			rt.delete("http://localhost:4444//user/"+uid+"",param);
			return new ResponseEntity<String>("Delete Successfully : "+uid,HttpStatus.NO_CONTENT);
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

	}

	
	// Zuul server
	@GetMapping("/confetchzuuldata")
	public ResponseEntity<List<User>> getDatathroughzuul(){
		
		return new ResponseEntity<List<User>>(rt.getForObject("http://zuul-server/getfetch", List.class),HttpStatus.OK);
	}
	
}
