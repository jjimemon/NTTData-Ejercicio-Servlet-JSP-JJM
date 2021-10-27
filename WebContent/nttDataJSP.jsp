<%@ page import = "com.nttdata.tomcat.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>NTTDATA - JSP</title>
</head>
<body>

	<p><%= NttDataJSP.helloNttData("Javier") %> | Cuenta de 1-10</p>

	<%
		for (int i = 0; i <= 10; i++) {
		out.println("A la de... " + i +"</br>");
	}
	%>
	
</body>
</html>