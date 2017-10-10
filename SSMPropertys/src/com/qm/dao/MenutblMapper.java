package com.qm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.qm.bean.Menutbl;
import com.qm.entity.PageBean;
@Repository
public interface MenutblMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Menutbl record);

    int insertSelective(Menutbl record);

    Menutbl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Menutbl record);

    int updateByPrimaryKey(Menutbl record);
    
    List<Menutbl> selectLimit(PageBean page);
    
    List<Menutbl> selectAll();
    
    List<Menutbl> selectJoint();
    	
   
}