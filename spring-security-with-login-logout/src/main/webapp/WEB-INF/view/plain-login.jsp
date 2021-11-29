<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Login Here...</h1>
	<form:form
		action="${pageContext.request.contextPath }/authenticateTheUser"
		method="POST">
		<c:if test="${param.error!=null }">
			<i style="color: red;">Sorry! You entered wrong username/password</i>
		</c:if>
		
		<c:if test="${param.logout!=null }">
			<i style="color: red;">You are logged out</i>
		</c:if>

		<p><label>Username:</label>
		<input type="text" name="username"></p>
		<p><label>Password:</label>
		<input type="password" name="password"></p>
		<br>
		<input type="submit" value="Login">
	</form:form>
</body>
</html>