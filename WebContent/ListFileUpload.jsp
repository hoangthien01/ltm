<%@ page import = "model.Bean.FileUpload" %>
<%@ page import = "java.util.List" %>
<%@ page import = "java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
	* {
	font-family: "Opensan", sans-serif;
	box-sizing:border-box;
}
tr {
  background-color: #fff
 }
table, th, td{
  border:1px solid #868585;   
  text-align: left;
  padding: 3px;
}
table{
  border-collapse:collapse;
}
table tr:nth-child(1){
  background-color:skyblue;
}
.title {
	margin-bottom : 20px;
	font-size: 20px;
	font-weight: bold;
}
body {
	background-image: url('https://cdn.wallpapersafari.com/34/55/8ciD7v.png');
	background-repeat: no-repeat;
    background-size: cover;
    height: 100vh;
    padding: 50px;'
}
.go-back {
	width: 80px;
	height: 30px;
	border-radius: 5px;
	border: none;
	cursor: pointer;
	margin-top: 15px;
	font-weight: 600;
}
.title {
	font-size: 25px;
	font-weight: bold;
	margin-bottom: 15px;
}
</style>
<body>
	<%
		List<FileUpload> files = (ArrayList<FileUpload>) request.getAttribute("files");
	%>
	<table border="1"  width="100%" style = "text-align: center">
		<caption class="title">List File Upload</caption>
		<tr>
			<th>File name</th>
			<th>User upload</th>
			<th>Status</th>
		</tr>
		<% 
			for (FileUpload f : files) {
		%>
		<tr>
			<th><%= f.getName() %></th>
			<th><%= f.getUploader() %></th>
			<th><%= f.getStatus() %></th>
		</tr>
		<%
			}
		%>
	</table>
	<button class="go-back" type = "button" name = "back" onClick="history.back()">Go back</button>
	
</body>
</html>