<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>register</title>
</head>
<body>
	<h1>register</h1>
	<form action="${ pageContext.request.contextPath }/demo11Action" method="post">
		昵称：<input type="text" name="name"/><br>
		密码：<input type="text" name="password"/><br>
		<input type="submit" value="提交">
	</form>
</body>
</html>