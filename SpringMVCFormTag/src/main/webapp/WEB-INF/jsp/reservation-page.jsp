<%@ page contentType="text/html; utf-8" pageEncoding="UTF-8" language="java" %>
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
    性别:
    男<form:radiobutton path="gender" value="男"/>
    女<form:radiobutton path="gender" value="女"/><br>
    <input type="submit" value="提交"/>
</form:form>
</body>
</html>
