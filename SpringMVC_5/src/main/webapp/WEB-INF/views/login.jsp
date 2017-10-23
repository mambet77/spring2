<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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

			<form:label path="name">Name</form:label>
			<form:input path="name" />
			<form:label path="password">Password</form:label>
			<form:password path="password" />
		</fieldset>

		<footer>
			<label><input type="checkbox" tabindex="3">Keep melogged in</label> 
			<label><form:checkbox tabindex="3" path="admin"/>Admin</label> 
			<input type="submit" class="btnLogin" value="login">
		</footer>
	</form:form>


</body>
</html>
