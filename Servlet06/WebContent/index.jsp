<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>index</title>
</head>
<body>
	<table border="1px" cellspacing="0" width="800ps">
		<tr>
			<td>编号</td>
			<td>姓名</td>
			<td>电话</td>
			<td>邮箱</td>
		</tr>
		<c:forEach items="${list }" var="l">
			<tr>
				<td>${l.id }</td>
				<td>${l.username }</td>
				<td>${l.phoneNumber }</td>
				<td>${l.email }</td>
			</tr>
		</c:forEach>
	</table>
	共${listS }条,共${pages }页,第${page }页
	<!--pages为页面数，这个值从后台获取  -->
	<c:if test="${page > 1}">
		<a href="${pageContext.request.contextPath }/persons?page=${page-1}">前一页</a>
	</c:if>
	<c:if test="${page < pages}">
		<a href="${pageContext.request.contextPath }/persons?page=${page+1}">后一页</a>
	</c:if>
	
	<form action="skip">
		<input type="text" name="skipage" style="width:25px" />
		<input type="submit" value="跳转"/>
	</form>
	
</body>
</html>