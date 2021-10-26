package com.infy.springbootspringmvccrud.app.service_Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.springbootspringmvccrud.app.dao_Interface.UserDao;
import com.infy.springbootspringmvccrud.app.model.User;
import com.infy.springbootspringmvccrud.app.service_Interface.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao ud;

	@Override
	public int saveUser(User u) {
		
		return ud.saveUser(u);
	}

	

	@Override
	public List<User> getAllUsers(int i) {
		// TODO Auto-generated method stub
		return ud.getAllUsers(i);
	}

	

	@Override
	public User loginCheck(User u) {
		// TODO Auto-generated method stub
		return ud.loginCheck(u);
	}



	@Override
	public void deleteUser(User u) {
		
		ud.deleteUser(u);
	}



	@Override
	public User getSingleUserData(User u) {
		
		return ud.getSingleUserData(u);
	}



	@Override
	public void updateData(User u) {
		ud.updateData(u);
		
	}

	
	

}
