<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>demo4</title>
</head>
<body>
	<s:property value="[0]"/>
	<br><br>
	<s:property value="[0].top[0].name"/>
	<br><br>
	
	<s:iterator value="[0].top">
		<s:property value="name"/>
		<s:property value="type"/>
		<br><br>
	</s:iterator>
	
	<s:debug></s:debug>
	
</body>
</html>