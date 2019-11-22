<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.accenture.lkm.*, javax.persistence.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String empName= request.getParameter("empName");
String location= request.getParameter("location");

if(empName==null || location ==null){	
	out.println("You have left one of the fields or both fields empty.");
}
else{
	// Create Manager Factory and Manager
	EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("unit1");
	EntityManager manager = managerFactory.createEntityManager(); // CRUD ops
	
	// Create the Employee
	
	
	// Create Transaction
	EntityTransaction transaction1 = manager.getTransaction();
	EmployeeEntity employee = new EmployeeEntity();
	employee.setEmpName(empName);
	employee.setLocation(location);
	transaction1.begin();
	manager.persist(employee);
	transaction1.commit();
	
	int id = employee.getEmpId();
	
	out.println("Employee added with id : "+id);
	
	// Close the Manager and Manager Factory
	manager.close();
	managerFactory.close();
	}
%>

</body>
</html>