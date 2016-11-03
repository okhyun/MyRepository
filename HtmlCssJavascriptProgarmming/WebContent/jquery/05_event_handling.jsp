<%@ page contentType= "text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<script type="text/javascript" src="../common/js/jquery-1.12.4.min.js"></script>
		<script type="text/javascript">
			$(function() {
				$("#btn1").on("click", function(){
					$("#div1").attr("src", "../common/image/photo2.jpg");
				});
				
				$(".img2").on("mouseover", function(){
					$(".img2").attr("src", "../common/image/photo2.jpg");					
				});
				
				$(".img2").on("mouseout", function(){
					$(".img2").attr("src", "../common/image/photo1.jpg");
				});
			});
		</script>
	</head>
	<body>
		이벤트 처리
		<hr/>
		<button id="btn1">버튼1</button>
		<div>
			<img class="img1" src="../common/image/photo1.jpg" width="100" height="100"/>
		</div>
		<div>
			<img class="img2" src="../common/image/photo1.jpg" width="100" height="100"/>
			<img class="img2" src="../common/image/photo1.jpg" width="100" height="100"/>
		</div>
	</body>
</html>