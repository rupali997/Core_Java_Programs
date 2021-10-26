package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Book;
import com.example.model.Review;
import com.example.repository.ReviewDaoRepository;
import com.example.services.ReviewServices;

@RestController
public class ReviewController {
	
	@Autowired
	ReviewDaoRepository rd;


	@GetMapping("/review")
	public ResponseEntity<List<Review>> addBook(){
		return new ResponseEntity<List<Review>>(rd.findAll(),HttpStatus.OK);
		}
}
