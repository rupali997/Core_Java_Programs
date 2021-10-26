package com.infy.springbootspringmvccrud.app.dao_Interface;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.infy.springbootspringmvccrud.app.model.User;

public interface UserDao extends CrudRepository<User, Integer>{

	int saveUser(User u);

	User loginCheck(User u);

//	List<User> getAllUsers();

	User getAllByLogin_UsernameAndLogin_Password(String username, String password);

	List<User> getAllUsers();

	//List<User> getAllUsers(int i);

}
