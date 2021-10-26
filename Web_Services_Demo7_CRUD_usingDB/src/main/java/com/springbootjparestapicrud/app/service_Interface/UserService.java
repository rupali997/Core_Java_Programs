package com.springbootjparestapicrud.app.service_Interface;

import java.util.List;

import com.springbootjparestapicrud.app.model.User;

public interface UserService {

	User saveData(User u);

	List<User> getAllUser();

	User getSingleUser(int uid);

}
