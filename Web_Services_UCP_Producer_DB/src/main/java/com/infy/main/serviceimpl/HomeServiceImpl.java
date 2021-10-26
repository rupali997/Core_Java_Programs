package com.infy.main.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.main.model.User;
import com.infy.main.repository.UserRepository;
import com.infy.main.servicei.HomeServiceI;
@Service
public class HomeServiceImpl implements HomeServiceI{
	@Autowired
	UserRepository ur;

	@Override
	public List<User> getAllDataFromUser() {
		
		return ur.findAll();
	}

	@Override
	public User saveDataUser(User u) {
		
		return ur.save(u);
	}

	@Override
	public void deleteDataById(int uid) {
		ur.deleteById(uid);
	}

	@Override
	public List getDataByusAndPs(String username, String password) {
		
		return ur.findAllByUsernameAndPassword(username,password);
	}

}
