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
		<table border="2">
			<tr>
		<input type="hidden" name="sid" value="${stu.sid}">

				<td>Name :</td>
				<td><input type="text" name="name" value="${stu.name}"></td>
			</tr>
			<tr>

				<td>UserName :</td>
				<td><input type="text" name="username" value="${stu.username}"></td>
			</tr>
			<tr>

				<td>Password :</td>
				<td><input type="text" name="password" value="${stu.password}"></td>
			</tr>
			<tr>

				<td>Mobile :</td>
				<td><input type="number" name="mobile" value="${stu.mobile}"></td>
			</tr>
			<tr>

				<td>Fees  :</td>
				<td><input type="number" name="fees" value="${stu.fees}"></td>
			</tr>
			<tr>

				<td>Pincode  :</td>
				<td><input type="number" name="addr.pincode" value="${stu.addr.pincode}"></td>
			</tr>
			<tr>

				<td>City  :</td>
				<td><input type="text" name="addr.city" value="${stu.addr.city}"></td>
			</tr>
				<tr>

				<td>Area  :</td>
				<td><input type="text" name="addr.area" value="${stu.addr.area}"></td>
			</tr>
			<tr>
				<input type="submit" value="UPDATE">
			</tr>

		</table>



	</form>
	
</body>
</html>