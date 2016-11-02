<%@ page contentType= "text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<script type="text/javascript">
			function onClickButton1() {
				console.log("onClickButton1() 실행");
				/* var div1 = document.getElementById("div1"); */
				var div1 = document.querySelector("#div1");
				console.log(div1);
				div1.innerHTML = "수정내용";
			}
			
			function onClickButton2() {
				console.log("onClickButton2() 실행");
				/* var imgArr = document.getElementsByClassName("photo"); */
				var imgArr = document.querySelector(".photo");
				imgArr[0].src = "../common/image/photo2.jpg"
			}
			
			function onClickButton3() { /* 입력한 값을 출력한다. */
				var mid;
				var mpassword;
				
				  //입력된 mid와 mpassword 얻기
				//how1
				console.log("onClickButton3() 실행");
				mid = document.querySelector("#form1 [name=mid]").value;
				console.log("mid : " + mid);
				mpassword = document.querySelector("#form1 [name=mpassword]").value;
				console.log("mpassword : " + mpassword);  
				
				 /* //입력된 mid와 mpassword 얻기
				//how2
				mid = document.form1.mid.value; /*name이 있어야한다.  
				mpassword = document.form1.mpassword.value;  */
				
				//1차유효성검사
				if(mid == "") { //문자열 비교때 ==를 사용할 수 있다.
					alert("아이디를 입력하세요.");
				} else if(mpassword == "") {
					alert("비밀번호를 입력하세요.");
				}
				
				
				
				//서버전송
				var form1 = document.querySelector("#form1").submit;
				/* form1.submit();
				document.form1.submit(); */
			}
		</script>
	</head>
	<body>
		DOM 사용
		<hr/>
		<button onclick="onClickButton1 ()">버튼1</button>
		<div id="div1">최초 내용</div>
		
		<button onclick="onClickButton2 ()">버튼2</button>
		<div id="div2">
			<img class="photo" src="../common/image/photo1.jpg"/>
		</div>
		
		<button onclick="onClickButton3 ()">버튼3</button>
		<div>
			<form id="form1" name="form1">
				아이디: <input type="text" name="mid"/><br/>
				비밀번호: <input type="password" name="mpassword"/><br/>
			</form>
			
			<!-- <form id="form2">
				아이디: <input type="text" name="mid"/><br/>
				비밀번호: <input type="password" name="mpassword"/><br/>
			</form> -->
		</div>
	</body>
</html>