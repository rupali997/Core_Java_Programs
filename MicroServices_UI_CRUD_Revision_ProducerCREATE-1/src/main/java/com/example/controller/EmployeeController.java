package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository er;
	
	@PostMapping("/emp")
	public ResponseEntity<String> insertData(@RequestBody List<Employee> elis){
		er.saveAll(elis);
		return new ResponseEntity<String>("Number of data added:"+elis,HttpStatus.CREATED);
	}
	
	@GetMapping("/emp")
	public ResponseEntity<List<Employee>> fetchData(){
		return new ResponseEntity<List<Employee>>(er.findAll(),HttpStatus.FOUND);
	}
	
	@GetMapping("/emp/{eid}")
	public ResponseEntity<Employee> fetcSingleData(@PathVariable int eid){
		Optional<Employee> data = er.findById(eid);
		return new ResponseEntity<Employee>(data.get(),HttpStatus.FOUND);
		
	}
}
