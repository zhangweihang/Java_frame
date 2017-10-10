package com.qm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qm.bean.Tabletbl;
import com.qm.bean.Usertbl;
import com.qm.dao.TabletblMapper;
import com.qm.dao.UsertblMapper;

@Service
public class UserUtbl {

	@Autowired
	UsertblMapper usertblMapper;
	
	public Usertbl selectBy(String username){
		return usertblMapper.select(username);
		
	}
	
	public int updateByPrimaryKeySelective(Usertbl record){
		
		return usertblMapper.updateByPrimaryKeySelective(record);
		
	}
	
	public Usertbl selectAll(){
	
		return usertblMapper.selectAll();
	}
	

	
	
	
	
}
