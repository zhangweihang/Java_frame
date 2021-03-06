package com.ihtc.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ihtc.util.DBUtil;
import com.ihtc.util.PageCount;
import com.ihtc.util.Person;

public class PersonDAOImpl implements PersonDAO{

	@Override
	public ArrayList<Person> findAll() {
		
		PreparedStatement ps = null;
		
		try {
			
			ps = DBUtil.getConn().prepareStatement("select * from person");
			ResultSet rs = ps.executeQuery();
			ArrayList<Person> list = new ArrayList<>();
			
			while(rs.next()){
				Person p = new Person(rs.getInt("_id"),rs.getString("_username"),rs.getString("_phonenumber"),rs.getString("_email"));
				list.add(p);
			}
			
			return list;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			
			if(ps != null){
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			DBUtil.close();
			
		}
		
		return null;
		
	}

	@Override
	public ArrayList<Person> findByPage(int startPage) {
		
		PreparedStatement ps = null;
		try {
			
			ps = DBUtil.getConn().prepareStatement("select * from person limit ?,?");
			ps.setInt(1, startPage);
			ps.setInt(2, PageCount.PAGE_SIZE);
			
			ResultSet rs = ps.executeQuery();
			ArrayList<Person> list = new ArrayList<>();
			
			while(rs.next()){
				Person p = new Person(rs.getInt("_id"),rs.getString("_username"),rs.getString("_phonenumber"),rs.getString("_email"));
				list.add(p);
			}
			
			return list;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			
			if(ps != null){
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			DBUtil.close();
			
		}
		
		return null;
		
	}
	
}