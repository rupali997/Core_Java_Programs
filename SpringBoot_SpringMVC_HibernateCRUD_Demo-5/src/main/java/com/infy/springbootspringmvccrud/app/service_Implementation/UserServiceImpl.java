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
	public void saveUser(User u) {
		ud.saveUser(u);
		
	}

	@Override
	public int loginCheck(String username, String password) {
	
		return ud.loginCheck(username,password);
	}

	@Override
	public List<User> getAllUsers() {
		
		return ud.getAllUsers();
	}

	@Override
	public int deleteUser(int uid) {
		
		return ud.deleteUser(uid);
	}

	@Override
	public User editUser(int uid) {
		
		return ud.editUser(uid);
	}

	@Override
	public void updateUser(User u) {
		ud.updateUser(u);
		
	}

}
