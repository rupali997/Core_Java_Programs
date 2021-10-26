<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update">
<pre>
<input type="hidden" name="uid" value="${us.uid}">
<br>
Name : <input type="text" name="name" value="${us.name}">
<br>
UserName : <input type="text" name="username"  value="${us.username}">
<br>
Password : <input type="text" name="password" value="${us.password}">
<br>
Mobile : <input type="number" name="mobile" value="${us.mobile}">
<br>
Pincode : <input type="number" name="addr.pincode" value="${us.addr.pincode}">
<br>
City : <input type="text" name="addr.city" value="${us.addr.city}">
<br>
Mobile : <input type="text" name="addr.area" value="${us.addr.area}">
<br>
<input type="submit" value="UPDATE">

</pre>
</form>
</body>
</html>