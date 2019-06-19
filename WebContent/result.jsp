<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SprinMVCDemo</title>
</head>
<body>
	Welcome <%=request.getAttribute("name") %>
	Result is <%=request.getAttribute("result") %> 
	Result displayed using EL is ${result}
	<%=request.getAttribute("msg") %>
</body>
</html>