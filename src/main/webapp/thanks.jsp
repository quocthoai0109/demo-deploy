<%--
  Created by IntelliJ IDEA.
  User: Asus
  Date: 2/9/2023
  Time: 2:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Email List Thanks ne!!!</title>
  <link rel="stylesheet" href="main.css">
</head>
<body>
  <h1>Thanks for joining our email list</h1>
  <p>Here is the information tht you entered:</p>

  <label>Email:</label>
  <span>${user.email}</span><br>

  <label>First Name:</label>
  <span>${user.firstName}</span><br>

  <label>Last Name:</label>
  <span>${user.lastName}</span> <br>

  <p>To enter another email address, click on the Back button in you web
    browser or the Return button show below.</p>
  <form action="" method="get">
    <input type="hidden" name="action" value="join">
    <input type="submit" value="Return">
  </form>



</body>
</html>
