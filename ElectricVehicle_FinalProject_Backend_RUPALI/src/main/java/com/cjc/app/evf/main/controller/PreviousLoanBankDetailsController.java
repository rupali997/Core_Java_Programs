package com.cjc.app.evf.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.evf.main.model.PreviousLoanBankDetails;
import com.cjc.app.evf.main.repository.PreviousLoanBankDetailsRepository;

@RestController 
public class PreviousLoanBankDetailsController {
	
	@Autowired
	PreviousLoanBankDetailsRepository pbdr;
	
	@PostMapping("/previousLoanBankDetails")
	public ResponseEntity<PreviousLoanBankDetails> addData(@RequestBody PreviousLoanBankDetails plb){
		return new ResponseEntity<PreviousLoanBankDetails>(pbdr.save(plb),HttpStatus.CREATED);
	}

	
}
