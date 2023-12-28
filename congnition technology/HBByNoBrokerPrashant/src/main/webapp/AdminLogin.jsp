<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
	@import url(https://fonts.googleapis.com/css?family=Exo:100,200,400);
@import url(https://fonts.googleapis.com/css?family=Source+Sans+Pro:700,400,300);

body{
	margin: 0;
	padding: 0;
	background: #fff;
    color:yellow;
	font-family: Arial;
	font-size: 12px;
}

.body{
	position: absolute;
	top: -20px;
	left: -20px;
	right: -40px;
	bottom: -40px;
	width: auto;
	height: auto;
	background-image: url(data:image/jpeg;base64,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);
	background-size: cover;
	-webkit-filter: blur(5px);
	z-index: 0;
}

.grad{
	position: absolute;
	top: -20px;
	left: -20px;
	right: -40px;
	bottom: -40px;
	width: auto;
	height: auto;
	background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,rgba(0,0,0,0)), color-stop(100%,rgba(0,0,0,0.65))); /* Chrome,Safari4+ */
	z-index: 1;
	opacity: 0.7;
}

.header{
	position: absolute;
	top: calc(50% - 35px);
	left: calc(50% - 255px);
	z-index: 2;
}

.header div{
	float: left;
	color: #fff;
	font-family: 'Exo', sans-serif;
	font-size: 35px;
	font-weight: 200;
}

.header div span{
	color: #5379fa !important;
}

.login{
	position: absolute;
	top: calc(35% - 75px);
	left: calc(35% - 50px);
	height: 150px;
	width: 350px;
	padding: 10px;
	z-index: 2;
}

.login input[type=text]{
	width: 300px;
	height: 50px;
	background: transparent;
	border: 2px solid rgba(255,255,255,0.6);
	border-radius: 2px;
	color: #fff;
	font-family: 'Exo', sans-serif;
	font-size: 16px;
	font-weight: 400;
	padding: 4px;
}

.login input[type=password]{
	width: 300px;
	height: 50px;
	background: transparent;
	border: 2px solid rgba(255,255,255,0.6);
	border-radius: 2px;
	color: #fff;
	font-family: 'Exo', sans-serif;
	font-size: 16px;
	font-weight: 400;
	padding: 4px;
	margin-top: 10px;
}

.login input[type=button]{
	width: 250px;
	height: 40px;
	background:green;
	border: 2px solid #fff;
	cursor: pointer;
	border-radius: 2px;
	color: yellow;
	font-family: 'Exo', sans-serif;
	font-size: 20px;
	font-weight: 400;
	padding: 6px;
	margin-top: 10px;
}

.login input[type=button]:hover{
	opacity: 0.9;
}

.login input[type=button]:active{
	opacity: 0.9;
}

.login input[type=text]:focus{
	outline: none;
	border: 2px solid rgba(255,255,255,0.9);
}

.login input[type=password]:focus{
	outline: none;
	border: 2px solid rgba(255,255,255,0.9);
}

.login input[type=button]:focus{
	outline: none;
}

::-webkit-input-placeholder{
   color: rgba(255,255,255,0.6);
}

::-moz-input-placeholder{
   color: rgba(255,255,255,0.6);
}
</style>
</head>
<body>
 
 <div class="body"></div>
		<div class="grad"></div>
		<div class="login">
		<center>
		<marquee><font size="8"><font color="red">Admin Login</font></font></marquee>
		</center>
		<h1>Enter Username</h1>
				<input type="text" placeholder="username" name="user"><br>
		<h1>Enter Password</h1>
				<input type="password" placeholder="password" name="password"><br>
				<input type="button"  value="Login">
		</div>
		
</body>
</html>