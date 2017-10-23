package com.ihtc.submit;

import com.opensymphony.xwork2.ActionSupport;

public class TestSubmit extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String execute() throws Exception {
		Thread.sleep(2000);
		return SUCCESS;
	}
	
}
