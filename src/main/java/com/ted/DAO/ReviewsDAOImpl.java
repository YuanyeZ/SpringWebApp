package com.ted.DAO;

import java.util.List;

import org.hibernate.SessionFactory;

import com.ted.Model.Reviews;

public class ReviewsDAOImpl implements ReviewsDAO {

	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void add(Reviews review) {
		this.sessionFactory.getCurrentSession().persist(review);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Reviews> getAll() {
		String hql = "FROM Reviews";
		return this.sessionFactory.getCurrentSession().createQuery(hql).list();
	}

	@Override
	public void edit(Reviews review) {
		this.sessionFactory.getCurrentSession().update(review);
	}

//	@Override
//	public void delete(String cam_mod) {
//		Session session = this.sessionFactory.getCurrentSession();
//		Reviews rev = (Reviews) session.load(Reviews.class, new String(cam_mod));
//		if(rev != null){
//			session.delete(rev);
//		}
//
//	}

}
