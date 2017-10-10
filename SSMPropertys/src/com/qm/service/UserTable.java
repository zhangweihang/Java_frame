package com.qm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qm.bean.Tabletbl;
import com.qm.dao.TabletblMapper;
import com.qm.entity.PageBean;

@Service
public class UserTable {

	@Autowired
	TabletblMapper tabletblMapper;
	
	
	public List<Tabletbl> selectBy(){
		 
		return tabletblMapper.selectBy();
		
	}
	
	public Tabletbl selectById(Integer id){
		
		
		return tabletblMapper.select(id);
		
	}
	
	 public int updateByPrimaryKey(Tabletbl record){
		 
		return tabletblMapper.updateByPrimaryKey(record);
	 }
	 

	 public  int deleteByPrimaryKey(Integer TableID){
		 
		return tabletblMapper.deleteByPrimaryKey(TableID);
		 
	 }
	 
	public List<Tabletbl> selectPage(PageBean page){
		return tabletblMapper.selectPage(page);
		
	}
	
	public int insertSelective(Tabletbl record){
		
		return tabletblMapper.insertSelective(record);
		
	}
}
