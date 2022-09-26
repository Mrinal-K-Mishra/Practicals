package com.maven.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernateutil {
	private static SessionFactory sessionFactory;
	static { 
		try {	//try block
			
			sessionFactory= new Configuration().configure().buildSessionFactory();
	}
	catch(Exception e) { 	//exception handling
		System.out.println(e);
		} 
	}
	public static SessionFactory getSessionFactory() {
	return sessionFactory;
	}
}