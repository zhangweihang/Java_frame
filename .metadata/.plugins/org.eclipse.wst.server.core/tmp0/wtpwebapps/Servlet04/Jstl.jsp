<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
</head>
<body>
	
	<% 
		request.setAttribute("money",10000);
	%>
	<c:out value="dasdas"></c:out>
	
	<c:choose>
		<c:when test="${money>10000}">
			<h3>hahahaha</h3>
		</c:when>
		<c:when test="${money<10000}">
			<h3>555555</h3>
		</c:when>
		<c:otherwise>
			<h3>0.0</h3>
		</c:otherwise>
	</c:choose>
	

</body>
</html>