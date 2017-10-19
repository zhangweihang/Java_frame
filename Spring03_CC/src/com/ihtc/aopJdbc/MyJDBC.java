package com.ihtc.aopJdbc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class MyJDBC {

	JdbcTemplate template;
	
	@Before
	public void setUp() throws Exception {
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/ithc");
		dataSource.setUsername("root");
		dataSource.setPassword("123456");
		
		template = new JdbcTemplate();
		template.setDataSource(dataSource);
			
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		
		int insert = template.update("insert into t_account(user_name,user_money) value(?,?)","菲兹",9999);
		System.out.println(insert);
		
	}

}
