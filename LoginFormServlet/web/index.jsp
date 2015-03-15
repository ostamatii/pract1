<%-- 
    Document   : index
    Created on : 24.02.2015, 10:50:33
    Author     : Katja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Form</title>
    </head>
    <body>
        <h1>Input data to log in</h1>
        <form action="LoginServlet" method="POST">
            Login:<br>
            <input type="text"  name="login" required>
            <br>
            Password:<br>
            <input type="password" name="password" required><br>
            <input type="submit" value="Login">
        </form>
    </body>
</html>
