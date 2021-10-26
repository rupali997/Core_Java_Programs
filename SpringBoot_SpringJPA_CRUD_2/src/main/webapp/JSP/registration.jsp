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
		<table border="2" align="center">
			<tr>
				<td>NAME :</td>
				<td><input type="text" name="name"></td>

			</tr>
			<tr>
				<td>USERNAME :</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>PASSWORD :</td>
				<td><input type="text" name="password"></td>
			</tr>
			<tr>
				<td>MOBILE :</td>
				<td><input type="number" name="mobile"></td>
			</tr>
			<tr>
				<td>PINCODE :</td>
				<td><input type="number" name="addr.pincode"></td>
			</tr>
			<tr>
				<td>CITY :</td>
				<td><input type="text" name="addr.city"></td>
			</tr>
			<tr>
				<td>AREA :</td>
				<td><input type="text" name="addr.area"></td>
			</tr>
			<tr>
				<td><input type="submit" value="REGISTER"></td>

			</tr>



		</table>

	</form>
</body>
</html>