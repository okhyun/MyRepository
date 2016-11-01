<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
   <head>
      <meta charset="UTF-8">
      <link rel="stylesheet" type="text/css" href="../common/bootstrap-3.3/css/bootstrap.min.css">
      <script type="text/javascript" src="../common/js/jquery-1.12.4.min.js"></script>
      <script type="text/javascript" src="../common/bootstrap-3.3/js/bootstrap.min.js"></script>
      <style type="text/css">
     
       #container {
			height: 95vh;
		}
       
       
      #header, #footer{
      	padding: 1em;
		color: white;
		background-color: black;
		text-align: center;
      }
      
      * {
			magin:0;
			padding:0;
				
		}
		
		#content #menu {
				background-color: orange;
				padding: 1em;
			}
			
		#content #menu ul {
		list-style-type:none;
		padding:0;
		}
		
		#content #center {
			flex:1;
			padding: 1em;
		}
			
			
      </style>      
   </head>
   <body>
      <hr/>
         Grid System(layout 작성)   
      <hr/>
	<div class="container-fluid">
      <div id="header" class="row">
		  <div class=" col-md-12">
		  	<h1>City Gallery</h1>
		  </div>
	  </div>
	  <div id="content" class="row">
		  <div id="menu" class=" col-md-3">
		  	<ul>
			    <li><a href="#">London</a></li>
				<li><a href="#">Paris</a></li>
			    <li><a href="#">Tokyo</a></li>
			</ul>
		  </div>
		  <div id="center" class=" col-md-9">
		  	<h1>London</h1>
			 <p>London is the capital city of England. It is the most populous city in the  United Kingdom, with a metropolitan area of over 13 million inhabitants.</p>
			<p>Standing on the River Thames, London has been a major settlement for two millennia, its history going back to its founding by the Romans, who named it Londinium.</p>
		  </div>
	  </div>
	  <div id="footer" class="row">
		  <div class=" col-md-12">Copyright © W3Schools.com</div>
	  </div>
   </div>
   </body>
</html>