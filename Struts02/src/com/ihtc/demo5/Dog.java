package com.ihtc.demo5;

import java.io.UnsupportedEncodingException;

public class Dog {

	private String name;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		try {
			return "Dog [name=" + new String(name.getBytes("ISO-8859-1"),"utf-8") + ", password=" + new String(password.getBytes("ISO-8859-1"),"utf-8") + "]";
		} catch (UnsupportedEncodingException e) {
			return "Dog [name=" + name + ", password=" + password + "]";
		}
		
	}
	
}
