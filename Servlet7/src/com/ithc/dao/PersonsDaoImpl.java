package com.ithc.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ithc.bean.Persons;
import com.ithc.utils.DBUtil;
import com.ithc.utils.PageBean;

public class PersonsDaoImpl implements PersonsDao {

	/**
	 *  查询所有数据
	 */
	@Override
	public List<Persons> findAll() {
		try {
			PreparedStatement ps = DBUtil.getConn().prepareStatement("select _id,_username,_phoneNumber,_email from persons");
			ResultSet rs = ps.executeQuery();
			List<Persons> list = new ArrayList<Persons>();
			while(rs.next()){
				Persons persons = new Persons();
				persons.set_id(rs.getInt("_id"));
				persons.set_username(rs.getString("_username"));
				persons.set_phoneNumber(rs.getString("_phoneNumber"));
				persons.set_email(rs.getString("_email"));
				list.add(persons);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	//分页查询
	@Override
	public List<Persons> findByPage(int startPage) {
		try {
			PreparedStatement ps = DBUtil.getConn().prepareStatement("select _id,_username,_phoneNumber,_email from persons limit ?,?");
			ps.setInt(1,startPage);
			ps.setInt(2, PageBean.PAGE_SIZE);
			ResultSet rs = ps.executeQuery();
			List<Persons> list = new ArrayList<Persons>();
			while(rs.next()){
				Persons persons = new Persons();
				persons.set_id(rs.getInt("_id"));
				persons.set_username(rs.getString("_username"));
				persons.set_phoneNumber(rs.getString("_phoneNumber"));
				persons.set_email(rs.getString("_email"));
				list.add(persons);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
