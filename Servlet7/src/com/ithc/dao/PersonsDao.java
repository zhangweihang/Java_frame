package com.ithc.dao;

import java.util.List;

import com.ithc.bean.Persons;

public interface PersonsDao {

	List<Persons> findAll();

	List<Persons> findByPage(int startPage);

}
