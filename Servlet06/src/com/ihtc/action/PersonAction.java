package com.ihtc.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ihtc.service.PersonService;
import com.ihtc.util.PageCount;
import com.ihtc.util.Person;

@WebServlet(value="/persons")
public class PersonAction extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//设置默认当前页
	private int page = 1;
	private PersonService personService = new PersonService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ArrayList<Person> list = personService.findAll();
		
		try{
			page = Integer.parseInt(req.getParameter("page").trim());
			if(page < 2){
				page = 1;
			}
			if(page > list.size()/PageCount.PAGE_SIZE+1){
				page = list.size()/PageCount.PAGE_SIZE+1;
			}
		}catch(Exception e){
			page = 1;
		}
		
		ArrayList<Person> list2 = personService.findByPage((page-1)*8);
		HttpSession session = req.getSession();
		//保存数据集合
		session.setAttribute("list", list2);
		//保存页面数
		session.setAttribute("page", page);
		//保存总页面数
		session.setAttribute("pages", list.size()/PageCount.PAGE_SIZE+1);
		//总记录
		session.setAttribute("listS", list.size());
		
		req.getRequestDispatcher("index.jsp").forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
	
	
}
