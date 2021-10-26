package com.infy.springbootjparestapicrud.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.springbootjparestapicrud.app.model.User;

@Repository
public interface UserDaoRepository extends JpaRepository<User, Integer> {

}
