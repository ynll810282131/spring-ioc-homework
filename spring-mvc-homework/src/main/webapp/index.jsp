<%--
  Created by IntelliJ IDEA.
  User: Gungnir
  Date: 2020/3/15
  Time: 18:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页</title>
</head>
<body>
<form action="/login" method="post">
    用户名：<input type="text" name="username" value="admin"><br>
    密&nbsp;&nbsp;&nbsp;码:
    <input type="password" name="pwd" value="admin"><br>
    <input type="submit" value="登录">
</form>

</body>
</html>