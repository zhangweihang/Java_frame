package com.ihtc.demo;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoCookie extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = URLEncoder.encode("姓名", "utf-8");
		String value = URLEncoder.encode("小郭", "utf-8");
		
		Cookie coo = new Cookie(name,value);
		coo.setMaxAge(60);
		
		resp.addCookie(coo);
		
		Cookie[] c = req.getCookies();
		
		if(c != null){
			
			for(Cookie cc : c){
				String keyName = URLDecoder.decode(cc.getName(),"utf-8");
				String keyValue = URLDecoder.decode(cc.getValue(),"utf-8");
				System.out.println(keyName+","+keyValue);
			}
			
		}
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

}
