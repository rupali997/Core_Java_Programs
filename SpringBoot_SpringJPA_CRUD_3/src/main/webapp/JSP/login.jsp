<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<form action="log">
		<table border="2" align="center">
			<tr>
				<td>USERNAME :</td>
				<td><input type="text" name="login.username"></td>

			</tr>
			<tr>
				<td>PASSWORD :</td>
				<td><input type="text" name="login.password"></td>

			</tr>
			<tr>
				<td><input type="submit" name="LOGIN"></td>

			</tr>
			<tr>
			<td><a href="register">NEW USER--></a></td>
			</tr>

		</table>


	</form>
</body>
</html>