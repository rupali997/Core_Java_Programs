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

import com.example.model.Department;
import com.example.repository.DepartmentRepository;

@RestController
public class DepartmentController {

	@Autowired
	DepartmentRepository dr;
	
	@PostMapping("/dept")
	public ResponseEntity<Department> addData(@RequestBody Department d){
		return new ResponseEntity<Department>(dr.save(d),HttpStatus.CREATED);
	}
	
	@GetMapping("/dept")
	public ResponseEntity<List<Department>> fetchData(){
		return new ResponseEntity<List<Department>>(dr.findAll(),HttpStatus.FOUND);
	}
	
	@GetMapping("/dept/{did}")
	public ResponseEntity<Department> fetcSingleData(@PathVariable int did){
		 Optional<Department> data = dr.findById(did);
		return new ResponseEntity<Department>(data.get(),HttpStatus.FOUND);
		
	}
}
