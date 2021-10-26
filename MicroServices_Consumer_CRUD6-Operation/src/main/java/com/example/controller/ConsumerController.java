package com.example.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.model.Student;


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
	public ResponseEntity<Student> insertData(@RequestBody Student s) {
		return new ResponseEntity<Student>(rt.postForObject("http://localhost:1111/student", s, Student.class),
				HttpStatus.CREATED);
	}

	// @GetMapping("/getConsumeData/{un}/{ps}")
	// public ResponseEntity<List<Student>> getAll(@PathVariable("un") String
	// un,@PathVariable("ps") String pass){
	// System.out.println("Username : "+un);
	// System.out.println("Password : "+pass);
	//
	// return new
	// ResponseEntity<List<Student>>(rt.getForObject("http://localhost:1111/student",
	// List.class),HttpStatus.OK);
	//
	// }
	@GetMapping("/confetch")
	public ResponseEntity<List<Student>> getAll() {

		return new ResponseEntity<List<Student>>(rt.getForObject("http://localhost:1111/student", List.class),
				HttpStatus.OK);

	}

	@PutMapping("/conupdate")
	public ResponseEntity<String> updateData(@RequestBody Student s) {

		Student s1 = rt.getForObject("http://localhost:1111/student/{sid}", Student.class, s.getSid());

		if (s1 != null) {
			rt.put("http://localhost:1111/student", s);
			return new ResponseEntity<String>("Updated Successfully! ID :" + s.getSid(), HttpStatus.ACCEPTED);
		} else {
			rt.put("http://localhost:1111/student", s);
			return new ResponseEntity<String>("Data added of ID :" + s.getSid(), HttpStatus.CREATED);
		}
	}

	@DeleteMapping("/condelete/{sid}")
	public ResponseEntity<String> deleteData(@PathVariable int sid, @RequestBody Student s) {
		Student s1 = rt.getForObject("http://localhost:1111/student/{sid}", Student.class, s.getSid());
		if (s1 != null) {
			Map<String, String> param = new HashMap<String, String>();
			param.put("id", "sid");
			rt.delete("http://localhost:1111/student/" + sid + "", param);
			return new ResponseEntity<String>("Deleted Succesfuuly!", HttpStatus.NO_CONTENT);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}

	
	//***fetching through zuul api
	@GetMapping("/consume") // we are fetching data through zuul url : http://desktop-gk9nfif:8888/consumer-api/consume
	public ResponseEntity<List<Student>> getAlldata(){
		List lis = rt.getForObject("http://zuul-server/getfetch", List.class);
		return new ResponseEntity<List<Student>>(lis,HttpStatus.OK);
		}
	
	// we are fetching data through zuul url : http://desktop-gk9nfif:8888/consumer-api/consume,
	// consumer-api : consumer application name
	// /consume : url in getmapping to executed method getAlldata
}
