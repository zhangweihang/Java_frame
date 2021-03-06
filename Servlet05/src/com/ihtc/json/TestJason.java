package com.ihtc.json;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
public class TestJason {

	public JsonArray select(){
		
		JsonArray ja = new JsonArray();
		PreparedStatement ps = null;
		try {
			
			ps = DBUtil.getCon().prepareStatement("select * from user");
			ResultSet rs = ps.executeQuery();
			//获取目标数据
			ResultSetMetaData rsmd = rs.getMetaData();
			//获取目标数量
			int column = rsmd.getColumnCount();
			
			while(rs.next()){
				
				JsonObject jo = new JsonObject();
				
				for(int i = 1;i<=column;i++){
					
					String key = rsmd.getColumnLabel(i);
					String value = rs.getString(key);
					jo.addProperty(key, value);
					
				}
				
				ja.add(jo);
				
			}
			return ja;
			
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
			
		}
		
		
		
		return null;
	}

}
