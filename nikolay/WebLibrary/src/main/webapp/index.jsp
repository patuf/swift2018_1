<%@ page import="model.User" %>

<html>
<body>
<% User usr = (User) session.getAttribute("user");
   if(usr != null) {  %>
<h2>Hello <%= usr.getFullName()%>!</h2>
<% } else { %>
<h2>Hello Unknown user!</h2>
<a href=login.jsp>login</a>
<% } %>
</body>
</html>
