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
	alert("delete");
	document.fn.action="delete";
	document.fn.submit();
}

function edit(){
	alert("edit");
	document.fn.action="edit";
	document.fn.submit();
}



</script>
</head>
<body>
<form name="fn">

<table border="2">

<tr>

<th>SELECTESID</th>
<th>NAME</th>
<th>USERNAME</th>
<th>PASSWORD</th>
<th>MOBILE</th>
<th>FEES</th>
<th>PINCODE</th>
<th>CITY</th>
<th>AREA</th>

</tr>

<q:forEach items="${slist}" var="st">
<tr>
<td><input type="radio" name="sid" value="${st.sid}"></td>
<td><q:out value="${st.name}"></q:out></td>
<td><q:out value="${st.username}"></q:out></td>
<td><q:out value="${st.password}"></q:out></td>
<td><q:out value="${st.mobile}"></q:out></td>
<td><q:out value="${st.fees}"></q:out></td>
<td><q:out value="${st.addr.pincode}"></q:out></td>
<td><q:out value="${st.addr.city}"></q:out></td>
<td><q:out value="${st.addr.area}"></q:out></td>

</tr>


</q:forEach>

</table>

<input type="button" value="DELETE" onclick="del()">
<input type="button" value="UPDATE" onclick="edit()">
</form>

</body>
</html>