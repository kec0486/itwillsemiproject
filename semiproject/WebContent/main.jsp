<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/default.css" rel="stylesheet">
</head>
<body>
	<aside><jsp:include page="aside.jsp"></jsp:include></aside>
	<section>
		<div class="container">
			<h1>메인컨텐트영역</h1>
			<form>
				학사번호  <input type="text" name="id"><br>
				비밀번호  <input type="password" name="pwd"><br>
				성명  <input type="text" name="name"><br>
				주민등록번호  <input type="text" name="ssn"><br>
				계좌번호  <input type="text" name="accound"><br>
				권한  <input type="text" name="auth"><br>
				성별  <input type="text" name="gender"><br>
				전화번호  <input type="text" name="phone"><br>
				휴대폰번호  <input type="text" name="mobile"><br>
				이메일  <input type="email" name="email"><br>
				주소  <input type="text" name="addr"><br>
			</form>
		</div>
	</section>
</body>
</html>