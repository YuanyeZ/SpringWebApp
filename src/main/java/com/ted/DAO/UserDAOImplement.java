package com.ted.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.stereotype.Repository;

import com.ted.Model.User;

@Repository
public class UserDAOImplement implements UserDAO {
	
	//private static final Logger logger = LoggerFactory.getLogger(UserDAOImplement.class);
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	

	@Override
	public void add(User user) {
//		Session session = this.sessionFactory.openSession();
//		try{
//			Transaction tx = session.beginTransaction();
//			session.persist(user);
//			tx.commit();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally{
//			session.close();
//		}
		this.sessionFactory.getCurrentSession().persist(user);
		//logger.info("User saved successfully, Person Details= " + user);
	}

	@Override
	public void update(User user) {
		this.sessionFactory.getCurrentSession().update(user);
		//logger.info("User updated successfully, Person Details= " + user);
	}

	@Override
	public void delete(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		User user = (User) session.load(User.class, new Integer(id));
		if(user != null){
			session.delete(user);
		}
		//logger.info("User deleted successfully, Person Details= " + user);
	}


	@Override
	public User getUser(int id) {
		User user = (User)sessionFactory.getCurrentSession().load(User.class, new Integer(id));
		//logger.info("User saved successfully, Person Details= " + user);
		return user;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUsers() {
		String hql = "FROM User";
		List<User> usersList = sessionFactory.getCurrentSession().createQuery(hql).list();
//		for(User u : usersList){
//			logger.info("Person List::" + u);
//		}
		return usersList;
	}

}
