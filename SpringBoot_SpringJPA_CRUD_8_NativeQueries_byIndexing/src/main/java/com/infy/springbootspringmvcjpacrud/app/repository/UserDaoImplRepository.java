package com.infy.springbootspringmvcjpacrud.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.infy.springbootspringmvcjpacrud.app.model.User;

@Repository
public interface UserDaoImplRepository extends JpaRepository<User, Integer>{

	@Query(value="select * from User where username=?1 and password=?2",nativeQuery=true)
	List<User> findAllByUsernameAndPassword(String username,String password);

	@Query(value="select * from User",nativeQuery=true)
	Iterable<User> findAllUser();

	@Modifying
	@Query(value="delete from User where uid=?1",nativeQuery=true)
	int deleteByUid(int uid);

	

//	@Modifying
//	@Query(value="select * from User where uid=:id",nativeQuery=true)
	User findAllUsersByUid(int uid);

}
