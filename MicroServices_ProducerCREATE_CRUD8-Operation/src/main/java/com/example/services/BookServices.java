package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Book;
import com.example.repository.BookDaoRepository;

@Service
public class BookServices {
	
	@Autowired
	BookDaoRepository bd;

	public Book saveOrUpdateABook(Book b) {
		
		return bd.save(b);
	}
	

}
