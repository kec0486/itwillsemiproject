<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수강과목 등록 페이지</title>
<script>
	


</script>
</head>
<body>

	<div id="lecture"> 
		<form action="lecture_insert_ok" method="get">
			<table>
				<caption>수강과목 등록</caption>
				<tbody>
					<tr>
						<th>수강번호</th>
						<td><input type="text" name="id" title="수강번호"></td>
					</tr>
					<tr>
						<th>관련학과</th>
						<td>
						<select name="department">
						<option value="경제학과">경제학과</option>
						<option value="수학과">수학과</option>
						<option value="통계학과">통계학과</option>
						</select>
						</td>
					</tr>
					<tr>
						<th>이수구분</th>
						<td>
						<select name="categorize">
						<option value="교양선택">교양선택</option>
						<option value="교양필수">교양필수</option>
						<option value="전공선택">전공선택</option>
						<option value="전공필수">전공필수</option>
						</select>
						</td>
					</tr>
					<tr>
						<th>이수학년</th>
						<td>
						<input type='radio' name='year'value='all' /> 전체학년 
						<input type='radio' name='year'value='1' /> 1학년 
						<input type='radio' name='year'value='2' /> 2학년 
						<input type='radio' name='year'value='3' /> 3학년 
						<input type='radio' name='year'value='4' /> 4학년 
						</td>
					</tr>
					<tr>
						<th>이수학기</th>
						<td>
						<input type='radio' name='semester'value='1' /> 1학기
						<input type='radio' name='semester'value='2' /> 2학기
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
						<td colspan="2"><input type="submit" value="등록"> 
						<input type="reset" value="초기화">
						<input type="button" value="목록보기" onclick="list_go()"></td>
					</tr>
				</tfoot>
			</table>
		</form>
	</div>
<<<<<<< HEAD
	
			
=======
>>>>>>> branch 'master' of https://github.com/kec0486/itwillsemiproject.git
</body>
</html>