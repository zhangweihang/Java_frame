package com.ihtc.demo1;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Test1 {

	@Resource(name="accountService")
	AccountService accountService;
	
	@Test
	public void test1() {
		
		accountService.transfer(12, 13, 1);
		
	}

}
