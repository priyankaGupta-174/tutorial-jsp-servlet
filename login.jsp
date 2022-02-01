<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align ="center">
<h1>  login </h1>
<form action ="LoginServlet" method="post">
<table>
<tr><td>User name </td><td><input type="text" name="uname"></td></tr>
<tr><td>Password </td><td><input type="password" name="password"> </td></tr>
<tr><td></td><td><input type="submit" value="Login"> </td></tr>
<tr><td>Not a member?</td><td><a href="MemberRegistraion.jsp">Sign up now</a> </td></tr>

</table>
</form>
</div>
</body>
</html>