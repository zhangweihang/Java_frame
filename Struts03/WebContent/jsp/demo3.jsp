<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>demo3</title>
</head>
<body>
	<s:property value="[0]"/>
	<br><br>
	<s:property value="[0].top.cat.name"/><s:property value="cat.name"/>
	<br><br>
	<s:property value="[0].top.dog.name"/><s:property value="dog.name"/>
	<br><br>
	<s:property value="[0]"/>
	<br><br>
	
	<s:debug></s:debug>
	
</body>
</html>