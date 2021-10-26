package com.infy.springmvc.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.springmvc.daoi.UserDao;
import com.infy.springmvc.model.User;
import com.infy.springmvc.servicei.UserService;


@Service
public class UserServiceImpli implements UserService
{
	@Autowired
	UserDao ud;

	@Override
	public void savedata(User u) {
		ud.savedata(u);
		
	}



	@Override
	public User logincheck(User u) {
		
		return ud.logincheck(u);
	}



	@Override
	public List<User> displayList(int i) {
		
		return ud.displayList(i);
	}



	@Override
	public User getSingleUserData(User u) {
		
		return ud.getSingleUserData(u);
	}



	@Override
	public void deleteUserData(User u) {
		ud.deleteUserData(u);
		
	}


	
	
	

}
