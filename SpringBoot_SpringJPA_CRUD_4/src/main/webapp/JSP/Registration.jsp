<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>REGISTRATION PAGE</title>
</head>
<body>
	<form action="reg">
		<pre>
FULLNAME          : <input type="text" name="name"
				placeholder="ENTER FULL NAME">
				<br>
USERNAME          : <input type="text" name="username"
				placeholder="ENTER USERNAME">
				<br>
PASSWORD          : <input type="text" name="password"
				placeholder="ENTER PASSWORD">
				<br>
MOBILE     : <input type="text" name="mobile"
				placeholder="ENTER MOBILENUMBER">
				<br>
ROLE              : <input type="radio" id="role" name="role.rolename"
				value="Admin">ADMIN <input type="radio" id="role"
				name="role.rolename" value="Trainer">TRAINER <input
				type="radio" id="role" name="role.rolename" value="Student">STUDENT
				<br>

<input type="submit" value="REGISTER">
</pre>

	</form>

</body>
</html>