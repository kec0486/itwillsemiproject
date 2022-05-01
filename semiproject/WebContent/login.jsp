<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.login {padding-top: 200px;
			padding-left: 150px;
			}
	.loginmain {float: left;
				border: 1px solid white;
				text-align: center;}
	.main-notice {border: 1px solid white;
				border-left: 50px;
				left: 300px;}	
	.notice {position: relative;float: left;
			list-style: none;margin:0;padding: 0;
			}
	.tab {display: inline-block;}
	.main-table {}
	.login-btn {background-color: gray;
				margin:5px 10px;
				 width: 150px;
				 height: 40px;}
</style>
</head>
<body>
	<div class="login">
		<div class = "loginmain">
			<form action="subpage.jsp" method="get">
					통합로그인<br>
					<input type="text" name ="id"><br>
					<input type="password" name = "password"><br>
					<input type="submit" value="로그인" class="login-btn"><br>
			</form>
			<a href="#">학번/교번 찾기</a>
			<a href="#">비밀번호초기화</a>
		</div>
		<div class="main-notice">
			<ul class="notice">
				<li class="tab">포털공지</li>
				<li class="tab">공지사항</li>
				<li class="tab">학사공지</li>
				<li class="tab">장학공지</li>
				<li class="tab">뉴스</li>
			</ul><br>
			<table class="main-table">
				<tbody>
					<tr>
						<td>내용</td>
					</tr>
					<tr>
						<td>내용2</td>
					</tr>
					<tr>
						<td>내용3</td>
					</tr>
					<tr>
						<td>내용4</td>
					</tr>
					<tr>
						<td>내용5</td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>