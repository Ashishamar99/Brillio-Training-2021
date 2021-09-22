<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Student</title>
</head>
<body>

    <h1>SID:: <c:out value="${student.getSid()}"/></h1>
    <h1>Fname:: <c:out value="${student.getFname()}"/></h1>
    <h1>Lname:: <c:out value="${student.getLname()}"/></h1>
    <h1>DOB:: <c:out value="${student.getDob()}"/></h1>
    <h1>Address:: <c:out value="${student.getAddress()}"/></h1>

</body>
</html>