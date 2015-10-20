package com.ted.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.ted.Model.Camera;

public class CameraDAOImpl implements CameraDAO {

	
	//private static final Logger logger = LoggerFactory.getLogger(UserDAOImplement.class);
	
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void add(Camera cam) {
		this.sessionFactory.getCurrentSession().persist(cam);
	}

	@Override
	public void update(Camera cam) {
		this.sessionFactory.getCurrentSession().update(cam);
	}
	
	@Override
	public void delete(String model){
		Session session = this.sessionFactory.getCurrentSession();
		Camera cam = (Camera) session.load(Camera.class, new String(model));
		if(cam != null){
			session.delete(cam);
		}
	}

	@Override
	public Camera getCamByModel(String model) {
		Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(Camera.class);
		criteria.add(Restrictions.like("model", model));
		return (Camera) criteria.uniqueResult();
		//return (Camera)this.sessionFactory.getCurrentSession().load(Camera.class, new String(model));
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Camera> getAllCams() {
		String hql = "FROM Camera";
		return this.sessionFactory.getCurrentSession().createQuery(hql).list();
	}

}
