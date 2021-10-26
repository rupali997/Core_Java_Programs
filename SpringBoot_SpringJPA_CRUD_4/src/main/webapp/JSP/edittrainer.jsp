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

FULL NAME     : <input type="text" name="name" value="${u.name}">
<br>
USERNAME      : <input type="text" name="username" value="${u.username}">
<br>
PASSWORD      : <input type="text" name="password" value="${u.password}">
<br>
MOBILE        : <input type="text" name="mobile" value="${u.mobile}">
<br>
ROLE              : <input type="radio" id="role" name="role.rolename"
				value="Admin" checked>ADMIN <input type="radio" id="role"
				name="role.rolename" value="Trainer" checked>TRAINER <input
				type="radio" id="role" name="role.rolename" value="Student">STUDENT
				<br>

<input type="submit" value="UPDATE">
</pre>
	</form>


</body>
</html>