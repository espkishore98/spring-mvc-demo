<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Enter City Name
	<form method="POST" action="/weatherForecast">
		<label> City: <input type="text" name="city"/></label> 
		<input type="submit" value="Submit"/>
	</form>
</body>
</html>