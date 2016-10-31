<%@ page contentType= "text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<style type="text/css">
			*{ color:red; }
			
			div { background-color: yellow;}  /* 태그 */
			.div3 { background-color: green;}  /* class */
			#div2 { background-color: aqua;}  /* id */
			
			#div4, #p1, #h1 { background-color: orange; }
			
			#div5 p {background-color: blue;}
			#div6 > p {background-color: fuchsia;}
			
			[checked] {color:green;} /* 속성 */
			[selected=true] {color:green;} /* 속성의 값 */
			
			a{color:black; text-decoration: none; }
			a:hover {color:green; text-decoration: underline;}
			
			#form1 [checked=false] {color:orange} 
		</style>
	</head>
	<body>
		CSS 선택자
		<hr/>
		
		
		<div>A</div>
		<div id="div2" class="div3">B</div>
		<div class="div3">C</div>
		<div class="div3">D</div>
		<br/>
		
		
		<div id="div4">E</div>
		<p id="p1">F</p>
		<h3 id="h1">G</h3>
		<br/>
		
		<div id="div5">
			<p>A</p>
			<p>A</p>
		</div>
		<br/>
		
		<div id="div6">
			<div>
				<p>A</p>
			</div>
			<p>A</p>
		</div>
		<br/>
		
		<div>
			<div checked="true">A</div>
			<div checked="false">B</div>
			<br/>
			<div selected="false">C</div>			
			<div selected="true">D</div>
			<div selected="true">E</div>
		</div>
		<br/>
		
		<div style="background-color: white">  <!--  inline style이다.  -->
			<a href="http://www.naver.com">네이버</a>
			<a href="http://www.google.com">구글</a>
			<a href="http://www.w3c.org">w3c</a>
		</div>
		<br/>
		
		
		<form id="form1">
			<div checked="true">A</div>
			<div checked="false">B</div>
		</form>
		
		
	</body>
</html>


