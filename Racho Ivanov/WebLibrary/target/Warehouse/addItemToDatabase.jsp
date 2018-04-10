<%--
  Created by IntelliJ IDEA.
  User: Racho Ivanov
  Date: 9.4.2018 г.
  Time: 20:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String str = request.getParameter("Console");
        out.print(str);
    %>
</body>
</html>
