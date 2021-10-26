package com.example.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;


public class Book {

	
	private int bookId;
	private String bookName;
	private String author;
	
	private List<Review> review;
	
	
	public List<Review> getReview() {
		return review;
	}

	public void setReview(List<Review> review) {
		this.review = review;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	
	
	
	
	
	
}
