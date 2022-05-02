<%@page import="com.cts.dto.Employee"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.cts.dao.EmpDao"%>
<%@page import="com.cts.dao.EmployeeDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
	<h1>Employee List</h1>
	<table border="1">
	<th>Employee Number</th>
	<th>Employee Name</th>
	<th>Salary</th>
	<th>City</th>
	<th>Email</th>
	<th>Department No</th>
	<%
	EmpDao empDao=new EmployeeDaoImpl();
	ArrayList<Employee>empList=empDao.getAllRecords();
	for(Employee emp:empList){
	%>
		<tr>
			<td><%=emp.getEmpno() %></td>
			<td><%=emp.getName() %></td>
			<td><%=emp.getSalary() %></td>
			<td><%=emp.getCity() %></td>
			<td><%=emp.getEmail() %></td>
			<td><%=emp.getDeptno() %></td>
		</tr>
	
	<%}%>
	</table>
</body>
</html>