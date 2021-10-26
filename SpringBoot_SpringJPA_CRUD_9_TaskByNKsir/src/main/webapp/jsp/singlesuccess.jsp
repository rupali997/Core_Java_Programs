<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SingleSuccess</title>

<script type="text/javascript">
	function editUser() {
		alert("Editing User");
		document.single.action = "editdata";
		document.single.submit();
	}
	function deleteUser() {
		alert("Deleting User");
		document.single.action = "delete";
		document.single.submit();
	}
	function addUser() {
		alert("Adding New User");
		document.single.action = "register";
		document.single.submit();
	}
	function logoutUser() {
		document.single.action = "/";
		document.single.submit();

	}
</script>

</head>
<body>
	<form name="single">
	<h2>${h} DETAILS</h2>
		<pre>
<input type="hidden" name="uid" value="${u.uid}">
FULLNAME        : ${u.name}
MOBILENUMBER    : ${u.mobilenumber}
USERNAME        : ${u.login.username}
PASSWORD        : ${u.login.password}
ROLE            : ${u.role.rolename}



<input type="button" value="EDIT" onclick="editUser()">  <input
				type="button" value="DELETE" onclick="deleteUser()"> <input
				type="button" value="ADD" onclick="addUser()">  <input
				type="button" value="LOGOUT" onclick="logoutUser()"> 

</pre>
	</form>

</body>
</html>