package com.qm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.qm.bean.Menutypetbl;

@Repository
public interface MenutypetblMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Menutypetbl record);

    int insertSelective(Menutypetbl record);

    Menutypetbl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Menutypetbl record);

    int updateByPrimaryKey(Menutypetbl record);
    
    List<Menutypetbl> seleceId(Integer id);
    
    List<Menutypetbl> selectAll(int id);
    
    Menutypetbl selectNID(String name);
}