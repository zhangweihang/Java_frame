package com.ihtc.demo2;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class Demo2Action extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String execute() throws Exception {
		
		HttpServletRequest req = ServletActionContext.getRequest();
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		
		System.out.println(new String(name.getBytes("ISO-8859-1"),"utf-8"));
		System.out.println(name);
		System.out.println(new String(password.getBytes("ISO-8859-1"),"utf-8"));
		System.out.println(password);

		return SUCCESS;
		
	}

}
