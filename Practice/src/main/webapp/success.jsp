<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Registration Successful</h1>
	Username : <%= request.getAttribute("uname") %>
	Password : <%= request.getAttribute("pass") %>
</body>
</html>