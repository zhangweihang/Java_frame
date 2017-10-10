package com.qm.dao;

import org.springframework.stereotype.Repository;

import com.qm.bean.Usertbl;

@Repository
public interface UsertblMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Usertbl record);

    int insertSelective(Usertbl record);

    Usertbl select(String username);
    
    Usertbl selectAll();

    int updateByPrimaryKeySelective(Usertbl record);

    int updateByPrimaryKey(Usertbl record);
}