package com.mycompany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateSomethingDao implements SomethingDao {
	
	private SessionFactory factory;
	public void setSessionFactory(SessionFactory factory)
	{
		this.factory = factory;
	}
	protected Session getSession()
	{
		return factory.getCurrentSession();
	}

	@Override
	public Something load(long id) {
		return (Something)getSession().get(Something.class, Long.valueOf(id));
	}

	@Override
	public Something save(Something something) {
		return (Something)getSession().merge(something);
	}

	@Override
	public int count(Something filter) {
		// TODO Auto-generated method stub
		return 0;
	}

}
