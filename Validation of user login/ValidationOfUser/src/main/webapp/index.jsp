<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login page</title>
</head>
<body>
<h1>Welcome to the webpage </h1>
<form action="<%=request.getContextPath()%>/Controller" method="get">
User name: <input type="text" name="name" required="required"/><br/>
Password: <input type="password" name="password" required="required"><br/>
<input type="submit" name="submit" value="login">
 </form>
</body>
</html>