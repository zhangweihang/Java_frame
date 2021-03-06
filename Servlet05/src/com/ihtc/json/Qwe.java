package com.ihtc.json;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;

public class Qwe {
	
	Gson g;
	
	@Before
	public void setUp() throws Exception{
		g = new Gson();
	}
	
	@After
	public void tearDown() throws Exception{
	}
	
	@Test
	public void test1(){
		
		Person p = new Person("拉拉",10);
		String json = g.toJson(p);
		System.out.println(json);
		
	}
	
	@Test
	public void test2(){

		String json = "{\"name\":\"haha\",\"age\":46}";
		Person p = g.fromJson(json, Person.class);
		System.out.println(p.name);
		System.out.println(p.age);
		
	}

	@Test
	public void test3(){
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(180));
		list.add(new Student(178));
		
		Person p = new Person("拉拉",10,list);
		String json = g.toJson(p);
		System.out.println(json);
		
	}
	
	@Test
	public void test4(){

		String json = "{\"name\":\"拉拉\",\"age\":10,\"list\":[{\"height\":200},{\"height\":210}]}";
		Person p = g.fromJson(json, Person.class);
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.list.get(0));

	}
	
	
}
