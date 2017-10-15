<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2017/10/15
  Time: 18:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!--
使用ognl+Struts2标签实现计算字符串长度
value属性值：ognl表达式
-->
<s:property value="'sssssss'.length()"></s:property>
<s:debug></s:debug>
</body>
</html>
