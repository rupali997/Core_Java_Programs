package com.example.controller;

import java.util.List;

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
	
	@PostMapping("/emp")
	public ResponseEntity<Employee> addData(@RequestBody Employee e ){
		return new ResponseEntity<Employee>(er.save(e),HttpStatus.CREATED);
		}

	
//	@GetMapping("/emp")
//	public List<Employee> fetchData(){
//		return er.findAll();
//		
//		
//		
//	}
	
	@GetMapping("/emp")
	public ResponseEntity<List<Employee>> fetchData(){
		return new ResponseEntity<List<Employee>>(er.findAll(),HttpStatus.OK);
		
		
		
	}
	
	@GetMapping("/emp/{eid}")
	public Employee fetchSingle(@PathVariable int eid) {
		return er.findById(eid).get();
		 
	}
	
	@PutMapping("/emp")
	public ResponseEntity<String> updateData(@RequestBody Employee e){
		
		Employee edata =er.findAllEmployeeByEid(e.getEid());
		if(edata!=null) {
			edata.setEid(e.getEid());
			er.save(e);
			return new ResponseEntity<String>("Updated successfully!!:"+e.getEid(),HttpStatus.OK);
		}
		else {
			er.save(e);
			return new ResponseEntity<String>("Added successfully!!:"+e.getEid(),HttpStatus.OK);

			
		}
	}
	
	@DeleteMapping("/emp/{eid}")
	public ResponseEntity<String> deleteData(@PathVariable int eid){
		er.deleteById(eid);
		return new ResponseEntity<String>("Deleted successfully!!",HttpStatus.OK);
	}
	
}
