package com.infy.springbootspringmvcjpacrud.app.service_Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infy.springbootspringmvcjpacrud.app.model.User;
import com.infy.springbootspringmvcjpacrud.app.repository.UserDaoImplRepository;
import com.infy.springbootspringmvcjpacrud.app.service_Interface.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDaoImplRepository udr;
	
	@Override
	public void saveData(User u) {
		
		udr.save(u);
	}

	@Override
	public List<User> loginCheck(String username, String password) {
		
		return (List<User>) udr.findAllUser();
	}

	@Override
	public Iterable<User> getAllUser() {
		
		return udr.findAllUser();
	}

	@Transactional
	@Override
	public int deleteData(int uid) {
		// TODO Auto-generated method stub
		return udr.deleteByUid(uid);
	}

	@Transactional
	@Override
	public User editData(int uid) {
		
		return udr.findAllUsersByUid(uid);
	}

}
