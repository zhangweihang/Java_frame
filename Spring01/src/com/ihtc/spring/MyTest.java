package com.ihtc.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

	@Test
	public void run1(){
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserServiceImpl us = (UserServiceImpl)ac.getBean("userService");
		us.play();
	}
	
	@Test
	public void run2(){
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Car car = (Car)ac.getBean("car");
		System.out.println(car);
	}
	
}
