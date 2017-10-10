package com.qm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.qm.bean.Ordertbl;
import com.qm.bean.Tabletbl;
import com.qm.entity.PageBean;

@Repository
public interface TabletblMapper {
//	用id删除
    int deleteByPrimaryKey(Integer id);
    
//添加一条字段（所有数据）
    int insert(Tabletbl record);
//添加某一个数据（根据表结构来判断）
    int insertSelective(Tabletbl record);
//根据id来查询
    List<Tabletbl> selectBy();
    
    Tabletbl select(Integer id);
//根据id修改某一数据
    int updateByPrimaryKeySelective(Tabletbl record);
//根据id修改所有的数据
    int updateByPrimaryKey(Tabletbl record);
    
    List<Tabletbl> selectPage(PageBean page);
}