package com.ihtc.service;

import java.util.ArrayList;

import com.ihtc.dao.PersonDAO;
import com.ihtc.dao.PersonDAOImpl;
import com.ihtc.util.Person;

public class PersonService {

	private PersonDAO pd = new PersonDAOImpl();
	
	public ArrayList<Person> findAll(){
		return pd.findAll();
	}

	public ArrayList<Person> findByPage(int startPage){
		return pd.findByPage(startPage);
	}
	
}
