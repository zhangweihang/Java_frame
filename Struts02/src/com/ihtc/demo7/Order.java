package com.ihtc.demo7;

public class Order {
	
	String number;
	
	String date;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Order [number=" + number + ", date=" + date + "]";
	}
	

}
