<%@ page contentType= "text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	</head>
	<body>
		SpringFinalProgramming
		<hr/>
		1.<a href="<%=pageContext.getServletContext().getContextPath()%>/member/login">로그인</a><br/> <!--context 언급하지 않고 상대경로로 지정해서 접근 -->
		2.<a href="${pageContext.servletContext.contextPath}/freeboard/list">자유 게시판</a><br/>
		3.<a href="${pageContext.servletContext.contextPath}/photoboard/list">포토 게시판</a><br/>
	</body>
</html>
