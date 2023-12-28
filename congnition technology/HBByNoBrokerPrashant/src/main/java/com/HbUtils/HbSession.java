package com.HbUtils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HbSession {

	private static final SessionFactory sessionFactory = buildSessionFactory();
	private static SessionFactory buildSessionFactory() {
		// TODO Auto-generated method stub
		try {
			// Create the SessionFactory from hibernate.cfg.xml
			return new Configuration().configure().buildSessionFactory();
			//SessionFactory sessionFactory=Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}

	