<%--
  Created by IntelliJ IDEA.
  User: Racho Ivanov
  Date: 6.4.2018 г.
  Time: 11:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Welcome, please login!</h1>

<form action="/login" method="post">
    Name: <input type = "text" name="Loginname" width="30"/>
    Password: <input type = "password" width = "10"/>
    <button type = "button">Log In</button>
</form>
</body>
</html>
