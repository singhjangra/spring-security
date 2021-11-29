<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Security</title>
</head>
<body>

			Welcome to spring security with custom Login
			<hr>
			User:<security:authentication property="principal.username"/>
		<hr style="border: 1px dashed black;" />

			UserRole:<security:authentication property="principal.authorities"/>
			  <hr>
			<form:form action="${pageContext.request.contextPath}/logout"  method="POST">
				<input type="submit" value="Logout">					
								
			</form:form>
		
</body>
</html>