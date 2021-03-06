package com.ihtc.listener;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ListenerTest extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ArrayList<String> list = new ArrayList<>();
		String[] strs = req.getParameterValues("shop");
		for(String str : strs){
			list.add(str);
		}
		Shop shop = new Shop();
		shop.setList(list);
		
		HttpSession hs = req.getSession();
		hs.setMaxInactiveInterval(10);
		resp.sendRedirect("listener.jsp?id="+hs.getId());
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

}
