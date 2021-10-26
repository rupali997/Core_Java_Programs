package com.infy.springbootjparestapicrud.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.springbootjparestapicrud.app.model.Book;
import com.infy.springbootjparestapicrud.app.repository.BookDaoRepository;

@RestController
public class ProducerController {
	
	@Autowired
	BookDaoRepository ud;

	@PostMapping("/books")
	public Book insertdata(@RequestBody Book b) {
		ud.save(b);
		return b;
	}
}
