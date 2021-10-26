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
	public ResponseEntity<Department> fetchSingleData(@RequestBody Department d1,@PathVariable int did){
		
		Optional<Department> d = dr.findById(did);
		
		return new ResponseEntity<Department>(d.orElse(d1),HttpStatus.FOUND);
		
	}
	
	@PutMapping("/dept/{did}")
	public ResponseEntity<Department> updateData(@RequestBody Department d,@PathVariable int did){
	
		Optional<Department> data = dr.findById(did);
		if(data!=null) {
			return new ResponseEntity<Department>(dr.save(d),HttpStatus.ACCEPTED);

		}
		else {
			Department d1 = dr.save(d);
			return new ResponseEntity<Department>(d1,HttpStatus.CREATED);
		}
		
	}
	
	
	
	
	

}
