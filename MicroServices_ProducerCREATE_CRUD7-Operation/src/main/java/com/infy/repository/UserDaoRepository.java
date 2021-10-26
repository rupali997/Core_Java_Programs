package com.infy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.model.User;

@Repository
public interface UserDaoRepository extends JpaRepository<User, Integer> {

}
