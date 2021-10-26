<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UPDATE TRAINER</title>
<script type="text/javascript">
	if (document.update.getElementById('role_Admin').checked) {

	} else if (document.update.getElementById('role_Trainer').checked) {

	} else if (document.update.getElementById('role_Student').checked) {
	}
</script>
</head>
<body>
	<form action="update">
		<pre>
		<input type="hidden" name="uid" value="${u.uid}">
FULLNAME          : <input type="text" name="name"
				placeholder="ENTER FULL NAME" value="${u.name}">
				<br>
USERNAME          : <input type="text" name="username"
				placeholder="ENTER USERNAME" value="${u.username}">
				<br>
PASSWORD          : <input type="text" name="password"
				placeholder="ENTER PASSWORD" value="${u.password}">
				<br>
MOBILE          : <input type="text" name="mobile"
				placeholder="ENTER MOBILENUMBER" value="${u.mobile}">
				<br>
CITY     : <input type="text" name="addr.city" value="${u.addr.city}">
<br>
AREA      :<input type="text" name="addr.area" value="${u.addr.area}">

<input type="submit" value="UPDATE">
</pre>

	</form>
</body>
</html>