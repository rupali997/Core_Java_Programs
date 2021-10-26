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
		
		return ur.findAllByUsernameAndPassword(username,password);
	}

	@Override
	public Iterable<User> getAllUsers() {
		
		return ur.getAlldataofUser();
	}

	@Transactional
	@Override
	public User editUser(int uid) {
		// TODO Auto-generated method stub
		return  ur.findAllDataByUid(uid);
		
	
	}

	@Override
	public void updateUser(User u) {
		ur.save(u);
		
	}

	@Override
	public void deleteUser(User u) {
		ur.delete(u);
		
	}
   

//	@Override
//	public User loginCheck(String username, String password) {
//		
//		return ur.findAllByUsernameAndPassword(username,password);
//	}
//
//
//	
//
//
//	@Override
//	public User getsingledatabyUid(int uid) {
//		
//		return ur.findAllByUid(uid);
//	}
//
//
//	@Override
//	public void deleteUser(User u) {
//		ur.delete(u);
//		
//	}
//
//
//	@Override
//	public Iterable<User> displayAllDataRid(int i) {
//		
//		return ur.findAllByRole_Rid(i);
//	}

}
