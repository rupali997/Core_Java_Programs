<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="d"%>>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success Page</title>

<script type="text/javascript">
	function del() {
		alert("delete");
		document.fn.action = "delete";
		document.fn.submit();

	}

	function edit() {
		alert("edit");
		document.fn.action = "edit";
		document.fn.submit();
	}
</script>
</head>
<body>

	<form name="fn">
		<table border="2">
			<tr>

				<th>UID</th>
				<th>NAME</th>
				<th>USERNAME</th>
				<th>PASSWORD</th>
				<th>MOBILE</th>


			</tr>

			<d:forEach items="ulist" var="us">

				<tr>

					<td><input type="radio" name="uid" value="${us.uid}"></td>
					<td><d:out value="${us.name}"></d:out></td>
					<td><d:out value="${us.username}"></d:out></td>
					<td><d:out value="${us.password}"></d:out></td>
					<td><d:out value="${us.mobile}"></d:out></td>
					<td><d:out value="${us.addr.pincode}"></d:out></td>
					<td><d:out value="${us.addr.city}"></d:out></td>
					<td><d:out value="${us.addr.area}"></d:out></td>


				</tr>

			</d:forEach>


		</table>

		<input type="button" name="EDIT" onclick="edit()"> <input
			type="button" name="DELETE" onclick="del()">



	</form>
</body>
</html>