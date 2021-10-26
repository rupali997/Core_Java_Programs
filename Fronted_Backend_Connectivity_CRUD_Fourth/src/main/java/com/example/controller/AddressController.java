package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Address;
import com.example.repository.AddressRepository;

@RestController
public class AddressController {
	
	@Autowired
	AddressRepository ar;
	
	@PostMapping("/address")
	public ResponseEntity<Address> addData(@RequestBody Address a){
		
		return new ResponseEntity<Address>(ar.save(a),HttpStatus.CREATED);
	}
	

}
