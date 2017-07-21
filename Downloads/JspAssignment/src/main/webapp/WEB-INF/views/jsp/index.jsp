<%--
  Created by IntelliJ IDEA.
  User: ashish
  Date: 13/7/17
  Time: 12:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <div style="border-color: red">
<form action="/Login" method="post">
  Username: <input type="text" name="username"><br>
    <p>${error}</p>
  Password: <input type="text" name="password"><br>
  <input type="submit">
</form>
      <br>
      <br>
      <br>
  </div>
  <div style="border-color:red">

 <form  method="post" action="/registration">
   Enter your name      <input type="text" name="username"><br>
   Enter your password: <input type="password" required name="password"><br>
   Enter your email:    <input type="email" required name="email"><<br>
   Enter your age:       <input type="text" required name="age"><br>
   <input type="submit">
 </form>
  </div>
  </body>
</html>
