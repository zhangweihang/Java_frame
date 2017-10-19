package com.ihtc.aopJdbc;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JDBCI {

	@Resource(name="jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	@Test
	public void test1(){
		int insert = jdbcTemplate.update("insert into t_account(user_name,user_money) value(?,?)","东风不败dbcp",111111);
		System.out.println(insert);
	}
	
}
