<%-- 
    Document   : hello
    Created on : 06.03.2015, 11:26:12
    Author     : Katja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Hello <%= request.getParameter("name") %><br>
        your id is  <%= request.getParameter("id") %>
    </body>
</html>
