<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<title><spring:message code="login.title"/></title>
</head>
<body>
	<form:form commandName="loginCommand">
	<form:errors />
	<p>
		<label>
		<spring:message code="id" />:
		<form:input path="id" />
		<form:errors path="id" />
		</label>
	</p>
	<p>
		<label>
		<spring:message code="password" />:
		<form:input path="password" />
		<form:errors path="password" />
		</label>
	</p>
	<p>
		<label>
			<spring:message code="rememberEmail"/>
			<form:checkbox path="rememberEmail"/>
		</label>
		<input type="submit" value="<spring:message code="login.btn"/>">
	</form:form>
</body>
</html>