package com.ihtc.demo4;

import com.opensymphony.xwork2.ActionSupport;

public class Demo4Action extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String password;
	private String feel;
	
	public void setName(String name) {
		System.out.println("uuuu");
		this.name = name;
	}

	public void setPassword(String password) {
		System.out.println("pppp");
		this.password = password;
	}
	
	public void setFeel(String feel) {
		System.out.println("ffff");
		this.feel = feel;
	}

	@Override
	public String execute() throws Exception {

		//a标签请求参数 如果是中文会乱码需要自己 new String(值.getBytes("ISO-8859-1"),"UTF-8")
		System.out.println( name +" : "+password+" : "+new String(feel.getBytes("ISO-8859-1"),"utf-8"));
		
		return NONE;
	}
	
	

}