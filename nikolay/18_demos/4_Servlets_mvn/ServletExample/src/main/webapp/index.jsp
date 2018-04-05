<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="controller.MyTestController" %>

<%! MyTestController controller = new MyTestController(); %>
<html>
    <body>
        <h2>Hello World!</h2>
        <p><% out.println("Your IP address is " + request.getRemoteAddr()); %></p>
        <p><% out.println("The sum of 3 and 5 is " + controller.sum(3, 5)); %></p>
        <p>The subtraction of 96 and 5 is <%= controller.subtract(96, 5) %></p>

        <br/><br/>
        <p><a href="summer.jsp?sum1=5&sum2=3">Get your 5+3 sum through a hardcoded GET request</a></p>

        <br/><br/>
        <form action="summer.jsp" method="POST">
            <input type="text" name="sum1" value="0" />
            <input type="text" name="sum2" value="0" />
            <input type="submit" value="Get Your Sum" />
        </form>
    </body>
</html>
