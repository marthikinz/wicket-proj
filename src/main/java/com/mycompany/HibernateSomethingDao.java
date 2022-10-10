package com.mycompany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateSomethingDao {
	
	private SessionFactory factory;
	public void setSessionFactory(SessionFactory factory)
	{
		this.factory = factory;
	}
	protected Session getSession()
	{
		return factory.getCurrentSession();
	}

	public Something load(long id) {
		return (Something)getSession().get(Something.class, Long.valueOf(id));
	}

	public Something save(Something something) {
		return (Something)getSession().merge(something);
	}

	public int count(Something filter) {
		return 0;
	}

}
