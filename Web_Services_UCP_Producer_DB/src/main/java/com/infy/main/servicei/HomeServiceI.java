package com.infy.main.servicei;

import java.util.List;

import com.infy.main.model.User;

public interface HomeServiceI {

	List<User> getAllDataFromUser();

	User saveDataUser(User u);

	void deleteDataById(int uid);

	List getDataByusAndPs(String username, String password);

}
