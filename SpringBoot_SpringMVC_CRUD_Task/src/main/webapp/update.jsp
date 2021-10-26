<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Page</title>
</head>
<body>
<form action="update">
		<pre>
		<input type="hidden" name="uid" value="${us.uid}">
Name      : <input type="text" name="name" value="${us.name}">
<br>
Mobile    : <input type="number" name="mobile" value="${us.mobile}">
<br>
UserName  : <input type="text" name="login.username" value="${us.login.username}">
<br>
Password  : <input type="text" name="login.password"  value="${us.login.password}">
<br>
Role      :  <input type="checkbox" id="A1" name="role.rolename"
				value="${us.role.rolename}">
			<label for="A1"> Admin</label><br>
<input type="checkbox" id="T1" name="role.rolename" value="${us.role.rolename}">
<label for="T1">Trainer</label><br>
<input type="checkbox" id="S1" name="role.rolename" value="${us.role.rolename}">
<label for="S1">Student</label><br> 
<br>
<input type="button" value="UPDATE">
</body>
</html>