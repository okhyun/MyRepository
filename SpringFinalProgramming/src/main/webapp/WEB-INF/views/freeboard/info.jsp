<%@ page contentType= "text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	</head>
	<body>
		글내용
		<hr/>
		<form method="post">
			<table>
				<tr>
					<td style="background-color:orange; width:100px;">번호 </td>
					<td>${freeboard.bno}</td>
				</tr>
				<tr>
					<td style="background-color:orange; width:100px;">제목 </td>
					<td>${freeboard.btitle}</td>
				</tr>
				<tr>
					<td style="background-color:orange; width:100px;">내용 </td>
					<td><pre>${freeboard.bcontent}</pre></td><!-- 개행을 원하는대로 할때 pre -->
				</tr>
				<tr>
					<td style="background-color:orange; width:100px;">글쓴이 </td>
					<td>${freeboard.bwriter}</td>
				</tr>
				<tr>
					<td style="background-color:orange; width:100px;">조회수 </td>
					<td>${freeboard.bhitcount}</td>
				</tr>
				<tr>
					<td style="background-color:orange; width:100px;">날짜 </td>
					<td>${freeboard.bdate}</td>
				</tr>
			</table>	
			<div>
				<a href="modify?bno=${freeboard.bno}">[수정]</a>
				<a href="remove?bno=${freeboard.bno}">[삭제]</a>
				<a href="list">[목록]</a>
			</div>
		</form>
	</body>
</html>


