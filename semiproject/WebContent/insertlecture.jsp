<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수강과목 등록 페이지</title>
</head>
<body>

	<div id="lecture">
		<form action="lecture_insert_ok.jsp" method="post"
			enctype="multipart/form-data">
			<table>
				<caption>수강과목 등록</caption>
				<tbody>
					<tr>
						<th>수강번호</th>
						<td><input type="text" name="id" title="수강번호"></td>
					</tr>
					<tr>
						<th>관련학과</th>
						<td><input type="text" name="department" title="관련학과">
						</td>
					</tr>
					<tr>
						<th>이수구분</th>
						<td><input type="text" name="categorize" title="이수구분">
						<input type='radio' name='categorize'value='1' /> 1학년 
						
						</td>
					</tr>
					<tr>
						<th>이수학년</th>
						<td>
						<input type='radio' name='year'value='1' /> 1학년 
						<input type='radio' name='year'value='2' /> 2학년 
						<input type='radio' name='year'value='3' /> 3학년 
						<input type='radio' name='year'value='4' /> 4학년 
						</td>
					</tr>
					<tr>
						<th>이수학기</th>
						<td><input type="text" name="semester" title="이수학기">
						</td>
					</tr>
					<tr>
						<th>과목명</th>
						<td><input type="text" name="name" title="과목명"></td>
					</tr>
					<tr>
						<th>교수명</th>
						<td><input type="text" name="professor" title="교수명">
						</td>
					</tr>
					<tr>
						<th>학점</th>
						<td>
						<input type='radio' name='credit'value='1' /> 1학점
						<input type='radio' name='credit' value='2' /> 2학점
						<input type='radio' name='credit' value='3' /> 3학점
						</td>
					</tr>
				</tbody>
				<tfoot>
					<tr>
						<td colspan="2"><input type="button" value="저장"
							onclick="sendData()"> <input type="reset" value="초기화">
							<input type="button" value="목록보기" onclick="list_go()"></td>
					</tr>
				</tfoot>
			</table>
</body>
</html>