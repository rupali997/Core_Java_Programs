package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Product;
import com.example.repository.ProductRepository;

@RestController
public class ProductController {
	
	@Autowired
	ProductRepository pr;
	
	@PostMapping("/product")
	public ResponseEntity<Product> addData(@RequestBody Product p){
		return new ResponseEntity<Product>(pr.save(p),HttpStatus.CREATED);
	}

}
