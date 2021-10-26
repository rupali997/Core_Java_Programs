package com.infy.springbootspringmvccrud.app.dao_Implementation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.infy.springbootspringmvccrud.app.dao_Interface.UserDao;
import com.infy.springbootspringmvccrud.app.model.User;

@Repository
public class UserDaoImpl implements UserDao{
	
	@Autowired
	SessionFactory sf;

	@Override
	public int saveUser(User u) {
		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(u);
		tx.commit();
		return u.getUid();
		
	}

	@Override
	public User loginCheck(User u) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		User newuser=null;
		try {
			Query query = session.createQuery("from User where login.username='"+u.getLogin().getUsername()+"' and login.password='"+u.getLogin().getPassword()+"'");
			User u1 = (User) query.getResultList();
			newuser=u1;
			
			
		}catch(Exception e){
			System.out.println("No Data Found!!");
			return newuser;
		}
		return newuser;
		
		
	}

	@Override
	public List<User> getAllUsers() {
		Session session = sf.openSession();

		return session.createQuery("from User").getResultList();
	}

}
