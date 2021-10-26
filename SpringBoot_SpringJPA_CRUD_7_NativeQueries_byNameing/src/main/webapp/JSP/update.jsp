<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UPDATE TRAINER</title>

</head>
<body>
	<form action="update">
		<pre>
		<input type="hidden" name="uid" value="${us.uid}">
FULLNAME          : <input type="text" name="name"
				placeholder="ENTER FULL NAME" value="${us.name}">
				<br>
USERNAME          : <input type="text" name="username"
				placeholder="ENTER USERNAME" value="${us.username}">
				<br>
PASSWORD          : <input type="text" name="password"
				placeholder="ENTER PASSWORD" value="${us.password}">
				<br>
MOBILE          : <input type="text" name="mobile"
				placeholder="ENTER MOBILENUMBER" value="${us.mobile}">
				<br>
CITY     : <input type="text" name="addr.city" value="${us.addr.city}">
<br>
AREA      :<input type="text" name="addr.area" value="${us.addr.area}">

<input type="submit" value="UPDATE">
</pre>

	</form>
</body>
</html>