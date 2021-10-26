package com.infy.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.main.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	List findAllByUsernameAndPassword(String username, String password);

}
