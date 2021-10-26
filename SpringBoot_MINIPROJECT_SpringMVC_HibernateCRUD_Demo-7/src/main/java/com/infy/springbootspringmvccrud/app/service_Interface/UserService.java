package com.infy.springbootspringmvccrud.app.service_Interface;

import java.util.List;

import com.infy.springbootspringmvccrud.app.model.User;

public interface UserService {

	int saveUser(User u);

	void deleteUser(User u);

	List<User> getAllUsers(int i);

	
	User loginCheck(User u);

	User getSingleUserData(User u);

	void updateData(User u);


	

}
