<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<body>
	<c:if test="${pageContext.request.userPrincipal.name != null}">
	   <h2>Welcome : ${pageContext.request.userPrincipal.name} 
            <a href="<c:url value="/logout" />"> <p margin-right=20px>Logout</p></a></h2>
           </br>
           <a href="<c:url value="/add.jsp"/>" > Add</a> 
           &nbsp;
           <a href="<c:url value="/sub.jsp"/>" > Subtract</a> 
	</c:if>
</body>
</html>