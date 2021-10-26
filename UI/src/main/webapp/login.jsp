<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">

function login(){
	
	
	alert("Hello this is login page!");
	var us=document.getElementById("un").value;
	var ps=document.getElementById("ps").value;
	
	alert(us);
	alert(ps);
	
	var req= new XMLHttpRequest();
	var url="http://localhost:8181//fetchAllData/"+us+"/"+ps+"";
	req.open("GET",url,true);
	req.send();
	alert("Success");
	
	req.onreadystatechange=function(){
		alert(req.readyState);
		if(req.readyState==4 && req.status==200){
			alert(req.responseText);
		}
	}
}


</script>
</head>
<body>


Username : <input type="text" name="uname" id="un">
<br>
Password : <input type="text" name="pass" id="ps">
<br>
<input type="button" value="Login" onclick="login()">




</body>
</html>