package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Book;
import com.example.services.BookServices;

@RestController
public class BookController {
	
	@Autowired
	private BookServices bs;

	@PostMapping("/book")
	public ResponseEntity<Book> addBook(@RequestBody Book b){
		return new ResponseEntity<Book>(bs.saveOrUpdateABook(b),HttpStatus.CREATED);
		}
}
