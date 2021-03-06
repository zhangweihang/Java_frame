package com.ihtc.listener;

import java.util.HashMap;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyListener implements HttpSessionListener{

	public static HashMap<String,HttpSession> map = new HashMap<>();
	
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		
		HttpSession hs = arg0.getSession();
		String id = hs.getId();
		System.out.println("创建"+id);
		map.put(id,hs);
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		
		String id = arg0.getSession().getId();
		System.out.println("销毁"+id);
		map.remove(id);
		
	}

}
