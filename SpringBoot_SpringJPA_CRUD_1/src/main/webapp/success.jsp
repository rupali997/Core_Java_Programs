<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="d"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success Page</title>
<script type="text/javascript">
function del(){
	alert("Delete Data!!")
	document.fn.action="delete";
	document.fn.submit();
}

function edit(){
	alert("Edit Data!!")
	document.fn.action="edit";
	document.fn.submit();
}

function insert(){
	alert("Insert Data!!")
	document.fn.action="register";
	document.fn.submit();
}


</script>
</head>
<body>
<form name="fn">
<table border="2" align="center">
<tr>
<th>SELECT</th>
<th>NAME</th>
<th>MOBILE</th>
<th>USERNAME</th>
<th>PASSWORD</th>
<th>AGE</th>



</tr>
<d:forEach items="${slist}" var="use">
<tr>
<td><input type="radio" name="sid" value="${use.sid}"></td>
<td><d:out value="${use.name}"></d:out></td>
<td><d:out value="${use.mobile}"></d:out></td>
<td><d:out value="${use.username}"></d:out></td>
<td><d:out value="${use.password}"></d:out></td>
<td><d:out value="${use.age}"></d:out></td>


</tr>


</d:forEach>


</table>
<table border="2" align="center">
<tr>
<td><input type="button" value="INSERT" onclick="insert()"></td>
<td><input type="button" value="UPDATE" onclick="edit()"></td>
<td><input type="button" value="DELETE" onclick="del()"></td>

</tr>


</table>


</form>

</body>
</html>