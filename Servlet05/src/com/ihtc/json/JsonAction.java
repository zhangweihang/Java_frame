package com.ihtc.json;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

@WebServlet(value = "/json")
public class JsonAction extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		JsonArray ja = new TestJason().select();
		resp.setContentType("text/json");
		resp.setCharacterEncoding("utf-8");
		for(JsonElement je : ja){
			
			System.out.println(je.toString());
			resp.getWriter().println(je.toString());;
		}
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

}
