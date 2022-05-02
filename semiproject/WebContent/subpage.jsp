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
	<div><h5 class="login-ok">학과명 : 이름 </h5></div>
	<div class="logo"><a href="#">LOGO</a></div>
	<div class="logout"><a href="index.jsp">로그아웃</a></div>
	<nav class="nav"><h1 class="nav-header">학사관리시스템</h1></nav>
	<div class="header">
		
	</div>
	<jsp:include page="main.jsp"></jsp:include>
	<hr>
	<jsp:include page="footer.jsp" ></jsp:include>
</body>
</html>