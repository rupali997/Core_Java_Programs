package com.infy.springbootmvcjparestapistatuscodecrud.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.springbootmvcjparestapistatuscodecrud.app.ExceptionHandler.ProductNotFoundException;
import com.infy.springbootmvcjparestapistatuscodecrud.app.model.Product;

@RestController
public class ProductorController{
	
	List<Product> lis = new ArrayList<>();

	@GetMapping("/allproduct")
	public ResponseEntity<List<Product>> retriveData(){
		lis.add(new Product(1,"AC","34000"));
		lis.add(new Product(2,"Washing machine","78000"));
		lis.add(new Product(3,"Fridege","94000"));
		lis.add(new Product(4,"Car","89000"));
		if(lis.size()<=0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		
		return new ResponseEntity<List<Product>>(lis,HttpStatus.OK);
		
	}
	
	@GetMapping("/allproduct/{pid}")
	public ResponseEntity<Product> getSingleData(@PathVariable int pid) throws ProductNotFoundException{
		int a=50/0;
		if(pid==1) {
			return new ResponseEntity<Product>(new Product(pid,"AC","34000"),HttpStatus.OK);
		}
		else {
			throw new ProductNotFoundException("Product is not avliable");
		}
	}
	
	@PutMapping("/allproduct/{pid}")
	public ResponseEntity<Product> updatProduct(@PathVariable int pid,@RequestBody Product p){
	
	Product	p1 = new Product(pid,"yarrr","90888");
		
		
		return new ResponseEntity<Product>(p1,HttpStatus.OK);
		
	}
	
	
}