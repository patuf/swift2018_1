<%@ page import="com.sun.org.apache.xerces.internal.impl.dv.xs.DateTimeDV" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.time.LocalDate" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Racho Ivanov
  Date: 6.4.2018 г.
  Time: 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%
    Date dt = new Date();

    out.print("<h4>" + dt.toString() + "<h4>");
  %>
  </body>
</html>
