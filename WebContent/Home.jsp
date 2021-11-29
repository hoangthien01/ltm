<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<h1 class="title">My home</h1>
	<ul>
		<li>
			<a href = "UpLoadFileServlet" target = "_self">UpLoad File</a><br>
		</li>
		<li>
			<a href = "ListFileUploadServlet" target = "_self">List File Upload</a><br>
		</li>
		<li>
			<a href = "ListAllFileUploadServlet" target = "_self">List All File Upload</a><br>
		</li>
		<li class="logout">
			<a href = "LogoutServlet" target = "_self">Logout</a>
		</li>
	</ul>
</div>
</body>
<style>
.title {
	color: #944cc7;
}
.logout {
	display:inline-block;
	background-color: #944cc7;
    border-radius: 6px;
    float: right;
}
.logout a {
	color : #fff;
}

.logout:hover a {
	color: #fff;
}
body {
/* 	background-color: #E1E1E1; */
	background-image: url('https://cdn.wallpapersafari.com/34/55/8ciD7v.png');
	display: flex;
	align-items: center;
	justify-content: center;
	height: 100vh;
}
.container {
	background-color: #fff;
	width: 30%;
	border-radius: 12px;
	padding: 16px;
	
}

ul {
	list-style: none;
	padding: 0;
}

li {
	padding: 12px;
	font-size: 20px;
	font-weight: 500;
	cursor: pointer;
}
li:hover a {
	color: #944cc7;
}
a {
	color : #000;
	text-decoration: none;
}
</style>
</html>