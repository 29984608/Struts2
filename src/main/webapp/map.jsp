<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2017/10/11
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/map" method="post">
    <!--设置key值  map['key值']
    设置value值
    -->
    username:<input type="text" name="map['one'].username"><br>
    password:<input type="text" name="map['one'].password"><br>
    address: <input type="text" name="map['one'].address"><br><br>

    username:<input type="text" name="map['two'].username"><br>
    password:<input type="text" name="map['two'].password"><br>
    address: <input type="text" name="map['two'].address"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
