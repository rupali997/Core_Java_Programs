package com.infy.springbootspringmvcjpacrud.app.service_Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.infy.springbootspringmvcjpacrud.app.model.User;
import com.infy.springbootspringmvcjpacrud.app.repository.UserRepository;
import com.infy.springbootspringmvcjpacrud.app.service_Interface.UserService;

@Repository
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository ur;
	
	
	@Override
	public void saveData(User u) {
		
		ur.save(u);
	}


	@Transactional
	@Override
	public List<User> loginCheck(String username, String password) {
		

		return ur.findAllUsers();
	}


	@Transactional
	@Override
	public User getSingleData(int uid) {
		
		return ur.findAllByUid(uid);
	}


	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return ur.findAllUsers();
	}


	@Override
	public void updateData(User u) {
		ur.save(u);
		
	}


	@Override
	public void deleteData(User u) {
		ur.delete(u);
	}


	


	}
