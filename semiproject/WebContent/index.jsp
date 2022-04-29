<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인페이지(로그인)</title>
<style type="text/css">
	.login {height: 10%;}
	.footer {}
</style>
</head>
<body>
<div class="index">
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