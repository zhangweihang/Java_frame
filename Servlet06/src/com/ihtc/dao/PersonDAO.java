package com.ihtc.dao;

import java.util.ArrayList;

import com.ihtc.util.Person;

public interface PersonDAO {
	
	ArrayList<Person> findAll();
	ArrayList<Person> findByPage(int startPage);
	
}
