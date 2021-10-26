package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.example.model.Employee;
import com.example.repository.EmployeeRepository;
@CrossOrigin("*")
@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepository er;
	
	@PostMapping("/employee")
	public ResponseEntity<Employee> addData(@RequestBody Employee e){
		
		return new ResponseEntity<Employee>(er.save(e),HttpStatus.CREATED);
	}
	
	
	@GetMapping("/employee")
	public ResponseEntity<List<Employee>> getData(){
		System.out.println(er.findAll());
		for(Employee es : er.findAll()) {
			System.out.println(es.getEid());
			System.out.println();
		}
		return new ResponseEntity<List<Employee>>(er.findAll(),HttpStatus.OK);
	}
	
	@GetMapping("/employee/{eid}")
	public ResponseEntity<Employee> getSingleData(@PathVariable int eid){
		Optional<Employee> singleData = er.findById(eid);
		return new ResponseEntity<Employee>(singleData.get(),HttpStatus.OK);
	}

	@PutMapping("/employee")
	public ResponseEntity<String> updateData(@RequestBody Employee e){
		Employee singleData = er.findById(e.getEid()).get();
		if(singleData!=null) {
			singleData.setEid(e.getEid());
			er.save(e);
			return new ResponseEntity<String>("Data Updated Successfully!!:"+e.getEid(),HttpStatus.ACCEPTED);
		}
		else {
			er.save(e);
			return new ResponseEntity<String>("Data added Successfully!!:"+e.getEid(),HttpStatus.CREATED);

		}
	}
	
	@DeleteMapping("/employee/{eid}")
	public ResponseEntity<String> deleteData(@PathVariable int eid){
		er.deleteById(eid);
		
		return new ResponseEntity<String>("Deleted succesfully!!!:"+eid,HttpStatus.OK);
	}
}
