package com.infy.springbootjpacrud.producerapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.springbootjpacrud.producerapp.model.Book;
import com.infy.springbootjpacrud.producerapp.repository.BookRepository;

@RestController
public class BookController {
	
	@Autowired
	BookRepository dr;

	@PostMapping("/allbooks")
	public Book insertBook(@RequestBody Book b) {
		return dr.save(b);
	}
	
	@GetMapping("/allbooks")
	public List<Book> fetchBook(){
		return dr.findAll();
	}
}
