package com.infy.springbootspringmvccrud.app.dao_Implementation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.infy.springbootspringmvccrud.app.dao_Interface.StudentDao;
import com.infy.springbootspringmvccrud.app.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao{

	@Autowired
	SessionFactory sf;
	
	@Override
	public void saveUser(Student s) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(s);
		tx.commit();
		session.close();
		
	}

	@Override
	public int loginCheck(String username, String password) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from Student where username=:un and password=:ps");
		query.setParameter("un", username);
		query.setParameter("ps", password);
		
		List<Student> lis = query.getResultList();
		if(lis.isEmpty()){
			System.out.println("No Data Found!!");
			return 0;
		}
		
		return 1;
	}

	@Override
	public List<Student> getAllStudents() {
		Session session = sf.openSession();
		
		return session.createQuery("from Student").getResultList();
	}

	@Override
	public Student editUser(int sid) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		return session.get(Student.class, sid);
	}

	@Override
	public void updateUser(Student s) {
		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.update(s);
		tx.commit();
		session.close();
	}

	@Override
	public int deleteStudent(int sid) {
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("delete from Student where sid=:id");
		query.setParameter("id", sid);
		int x = query.executeUpdate();
		tx.commit();
		return x;
	}

}
