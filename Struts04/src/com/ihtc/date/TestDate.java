package com.ihtc.date;

import com.opensymphony.xwork2.ActionSupport;

public class TestDate extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String date;

	public void setDate(String date) {
		this.date = date;
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println(date);
		return NONE;
	}

}
