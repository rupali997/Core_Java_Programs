package com.example.controller;

import java.util.List;
import java.util.Optional;

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
		return new ResponseEntity<List<Employee>>(er.findAll(),HttpStatus.OK);
	}
	
	
	@GetMapping("/employee/{eid}")
	public ResponseEntity<Employee> getSingle(@PathVariable int eid){
		
		Optional<Employee> data = er.findById(eid);
		return new ResponseEntity<Employee>(data.get(),HttpStatus.OK);
	}
	
	@PutMapping("/employee")
	public ResponseEntity<String> updateData(@RequestBody Employee e){
		Employee edata = er.findAllEmployeeByEid(e.getEid());
		if(edata!=null) {
			edata.setEid(e.getEid());
			er.save(e);
			return new ResponseEntity<String>("Updated successfully!!"+e.getEid(),HttpStatus.ACCEPTED);
		}else {
			er.save(e);
			return new ResponseEntity<String>("Updated successfully!!"+e.getEid(),HttpStatus.CREATED);

		}
	}
	
	@DeleteMapping("/employee/{eid}")
	public ResponseEntity<String> deleteData(@PathVariable int eid){
		er.deleteById(eid);
		return new ResponseEntity<String>("Deleted Successfully :"+eid,HttpStatus.OK);
	}
	
}
