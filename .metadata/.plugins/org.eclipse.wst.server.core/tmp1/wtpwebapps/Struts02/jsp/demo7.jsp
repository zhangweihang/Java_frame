<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- OGNL -->

	<h3>注册页面</h3>
	<form action="${ pageContext.request.contextPath }/demo7Action.action"
		method="post">
		号码:<input type="text" name="list[0].number" /><br /> 
		时间:<input type="text" name="list[0].date" /><br /> 
			<br><br>
		号码:<input type="text" name="list[1].number" /><br /> 
		时间:<input type="text" name="list[1].date" /><br /> 
		
			<br><br>
			
		号码:<input type="text" name="map['one'].number" /><br /> 
		时间:<input type="text" name="map['one'].date" /><br /> 
			<br><br>
			
		号码:<input type="text" name="map['two'].number" /><br /> 
		时间:<input type="text" name="map['two'].date" /><br /> 
		
			<input type="submit" value="注册" />
	</form>
</body>
</html>