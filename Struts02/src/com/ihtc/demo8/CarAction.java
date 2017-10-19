package com.ihtc.demo8;

import com.opensymphony.xwork2.ActionSupport;

public class CarAction extends ActionSupport{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		
		System.out.println("车开了 ... ");
		
		return NONE;
	}

}
