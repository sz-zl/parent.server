<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="../scripts/jquery-1.7.2.min.js"></script>
<script>
	$(function(){
		var info = '${info}';
		if(!info){
			
		}else{
			alert(info);
		}
		location.href="http://10.1.14.113:9001/html/index.html";
	});
</script>
</head>
<body>
</body>
</html>