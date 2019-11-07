<%@ page contentType="text/html" pageEncoding="UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>员工列表</h1>
<table border="1" width="80%">
    <tr><th>Id</th><th>姓名</th><th>工资</th><th>说明</th><th>编辑</th><th>删除</th></tr>
    <c:forEach var="emp" items="${list}">
        <%--一个tr标签表示一行--%>
        <tr>
            <td>${emp.id}</td>
            <td>${emp.name}</td>
            <td>${emp.salary}</td>
            <td>${emp.designation}</td>
            <td><a href="editemp/${emp.id}">编辑</a></td>
            <td><a href="deleteemp/${emp.id}">删除</a></td>
        </tr>
    </c:forEach>
</table>
<br/>
<a href="empform">添加新员工</a>