<%--
  Created by IntelliJ IDEA.
  User: ashish
  Date: 13/7/17
  Time: 12:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<font color="red">Welcome <%=session.getAttribute("user")%></font>
<br>
<form action="/logout" method="get">
    <input type="submit" value="logout">
</form>

</body>
</html>
