<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
int add (int a, int b){
	return a+b;
}
int count = 0;
%>

<%
count++;
out.println(count);
int res = add (4,5);
%>
Count = <%=count %>
Added result = <%=res %>
</body>
</html>