<%@ page import="com.ihtc.listener.MyListener" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.ihtc.listener.Shop" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>listener</title>
</head>
<body>
	<%
	
		String id = request.getParameter("id");
		HttpSession hs = MyListener.map.get(id);
		Shop shop = (Shop)hs.getAttribute("shop");
		ArrayList<String> list = shop.getList();
		
		for(String s : list){
	%>
			<h3><%= s %></h3>
	<%
		}
	
	%>
</body>
</html>