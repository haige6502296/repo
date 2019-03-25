<%@ page contentType="text/html" pageEncoding="UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
    <title>Image File Upload</title>
</head>
<body>
<h1>File Upload Example - Com.lct</h1>

<h3 style="color:red">${filesuccess}</h3>
<form:form method="post" action="savefile" enctype="multipart/form-data">
    <p><label for="fileToUpload">Choose Image</label></p>
    <p><input name="file" id="fileToUpload" type="file" /></p>
    <p><input type="submit" value="Upload"></p>
</form:form>
</body>
</html>