package com.infy.springbootspringmvcjpacrud.app.service_Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infy.springbootspringmvcjpacrud.app.model.User;
import com.infy.springbootspringmvcjpacrud.app.repository.UserRepository;
import com.infy.springbootspringmvcjpacrud.app.service_Interface.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository ur;

	@Override
	public void saveUser(User u) {
		ur.save(u);
		
	}

}
