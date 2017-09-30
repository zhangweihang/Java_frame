package com.ihtc.jstl;

public class Person {

	private int id;
	private Student stu;
	
	public Person() {
		
	}
	
	public Person(int id, Student stu) {
		super();
		this.id = id;
		this.stu = stu;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Student getStu() {
		return stu;
	}
	public void setStu(Student stu) {
		this.stu = stu;
	}
	
	
	
}
