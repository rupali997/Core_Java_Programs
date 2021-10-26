package com.infy.springmvc.servicei;

import java.util.List;

import com.infy.springmvc.model.User;

public interface UserService {

	void savedata(User u);

	

	User logincheck(User u);



	List<User> displayList(int i);



	User getSingleUserData(User u);



	void deleteUserData(User u);



}
