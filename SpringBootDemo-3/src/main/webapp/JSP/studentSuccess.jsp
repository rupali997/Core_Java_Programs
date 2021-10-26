<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="d" %>>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<table border="2">
		<tr>
			<th>SID</th>
			<th>NAME</th>
			<th>USERNAME</th>
			<th>PASSWORD</th>




		</tr>

		<d:forEach items="${slist}" var="st">
			<tr>
				<td><d:out value="${st.sid}"></d:out></td>
				<td><d:out value="${st.name}"></d:out></td>
				<td><d:out value="${st.username}"></d:out></td>
				<td><d:out value="${st.password}"></d:out></td>



			</tr>





		</d:forEach>



	</table>

</body>
</html>