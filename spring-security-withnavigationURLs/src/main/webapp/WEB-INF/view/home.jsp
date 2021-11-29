<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Security</title>
</head>
<body>

	Welcome to spring security from Udemy !!!

	<hr>
	User:
	<security:authentication property="principal.username" />
	UserRole:
	<security:authentication property="principal.authorities" />
	<security:authorize access="hasRole('EMPLOYEE')">
		<a href="${pageContext.request.contextPath}/regular">Meeting Only
			For Employees</a>
		<hr>
	</security:authorize>
	<security:authorize access="hasRole('MANAGER')">
		<a href="${pageContext.request.contextPath}/leaders">Meeting Only
			For Managers</a>
		<hr>
	</security:authorize>
	<security:authorize access="hasRole('ADMIN')">
		<a href="${pageContext.request.contextPath}/systems">IT Systems
			For Admins</a>
		<hr>
	</security:authorize>

	<form:form action="${pageContext.request.contextPath}/logout"
		method="POST">
		<input type="submit" value="Logout">

	</form:form>


</body>
</html>