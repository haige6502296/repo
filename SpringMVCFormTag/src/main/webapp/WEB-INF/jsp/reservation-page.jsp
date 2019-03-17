<%@ page contentType="text/html" pageEncoding="UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
<head>
    <title>Reservation Form</title>
</head>
<h3>Railway Reservation Form</h3>
<body>
<form:form action="submitForm" modelAttribute="bbb">
姓：<form:input path="firstName"/><br>
名：<form:input path="lastName"/><br>
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>
