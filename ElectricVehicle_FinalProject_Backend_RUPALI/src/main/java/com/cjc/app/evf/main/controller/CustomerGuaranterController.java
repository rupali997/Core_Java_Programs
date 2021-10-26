package com.cjc.app.evf.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.evf.main.model.CustomerGuaranter;
import com.cjc.app.evf.main.repository.CustomerGuaranterRepository;

@RestController
public class CustomerGuaranterController {

	@Autowired
	CustomerGuaranterRepository cgr;
	
	@PostMapping("/customerguaranter")
	public ResponseEntity<CustomerGuaranter> addData(@RequestBody CustomerGuaranter cg){
		return new ResponseEntity<CustomerGuaranter>(cgr.save(cg),HttpStatus.CREATED);
	}
}
