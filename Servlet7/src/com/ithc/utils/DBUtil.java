package com.ithc.utils;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {
	private static Connection conn;
	private static Properties pt;
	private static String url;
	private static String username;
	private static String password;
	
	
	static{
		pt = new Properties();
		InputStream in = DBUtil.class.getResourceAsStream("/db.properties");
		try {
			pt.load(in);
			Class.forName(pt.getProperty("db_driver"));
			url = pt.getProperty("db_url");
			username = pt.getProperty("db_username");
			password = pt.getProperty("db_password");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConn(){
		
		try {
			conn = DriverManager.getConnection(url, username, password);
			return conn;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void close(){
		try {
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
