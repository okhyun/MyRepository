<%@ page contentType= "text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	</head>
	<body>
		포토내용
		<hr/>
		<form method="post">
			<table style="width:570px">
				<tr>
					<td style="background-color:orange; width:100px;">번호 </td>
					<td>${photoBoard.bno}</td>
				</tr>
				<tr>
					<td style="background-color:orange; width:100px;">제목 </td>
					<td>${photoBoard.btitle}</td>
				</tr>
				<tr>
					<td style="background-color:orange; width:100px;">내용 </td>
					<td><pre>${photoBoard.bcontent}</pre></td>
				</tr>
				<tr>
					<td style="background-color:orange; width:100px;">글쓴이 </td>
					<td><pre>${photoBoard.bwriter}</pre></td>
				</tr>
				<tr>
					<td style="background-color:orange; width:100px;">조회수 </td>
					<td><pre>${photoBoard.bhitcount}</pre></td>
				</tr>
				<tr>
					<td style="background-color:orange; width:100px;">날짜 </td>
					<td><pre>${photoBoard.bdate}</pre></td>
				</tr>
				<tr>
					<td style="background-color:orange; width:100px;">사진 </td>
					<td><img src="showPhoto?savedfile=${photoBoard.savedfile}" width="500px"/></td>
				</tr>
			</table>	
			<div>
				<c:if test="${login == freeboard.bwriter }"></c:if>
				<a href="modify?bno=${freeboard.bno}">[수정]</a>
				<a href="remove?bno=${freeboard.bno}">[삭제]</a>
			
				<a href="list">[목록]</a>
			</div>
		</form>
	</body>
</html>


