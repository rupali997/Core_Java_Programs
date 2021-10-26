<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="d"%>>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success page</title>
<script type="text/javascript">
	function del() {
		alert("Delete Data!!")
		document.fn.action = "delete";
		document.fn.submit();
	}
	function edit() {
		alert("Update Data!!")
		document.fn.action = "edit";
		document.fn.submit();
	}
	function insert() {
		alert("Insert Data!!")
		document.fn.action = "register";
		document.fn.submit();
	}
	function logout() {
		alert("Logout Data!!")
		document.fn.action = "/";
		document.fn.submit();
	}
</script>
</head>
<body>
	<form name="fn">
		<table border="2" align="center">
			<tr>
				<td>SELECTSID</td>
				<td>NAME</td>
				<td>USERNAME</td>
				<td>PASSWORD</td>
				<td>MOBILE</td>
				<td>ROLEID</td>
				<td>ROLENAME</td>
				


			</tr>
			<d:forEach items="${ulist}" var="st">
				<tr>
					<td><input type="radio" name="uid" value="${st.uid}"></td>
					<td><d:out value="${st.name}"></d:out></td>
					<td><d:out value="${st.login.username}"></d:out></td>
					<td><d:out value="${st.login.password}"></d:out></td>
					<td><d:out value="${st.mobile}"></d:out></td>
					<td><d:out value="${st.role.rid}"></d:out></td>
					<td><d:out value="${st.role.rolename}"></d:out></td>


				</tr>



			</d:forEach>
		</table>
		<table border="2" align="center">
			<tr>
				<td><input type="button" value="INSERT" onclick="insert()"></td>
				<td><input type="button" value="UPDATE" onclick="edit()"></td>
				<td><input type="button" value="DELETE" onclick="del()"></td>
				<td><input type="button" value="LOGOUT" onclick="logout()"></td>

				
			</tr>

		</table>


	</form>
</body>
</html>