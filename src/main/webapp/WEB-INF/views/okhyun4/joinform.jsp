<%@ page contentType= "text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
	<head>
	</head>
	<body>
		<form method="post" action="/myapp1/okhyun4/save">
		<h3 align="center">[글쓰기 페이지입니다.]</h3>
		
		<table align="center" border="2">
			<tr>
				<td>작성자</td>
				<td>
					<input type="text" name="mname" size="50">
				</td>
				<td>암호	</td>
				<td>
					<input type="password" name="mpassword">
				</td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><input type="text" name="memail" size="30">@
					<select>
					<option>naver.com</option>
					<option>nate.com</option>
					<option>daum.net</option>
					<option>hotmail.com</option>
					<option>gmail.com</option>
					</select>
				</td>
				<td>성별</td>
				<td>
					<input type="radio" name="msex">남<input type="radio"name="sex">여
				</td>
			</tr>
			<tr>
				<td>글제목</td>
				<td colspan="4">
					<input type="text" name="mtitle" size="100">
				</td>
			</tr>
			<tr>
				<td>글내용</td>
				<td colspan="4">
					<textarea cols="90" rows="30" name="mcontent"></textarea>
				</td>
			</tr>
			<tr>
				<td colspan="5">
					<center>
						<input type="submit" value="저장">
						<input type="reset" value="취소">
					</center>
				</td>
			</tr>
		</tabel>
		</form>
	</body>
</html>
