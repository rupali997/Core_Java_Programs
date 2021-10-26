package com.infy.springbootspringmvccrud.app.dao_Interface;

import java.util.List;

import com.infy.springbootspringmvccrud.app.model.User;

public interface UserDao {

	public void saveUser(User u);

	public int loginCheck(String username, String password);

	public List<User> getAllUsers();

	public int deleteUser(int uid);

	public User editUser(int uid);

	public void updateUser(User u);

}
