package com.ithc.service;

import java.util.List;

import com.ithc.bean.Persons;

public interface PersonsService {

	List<Persons> findAll();

	List<Persons> findByPage(int startPage);

}
