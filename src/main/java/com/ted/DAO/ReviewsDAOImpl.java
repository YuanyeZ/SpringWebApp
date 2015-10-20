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
	public List<Reviews> getAllReviews() {
		String hql = "FROM Reviews";
		return (List<Reviews>) this.sessionFactory.getCurrentSession().
				//createSQLQuery("SELECT * FROM REVIEWS").list();
				createQuery(hql).list();
	}

	@Override
	public void edit(Reviews review) {
		this.sessionFactory.getCurrentSession().update(review);
	}

//	@Override
//	public List<Reviews> getReviewsByCamera(String model) {
//		Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(Reviews.class);
//		criteria.add(Restrictions.like("camera", model));
//		@SuppressWarnings("unchecked")
//		List<Reviews> results = (List<Reviews>)criteria.list();
//		return results;
//	}

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
