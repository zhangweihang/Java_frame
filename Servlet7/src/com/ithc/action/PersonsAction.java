package com.ithc.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ithc.bean.Persons;
import com.ithc.service.PersonsService;
import com.ithc.service.PersonsServiceImpl;
import com.ithc.utils.PageBean;

@WebServlet(value="/persons")
public class PersonsAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//设置页面的默认值
	private int pages = 1;
	
	private PersonsService personsService = new PersonsServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//从页面获取点击前一页后一页的值
		try {
			pages = Integer.parseInt(req.getParameter("page").trim());
			if(pages < 2){
				pages = 1;
			}
		} catch (Exception e) {
			pages = 1;
		}
		
		
		HttpSession session = req.getSession();
		//查询所有
		List<Persons> list = personsService.findAll();
		
		//利用limit分页查询 , 传入一个值，这个值代表数据库的查询位置
		
		PageBean pageBean = new PageBean(pages, list.size());
		List<Persons> beanList = personsService.findByPage(pageBean.getStartPage());
		//保存数据集合
		session.setAttribute("beanList",beanList);
		//保存页面数
		session.setAttribute("pages",pages);
		//保存总页面数
		session.setAttribute("pageCount",pageBean.getPageCount());
		//总记录
		session.setAttribute("list",list.size());
		
		req.getRequestDispatcher("index.jsp").forward(req, resp);
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
	}

	
}
