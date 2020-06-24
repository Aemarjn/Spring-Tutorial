<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%-- <spring:form action="save" method="POST">
		Name :<input type="text" name="name"/><br>
		Age :<input type="text" name="age"/><br>
		<input type="submit" value="Submit"/>
	</spring:form> --%>
	
	<spring:form modelAttribute="person" action="save" method="POST">
		Name : <spring:input path="name"/><spring:errors path="name"></spring:errors><br>
		Age : <spring:input path="age"/><spring:errors path="age"/><br>
		<input type="submit" value="Submit">
	</spring:form>

</body>
</html>