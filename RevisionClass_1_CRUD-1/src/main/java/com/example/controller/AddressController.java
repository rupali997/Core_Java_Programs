package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Repository.AddressRepository;
import com.example.model.Address;

@RestController
public class AddressController {
	
	@Autowired
	AddressRepository ar;
	
	@PostMapping("address")
	public ResponseEntity<Address> addData(@RequestBody Address a){
		return new ResponseEntity<Address>(ar.save(a),HttpStatus.CREATED);
	}

	@GetMapping("address")
	public ResponseEntity<List<Address>> getData(){
		return new ResponseEntity<List<Address>>(ar.findAll(),HttpStatus.FOUND);
	}
}
