package com.ihtc.spring;

public class UserServiceImpl {

	private UserDaoImpl ud = new UserDaoImpl();

	public void play(){
		ud.play();
		System.out.println("Service在玩");
	}
	
	public void init(){
		System.out.println("init");
	}

	public void destory(){
		System.out.println("destory");
	}
	
}
