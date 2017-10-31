package com.ihtc.hsql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ihtc.utils.HibernateUtil;

@SuppressWarnings("unchecked")
public class HsqlTest {

	private Session session;
	private Transaction tr;
	
	@Before
	public void before(){
		 session = HibernateUtil.getCurrentSession();
		 tr = session.beginTransaction();
	}
	
	@After
	public void after(){
		tr.commit();
	}
	
	
	@Test
	public void test1(){
		
		Customer c = new Customer();
		c.setCust_name("东方不败");
		c.setCust_phone("785646");
		
		Linkman l1 = new Linkman();
		l1.setLkm_name("杨莲亭");
		l1.setLkm_qq("123123");
		
		Linkman l2 = new Linkman();
		l2.setLkm_name("令狐冲");
		l2.setLkm_qq("666666");
		
		c.getLinkmans().add(l1);
		c.getLinkmans().add(l2);
		l1.setCustomer(c);
		l2.setCustomer(c);
		
		session.save(c);
		
	}
	
	/**
	 * OID检索方式
	 */
	@Test
	public void test2(){
		
		Customer c = session.get(Customer.class, 1L);
		System.out.println(c+"-----------------------");
		
		System.out.println(c.getLinkmans().size()+"------------------------");
		
	}
	
	/**
	 *hql查询，支持方法链的格式
	 */
	@Test
	public void test3(){
		
		List<Customer> list = session.createQuery("from Customer order by cust_id desc").list();
		
		for (Customer customer : list) {
			System.out.println(customer);
		}
		
	}
	
	@Test
	public void test4(){
		
		Query query = session.createQuery("from Customer");
		query.setFirstResult(1);
		query.setMaxResults(2);
		
		List<Customer> list = query.list();
		
		for (Customer customer : list) {
			System.out.println(customer);
		}
		
	}
	
	/**
	 *下面还有几种类似的东西，由于本人比较懒。。。。。。
	 *1.select c.cust_name,c.cust_phone from Customer c;
	 *2.from Customer where cust_id<? and cust_name like ? order by cust_id desc;
	 *3.分页查询 session.createQuery("from Customer").setFirstResult(0).setMaxResult(10);
	 *4.select new Customer(c.cust_name,c.cust_phone) from Customer c,需要注意的是 Customer类中必须有这样一个构造器！
	 *5.聚合函数。select count(c) from Customer c,一大堆，还有max,min,avg,sum
	 * 目前就这样
	 */


}