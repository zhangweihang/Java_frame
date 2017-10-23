<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK href="${pageContext.request.contextPath}/css/Style.css"
	type="text/css" rel="stylesheet">
<script language="javascript"
	src="${pageContext.request.contextPath}/js/public.js"></script>
<script language="javascript"
	src="${pageContext.request.contextPath}/js/check.js"></script>
	
<script type="text/javascript" src="jquery/jquery-1.4.2.js"></script>
<link rel="stylesheet" href="jquery/jquery.datepick.css" type="text/css">
<script type="text/javascript" src="jquery/jquery.datepick.js"></script>
<script type="text/javascript" src="jquery/jquery.datepick-zh-CN.js"></script>
<title>Insert title here</title>
</head>
<script type="text/javascript">
	$(document).ready(function() {
		//设置格式
		$('#birthday').datepick({
			dateFormat : 'yy-mm-dd'
		});
	});
</script>
<body>
	<form action="testDate" method="post">
		<input type="text" id="birthday" name="date" />
		<input type="submit" value="Login"/>
	</form>
</body>
</html>