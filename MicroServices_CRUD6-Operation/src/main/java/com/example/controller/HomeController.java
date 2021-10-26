package com.example.controller;

import java.util.List;

import javax.ws.rs.core.Response;

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

import com.example.model.Student;
import com.example.repository.StudentRepository;

@RestController
public class HomeController {
	
	@Autowired
	StudentRepository sr; 

//	1]-->Adding single data at a time in postman
	/*pattern :
	 
	 {}
	  */
	
//	@PostMapping("/student")
//	public ResponseEntity<Student> saveData(@RequestBody Student s){
//		
//		return new ResponseEntity<Student>(sr.save(s),HttpStatus.CREATED);
//		
//	}
	
//	1]-->Adding Multiple data at a time in postman
		/*pattern :
		 [
		 {},
		 {}
		 ] */
	
	@PostMapping("/student")
	public ResponseEntity<String> saveData(@RequestBody List<Student> stu){
		sr.saveAll(stu);
		return new ResponseEntity<String>("Data Added : "+stu.size(),HttpStatus.CREATED);
	}
	
	
	@GetMapping("/student")
	public ResponseEntity<List<Student>> fetchData(){
		return new ResponseEntity<List<Student>>(sr.findAll(),HttpStatus.OK);
	}
	
	@GetMapping("/student/{sid}")
	public ResponseEntity<Student> fetchSingleData(@PathVariable int sid){
		
		Student s = sr.findAllBySid(sid);
		if(s==null) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}
		else {
			return new ResponseEntity<Student>(s,HttpStatus.FOUND);
		}
	}
	
	@PutMapping("/student")
	public ResponseEntity<Student> updateData(@RequestBody Student s){
		Student s1 = sr.findAllBySid(s.getSid());
		if(s1!=null) {
			return new ResponseEntity<Student>(sr.save(s),HttpStatus.ACCEPTED);
		}
		else {
			return new ResponseEntity<Student>(sr.save(s),HttpStatus.CREATED);

		}
	}
		
	@DeleteMapping("/student/{sid}")
	public ResponseEntity<String> deleteData(@PathVariable int sid){
		sr.deleteById(sid);
		return new ResponseEntity<String>("Delete Successfully Data od ID : "+sid,HttpStatus.NO_CONTENT);
	}
	
	
}
