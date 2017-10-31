package com.ihtc.hsql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ihtc.utils.HibernateUtil;

@SuppressWarnings("unchecked")
public class CriteriaTest_ByTheWay_InPassing_Passingly_Incidentally {

	private Session session;
	private Transaction tr;

	@Before
	public void before() {
		session = HibernateUtil.getCurrentSession();
		tr = session.beginTransaction();
	}

	@After
	public void after() {
		tr.commit();
	}

	@Test
	public void test1() {

		Criteria criteria = session.createCriteria(Linkman.class);
		List<Linkman> list = criteria.list();

		for (Linkman linkman : list) {
			System.out.println(linkman);
		}

	}

	@Test
	public void test2() {

		Criteria criteria = session.createCriteria(Linkman.class);
		criteria.addOrder(Order.desc("lkm_id"));
		List<Linkman> list = criteria.list();

		for (Linkman linkman : list) {
			System.out.println(linkman);
		}

	}

	@Test
	public void test3() {

		Criteria criteria = session.createCriteria(Linkman.class);
		criteria.setFirstResult(0);
		criteria.setMaxResults(5);
		List<Linkman> list = criteria.list();

		for (Linkman linkman : list) {
			System.out.println(linkman);
		}

	}

	/**
	 * 拼接条件查询 Restrictions.eq(propertyName, value) equals相等
	 * Restrictions.gt(propertyName, value) great than大于
	 * Restrictions.ge(propertyName, value) 大于等于 Restrictions.lt(propertyName,
	 * value) less than 小于 Restrictions.le(propertyName, value) 小于等于
	 * Restrictions.between(propertyName,low,high) 在low和high之间
	 * Restrictions.or(Restrictions...,Restrictions...) 或者
	 * Restrictions.like(propertyName, value) name like "%相同的部分%"
	 *
	 * 注意！！！！：criteria.add(Restrictions....)可以多次添加
	 */
	@Test
	public void test4() {

		Criteria criteria = session.createCriteria(Linkman.class);
		/* select * from linkman where lkm_name = "令狐冲" */
		criteria.add(Restrictions.eq("lkm_name", "令狐冲"));
		List<Linkman> list = criteria.list();

		for (Linkman linkman : list) {
			System.out.println(linkman);
		}

	}
	/**
	 *聚合函数
	*/
	@Test
	public void test5() {

		Criteria criteria = session.createCriteria(Linkman.class);
		criteria.setProjection(Projections.sum("lkm_id"));
		long value = (long) criteria.list().get(0);
		System.out.println(value);

	}
	/**
	 *离线查询
	*/
	@Test
	public void test6() {

		DetachedCriteria dc = DetachedCriteria.forClass(Linkman.class);
		//查询所有
		List<Linkman> list = dc.getExecutableCriteria(session).list();
		
		for (Linkman linkman : list) {
			System.out.println(linkman);
		}
		
		
	}
	
	/**
	*HQL多表查询
	*/
	@Test
	public void test7() {
		
		Query query = session.createQuery("from Customer c inner join c.linkmans");
		
		List<Object[]> list = query.list();
		
		for (Object[] objects : list) {
			System.out.println(Arrays.toString(objects));
		}
		
	}

	@Test
	public void test8() {
		
		Query query = session.createQuery("from Customer c inner join fetch c.linkmans");
		
		List<Customer> list = query.list();
		
		for (Customer objects : list) {
			System.out.println(objects);
			/*
			for (Linkman linkman : objects.getLinkmans()) {
				System.out.println(linkman);
			}
			*/
		}
		
	}

	@Test
	public void test9() {
		
		Query query = session.createQuery("from Customer c left join c.linkmans");
		
		List<Object[]> list = query.list();
		
		for (Object[] objects : list) {
			System.out.println(Arrays.toString(objects));
		}
		
	}
	
	/**
	*延时加载
	*/
	@Test
	public void test10() {
		
		Customer c = session.get(Customer.class, 1L);
		System.out.println("看看你究竟有没有延时加载");
		System.out.println(c);
		
		System.out.println("----------------------");
		
		System.out.println(c.getLinkmans().size());
		
	}

}
