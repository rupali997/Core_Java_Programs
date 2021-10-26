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
		<pre>
<input type="hidden" name="sid" value="${stu.sid}">
Name      : <input type="text" name="name" value="${stu.name}">
<br>
Mobile    : <input type="number" name="mobile" value="${stu.mobile}">
<br>
UserName  : <input type="text" name="username" value="${stu.username}">
<br>
Password  : <input type="text" name="password" value="${stu.password}">
<br>
AGE       : <input type="number" name="age" value="${stu.age}">
<br>
<input type="submit" value="UPDATE">


</pre>


	</form>

</body>
</html>