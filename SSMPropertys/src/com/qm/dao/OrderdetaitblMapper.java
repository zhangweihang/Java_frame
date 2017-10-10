package com.qm.dao;

import org.springframework.stereotype.Repository;

import com.qm.bean.Orderdetaitbl;

@Repository
public interface OrderdetaitblMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Orderdetaitbl record);

    int insertSelective(Orderdetaitbl record);

    Orderdetaitbl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Orderdetaitbl record);

    int updateByPrimaryKey(Orderdetaitbl record);
}