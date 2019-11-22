<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ page import="com.accenture.lkm.EmployeeEntity" %>
<%@ page import="java.util.Random" %>
<jsp:useBean id="emp" class="com.accenture.lkm.EmployeeEntity"></jsp:useBean>


<jsp:setProperty name="emp"  property="*"/>

<h2> Employee Details </h2>

Employee added with id : <jsp:getProperty name="emp" property="empId"/> <br>



</body>
</html>