<%@page contentType="text/html;charset = UTF-8" language="java"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC Form Handling</title>
</head>

<body>
	<p>hello</p>
	<form action="addUser">
	<input type ="text" name="id" ><br>
	<input type="text" name="name"><br>
	<input type="submit">

	</form>
	

</body>

</html>