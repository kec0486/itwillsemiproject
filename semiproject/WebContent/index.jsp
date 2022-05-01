<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인페이지(로그인)</title>
<style type="text/css">
	html {margin: 0;padding: 0;}
	body {margin:0;padding: 0;
			font-size: 12pt;
			background-image: url("img/벚꽃.jpg");
			/*height: 500px;*/ 
			background-attachment: fixed;
			background-repeat: no-repeat;
			background-size: cover;
			background-position: center;}
	.login {height: 600px;}
	.footer {}
</style>
</head>
<body>
<div class="index">
	<div class="logo">a</div>
	<div class ="login">
		<jsp:include page="login.jsp"></jsp:include>
	</div>
	<hr>
	<div class ="footer">
		<jsp:include page="footer.jsp" ></jsp:include>
	</div>
</div> 
</body>
</html>