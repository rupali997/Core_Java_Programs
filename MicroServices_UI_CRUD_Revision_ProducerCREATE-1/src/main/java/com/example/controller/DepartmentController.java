package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
	
}
