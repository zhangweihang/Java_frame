<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style type="text/css">
div {
	text-align: center;
}
</style>
<script type="text/javascript">
	function preview(file) {
		var prevDiv = document.getElementById('preview');
		var imgNode = document.getElementById('imgId');
		if (file.files && file.files[0]) {
			var reader = new FileReader();
			reader.onload = function(evt) {
				//prevDiv.innerHTML = '<img src="' + evt.target.result + '" />';
				imgNode.src = evt.target.result;
			}
			reader.readAsDataURL(file.files[0]);
		} else {
			//prevDiv.innerHTML = '<div class="img" style="filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale,src=\'' + file.value + '\'"></div>';
			imgNode.src =  file.value;
		}
	}
</script>
</head>
<body>
			<!--enctype 属性规定在发送到服务器之前应该如何对表单数据进行编码。  -->
	<!--可以上传图片与文件  -->
	<form action="./upload" method="post" enctype="multipart/form-data">
			上传：<input id="fileId" type="file" name="uploadFile" onchange="preview(this)" />
					<br /> 
			描述：<input type="text" name="desc" />
			<br /> 
			<input type="submit" value="提交" /> 
			<img alt="测试" src="" id="imgId" />
				<div id="preview"></div>
		</form>
</body>
</html>