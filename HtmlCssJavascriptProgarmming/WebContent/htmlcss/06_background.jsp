<%@ page contentType= "text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<style type="text/css">
			body {
				background-image: "url(../common/image/paper.gif");
				background-repeat: no-repeat;
			}
			.album {
				width: 200px;
				height: 200px;
				background-image: "url(../common/image/photo5.jpg");
				background-size: 100px 100px;
				display:inline-block;
			} 			
		</style>
	</head>
	<body>
		background 관련 CSS 속성
		<hr/>
		<%for(int i=0; i<10; i++) {%>
			<div class="album">
			</div>
		<%} %>
	</body>
</html>








