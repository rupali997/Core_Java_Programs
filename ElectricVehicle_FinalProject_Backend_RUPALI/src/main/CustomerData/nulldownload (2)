<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	function login() {

		var u = document.getElementById("us").value;
		var p = document.getElementById("ps").value;

		var url = "http://localhost:3535/consumer/" + u + "/" + p + "";
		var req = new XMLHttpRequest();
		req.open("GET", url, true); //true=asynchronous , false=synchronous
		req.send();
		alert("success");

		req.onreadystatechange = function() {
			if (req.readystate == 4 && req.readystate == 200) {
				alert(req.responseText);
				var tab = document.getElementById("tab");
				var Row = tab.insertRow();
				var cell1 = Row.insertCell();
				cell1.innerHTML = "UID";
				var cell2 = Row.insertCell();
				cell2.innerHTML = "NAME";
				var cell3 = Row.insertCell();
				cell3.innerHTML = "USERNAME";
				var cell4 = Row.insertCell();
				cell4.innerHTML = "PASSWORD";
				var cell5 = Row.insertCell();
				cell5.innerHTML = "MOBILENUMBER";
				var cell6 = Row.insertCell();
				cell6.innerHTML = "AREA";
				var cell7 = Row.insertCell();
				cell7.innerHTML = "CITY";

				var data = JSON.parse(req.responseText);
				for ( var d in data) {
					var Row = tab.insertRow();
					var cell1 = Row.insertCell();
					cell1.innerHTML = data[d].uid;
					var cell2 = Row.insertCell();
					cell2.innerHTML = data[d].name;
					var cell3 = Row.insertCell();
					cell3.innerHTML = data[d].username;
					var cell4 = Row.insertCell();
					cell4.innerHTML = data[d].password;
					var cell5 = Row.insertCell();
					cell5.innerHTML = data[d].mobilenumber;
					var cell6 = Row.insertCell();
					cell6.innerHTML = data[d].area;
					var cell7 = Row.insertCell();
					cell7.innerHTML = data[d].city;
				}

			}
		}

	}
</script>
</head>
<body>
	UserName :
	<input type="text" name="username" id="us"> Password :
	<input type="text" name="password" id="ps">
	<input type="button" value="LOGIN" onclick="login()">

	<table id="tab" border="2"></table>


</body>
</html>