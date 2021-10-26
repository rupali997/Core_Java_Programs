<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<script type="text/javascript">

function login(){
	alert("Hello Login");
	
	var un =document.getElementById("un").value
	var pass=document.getElementById("pass").value
	alert(pass);
	
	var req = new XMLHttpRequest();
	var url = "http://localhost:2222/getConsumeData/"+un+"/"+pass+"";
	req.open("GET",url,true);
	req.send();
	alert("Send");
	req.onreadystatechange=function()
	{
		if(req.readyState==4 && req.status==200){
			alert(req.responseText);
		}
	}
}


</script>
</head>
<body>

Username : 
<input type="text" name="un" id="un">
Password
<input type="text" name="pass" id="pass">

<input type="button" value="LOGIN" onclick="login()">
</body>
</html>