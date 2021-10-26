<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="q" %>>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success Page</title>
<script type="text/javascript">
function del(){
	alert("delete data!");
	document.fn.action="delete";
	document.fn.submit();
}

function edit(){
	alert("update data!");
	document.fn.action="edit";
	document.fn.submit();
}

function save(){
	alert("insert data!");
	document.fn.action="register";
	document.fn.submit();
}



</script>
</head>
<body>
<form name="fn">

<table border="2" >

<tr>

<th>SELECTEUID</th>
<th>NAME</th>
<th>MOBILE</th>
<th>USERNAME</th>
<th>PASSWORD</th>
<th>ROLEID</th>
<th>ROLENAME</th>



</tr>

<q:forEach items="${ulist}" var="st">
<tr>
<td><input type="radio" name="sid" value="${st.uid}"></td>
<td><q:out value="${st.name}"></q:out></td>
<td><q:out value="${st.mobile}"></q:out></td>
<td><q:out value="${st.login.username}"></q:out></td>
<td><q:out value="${st.login.password}"></q:out></td>
<td><q:out value="${st.rol.rid}"></q:out></td>
<td><q:out value="${st.rol.rolename}"></q:out></td>

</tr>


</q:forEach>

</table>
<table border="2" align="center">
<input type="button" value="DELETE" onclick="del()">
<input type="button" value="UPDATE" onclick="edit()">
<input type="button" value="INSERT" onclick="save()">


</table>

</form>

</body>
</html>