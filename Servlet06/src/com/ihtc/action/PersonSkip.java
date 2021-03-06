package com.ihtc.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ihtc.service.PersonService;
import com.ihtc.util.PageCount;
import com.ihtc.util.Person;

public class PersonSkip extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//设置默认当前页
	private int page = -1;
	private PersonService personService = new PersonService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ArrayList<Person> list = personService.findAll();
		
		try{
			page = Integer.parseInt(req.getParameter("skipage").trim());
			if(page < 2){
				page = 1;
			}
			if(page > list.size()/PageCount.PAGE_SIZE+1){
				page = list.size()/PageCount.PAGE_SIZE+1;
			}
		}catch(Exception e){
			resp.sendRedirect(req.getHeader("referer"));
			return;
		}
		
		resp.sendRedirect("http://localhost:8080/Servlet06/persons?page="+page);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
	
	
}
