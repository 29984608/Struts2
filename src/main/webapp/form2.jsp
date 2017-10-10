<%@ page import="org.apache.struts2.ServletActionContext" %><%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2017/10/9
  Time: 21:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/form2" method="post">
    username:<input type="text" name="username"><br>
    password:<input type="text" name="password"><br>
    address: <input type="text" name="address"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
