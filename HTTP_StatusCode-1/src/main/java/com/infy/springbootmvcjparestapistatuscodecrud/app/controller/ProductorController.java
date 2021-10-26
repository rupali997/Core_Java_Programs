package com.infy.springbootmvcjparestapistatuscodecrud.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.springbootmvcjparestapistatuscodecrud.app.ExceptionHandler.ProductNotFoundException;
import com.infy.springbootmvcjparestapistatuscodecrud.app.model.Product;
import com.infy.springbootmvcjparestapistatuscodecrud.app.repository.ProductDaoRepository;

@RestController
public class ProductorController {

	@Autowired
	ProductDaoRepository pdr;

	@PostMapping("/products")
	public ResponseEntity<Product> insertData(@RequestBody Product p) {
		return new ResponseEntity<Product>(pdr.save(p), HttpStatus.CREATED);
	}

	@GetMapping("/products")
	public ResponseEntity<List<Product>> getAllProducts() {

		List<Product> lis = pdr.findAll();
		if (lis.size() <= 0) {

			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}

		return new ResponseEntity<List<Product>>(pdr.findAll(), HttpStatus.OK);
	}

	@GetMapping("/products/{pid}")
	public ResponseEntity<Product> getSingleProduct(@PathVariable int pid, @RequestBody Product p)
			throws ProductNotFoundException {
		Product p1 = pdr.findAllProductByPid(pid);

		if (p1 == null) {
			throw new ProductNotFoundException("Currently this product is out of the stock!!");

		} else {
			return new ResponseEntity<Product>(p1, HttpStatus.OK);
		}
	}

	@PutMapping("/products/{pid}")
	public ResponseEntity<Product> updateProduct(@PathVariable int pid, @RequestBody Product p) {
		p.setPid(pid);

		return new ResponseEntity<Product>(p, HttpStatus.OK);

	}

	@DeleteMapping("/products/{pid}")
	public ResponseEntity<Product> deleteProduct(@PathVariable int pid, @RequestBody Product p) {
		try {
			p.setPid(pid);
			pdr.delete(p);
			return new ResponseEntity<Product>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

}
