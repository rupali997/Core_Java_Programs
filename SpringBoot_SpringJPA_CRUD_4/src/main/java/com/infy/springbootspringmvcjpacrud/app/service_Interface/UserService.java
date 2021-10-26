package com.infy.springbootspringmvcjpacrud.app.service_Interface;

import com.infy.springbootspringmvcjpacrud.app.model.User;

public interface UserService {

	void saveData(User u);

	User loginCheck(String username, String password);

	

	User getsingledatabyUid(int uid);

	void deleteUser(User u);

	Iterable<User> displayAllDataRid(int i);

}
