<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; " pageEncoding="UTF-8" language="java" %>
<html lang="en">
<head>
    <title>确认页</title>
</head>
<body>
<p><b>Your reservation confirmed successfully.Please re-check details:</b></p>
姓：${aaa.firstName}<br>
名：${aaa.lastName}<br>
性别：${aaa.gender}<br>
就餐:
<ul>
    <c:forEach var="meal" items="${aaa.food}">
        <li>${meal}</li>
    </c:forEach>
</ul>
出发：${aaa.cityFrom}<br>
到达：${aaa.cityTo}<br>
</body>
</html>
