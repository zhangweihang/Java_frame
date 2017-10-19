package com.ihtc.demo1;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		System.out.println("默认的方法");
		return NONE;
	}
	
	public String eat(){
		System.out.println("吃吃吃吃鸡");
		return NONE;
	}
	
	public String sleep(){
		System.out.println("睡睡睡睡起来(｡･∀･)ﾉﾞ嗨");
		return NONE;
	}
	
}
