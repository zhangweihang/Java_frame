package com.ihtc.jstl;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PersonServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ArrayList<Person> ps = new ArrayList<>();
		
		for(int i = 0;i<10;i++){
			ps.add(new Person(i,new Student("张三"+i,15+i,"男"+i,60+i)));
		}
		
		
		req.getSession().setAttribute("list", ps);
		req.getRequestDispatcher("person.jsp").forward(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

}