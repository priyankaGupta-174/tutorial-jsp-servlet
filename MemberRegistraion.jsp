<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="register" method="post">
<div align = "center">
<h1>  Register Form </h1>
<table>
<tr><td>User Name:</td><td> <input type="text" name="uname" required></td></tr>
<tr><td>Password:</td><td><input type="password" name="password"required></td></tr>
<tr><td>Email:</td><td> <input type="text" name="email"required></td></tr>
<tr><td>Phone:</td><td> <input type="text" name="phone" minlength="10" maxlength="10"required></td></tr>
<tr><td></td><td> <input type="submit" value="register"required></td></tr>
</table>
</div>
</form>
</body>
</html>