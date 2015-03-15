<%-- 
    Document   : errorLogin
    Created on : 24.02.2015, 12:31:36
    Author     : Katja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <p style="color:red"> Wrong password or login</p>
        <form action="LoginServlet" method="POST">
            Login:<br>
            <input type="text"  name="login" required>
            <br>
            Password:<br>
            <input type="password" name="password" required><br>
            <input type="submit" value="Login">
        </form>
</html>
