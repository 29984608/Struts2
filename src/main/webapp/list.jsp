<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2017/10/11
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/list" method="post">
    <!--list[0]：表示list集合中第一个user对象-->
    username:<input type="text" name="list[0].username"><br>
    password:<input type="text" name="list[0].password"><br>
    address: <input type="text" name="list[0].address"><br><br>

    username:<input type="text" name="list[1].username"><br>
    password:<input type="text" name="list[1].password"><br>
    address: <input type="text" name="list[1].address"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
