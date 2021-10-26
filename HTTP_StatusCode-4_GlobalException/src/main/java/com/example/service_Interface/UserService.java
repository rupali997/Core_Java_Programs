package com.example.service_Interface;

import org.springframework.http.ResponseEntity;

import com.example.model.User;

public interface UserService {

	ResponseEntity<User> inserdata(User u);

}
