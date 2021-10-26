package com.infy.springbootspringmvccrud.app.service_Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.springbootspringmvccrud.app.dao_Interface.UserDao;
import com.infy.springbootspringmvccrud.app.model.User;
import com.infy.springbootspringmvccrud.app.service_Interface.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao ud;

	@Override
	public int saveUser(User u) {
		return ud.saveUser(u);
	}

	

	

	@Override
	public User loginCheck(String username, String password) {
		
		return ud.getAllByLogin_UsernameAndLogin_Password(username,password);
	}





	@Override
	public User loginCheck(User u) {
		// TODO Auto-generated method stub
		return null;
	}





	@Override
	public List<User> getAllUsers(int i) {
		// TODO Auto-generated method stub
		return null;
	}



	

}
