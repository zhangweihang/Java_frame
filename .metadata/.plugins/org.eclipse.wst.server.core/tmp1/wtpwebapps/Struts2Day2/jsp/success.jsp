<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>成功页面</h1>
<!-- 用el表达式取值 -->
<!-- application取值 -->
${applicationScope.msg }
<!-- session取值 -->
${sessionScope.msg }
<!-- request取值 -->
${requestScope.msg }
</body>
</html>