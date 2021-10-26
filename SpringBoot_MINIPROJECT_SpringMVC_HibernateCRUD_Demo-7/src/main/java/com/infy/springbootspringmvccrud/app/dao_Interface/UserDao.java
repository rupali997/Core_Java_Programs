package com.infy.springbootspringmvccrud.app.dao_Interface;

import java.util.List;

import com.infy.springbootspringmvccrud.app.model.User;

public interface UserDao {

	int saveUser(User u);

	
	List<User> getAllUsers(int i);

	

	User loginCheck(User u);

	void deleteUser(User u);


	User getSingleUserData(User u);


	void updateData(User u);

	

	
}
