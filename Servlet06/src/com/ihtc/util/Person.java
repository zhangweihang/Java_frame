package com.ihtc.util;

public class Person {

	private int id;
	private String username;
	private String phoneNumber;
	private String email;
	
	public Person() {
		super();
	}
	
	public Person(int id, String username, String phoneNumber, String email) {
		super();
		this.id = id;
		this.username = username;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", username=" + username + ", phoneNumber=" + phoneNumber + ", email=" + email
				+ "]";
	}
	
}
