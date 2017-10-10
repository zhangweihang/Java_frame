package com.qm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qm.bean.Menutypetbl;
import com.qm.dao.MenutypetblMapper;

@Service
public class Usermenutype {

	@Autowired
	MenutypetblMapper menutypetblMapper;
	
	public List<Menutypetbl> seleceId(Integer id){
		return menutypetblMapper.seleceId(id);
		
	}
	
	public  List<Menutypetbl> selectAll(int id){
		
		return menutypetblMapper.selectAll(id);
	}
	
	public Menutypetbl selectNID(String name){
		return menutypetblMapper.selectNID(name);
		
	}
}
