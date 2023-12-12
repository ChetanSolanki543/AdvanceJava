<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%	String fname = request.getParameter("firstName");
	    String lname = request.getParameter("lastName");
	    String login = request.getParameter("loginId");
	    String pass = request.getParameter("password");
	%>
	<%= fname%><br>
	<%= lname%><br>
	<%= login%><br>
	<%= pass%>
</body>
</html>