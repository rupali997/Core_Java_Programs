package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Repository.Student_Repository;
import com.example.model.Student;

@RestController
public class StudentController {

	
	
	@Autowired
	Student_Repository sr;
	
	@PostMapping("student")
	public ResponseEntity<Student> addData(@RequestBody Student s) {
		return new ResponseEntity<Student>(sr.save(s),HttpStatus.CREATED);
		
	}
	
	@GetMapping("student")
	public ResponseEntity<List<Student>> getData(){
		return new ResponseEntity<List<Student>>(sr.findAll(),HttpStatus.FOUND);
	}
	
	@PutMapping("/student")
	public ResponseEntity<String> updateData(@RequestBody Student s){
		Student s1 = sr.findBySid(s.getSid());
		if(s1!=null) {
			sr.save(s1);
		return new ResponseEntity<String>("updated successfully ID"+s.getSid(),HttpStatus.ACCEPTED);
		}
		else {
			sr.save(s1);
			return new ResponseEntity<String>("added successfully ID"+s.getSid(),HttpStatus.CREATED);

		}
	}
	
}
