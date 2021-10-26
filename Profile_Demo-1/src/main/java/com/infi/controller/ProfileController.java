package com.infi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

	@Value("${d.bbb}")
	private String msg;
	
	@RequestMapping("/")
	public String prelogin() {
		System.out.println(msg);
		return msg;
	}
}
