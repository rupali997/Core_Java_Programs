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

import com.example.model.Customer;
import com.example.repository.CustomerRepository;

@CrossOrigin("*")
@RestController
public class CustomerController {
	
	@Autowired
	CustomerRepository cr;
	
	@PostMapping("/customer")
	public ResponseEntity<Customer> addData(@RequestBody Customer c){
		return new ResponseEntity<Customer>(cr.save(c),HttpStatus.CREATED);
	}
	
	@GetMapping("/customer")
	public ResponseEntity<List<Customer>> getAllData(){
		return new ResponseEntity<List<Customer>>(cr.findAll(),HttpStatus.OK);

	}
	
	@GetMapping("/customer/{cid}")
	public ResponseEntity<Customer> getSingleData(@PathVariable int cid){
		return new ResponseEntity<Customer>(cr.findById(cid).get(),HttpStatus.OK);
 
	}
	
	@PutMapping("/customer")
	public ResponseEntity<String> updateData(@RequestBody Customer c){
		
		Customer cu = cr.findById(c.getCid()).get();
		if(cu.getCid()!=0) {
			cu.setCid(c.getCid());
			cr.save(c);
			return new ResponseEntity<String>("Update Successfully!!:"+c.getCid(),HttpStatus.ACCEPTED);
		}else {
			
			cr.save(c);
			return new ResponseEntity<String>("Added Successfully!!:"+c.getCid(),HttpStatus.ACCEPTED);
		}
		
	}
	
	@DeleteMapping("/customer/{cid}")
	public ResponseEntity<String> deleteData(@PathVariable int cid){
		cr.deleteById(cid);
		return new ResponseEntity<String>("Deleted Successfully!!:"+cid,HttpStatus.OK);
	}

}
