package com.infy.springbootmvcjpacrud.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.springbootmvcjpacrud.app.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer>{

	User findAllByLogin_UsernameAndLogin_Password(String username, String password);

	Iterable<User> findAllDataByRole_Rid(int i);

	User findAllByUid(int uid);

}
