package com.cjc.app.evf.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.evf.main.model.Previous_Loan;
import com.cjc.app.evf.main.repository.PreviousLoanRepository;

@RestController
public class PreviousLoanController {
	
	@Autowired
	PreviousLoanRepository plr;

	
	@PostMapping("/previousLoan")
	public ResponseEntity<Previous_Loan> postData(@RequestBody Previous_Loan pl){
		
		
		return new ResponseEntity<Previous_Loan>(plr.save(pl),HttpStatus.CREATED);

	}
	
}
