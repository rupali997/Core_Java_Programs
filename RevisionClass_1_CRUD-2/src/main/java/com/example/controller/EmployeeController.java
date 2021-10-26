package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository er;
	
	@PostMapping("/employee")
	public ResponseEntity<Employee> insertData(@RequestBody Employee e){
		return new ResponseEntity<Employee>(er.save(e),HttpStatus.CREATED);
	}
	
	@GetMapping("/employee")
	public ResponseEntity<List<Employee>> getData(){
		return new ResponseEntity<List<Employee>>(er.findAll(),HttpStatus.FOUND);
	}
	
	
}
