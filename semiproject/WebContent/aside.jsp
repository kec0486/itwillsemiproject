<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<link href="css/default.css" rel="stylesheet">
</head>
<body>
	<div class="manu-bar">
		<h1>이곳은 사이드바 메뉴입니다.</h1>
		<%-- <c:if test="${param eq 0 }"> --%>
		관리자
			<ul class="manu">
				<li>회원정보
					<ul>
						<li>회원등록</li>
						<li>회원정보조회</li>
						<li>회원정보수정</li>
					</ul>
				</li>		
				<li>수업정보
					<ul>
						<li>수강신청</li>
						<li>수강과목등록</li>
						<li>수강과목조회</li>
						<li>수강과목수정</li>
						<li>수강과목삭제</li>
					</ul>	
				</li>
				<li>성적
					<ul>
						<li>성적조회</li>
						<li>성적등록</li>
						<li>성적수정</li>
					</ul>
				</li>
				<li>비용처리
					<ul>
						<li>등록금
							<ul>
								<li>등록금조회</li>
								<li>등록금수정</li>
							</ul>
						</li>
						<li>장학금
							<ul>
								<li>장학금조회</li>
								<li>장학금수정</li>
							</ul>
						</li>
					</ul>
				</li>
				<li>게시판
					<ul>
						<li>등록</li>
						<li>조회</li>
						<li>수정</li>
						<li>삭제</li>
					</ul>
				</li>
				<li>기숙사
					<ul>
						<li>입사신청조회</li>
						<li>입사자조회</li>
					</ul>
				</li>
			</ul>
		<%-- </c:if>
		<c:if test="${param eq 1 }">
		학생
			<ul class="manu-bar">
				<li>회원정보
					<ul>
						<li>회원정보조회</li>
						<li>회원정보수정</li>
					</ul>
				</li>		
				<li>수업정보
					<ul>
						<li>수강신청</li>
						<li>수강과목조회</li>
						<li>수강과목수정</li>
						<li>강의평가</li>
						<li>전자출석명부조회</li>
					</ul>	
				</li>
				<li>성적
					<ul>
						<li>성적조회</li>
						<li>이의신청</li>
					</ul>
				</li>
				<li>비용처리
					<ul>
						<li>등록금
							<ul>
								<li>등록금조회</li>
							</ul>
						</li>
						<li>장학금
							<ul>
								<li>장학금조회</li>
							</ul>
						</li>
					</ul>
				</li>
				<li>게시판
					<ul>
						<li>조회</li>
					</ul>
				</li>
				<li>기숙사
					<ul>
						<li>입사신청조회</li>
					</ul>
				</li>
			</ul>
		</c:if>
		<c:if test="${param eq 2 }">
		교수
			<ul class="manu-bar">
				<li>회원정보
					<ul>
						<li>회원정보조회</li>
						<li>회원정보수정</li>
					</ul>
				</li>		
				<li>수업정보
					<ul>
						<li>내수강과목등록</li>
						<li>내강의과목조회</li>
						<li>내강의과목수정</li>
					</ul>	
				</li>
				<li>성적
					<ul>
						<li>수강생조회</li>
						<li>성적입력</li>
						<li>성적수정</li>
					</ul>
				</li>
				<li>게시판
					<ul>
						<li>조회</li>
					</ul>
				</li>
			</ul>
		</c:if> --%>
	</div>
</body>
</html>