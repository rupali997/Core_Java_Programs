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
				<td>MOBILE :</td>
				<td><input type="text" name="mobile"></td>
			</tr>
			<tr>
				<td>USERNAME :</td>
				<td><input type="text" name="login.username"></td>
			</tr>
			<tr>
				<td>PASSWORD :</td>
				<td><input type="text" name="login.password"></td>
			</tr>


			<tr>
				<td>ROLE :</td>
				<td><input type="radio" id="role" name="role.rolename"
					value="Admin">ADMIN <input type="radio" id="role"
					name="role.rolename" value="Trainer">TRAINER <input
					type="radio" id="role" name="role.rolename" value="Student">STUDENT
				</td>
			</tr>
			<!-- <!-- <tr>
				<td>ROLE :</td>
				<td><label class="container">Admin <input
						type="checkbox" name="role.rolename"> <span
						class="checkmark"></span>
				</label> <label class="container">Trainer <input type="checkbox"
						name="role.rolename"> <span class="checkmark"></span>
				</label> <label class="container">Student <input type="checkbox"
						name="role.rolename"> <span class="checkmark"></span>
				</label></td>

			</tr> -->
			
			<tr>
				<td><input type="submit" value="REGISTER"></td>

			</tr>



		</table>

	</form>
</body>
</html>