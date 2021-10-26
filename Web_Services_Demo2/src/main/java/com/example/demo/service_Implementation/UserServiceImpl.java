package com.example.demo.service_Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.UserDao;
import com.example.demo.service_Interface.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao ud;

	@Override
	public List<Student> getAllUser() {
		
		return (List<Student>) ud.findAll();
	}

	@Override
	public List<Student> getAllStudent() {
		
		return (List<Student>) ud.findAll();
	}

}
