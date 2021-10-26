package com.example.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.example.model.User;

@RestController
public class ConsumerController {

	@Autowired
	RestTemplate rt;

	// -->Zuul Fetching

	@GetMapping("/consume")
	public ResponseEntity<List<User>> getData() {
		return new ResponseEntity<List<User>>(rt.getForObject("http://zuul-server/getfetch", List.class),
				HttpStatus.OK);
	}

	// -->Consumer Fetching all data

	@GetMapping("/consume/all")
	public ResponseEntity<List<User>> getAll() {
		List<User> lis = rt.getForObject("http://desktop-gk9nfif:2222/retrive", List.class);

		return new ResponseEntity<List<User>>(lis, HttpStatus.FOUND);

	}

	// -->Consumer Fetching single data

	@GetMapping("/consume/{uid}")
	public ResponseEntity<User> getSingle(@PathVariable int uid) {
		User u1 = rt.getForObject("http://localhost:2222/retrive/" + uid + "", User.class);
		if (u1 == null) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

		} else {
			return new ResponseEntity<User>(u1, HttpStatus.FOUND);

		}
	}

	// -->Consumer creating data

	@PostMapping("/concreate")
	public ResponseEntity<User> addData(@RequestBody User u) {
		return new ResponseEntity<User>(rt.postForObject("http://localhost:1111/insert", u, User.class),
				HttpStatus.CREATED);
	}

	// -->Consumer updating data

	@PutMapping("/conupdate")
	public ResponseEntity<String> updateData(@RequestBody User u){
		User u1 = rt.getForObject("http://localhost:2222/retrive/{uid}", User.class,u.getUid());		
		if(u1!=null) {
			rt.put("http://localhost:3333/update",u);
			return new ResponseEntity<String>("Updated SuccessFully!!",HttpStatus.OK);
			
		}
		else {
			rt.put("http://localhost:3333/update", u);
			return new ResponseEntity<String>("added SuccessFully!!",HttpStatus.CREATED);
			
		}
		
//		Map<String,String> param = new HashMap<String,String>();
//		param.put("id", "uid");
//		User u1 = rt.getForObject("http://localhost:2222/retrive/"+uid+"", User.class);
//		
//		rt.put("http://localhost:3333/update/"+uid+"",u1,param);
//		return new ResponseEntity<String>("update Successfully!!",HttpStatus.OK);

	}

	



	// -->Consumer deleting data

	@DeleteMapping("/condelete/{uid}")
	public ResponseEntity<String> deleteData(@PathVariable int uid) {

        Map < String, String > params = new HashMap < String, String > ();
        params.put("id", "uid");
        rt.delete("http://localhost:4444/delete/"+uid+"",params);
        return new ResponseEntity<String>("Deleted Successfully!",HttpStatus.NO_CONTENT);

	}

	
}
