<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2017/10/20
  Time: 9:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>欢迎您</h1>
<%=session.getAttribute("username")%>
${sessionScope.username}
</body>
</html>
