package com.ihtc.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	public static Session getCurrentSession(){
		
		Configuration config = new Configuration().configure();
		SessionFactory factory = config.buildSessionFactory();
		return factory.getCurrentSession();
		
	}
	
}