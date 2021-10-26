package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Exception.BookNotFound;
import com.example.model.Book;
import com.example.repository.BookDaoRepository;
import com.example.services.BookServices;

@RestController
public class BookController {
	
	@Autowired
	BookDaoRepository bd;

	@GetMapping("/book")
	public ResponseEntity<List<Book>> getAll(){
		return new ResponseEntity<List<Book>>(bd.findAll(),HttpStatus.OK);
		}
	
	@GetMapping("/book/{bookId}")
	public ResponseEntity<Book> getSingleData(@PathVariable int bookId) throws BookNotFound{
		Book b1 = bd.findByBookId(bookId);
		if(b1==null) {
			throw new BookNotFound("Book is not avliable!!");
		}
		else {
			return new ResponseEntity<Book>(b1,HttpStatus.FOUND);
		}
	}
}
