<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="controller.MyTestController" %>

<%! MyTestController controller = new MyTestController(); %>
<% int sum1 = Integer.parseInt(request.getParameter("sum1"));
   int sum2 = Integer.parseInt(request.getParameter("sum2")); %>
<html>
    <body>
        <h2>Behold the mighty summer, dirty plebs!</h2>
         <p>The sum of <%= sum1 %> and <%= sum2 %> is <%= controller.sum(sum1, sum2) %> </p>
         <a href="index.jsp">Back to main menu</a>
    </body>
</html>
