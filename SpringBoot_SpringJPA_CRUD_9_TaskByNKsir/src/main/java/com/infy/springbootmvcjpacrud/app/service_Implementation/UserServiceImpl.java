package com.infy.springbootmvcjpacrud.app.service_Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.springbootmvcjpacrud.app.model.User;
import com.infy.springbootmvcjpacrud.app.repository.UserDao;
import com.infy.springbootmvcjpacrud.app.service_Interface.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao ud;

	@Override
	public void saveData(User u) {
		
		ud.save(u);
		
	}

	@Override
	public User loginCheck(String username, String password) {
		
		return ud.findAllByLogin_UsernameAndLogin_Password(username,password);
	}

	@Override
	public Iterable<User> getAllUserbyRid(int i) {
		// TODO Auto-generated method stub
		return ud.findAllDataByRole_Rid(i);
	}

	@Override
	public User getSingleData(int uid) {
		// TODO Auto-generated method stub
		return ud.findAllByUid(uid);
	}

	@Override
	public void deleteUser(User u) {
		ud.delete(u);
		
	}

	@Override
	public Iterable<User> getAllData() {
		// TODO Auto-generated method stub
		return ud.findAll();
	}

}
