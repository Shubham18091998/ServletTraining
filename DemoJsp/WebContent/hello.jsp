<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello</title>
</head>
<body>
	<h1>Hello World</h1>
	<%
		for(int i=1;i<=5;i++){
			out.println(i+" Hello World<br>");
		}
	%>
	
	<!-- This is a comment -->
	
	Result <%= 5*10 %>
	
	<%
	String msg="Hello";
	for(int i=0;i<5;i++)
	{
	%>
	<%=msg %>
	<br>
	<% } %>
</body>
</html>