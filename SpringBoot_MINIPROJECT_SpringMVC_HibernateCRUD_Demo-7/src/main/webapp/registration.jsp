<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
	<form action="reg">
		<pre>
		Name  : <input type="text" name="name">
		<br>
		Mobile : <input type="number" name="mobile">
		<br>
		UserName : <input type="text" name="login.username">
		<br>
		Password : <input type="text" name="login.password">
		<br>
		Role  :<select name="rol.rolename">
		
		<option value="admin">admin</option>
		<option value="trainer">trainer</option>
		<option value="student">student</option>
		
		
		</select>
		<br>
		<input type="submit" name="REGISTER">
		
		
		
		</pre>



	</form>
</body>
</html>