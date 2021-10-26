package com.cjc.app.evf.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.evf.main.model.Customer_Registration;
import com.cjc.app.evf.main.repository.CustomerRegistrationRepository;
@CrossOrigin("*")
@RestController
public class CustomerRegistrationController {
	
	@Autowired
	CustomerRegistrationRepository crr;

	@PostMapping("/customerRegistration")
	public ResponseEntity<Customer_Registration> addData(@RequestBody Customer_Registration cr){
		
		return new ResponseEntity<Customer_Registration>(crr.save(cr),HttpStatus.CREATED);
	}
	
	@GetMapping("/customerRegistration")
	public ResponseEntity<List<Customer_Registration>> getData(){
		return new ResponseEntity<List<Customer_Registration>>(crr.findAll(),HttpStatus.OK);

	}
}
