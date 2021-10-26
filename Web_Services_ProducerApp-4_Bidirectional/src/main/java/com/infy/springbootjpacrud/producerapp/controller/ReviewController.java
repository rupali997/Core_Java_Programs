package com.infy.springbootjpacrud.producerapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.infy.springbootjpacrud.producerapp.model.Review;
import com.infy.springbootjpacrud.producerapp.repository.ReviewRepository;

@Controller
public class ReviewController {

	@Autowired
	ReviewRepository rr;

	@PostMapping("/allreviews")
	public Review insertReview(@RequestBody Review r) {
		return rr.save(r);
	}
	
	@GetMapping("/allreviews")
	public List<Review> fetchReview(){
		return rr.findAll();
	}
}
