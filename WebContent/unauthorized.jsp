<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<%@page session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SprinMVCDemo</title>
</head>
<body>
	You are not authorized to access the page. Click 
	<a href="<c:url value="/welcome.jsp" />" > here</a> 
	to go back to home page
</body>
</html>