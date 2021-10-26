<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>

	<form action="update">
		<pre>
<input type="hidden" name="${uid}" value="${data.uid}">
FULL NAME       : <input type="text" name="name" value="${data.uid}">
<br>
MOBILENUMBER    : <input type="text" name="mobilenumber"
				value="${data.mobilenumber}">
<br>
USERNAME        : <input type="text" name="login.username"
				value="${data.login.username}">
<br>
PASSWORD        : <input type="text" name="login.password"
				value="${data.login.password}">
<br>
ROLE            : <input type="radio" id="role" name="role.rolename"
				value="Admin">ADMIN 
                  <input type="radio" id="role" name="role.rolename"
				value="Trainer">TRAINER 
                  <input type="radio" id="role" name="role.rolename"
				value="Student">STUDENT 
<br>
<input type="submit" value="UPDATE">

</pre>
	</form>

</body>
</html>