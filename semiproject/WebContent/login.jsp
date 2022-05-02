<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/default.css" rel="stylesheet">
<script>
	function openCity(cityName) {
	  var i;
	  var x = document.getElementsByClassName("city");
	  for (i = 0; i < x.length; i++) {
	    x[i].style.display = "none";  
	  }
	  document.getElementById(cityName).style.display = "block";  
	}
</script>
<title>login.jsp</title>
</head>
<body>
	<div class="login">
		<div class = "login-main">
			<form action="subpage.jsp" method="get">
					<h2 class="login-title">통합로그인</h2><br>
					<input type="text" name ="id"><br>
					<input type="password" name = "password"><br>
					<input type="submit" value="로그인" class="login-btn"><br>
			</form>
			<a href="#">학번/교번 찾기</a>
			<a href="#">비밀번호초기화</a>
		</div>
		<div class="main-notice">
			<div class="w3-bar w3-black">
			  <button class="w3-bar-item w3-button" onclick="openCity('potal')">포털공지</button>
			  <button class="w3-bar-item w3-button" onclick="openCity('Paris')">공지사항</button>
			  <button class="w3-bar-item w3-button" onclick="openCity('Tokyo')">학사공지</button>
			</div>
			
			<div id="potal" class="w3-container city">
				 <table class="main-table">
					<tbody>
						<tr>
							<td><a href="#">포털내용</a></td>
						</tr>
						<tr>
							<td><a href="#">포털내용1</a></td>
						</tr>
						<tr>
							<td><a href="#">포털내용2</a></td>
						</tr>
					</tbody>
				</table>
			</div>
			
			<div id="Paris" class="w3-container city" style="display:none">
			   <table class="main-table">
					<tbody>
						<tr>
							<td><a href="#">공지내용</a></td>
						</tr>
						<tr>
							<td><a href="#">공지내용1</a></td>
						</tr>
						<tr>
							<td><a href="#">공지내용2</a></td>
						</tr>
					</tbody>
				</table>
			</div>
			
			<div id="Tokyo" class="w3-container city" style="display:none">
			   <table class="main-table">
					<tbody>
						<tr>
							<td><a href="#">학사내용</a></td>
						</tr>
						<tr>
							<td><a href="#">학사내용1</a></td>
						</tr>
						<tr>
							<td><a href="#">학사내용2</a></td>
						</tr>
					</tbody>
				</table>
			</div>
			
			<!-- <ul class="notice">
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
			</table> -->
		</div>
	</div>
</body>
</html>