package com.ihtc.bean;

public class Account {
	
	private int id;
	private String user_name;
	private double user_money;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public double getUser_money() {
		return user_money;
	}
	public void setUser_money(double user_money) {
		this.user_money = user_money;
	}
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", user_name=" + user_name + ", user_money=" + user_money + "]";
	}
	
}
