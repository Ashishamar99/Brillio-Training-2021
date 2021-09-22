<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Name</title>
</head>
<body>
    <p>
        Using JSP. request.getAttribute.
	    <h1>Welcome <%= request.getAttribute("name") %></h1>
	</p>

	<p>
        Using JSTL Tags.
    	<h1>Welcome <c:out value="${name}"/>   </h1>
    </p>
</body>
</html>