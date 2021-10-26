package com.example.controller;

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

import com.example.Exception.UserNotFoundException;
import com.example.model.User;

@RestController
public class ConsumerController {

	// @LoadBalanced
	@Bean
	public RestTemplate rt() {
		return new RestTemplate();
	}

	@Autowired
	RestTemplate restTemp;

	@PostMapping("/consume")
	public ResponseEntity<User> addData(@RequestBody User u) {
		return new ResponseEntity<User>(restTemp.postForObject("http://localhost:1111/user", u, User.class),
				HttpStatus.CREATED);
	}

	@GetMapping("/consume")
	public ResponseEntity<List<User>> getAllData() {
		return new ResponseEntity<List<User>>(restTemp.getForObject("http://localhost:1111/user", List.class),
				HttpStatus.OK);

	}

	@GetMapping("/consume/{uid}")
	public ResponseEntity<User> getSingleData(@PathVariable int uid) throws UserNotFoundException {
		User u1 = restTemp.getForObject("http://localhost:1111/user/" + uid + "", User.class);
		if (u1 != null) {
			return new ResponseEntity<User>(u1, HttpStatus.FOUND);
		} else {
			throw new UserNotFoundException("User is not avliable!!");
		}
	}

	@GetMapping("/consume/{username}/{password}")
	public ResponseEntity<User> getSingleData(@PathVariable String username, @PathVariable String password)
			throws UserNotFoundException {
		User u1 = restTemp.getForObject("http://localhost:1111/user/" + username + "/" + password + "", User.class);
		if (u1 != null) {
			return new ResponseEntity<User>(u1, HttpStatus.FOUND);
		} else {
			throw new UserNotFoundException("User is not avliable!!");
		}

	}

	@PutMapping("/conupdate")
	public ResponseEntity<String> updateData(@RequestBody User u) {
		User u1 = restTemp.getForObject("http://localhost:1111/user/{uid}", User.class, u.getUid());
		if (u1 == null) {
			restTemp.put("http://localhost:1111/user", u);
			return new ResponseEntity<String>("New Data added of ID : " + u.getUid(), HttpStatus.CREATED);
		} else {
			restTemp.put("http://localhost:1111/user", u);
			return new ResponseEntity<String>("Data updated of ID : " + u.getUid(), HttpStatus.ACCEPTED);
		}
	}

	@DeleteMapping("/condelete/{uid}")
	public ResponseEntity<String> deleteData(@PathVariable int uid, @RequestBody User u) {
		User u1 = restTemp.getForObject("http://localhost:1111/user/{uid}", User.class, u.getUid());
		if (u1 != null) {
			Map<String, String> param = new HashMap<String, String>();
			param.put("id", "uid");
			restTemp.delete("http://localhost:1111/" + uid + "", param);
			return new ResponseEntity<String>("delete Successfully!!", HttpStatus.NO_CONTENT);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

		}
	}

	@GetMapping("/consumezull")
	public ResponseEntity<List<User>> getAllDataZuul() {
		List lis = restTemp.getForObject("http://zuul-server/getfetch", List.class);
		return new ResponseEntity<List<User>>(lis, HttpStatus.OK);

	}
}
