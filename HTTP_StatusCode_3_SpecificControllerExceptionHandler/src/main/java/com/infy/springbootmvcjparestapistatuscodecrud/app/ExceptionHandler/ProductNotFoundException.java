package com.infy.springbootmvcjparestapistatuscodecrud.app.ExceptionHandler;

public class ProductNotFoundException extends RuntimeException{

	public ProductNotFoundException(String msg) {
		super(msg);
	}
}
