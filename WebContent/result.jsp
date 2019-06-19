<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<%@page session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SprinMVCDemo</title>
</head>
<body>
	You entered <%=request.getAttribute("int1") %> and <%=request.getAttribute("int2") %> and your result 
	is <%=request.getAttribute("result") %> 
	</br>
	<a href="<c:url value="/welcome.jsp" />" > Home</a>
	&nbsp;
	<a href="<c:url value="/logout" />" > Logout</a> 
</body>
</html>