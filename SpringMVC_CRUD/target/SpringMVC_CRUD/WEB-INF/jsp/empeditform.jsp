<%@ page contentType="text/html" pageEncoding="UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>编辑员工</h1>
<form:form method="POST" action="/home/editsave"><%--这里必须加主目录限定比如我设置的/home，否则报错--%>
    <table >
        <tr>
            <td></td>
            <td><form:hidden  path="id" /></td>
        </tr>
        <tr>
            <td>姓名 : </td>
            <td><form:input path="name"  /></td>
        </tr>
        <tr>
            <td>工资 :</td>
            <td><form:input path="salary" /></td>
        </tr>
        <tr>
            <td>说明 :</td>
            <td><form:input path="designation" /></td>
        </tr>

        <tr>
            <td> </td>
            <td><input type="submit" value="保存" /></td>
        </tr>
    </table>
</form:form>
