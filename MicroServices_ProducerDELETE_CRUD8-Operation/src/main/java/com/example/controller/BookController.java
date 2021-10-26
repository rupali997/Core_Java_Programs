package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Book;
import com.example.repository.BookDaoRepository;

@RestController
public class BookController {
	
	@Autowired
	BookDaoRepository bd;

	@DeleteMapping("/book/{bookId}")
	public ResponseEntity<String> addBook(@PathVariable int bookId){
		Book b1 = bd.findByBookId(bookId);
		if(b1!=null) {
			bd.deleteById(bookId);
			return new ResponseEntity<String>("Deleted SuccessFully!!",HttpStatus.NO_CONTENT);

		}
		else {

			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		}
}
