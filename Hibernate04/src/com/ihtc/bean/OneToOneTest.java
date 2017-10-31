package com.ihtc.bean;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.ihtc.utils.HibernateUtil;

public class OneToOneTest {

	@Test
	public void test1(){
		Session session = HibernateUtil.getCurrentSession();
		Transaction tr = session.beginTransaction();
		
		Person person = new Person();
		person.setPname("西门吹雪222");
		
		IdCard c = new IdCard();
		c.setNumber("123456789x22xx");
		
		c.setPerson(person);
		
		session.save(c);
		
		tr.commit();
	}
	
}