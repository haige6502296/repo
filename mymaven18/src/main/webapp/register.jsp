<%@page import="com.lct.UserDao"%>
<jsp:useBean id="obj" class="com.lct.User">
</jsp:useBean>
<jsp:setProperty property="*" name="obj"/>
<%
    UserDao.register(obj);
        out.print("You are successfully registered");
%>