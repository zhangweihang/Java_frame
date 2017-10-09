package com.ithc.service;

import java.util.List;

import com.ithc.bean.Persons;
import com.ithc.dao.PersonsDao;
import com.ithc.dao.PersonsDaoImpl;

public class PersonsServiceImpl implements PersonsService {

	private PersonsDao personsDao = new PersonsDaoImpl();
	
	@Override
	public List<Persons> findAll() {
		return personsDao.findAll();
	}

	@Override
	public List<Persons> findByPage(int startPage) {
		return personsDao.findByPage(startPage);
	}

}
