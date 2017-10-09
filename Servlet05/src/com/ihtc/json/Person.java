package com.ihtc.json;

import java.util.ArrayList;

public class Person {

	String name;
	int age;
	ArrayList<Student> list;
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person(String name, int age, ArrayList<Student> list) {
		super();
		this.name = name;
		this.age = age;
		this.list = list;
	}
	
}
class Student{
	int height;

	public Student(int height) {
		super();
		this.height = height;
	}

	@Override
	public String toString() {
		return "Student [height=" + height + "]";
	}
	
}