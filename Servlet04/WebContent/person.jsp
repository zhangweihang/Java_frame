<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	
	<c:forEach items="${list}" var="l">
	
	<h3>${l.id}</h3>
	<h3>${l.stu.name}</h3>
	<h3>${l.stu.sex}</h3>
	<h3>${l.stu.age}</h3>
	<h3>${l.stu.weight}</h3>
	
	</c:forEach>
	
</body>
</html>