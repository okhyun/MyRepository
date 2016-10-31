<%@ page contentType= "text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	</head>
	<body>
		Block  엘리먼트
		<hr/>
		<h1>Block</h1>
		<div style="background-color:#ff0000; height:50px; border:1px soild green">빨강</div>
		<div style="background-color:#0000ff; height:50px; border:1px soild yellow">파랑</div>
		<h1 style="background-color:#0000ff; height:50px; border:1px soild yellow">h 태그</h1>
		<p style="background-color:#0000ff; height:50px; border:1px soild yellow">p 태그</p>
		<form style="background-color:#0000ff; height:50px; border:1px soild yellow">form 태그</form>
		<hr/>
		
		<h1>In-line</h1>
		<div style="color:red; board:1px solid green">빨강</div>
		<div style="color:blue">파랑</div>
		<div style="color:yellow">노랑</div>	
		<img src="../common/image/naver.gif" style="board:1px solid green" />
		<hr/>
		
		<h1>Block --> In-line</h1>
		<div style="height:50px; width:200px; border:1px solid green; display:inline-block"></div>
		<div style="height:50px; width:200px; border:1px solid red; display:inline-block"></div>
		<hr/>
		
		<h1>Example</h1>
		<div style="height:50px; width:200px; border:1px solid green; display:inline-block">
			<div style="background-color:#ff0000; height:30px;"></div>
		</div>
	</body>
</html>