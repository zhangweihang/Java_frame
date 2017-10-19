package com.ihtc.demo8;

import com.opensymphony.xwork2.ActionSupport;

public class AnimalAction extends ActionSupport{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		System.out.println("吃饭 ... ");
		
		return NONE;
	}
	

}
