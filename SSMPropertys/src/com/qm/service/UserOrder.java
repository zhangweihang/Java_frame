package com.qm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qm.dao.OrdertblMapper;

@Service
public class UserOrder {

	@Autowired
	OrdertblMapper ordertblMapper;
	
	public int deleteByPrimaryKey(Integer id){
		
		return ordertblMapper.deleteByPrimaryKey(id);
	}
}
