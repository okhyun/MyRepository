<%@ page contentType= "text/html;charset=UTF-8" %>
<%@ page pageEncoding="EUC-KR"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<!-- meta charset<> -->
		<title>index</title>
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
		<link rel="stylesheet" type="text/css" href="../common/bootstrap-3.3/css/bootstrap.min.css"><!--min�� ����� ���̱� ���ؼ� ���  -->
		<script type="text/javascript" src="../common/bootstrap-3.3/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="../common/js/jquery-1.12.4.min.js"></script>
	</head>
	<body>
		Bootstrap
		<hr/>
		[Button]
		<br/>
		<!-- Standard button -->
		<button type="button" class="btn btn-default">Default</button>
		
		<!-- Provides extra visual weight and identifies the primary action in a set of buttons -->
		<button type="button" class="btn btn-primary">Primary</button>
		
		<!-- Indicates a successful or positive action -->
		<button type="button" class="btn btn-success">Success</button>
		
		<!-- Contextual button for informational alert messages -->
		<button type="button" class="btn btn-info">Info</button>
		
		<!-- Indicates caution should be taken with this action -->
		<button type="button" class="btn btn-warning">Warning</button>
		
		<!-- Indicates a dangerous or potentially negative action -->
		<button type="button" class="btn btn-danger">Danger</button>
		
		<!-- Deemphasize a button by making it look like a link while maintaining button behavior -->
		<button type="button" class="btn btn-link">Link</button>
		<br/><br/><br/>
		
		[Table]
		<br/>
		<table class="table table-bordered">
			<tr class="success">
				<td>����</td>
				<td>�۾���</td>
				<td>����</td>
			</tr>
			<tr class="danger">
				<td>1</td>
				<td>����1</td>
				<td>����1</td>
			</tr>
			<tr class="info">
				<td>2</td>
				<td>����2</td>
				<td>����2</td>
			</tr>
		</table>
		<br/><br/><br/>
		
		[Image]
		<br/>
		<img src= "../common/image/photo1.jpg" class="img-rounded" width="100px" height="100px">
		<img src= "../common/image/photo1.jpg"  class="img-circle" width="100px" height="100px">
		<img src= "../common/image/photo1.jpg"  class="img-thumbnail" width="100px" height="100px">
		<br/><br/><br/>
		
		[Icon]
		<br/>
		<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
		<br/><br/><br/>
		
		[Single button dropdowns]
		<br/>
		<!-- Split button -->
		<div class="btn-group">
		  <button type="button" class="btn btn-danger">Action</button>
		  <button type="button" class="btn btn-danger dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
		    <span class="caret"></span>
		    <span class="sr-only">Toggle Dropdown</span>
		  </button>
		  <ul class="dropdown-menu">
		    <li><a href="#">Action</a></li>
		    <li><a href="#">Another action</a></li>
		    <li><a href="#">Something else here</a></li>
		    <li role="separator" class="divider"></li>
		    <li><a href="#">Separated link</a></li>
		  </ul>
		</div>
	</body>
</html>






