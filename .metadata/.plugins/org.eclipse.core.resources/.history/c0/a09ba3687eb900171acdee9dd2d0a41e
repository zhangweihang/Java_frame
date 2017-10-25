package com.ithc.demo;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.ithc.utils.HibernateUtils;

public class Demo {
	@Test
	public void run1() {

		Session session = HibernateUtils.getSession();

		Transaction tr = session.beginTransaction();

		Person person = new Person();

		person.setName("小名");
		person.setAge(20);
		// 上面部分的对象叫瞬时态 没有oid ,没有交给session

		session.save(person);// 这行执行完就是持久化状态

		tr.commit();
		session.close();// 这一步执行完叫托管状态
	}

	/**
	 * 持久化的状态有自动更新的能力
	 * 
	 * 更新之前先查询 , 能查出来就已经是持久化状态
	 */
	@Test
	public void run2() {

		Session session = HibernateUtils.getSession();

		Transaction tr = session.beginTransaction();

		Person person = session.get(Person.class, 2);

		person.setName("隔壁老宋");

		tr.commit();
		session.close();
	}

	/**
	 * 证明一级缓存的存在，最简单的方法就是查询两次(相同的数据)
	 */
	@Test
	public void run3() {
		Session session = HibernateUtils.getSession();

		Transaction tr = session.beginTransaction();

		Person person = session.get(Person.class, 2);
		System.out.println(person);
		System.out.println(" ---------------------------------  ");
		Person person2 = session.get(Person.class, 2);
		System.out.println(person2);

		tr.commit();
		session.close();
	}

	/**
	 * 保存信息的时候会返回一个id值，在用这个id值去查询
	 */
	@Test
	public void run4() {

		Session session = HibernateUtils.getSession();

		Transaction tr = session.beginTransaction();

		Person person = new Person();
		person.setName("老宋");
		person.setAge(45);

		Serializable id = session.save(person);

		Person person2 = session.get(Person.class, id);

		System.out.println(person2);

		tr.commit();
		session.close();

	}

	/**
	 * * Session.clear() -- 清空缓存。 Session.evict(Object entity) --
	 * 从一级缓存中清除指定的实体对象。 Session.flush() -- 刷出缓存
	 */
	@Test
	public void run5() {

		Session session = HibernateUtils.getSession();
		Transaction tr = session.beginTransaction();
		Person person = session.get(Person.class, 2);
		System.out.println(person);
		// 清空缓存
		session.clear();

		Person person2 = session.get(Person.class, 2);
		System.out.println(person2);
		tr.commit();
		session.close();
	}

	@Test
	public void run6() {
		Session session = HibernateUtils.getSession();
		Transaction tr = session.beginTransaction();

		Person person = session.get(Person.class, 2);
		System.out.println(person);
		// 从缓存中清楚指定对象
		session.evict(person);
		Person person2 = session.get(Person.class, 2);
		System.out.println(person2);
		tr.commit();
		session.close();
	}

	@Test
	public void run7() {
		Session session = HibernateUtils.getSession();
		Transaction tr = session.beginTransaction();
		Person person = session.get(Person.class, 2);
		System.out.println(person);
		// 刷出缓存
		session.flush();
		Person person2 = session.get(Person.class, 2);
		System.out.println(person2);
		tr.commit();
		session.close();

	}

	/**
	 * 乐观锁测试数据丢失
	 */
	@Test
	public void test1() {
		Session session = HibernateUtils.getSession();
		Transaction tr = session.beginTransaction();
		Person person1 = session.get(Person.class,3);
		person1.setName("隔壁老王");
		
		tr.commit();
		session.close();

	}

	@Test
	public void test2() {
		Session session = HibernateUtils.getSession();
		Transaction tr = session.beginTransaction();

		Person person2 = session.get(Person.class,3);
		person2.setAge(40);
		
		tr.commit();
		session.close();

	}

	/**
	 *  测试绑定本地session
	 */
	@Test
	public void run8(){
		Session currentSession = HibernateUtils.getCurrentSession();
		Transaction tr = currentSession.beginTransaction();
		Person person = new Person();
		person.setName("腾讯2");
		currentSession.save(person);
		tr.commit();
	}
	
	/**
	 *  Query 查询 
	 */
	Session session;
	Transaction tr;
	@Before
	public void before(){
	 session = HibernateUtils.getCurrentSession();
	 tr = session.beginTransaction();
	}
	@After
	public void after(){
		tr.commit();
	}
	
	@Test
	public void selectAll(){
		
		Query query = session.createQuery("from Person");
		// select * from h_person;
		List<Person> list = query.list();
		
		for (Person person : list) {
			
			System.out.println(person);
		}
	}
	@Test
	public void findById(){
		Query query = session.createQuery("from Person where id = ?");
		// ？ 的位置值 从 0 开始
		query.setInteger(0,3);
		List<Person> list = query.list();
		for (Person person : list) {
			System.out.println(person);
		}
	}
	@Test
	public void like(){
		Query query = session.createQuery("from Person where name like ?");
		query.setString(0,"%王");
		List<Person> list = query.list();
		for (Person person : list) {
			System.out.println(person);
		}
	}
	
	@Test
	public void aaa(){
		Query query = session.createQuery("from Person where name = :name and id = :id");
		query.setString("name","隔壁老王");
		query.setInteger("id",3);
		
		List<Person> list = query.list();
		for (Person person : list) {
			System.out.println(person);
		}
	}
}
