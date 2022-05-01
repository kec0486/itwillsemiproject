<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>subpage</title>
<style type="text/css">
	.header {background-color: aqua;
			color: white;
			height: 50px;}
</style>
</head>
<body>
	<div class="header">
		<h1>학사관리시스템</h1>
	</div>
	<jsp:include page="main.jsp"></jsp:include>
	<hr>
	<jsp:include page="footer.jsp" ></jsp:include>
</body>
</html>