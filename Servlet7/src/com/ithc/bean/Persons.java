package com.ithc.bean;

public class Persons {
	
	private int _id;
	private String _username;
	private String _phoneNumber;
	private String _email;
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public String get_username() {
		return _username;
	}
	public void set_username(String _username) {
		this._username = _username;
	}
	public String get_phoneNumber() {
		return _phoneNumber;
	}
	public void set_phoneNumber(String _phoneNumber) {
		this._phoneNumber = _phoneNumber;
	}
	public String get_email() {
		return _email;
	}
	public void set_email(String _email) {
		this._email = _email;
	}
	@Override
	public String toString() {
		return "Persons [_id=" + _id + ", _username=" + _username + ", _phoneNumber=" + _phoneNumber + ", _email="
				+ _email + "]";
	}

}
