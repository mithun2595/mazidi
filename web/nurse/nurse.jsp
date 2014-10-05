<%-- 
    Document   : nurse
    Created on : Oct 3, 2014, 6:31:16 PM
    Author     : acer
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.io.PrintWriter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
        <title>Nurse</title>
    </head>
    <body background="${pageContext.request.contextPath}/nurse/nurse.jpg">
        <h1>Hello World!</h1>
        <%ServletContext context = request.getSession().getServletContext();
        String id=(String)context.getAttribute("nurseid");
         String dno=((String)context.getAttribute("nursedno"));
     /*  Class.forName("com.mysql.jdbc.Driver");
String connectionURL = "jdbc:mysql://localhost:3306/hospitalmanagement"; 
Connection connection = null; 
Statement st=null;
    ResultSet rs=null;
   
   String sql1="";

connection = DriverManager.getConnection(connectionURL,"root","12021995");

sql1="select dno from nurse where nid='"+id+"';";		
st=connection.createStatement();
		st.executeQuery(sql1);
                String dno=rs.getString("dno");*/
        PrintWriter outc = response.getWriter();%>
        <%outc.println("Welcome to "+dno+" department");%>
    </body>
</html>
