<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="jdbc_demo.SchoolDAOB" %>
<%@ page import="jdbc_demo.SDetailsDTO" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student</title>
</head>
<body>

    <h2> <c:out value="${msg}"/> </h2>
    <form action="/SpringMVC/student/insert" method="POST">
        SID:: <input type="text" name="sid" value="${student.getSid()}"/> <br /> <br />
        Fname:: <input type="text" name="fname" value="${student.getSid()}"/> <br /> <br />
        Lname:: <input type="text" name="lname" value="${student.getSid()}"/> <br /> <br />
        DOB:: <input type="text" name="sid" value="${student.getSid()}"/> <br /> <br />
        Address:: <input type="text" name="sid" value="${student.getSid()}"/> <br /> <br />
        <input type="submit" value="Insert" />
    </form>

</body>
</html>