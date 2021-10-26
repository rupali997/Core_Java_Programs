package com.example.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.Exception.BookNotFound;
import com.example.model.Book;
import com.example.model.Review;

@RestController
public class ConsumerController {
	
	@LoadBalanced
	@Bean
	public RestTemplate rt() {
		return new RestTemplate();
	}
	
	@Autowired
	RestTemplate rtt;

	//1---->>>Fetch data through Consumer
	
	@GetMapping("/consume")
	public ResponseEntity<List<Book>> getAllData(){
		return new ResponseEntity<List<Book>>(rtt.getForObject("http://localhost:2222/book",List.class),HttpStatus.FOUND);
	}
	
	//2---->>>Fetch data through zull
	@GetMapping("/consumezulldata")
	public ResponseEntity<List<Book>> getZuulData(){
		return new ResponseEntity<List<Book>>(rtt.getForObject("http://zuul-server/getfetch",List.class),HttpStatus.FOUND);

	}
	
	@GetMapping("/consume/{bookId}")
	public ResponseEntity<Book> getSingleData(@PathVariable int bookId) throws BookNotFound{
		Book b1 = rtt.getForObject("http://localhost:2222/book/"+bookId+"",Book.class,bookId);
		if(b1==null) {
			throw new BookNotFound("Book is not present!!");
		}
		else {
			return new ResponseEntity<Book>(b1,HttpStatus.FOUND);
		}
	}
	
	@PostMapping("/consumebook") 
	public ResponseEntity<Book> addBookData(@RequestBody Book b){
		return new ResponseEntity<Book>(rtt.postForObject("http://localhost:1111/book",b,Book.class),HttpStatus.CREATED);
	}
	
	@PostMapping("/consumereview") 
	public ResponseEntity<Review> addReviewData(@RequestBody Review r){
		return new ResponseEntity<Review>(rtt.postForObject("http://localhost:1111/review",r,Review.class),HttpStatus.CREATED);
	
	}
}
