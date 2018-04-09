<%@ page import="model.User" %>
<%@ page import="controller.mockimpl.UserManagementControllerMockImpl" %>
<%@ page import="controller.interfaces.UserManagementController" %>

<%! UserManagementController umc = new UserManagementControllerMockImpl(); %>
<html>
<body>
<% session.setAttribute("user", umc.login("pesho", "pepi")); %>
<span>You are now logged in!</span>
<a href=index.jsp>go back</a>
</body>
</html>
