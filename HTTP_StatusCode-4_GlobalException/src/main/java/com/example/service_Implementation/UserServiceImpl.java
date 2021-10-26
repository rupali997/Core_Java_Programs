package com.example.service_Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.repository.UserDaoRepository;
import com.example.service_Interface.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserDaoRepository udr;

	@Override
	public ResponseEntity<User> inserdata(User u) {
		
		return new ResponseEntity<User>(udr.save(u),HttpStatus.CREATED);
	}

}
