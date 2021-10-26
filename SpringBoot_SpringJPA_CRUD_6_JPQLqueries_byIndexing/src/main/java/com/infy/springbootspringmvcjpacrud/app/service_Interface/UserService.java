package com.infy.springbootspringmvcjpacrud.app.service_Interface;

import java.util.List;

import com.infy.springbootspringmvcjpacrud.app.model.User;

public interface UserService {

	void saveData(User u);

	List<User> loginCheck(String username, String password);

	Iterable<User> getAllUsers();

	User editUser(int uid);

	void updateUser(User u);

	void deleteUser(User u);

	

}
