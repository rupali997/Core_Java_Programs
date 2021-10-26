package com.example.Exception;


public class BookNotFound extends RuntimeException{

	public BookNotFound(String msg) {
		super(msg);
	}
}
