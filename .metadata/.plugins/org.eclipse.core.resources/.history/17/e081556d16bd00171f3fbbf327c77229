package com.ithc.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	public static final Configuration config;
	public static final SessionFactory factory;
	
	static{
		config = new Configuration().configure();
		factory = config.buildSessionFactory();
		
	}
	
	public static Session getSession(){
		return factory.openSession();
	}

	public static Session getCurrentSession(){
		
		return factory.getCurrentSession();
	}
	
	
	public static void main(String[] args) {
		
//		getSession();
		
	}
}
