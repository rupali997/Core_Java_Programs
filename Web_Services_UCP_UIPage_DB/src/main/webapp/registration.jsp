<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function register() {
	alert("This is Registration function!!");
	
	var name=document.getElementById("nm").value;
	var uname=document.getElementById("us").value;
	var password=document.getElementById("ps").value;
	var mobile=document.getElementById("mb").value;
	var area=document.getElementById("ar").value;
	var city=document.getElementById("ct").value;
	
	alert("Get All Data!!");
	var req = new XMLHttpRequest();
	
	var url = "http://localhost:3535/consumer";
	req.open("POST",url,true);
	
	var user = {name:name,username:uname,password:password,mobilenumber:mobile,area:area,city:city};
	alert(user);
	var use=JSON.stringify(user);
	req.setRequestHeader("Content-type","application/json");
	req.send(use);
	alert("Send Data Success!");
	
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
Name     : <input type="text" name="name" id="nm">
<br>
UserName : <input type="text" name="username" id="us">
<br>
Password : <input type="text" name="password" id="ps">
<br>
Mobile   : <input type="text" name="mobilenumber" id="mb">
<br>
Area     : <input type="text" name="area" id="ar">
<br>
City     : <input type="text" name="city" id="ct">
<br>
<input type="button" Value="REGISTER" onclick="register()">
</body>
</html>