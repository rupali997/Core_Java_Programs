package com.infy.springbootmvcjpacrud.app.service_Interface;

import com.infy.springbootmvcjpacrud.app.model.User;

public interface UserService {

	void saveData(User u);

	User loginCheck(String username, String password);

	Iterable<User> getAllUserbyRid(int i);

	User getSingleData(int uid);

	void deleteUser(User u);

	Iterable<User> getAllData();

}
