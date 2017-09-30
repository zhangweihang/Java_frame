package com.ihtc.jstl;

public class Student {

	private String name;
	private int age;
	private String sex;
	private double weight;
	
	public Student() {
	}

	public Student(String name, int age, String sex, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", sex=" + sex + ", weight=" + weight + "]";
	}
	
	
	
}
