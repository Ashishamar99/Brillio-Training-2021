<!-- https://imagecolorpicker.com/ -->

<%@page import="com.brillio.dto_jsp_demo.AddDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Addition Page MVC</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" />
</head>

<style>
body{
background-color: #4bbaaa;
}

.labelForInput{
/* background-color: #e8441d;
   color: white; */
   
   color: black;
   background-color: #f3ac36;
}

.labelForResult{
color: black;
background-color: #f3ac36;
}
</style>

<body>

	<%
		AddDTO dto = new AddDTO();
		
		if(request.getAttribute("k1") != null){
			dto = (AddDTO) request.getAttribute("k1");
		}
		
		String message = "";
		if(request.getAttribute("msg") != null){
			message = request.getAttribute("msg").toString();
		}
	%>
	<div class="container">
	<br />
	<h3 class="text-center">Addition of 2 Numbers Using MVC and Servlets</h3>
	<div class="alert alert-primary" role="alert" id="messageDiv">
		<%= message %>
	</div>
	
	<script type="text/javascript">
	const getCookie = (name) => {
	    const cookies = document.cookie.split(';');
	    for (let i = 0; i < cookies.length; i++) {
	        let c = cookies[i].trim().split('=');
	        if (c[0] === name) {
	            return c[1];
	        }
	    }
	    return "";
	}
	
	var cookieValue = getCookie("div_visibility");
	if(cookieValue === "" || cookieValue === "hidden"){
		document.getElementById("messageDiv").style.visibility = "hidden";
	}
	else if(cookieValue === "initial"){
		document.getElementById("messageDiv").style.visibility = "initial";
		document.cookie = "div_visibility=hidden";
	}
	</script>
	
	<br />
	<hr />
	
	
	
		<form action="AddWithDTOAndBO" method="get">
		<div class="input-group mb-3">
  			<span class="input-group-text labelForInput">Enter Number 1:</span>
  			<input type="text" name="a1" value="<%= dto.getNum1() %>" class="form-control">
		</div>
		
		<div class="input-group mb-3">
  			<span class="input-group-text labelForInput">Enter Number 2:</span>
  			<input type="text" name="a2" value="<%= dto.getNum2() %>" class="form-control">
		</div>
		
		<div class="input-group mb-3">
		<span class="input-group-text labelForResult">Result:</span>
		<input class="form-control" type="text" value="<%= dto.getNum3() %>" readonly>
		</div>
		
		<div>
		<input type="submit" value="Add" class="btn btn-dark" />
		</div>
		<!-- 
		<input type="text" name="a1" value="<%= dto.getNum1() %>" placeholder="Enter Number 1:"/>
		<br /><br />
		<input type="text" name="a2" value="<%= dto.getNum2() %>" placeholder="Enter Number 2:"/>
		<br /><br />
		<input type="text" disabled name="a3" value="<%= dto.getNum3() %>" placeholder="Result:"/>
		<br /><br />
		<input type="submit" value="Add" />
		 -->
	</form>
	
	</div>


</body>
</html>