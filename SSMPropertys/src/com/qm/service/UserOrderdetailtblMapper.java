package com.qm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qm.bean.Orderdetaitbl;
import com.qm.dao.OrderdetaitblMapper;

@Service
public class UserOrderdetailtblMapper {

	@Autowired
	OrderdetaitblMapper orderdetaitblMapper;
	
	 Orderdetaitbl selectByPrimaryKey(Integer id){
		return orderdetaitblMapper.selectByPrimaryKey(id);
		 
	 }
	 
	
}
