package com.qm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qm.bean.Menutypetbl;
import com.qm.dao.MenutypetblMapper;

@Service
public class UserTypetbl {

	@Autowired
	MenutypetblMapper menutypetblMapper;
	
	int insertSelective(Menutypetbl record){
		return menutypetblMapper.insertSelective(record);
		
	}
}
