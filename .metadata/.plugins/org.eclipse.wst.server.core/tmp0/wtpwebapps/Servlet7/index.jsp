<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1px" cellspacing="0" width="800px"> 
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>手机号</td>
			<td>邮箱</td>
		</tr>
		<c:forEach items="${beanList }" var="l">
			<tr>
				<td>${l._id }</td>
				<td>${l._username }</td>
				<td>${l._phoneNumber }</td>
				<td>${l._email }</td>
			</tr>
		</c:forEach>
	</table>
	共${list }条，共${pageCount }页 ，第${pages }页
	<!--pages为页面数 ， 这个值从后台获取  -->
	<c:if test="${pages > 1 }">
		<a href="${pageContext.request.contextPath }/persons?page=${pages -1 }">前一页</a>
	</c:if>
	<c:if test="${pages < pageCount}">
	<a href="${pageContext.request.contextPath }/persons?page=${pages +1 }">后一页</a>
	</c:if>
</body>
</html>