<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수업관리 메인페이지 </title>
<script>

	// 수강신청 홈페이지 요청 
	function lecture_apply() {
		location.href = "controller?type=lectureapply ";
	}

	//수강등록 페이지 요청 
	function lecture_insert() {
		location.href = "controller?type=lectureinsert";
	}
	
	// 수강과목 조회 페이지 요청 
	function lecture_list() {
		location.href = "controller?type=lecturelist";
	}
	
	//수강과목 수정 페이지 요청 
	function lecture_update() {
		location.href = "controller?type=lectureupdate";
	}
	
	// 수강과목삭제 페이지 요청 
	function lecture_drop() {
		location.href = "controller?type=lecturedrop";
	}
	
	
</script>
</head>
<body>
	<h1>수업관리 메인 페이지 </h1>
	
	<input type="button" name="applyclass" onclick ="lecture_apply()" value="수강신청"/>
	<input type="button" name="applyclass" onclick ="lecture_insert()" value="수강과목등록"/>
	<input type="button" name="applyclass" onclick ="lecture_list()" value="수강과목조회"/>
	<input type="button" name="applyclass" onclick ="lecture_update()" value="수강과목수정"/>
	<input type="button" name="applyclass" onclick ="lecture_drop()" value="수강과목삭제"/>
	
					
	
	
</body>
</html>