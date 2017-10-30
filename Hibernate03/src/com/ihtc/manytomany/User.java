package com.ihtc.manytomany;

import java.util.HashSet;
import java.util.Set;

public class User {
	
	private Long uid;
	private String uname;
	private String upassword;
	
	private Set<Role> roles = new HashSet<Role>();
	
	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
}
