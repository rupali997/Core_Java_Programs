<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
	<form action="reg">
		<table border="2">
			<tr>

				<td>Name :</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>

				<td>UserName :</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>

				<td>Password :</td>
				<td><input type="text" name="password"></td>
			</tr>
			<tr>

				<td>Mobile :</td>
				<td><input type="number" name="mobile"></td>
			</tr>
			<tr>

				<td>Fees  :</td>
				<td><input type="number" name="fees"></td>
			</tr>
			<tr>

				<td>Pincode  :</td>
				<td><input type="number" name="addr.pincode"></td>
			</tr>
			<tr>

				<td>City  :</td>
				<td><input type="text" name="addr.city"></td>
			</tr>
				<tr>

				<td>Area  :</td>
				<td><input type="text" name="addr.area"></td>
			</tr>
			<tr>
				<input type="submit" value="REGISTER">
			</tr>

		</table>



	</form>
</body>
</html>