package com.infy.springmvc.daoimpl;

import java.util.List;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.infy.springmvc.daoi.UserDao;
import com.infy.springmvc.model.User;


@Repository
public class UserDaoImpl implements UserDao{
	@Autowired
	SessionFactory sf;

	@Override
	public void savedata(User u) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(u);
		tx.commit();
		session.close();
		
	}

	@Override
	public User logincheck(User u) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		User unew=null;
		
		try {
			Query query = session.createQuery("from User where login.username='"+u.getLogin().getUsername()+"' and login.password='"+u.getLogin().getPassword()+"'");
			User u1 = (User)query.getSingleResult();
			unew=u1;
			
		} catch (NoResultException e) {
			System.out.println("No Such Result Found");
			return unew;
		}
		
	return unew;
	
	}

	@Override
	public List<User> displayList(int i) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		List<User> ul = session.createQuery("from User where role.rid='"+i+"'").getResultList();
		tx.commit();
		session.close();
		return ul;
	}

	@Override
	public User getSingleUserData(User u) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		User user = session.get(User.class, u.getUid());
		return user;
	}

	@Override
	public void deleteUserData(User u) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(u);
		tx.commit();
		session.close();
	}







	
	
	
	

}
