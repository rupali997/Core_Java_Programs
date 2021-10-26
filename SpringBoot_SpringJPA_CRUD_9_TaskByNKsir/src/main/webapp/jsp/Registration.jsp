<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="reg">
		<pre>
FULLNAME          : <input type="text" name="name">
<br>
USERNAME          : <input type="text" name="login.username">
<br>
PASSWORD          : <input type="text" name="login.password">
<br>
MOBILENUMBER      : <input type="text" name="mobilenumber">
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