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
<!--获取字符串-->
<s:property value="user"></s:property><br>
<!--获取对象值-->
<s:property value="user.username"></s:property>
<s:property value="user.password"></s:property>
<s:property value="user.address"></s:property><br>
<!--获取list集合值 方法一-->
<s:property value="list[0].username"></s:property>
<s:property value="list[0].password"></s:property>
<s:property value="list[0].address"></s:property><br>

<%--使用Struts2标签
<s:iterator> :遍历值栈的list集合--%>
<s:iterator value="list">
    <s:property value="username"></s:property>
    <s:property value="password"></s:property>
    <s:property value="address"></s:property><br>
</s:iterator>
<!--
遍历值栈list集合，得到每个user对象
机制：把每次遍历出来的user对象放到context里面
获取context里面的数据特点：写ognl表达式
使用特殊符号 #
-->
<s:iterator value="list" var="user">
    <s:property value="#user.username"></s:property>
    <s:property value="#user.password"></s:property>
    <s:property value="#user.address"></s:property><br>
</s:iterator>

<!--获取set方法设置的值-->
<s:property value="username"></s:property><br>
<!--获取push方法设置的值-->
<s:property value="[0].top"></s:property>

<s:debug></s:debug>
</body>
</html>
