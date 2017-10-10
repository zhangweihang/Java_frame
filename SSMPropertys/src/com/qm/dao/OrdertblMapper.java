package com.qm.dao;

import org.springframework.stereotype.Repository;

import com.qm.bean.Ordertbl;

@Repository
public interface OrdertblMapper {
    int deleteByPrimaryKey(Integer TableID);

    int insert(Ordertbl record);

    int insertSelective(Ordertbl record);

    Ordertbl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ordertbl record);

    int updateByPrimaryKey(Ordertbl record);
}