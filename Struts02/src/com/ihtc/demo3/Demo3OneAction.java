package com.ihtc.demo3;

import com.opensymphony.xwork2.ActionSupport;

public class Demo3OneAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		
		System.out.println("one ... ");
		
		return "ok";
	}
	

}
