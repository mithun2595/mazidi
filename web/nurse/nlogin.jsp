<%-- 
    Document   : nlogin
    Created on : Oct 3, 2014, 7:46:40 PM
    Author     : acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="${pageContext.request.contextPath}/nurse/nformat.css" type="text/css">
        <title>Nurse Log-in</title>
    </head>
    <body background="${pageContext.request.contextPath}/nurse/nlogin.jpg">
        <form action="${pageContext.request.contextPath}/NurseLogin" method="post">
        <h1 style="color:#8B4513;text-align:center">PLEASE LOGIN</h1>
        <label>User ID :</label><input type="text" name="nid"/><br><br>
        <label> Password:</label><input type="password" name="pass"/><br><br><br>
        <div style="text-align:center"><input type="submit" value="Login"></div>
        
        </form>
    </body>
</html>
