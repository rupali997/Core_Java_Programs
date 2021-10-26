package com.springbootjparestapicrud.app.service_Implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootjparestapicrud.app.model.User;
import com.springbootjparestapicrud.app.repository.UserDaoRepository;
import com.springbootjparestapicrud.app.service_Interface.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDaoRepository udr;

	@Override
	public User saveData(User u) {
		udr.save(u);
		return u;
	}

	@Override
	public List<User> getAllUser() {
		
		return udr.findAll();
	}

	
	@Override
	public User getSingleUser(int uid) {
		
		return udr.getById(uid);
	}

}
