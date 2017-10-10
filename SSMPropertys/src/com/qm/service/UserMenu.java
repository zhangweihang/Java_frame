package com.qm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qm.bean.Menutbl;
import com.qm.bean.Menutypetbl;
import com.qm.dao.MenutblMapper;
import com.qm.entity.PageBean;

@Service
public class UserMenu {

	@Autowired
	MenutblMapper menutblMapper;
	
	public List<Menutbl> selectLimit(PageBean page){
		return menutblMapper.selectLimit(page);
		
	}
	
	public  List<Menutbl> selectAll(){
		return menutblMapper.selectAll();
		
	}
	
	public Menutbl selectByPrimaryKey(Integer id){
		return menutblMapper.selectByPrimaryKey(id);
		
	}
	
	public  List<Menutbl> selectJoint(){
		
		return menutblMapper.selectJoint();
		
	}
	
	public int updateBy(Menutbl record){
		return menutblMapper.updateByPrimaryKeySelective(record);
	}
	

	

}
