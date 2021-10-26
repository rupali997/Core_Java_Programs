package com.infy.springbootspringmvccrud.app.dao_Implementation;

import java.util.ArrayList;
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
public class UserDaoImpl implements UserDao {

	@Autowired
	SessionFactory sf;

	@Override
	public void saveUser(User u) {
		Session session = sf.openSession();

		session.save(u);
		session.beginTransaction().commit();
	}

	@Override
	public int loginCheck(String username, String password) {

		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from User where username=:un and password=:ps");
		query.setParameter("un", username);
		query.setParameter("ps", password);

		List<User> ulis = query.getResultList();
		if (ulis.isEmpty()) {
			System.out.println("No Data Found!!!!");
			return 0;
		}
		return 1;

	}

	@Override
	public List<User> getAllUsers() {
		Session session = sf.openSession();

		return session.createQuery("from User").getResultList();
	}

	@Override
	public int deleteUser(int uid) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("delete from User where uid=:id");
		query.setParameter("id", uid);

		int x = query.executeUpdate();

		tx.commit();
		return x;

	}

	@Override
	public User editUser(int uid) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		return session.get(User.class, uid);
	}

	@Override
	public void updateUser(User u) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		session.update(u);
		tx.commit();
	}

}
