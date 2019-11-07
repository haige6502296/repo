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
    就餐:
    早餐：<form:checkbox path="food" value="早餐"/>
    午餐：<form:checkbox path="food" value="午餐"/>
    晚餐：<form:checkbox path="food" value="晚餐"/><br>
    出发：
    <form:select path="cityFrom">
        <form:option value="shanghai" label="上海"/>
        <form:option value="北京" label="北京"/>
        <form:option value="广州" label="广州"/>
        <form:option value="深圳" label="深圳"/>
    </form:select>
    到达：
    <form:select path="cityTo">
        <form:option value="成都" label="成都"/>
        <form:option value="杭州" label="杭州"/>
        <form:option value="昆明" label="昆明"/>
        <form:option value="西安" label="西安"/>
    </form:select><br>
    <input type="submit" value="提交"/>
</form:form>
</body>
</html>
