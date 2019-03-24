<%@ page contentType="text/html" pageEncoding="UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<body>
<h1>Employee List</h1>
<table border="1" width="50%" >
<tr><th>ID</th><th>Name</th><th>Salary</th></tr>
    <c:forEach var="employee" items="${message}">
        <tr>
            <td>${employee.id}</td>
            <td>${employee.name}</td>
            <td>${employee.salary}</td>
        </tr>
    </c:forEach>
</table><br>
<a href="/home/viewemp/1">1</a>
<a href="/home/viewemp/2">2</a>
<a href="/home/viewemp/3">3</a>
<a href="/home/viewemp/4">4</a>
</body>
</html>
