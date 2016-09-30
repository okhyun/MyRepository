<%@ page contentType= "text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	</head>
	<body>
		<center>
			<h3>[로그인 페이지입니다.]</h3>
		</center><hr/>		
		
		<form method="post" action="/myapp1/okhyun4/login">
		<table align="center" border="2">
			<tr>
				<td>
					이름 : <input type="text" name="mname" value=""/>
				</td>
			</tr>
			<tr>
				<td>
					이메일 : <input type="email" name="memail"  value=""/>
				</td>
			</tr>
		</table>
		
		<center>
		<input type="submit" value="로그인"/>
		<input type="reset" value="취소"/>
		</center>
		
		</form>
	</body>
</html> 