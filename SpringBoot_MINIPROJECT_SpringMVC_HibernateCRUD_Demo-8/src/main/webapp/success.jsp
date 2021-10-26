<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Page</title>
<script type="text/javascript">
	function editUser() {
		alert("Editing User");
		document.fn.action = "edit";
		document.fn.submit();
	}
	function deleteUser() {
		alert("Deleting User");
		document.fn.action = "delete";
		document.fn.submit();
	}
	function addUser() {
		alert("Adding New User");
		document.fn.action = "register";
		document.fn.submit();
	}
	function logoutUser() {
		document.fn.action = "/";
		document.fn.submit();

	}
</script>
</head>
<body>
	<form name="fn">
		<table border="2" align="center">
			<tr>
				<th>SR NO</th>
				<th>NAME</th>
				<th>USERNAME</th>
				<th>PASSWORD</th>
				<th>MOBILENUMBER</th>
				<th>ROLE</th>
			</tr>

			<c:forEach items="${ulist}" var="u">
				<tr>
					<td><input type="radio" name="uid" value="${u.uid}"></td>
					<td>${u.name}</td>
					<td>${u.login.username}</td>
					<td>${u.login.password}</td>
					<td>${u.mobilenumber}</td>
					<td>${u.role.rolename}</td>
				</tr>
			</c:forEach>
		</table>
		<table border="2" align="center">
			<tr>
				<td><input type="button" value="EDIT" onclick="editUser()"></td>
				<td><input type="button" value="DELETE" onclick="deleteUser()"></td>
				<td><input type="button" value="ADD" onclick="addUser()"></td>
				<td><input type="button" value="LOGOUT" onclick="logoutUser()"></td>
			</tr>

		</table>


	</form>

</body>
</html>