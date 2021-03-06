
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page session="false"%>
<html>
<head>
<link href="<c:url value="/resources/css/home.css" />" rel="stylesheet">

<title>Titel</title>
</head>
<body>


	<form:form method="POST" modelAttribute="user" action="check-user"
		class="box login">
		<fieldset class="boxBody">

			<form:label path="name">
				<spring:message code="username" />
			</form:label>
			<form:input path="name" />
			<form:errors path="name" cssClass="error"/>
			
			<form:label path="password">
				<spring:message code="password" />
			</form:label>
			<form:password path="password" />
			<form:errors path="password" cssClass="error"/>
			
		</fieldset>

		<footer>
			<label><input type="checkbox" tabindex="3">
			<spring:message code="checkbox" /></label> <label><form:checkbox
					tabindex="3" path="admin" />
				<spring:message code="admin" /></label> <input type="submit"
				class="btnLogin" value="login">
		</footer>
	</form:form>

</body>
</html>
