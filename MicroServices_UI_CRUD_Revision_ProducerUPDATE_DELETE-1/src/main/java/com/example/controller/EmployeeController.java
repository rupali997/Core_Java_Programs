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
	
	@PostMapping("/emp")
	public ResponseEntity<String> insertData(@RequestBody List<Employee> elis){
		er.saveAll(elis);
		return new ResponseEntity<String>("Number of data added:"+elis,HttpStatus.CREATED);
	}
	
	@GetMapping("/emp")
	public ResponseEntity<List<Employee>> fetchData(){
		return new ResponseEntity<List<Employee>>(er.findAll(),HttpStatus.FOUND);
	}
	
	@PutMapping("/emp")
	public ResponseEntity<String> updateData(@RequestBody Employee e){
		
		Employee data = er.findAllEmployeeByEid(e.getEid());
		if(data!=null) {
			data.setEid(e.getEid());
			er.save(e);
			return new ResponseEntity<String>("update successfully:"+e.getEid(),HttpStatus.ACCEPTED);

		}
		else {
			er.save(e);
			return new ResponseEntity<String>("Added successfully:"+e.getEid(),HttpStatus.CREATED);

		}
	}
	
	@DeleteMapping("/emp/{eid}")
	public ResponseEntity<String> deleteData(@RequestBody Employee e,@PathVariable int eid){
		Employee data = er.findAllEmployeeByEid(e.getEid());
		if(data!=null) {
			data.setEid(e.getEid());
			er.deleteById(e.getEid());
			return new ResponseEntity<String>("Delete successfully!!",HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<String>("Invalid!!",HttpStatus.NOT_FOUND);

	}
}
