<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.login {}
	.loginmain {}
	.mainheader img {width: 1000px; height: 300px}
	.notice {}
</style>
</head>
<body>
<div class="login">
	<div class = "mainheader">
		<img alt="벚꽃사진" src="img/벚꽃.jpg">
	</div>
	<form action="subpage.jsp" method="get">
		<span class = "loginmain">
			통합로그인<br>
			<input type="text" name ="id"><br>
			<input type="password" name = "password"><br>
			<input type="submit" value="로그인">
		</span>
	</form>
	<span class="notice">
		<h2>공지사항</h2>
		<ul>
			<li>1</li>
			<li>2</li>
			<li>3</li>
		</ul>
	</span>
</div>
</body>
</html>