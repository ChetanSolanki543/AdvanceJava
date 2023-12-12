<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="User1" method="post">
		<table>
			<tr>
				<th>First Name:</th>
				<td><input type="text" name="firstName">
			</tr>
			<tr>
				<th>Last Name:</th>
				<td><input type="text" name="lastName">
			</tr>
			<tr>
				<th>LoginId:</th>
				<td><input type="text" name="loginId">
			</tr>
			<tr>
				<th>Password:</th>
				<td><input type="text" name="password">
			</tr>
			<tr>
				<th>Date</th>
				<td><input type="date" name="dob">
			</tr>
			<tr>
				<th>Address:</th>
				<td><input type="text" name="address">
			</tr>
			<tr>
				<th></th>
				<td><input type="submit">
			</tr>

		</table>
	</form>
</body>
</html>