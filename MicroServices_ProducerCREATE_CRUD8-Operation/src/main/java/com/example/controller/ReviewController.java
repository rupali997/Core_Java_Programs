package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Book;
import com.example.model.Review;
import com.example.services.ReviewServices;

@RestController
public class ReviewController {
	
	@Autowired
	private ReviewServices rs;

	@PostMapping("/review")
	public ResponseEntity<Review> addReview(@RequestBody Review r){
		return new ResponseEntity<Review>(rs.saveOrUpdateABook(r),HttpStatus.CREATED);

	}
}
