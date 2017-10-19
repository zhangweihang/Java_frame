package com.ihtc.two;

import com.opensymphony.xwork2.ActionSupport;

public class ShortM extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String execute() throws Exception {
		System.out.println("默认方法");
		return NONE;
	}
	
	public String m1(){
		System.out.println("m1");
		return NONE;
	}
	
	
	public String m2(){
		System.out.println("m2_login");
		return LOGIN;
	}
	
}
