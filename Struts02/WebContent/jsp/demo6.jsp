<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>注册页面</h3>
	<form action="${ pageContext.request.contextPath }/demo6Action.action"
		method="post">
		姓名:<input type="text" name="name" /><br /> 手机号:<input
			type="text" name="phoneNumber" /><br /> <input type="submit"
			value="注册" />
	</form>
</body>
</html>