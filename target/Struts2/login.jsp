<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2017/10/20
  Time: 9:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/login">
    账号： <input type="text" style="width: 100px;padding-left: 5px" name="username"><br>
    密码： <input type="password" style="width: 100px;padding-left: 5px" name="password"><br>
    <input type="submit" value="登录" style="width: auto">
</form>
</body>
</html>
