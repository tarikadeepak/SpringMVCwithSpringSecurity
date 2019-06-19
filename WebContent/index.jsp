<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="java.util.*" %>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<%@page session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SpringMVCDemo</title>
</head>
<body>
	<h2>Welcome to spring MVC demo application</h2>
	Today's date: <%= (new java.util.Date()).toLocaleString()%>
	</br>
	</br>
	Click <a href="<c:url value="/welcome.jsp"/>" > here </a> to launch the application
</body>
</html>