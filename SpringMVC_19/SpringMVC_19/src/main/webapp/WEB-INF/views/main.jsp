<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>

<title>Home</title>
</head>
<body>

<p>Hello ${user.name}!</p>
<p>Your password is  ${user.password}!</p>
<p>Admin  ${user.admin}!</p>
<p>Locale  ${locale}!</p>

	<form:form method="post" action="uploadFile" modelAttribute="uploadedFile" enctype="multipart/form-data">
		File to upload :<input name="file" type="file" /><br />
		  <form:errors path="file"> </form:errors>
		
<input type="submit" value="Upload"/>Press hier to upload the file! 
	</form:form >

</body>
</html>
