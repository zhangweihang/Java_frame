package com.ihtc.manytomany;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.ihtc.utils.HibernateUtil;

public class ManyToManyTest {
	
	@Test
	public void test1(){
		
		Session session = HibernateUtil.getCurrentSession();
		Transaction tr = session.beginTransaction();
		
		User u1 = new User();
		u1.setUname("关羽");
		User u2 = new User();
		u2.setUname("张飞");
		
		Role r1 = new Role();
		r1.setRname("小乔");
		Role r2 = new Role();
		r2.setRname("大乔");
		
		u1.getRoles().add(r1);
		u1.getRoles().add(r2);
		u2.getRoles().add(r1);
		u2.getRoles().add(r2);
		r1.getUsers().add(u1);
		r1.getUsers().add(u2);
		r2.getUsers().add(u1);
		r2.getUsers().add(u2);
		
		session.save(u1);
		/*session.save(u2);
		session.save(r1);
		session.save(r2);*/
		
		
		tr.commit();
		
	}

	@Test
	public void test2(){
		
		Session session = HibernateUtil.getCurrentSession();
		Transaction tr = session.beginTransaction();
		
		User user = session.get(User.class, 1L);
		user.setUname("0.00");
		
		session.update(user);
		
		tr.commit();
		
	}

	@Test
	public void test3(){
		
		Session session = HibernateUtil.getCurrentSession();
		Transaction tr = session.beginTransaction();
		
		User user = session.get(User.class, 1L);
		Role role = session.get(Role.class, 1L);
		user.getRoles().remove(role);
		
		tr.commit();
		
	}
	
}