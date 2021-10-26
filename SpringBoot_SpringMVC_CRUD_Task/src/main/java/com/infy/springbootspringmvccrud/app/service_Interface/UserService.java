package com.infy.springbootspringmvccrud.app.service_Interface;

import java.util.List;

import com.infy.springbootspringmvccrud.app.model.User;

public interface UserService {

	int saveUser(User u);

	User loginCheck(User u);

	List<User> getAllUsers(int i);

	User loginCheck(String username, String password);

}
