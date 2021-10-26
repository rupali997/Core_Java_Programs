<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
<script type="text/javascript">
function addUser() {
	alert("Adding New User");
	document.fn.action="register";
	document.fn.submit();
}
function editUser() {
	alert("Editing User");
	document.fn.action="edit";
	document.fn.submit();
}
function deleteUser() {
	alert("Deleting User");
	document.fn.action="delete";
	document.fn.submit();
}
</script>
</head>
<body>

	<form name="fn">
	<h2 align="center">${h} LIST</h2>
		<table border="2" align="center">
			<tr>
				<th>SR NO</th>
				<th>FULLNAME</th>
				<th>USERNAME</th>
				<th>PASSWORD</th>
				<th>MOBILE</th>
				<th>CITY</th>
				<th>AREA</th>
			</tr>
			<c:forEach items="${ulist}" var="u">
				<tr>
					<td><input type="radio" name="uid" value="${u.uid}"></td>
					<td>${u.name}</td>
					<td>${u.username}</td>
					<td>${u.password}</td>
					<td>${u.mobile}</td>
					<td>${u.addr.city}</td>
					<td>${u.addr.area}</td>
				</tr>
			</c:forEach>
		</table>
	<table border="2" align="center">
	<tr>
	<td><input type="button" value="ADD" onclick="addUser()"></td>
	<td><input type="button" value="EDIT" onclick="editUser()"></td>
	<td><input type="button" value="DELETE" onclick="deleteUser()"></td>
	</tr>
	
	</table>





	</form>
</body>
</html>