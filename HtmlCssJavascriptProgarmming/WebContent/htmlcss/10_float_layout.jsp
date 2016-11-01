<%@ page contentType= "text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8"> <!-- 문자셋을 해석할때  UTF-8 로 해석하겠다.-->
		<style type="text/css">
		/*초기화 시키는 코드
		 html, body, div, span, applet, object, iframe, table, caption, tbody, tfoot, thead, tr, th, td, 
		del, dfn, em, font, img, ins, kbd, q, s, samp, small, strike, strong, sub, sup, tt, var, 
		h1, h2, h3, h4, h5, h6, p, blockquote, pre, a, abbr, acronym, address, big, cite, code, 
		dl, dt, dd, ol, ul, li, fieldset, form, label, legend {
		 vertical-align: baseline;
		 font-family: inherit;
		 font-weight: inherit;
		 font-style: inherit;
		 font-size: 100%;
		 outline: none;
		 padding: 0;
		 margin: 0;
		 border: none;
		 } */
		 
		 * {
				magin:0;
				padding:0;
			}
			
			div.container{
				width: 100%;
				border: 1px solid gray;
			}
			
			header, footer {
				padding: 1em;
				color: white;
				background-color: black;
				text-align: center;
			}
			
			nav {
				float: left;
				max-width: 160px;
				margin: 0;
				padding: 1em;
				height: 500px;
				border: 1px solid gray;
			}
			
			footer {
				clear: both;	
			}
			
			nav ul {
				list-style-type: none;
				padding: 0;
			}
			
			nav ul a {
   				 text-decoration: none;
			}

			article {
			    margin-left: 170px;
			    padding: 1em;
			    overflow: hidden;
			}
		</style>
	</head>
	<body>
		<div class="container">
		
			<header>
			   <h1>City Gallery</h1>
			</header>
			  
			<nav>
			  <ul>
			    <li><a href="#">London</a></li>
			    <li><a href="#">Paris</a></li>
			    <li><a href="#">Tokyo</a></li>
			  </ul>
			</nav>
			
			<article>
			  <h1>London</h1>
			  <p>London is the capital city of England. It is the most populous city in the  United Kingdom, with a metropolitan area of over 13 million inhabitants.</p>
			  <p>Standing on the River Thames, London has been a major settlement for two millennia, its history going back to its founding by the Romans, who named it Londinium.</p>
			</article>
			
			<footer>Copyright © W3Schools.com</footer>
		</div>
	</body>
</html>