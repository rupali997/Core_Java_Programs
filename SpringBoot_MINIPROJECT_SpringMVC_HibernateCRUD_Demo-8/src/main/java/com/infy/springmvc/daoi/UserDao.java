package com.infy.springmvc.daoi;

import java.util.List;

import com.infy.springmvc.model.User;

public interface UserDao {

	void savedata(User u);

	User logincheck(User u);

	List<User> displayList(int i);

	User getSingleUserData(User u);

	void deleteUserData(User u);



}
