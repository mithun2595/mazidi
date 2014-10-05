/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author acer
 */
public class FixAppointment extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String name=request.getParameter("pname");
        String uid=request.getParameter("uname");
        String desg=request.getParameter("sel");
        String intern=request.getParameter("intern");
        String message=request.getParameter("msg");
        System.out.println(desg);
        System.out.println(intern);
              try {
            /* TODO output your page here. You may use following sample code. */
           
 Class.forName("com.mysql.jdbc.Driver");
String connectionURL = "jdbc:mysql://localhost:3306/hospitalmanagement"; 
Connection connection = null; 
Statement st=null;
    ResultSet rs=null;
   String sql="";
   String sql1="";
connection = DriverManager.getConnection(connectionURL,"root","12021995");

if(desg.equals("genchk"))
{
    {sql="insert into genchk values(1,'"+name+"','"+uid+"','"+intern+"','"+message+"');";}
}
if(desg.equals("gensurg"))
{
    {sql="insert into gensurg values(2,'"+name+"','"+uid+"','"+intern+"','"+message+"');";}
}
if(desg.equals("plasurg"))
{
    {sql="insert into plasurg values(3,'"+name+"','"+uid+"','"+intern+"','"+message+"');";}
}
if(desg.equals("cardio"))
{
    {sql="insert into cardio values(4,'"+name+"','"+uid+"','"+intern+"','"+message+"');";}
}
if(desg.equals("ent"))
{
    {sql="insert into ent values(5,'"+name+"','"+uid+"','"+intern+"','"+message+"');";}
}
if(desg.equals("pedia"))
{
    {sql="insert into pedia values(6,'"+name+"','"+uid+"','"+intern+"','"+message+"');";}
}
if(desg.equals("dent"))
{
    {sql="insert into dent values(7,'"+name+"','"+uid+"','"+intern+"','"+message+"');";}
}
if(desg.equals("gyne"))
{
    {sql="insert into gyne values(8,'"+name+"','"+uid+"','"+intern+"','"+message+"');";}
}
if(desg.equals("ortho"))
{
    {sql="insert into ortho values(9,'"+name+"','"+uid+"','"+intern+"','"+message+"');";}
}

                st=connection.createStatement();
		st.executeUpdate(sql);
            
                out.println("<!DOCTYPE html>");
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Successfully added !</title>");
            out.println("<link rel=\"stylesheet\" href=\"pformat.css\" type=\"text/css\">");
            out.println("</head>");
            out.println("<body background=login.jpg>");
            out.println("<h1>You have fixed an appointment with so and so at so and so time.</h1>");
            out.println("</body>");
            out.println("</html>");
    }
    catch(Exception e)
    {
System.out.print("bla bla"+e);
    }
        finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
