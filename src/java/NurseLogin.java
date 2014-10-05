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
import javax.servlet.http.*;
import javax.servlet.*;

/**
 *
 * @author acer
 */
public class NurseLogin extends HttpServlet {

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
        try {
            /* TODO output your page here. You may use following sample code. */
           
String id=request.getParameter("nid");
String pass=request.getParameter("pass");
          
if(id.equals("")){
RequestDispatcher rd=request.getRequestDispatcher("nurse/nlogin.jsp");
rd.forward(request,response);
}
if(pass.equals(""))
{
    RequestDispatcher rd=request.getRequestDispatcher("nurse/nlogin.jsp");
rd.forward(request,response);

}

if(Validate.checkUser(id,pass))
{
    //out.println("Welcome to "+id+" department");
    RequestDispatcher rd=request.getRequestDispatcher("nurse/nurse.jsp");
    
    Class.forName("com.mysql.jdbc.Driver");
String connectionURL = "jdbc:mysql://localhost:3306/hospitalmanagement"; 
Connection connection = null; 
Statement st=null;
    ResultSet rs=null;
   
   String sql1="";

connection = DriverManager.getConnection(connectionURL,"root","12021995");

sql1="select dno from nurse where nid='"+id+"';";		
st=connection.createStatement();
st.executeQuery(sql1);
String dno=rs.getString("dno");
ServletContext context = request.getSession().getServletContext();
    context.setAttribute("nurseid",id);
    context.setAttribute("nursepass",pass);
    context.setAttribute("nursedno",dno);
  
    rd.include(request,response);
    
}
else{
    out.println("Please enter right username and pass");
  
     RequestDispatcher rd=request.getRequestDispatcher("nurse/nlogin.jsp");
rd.include(request,response);
}
 
 
}              /* if(a.equals(id) && b.equals(pass))
                {
                       RequestDispatcher rd=request.getRequestDispatcher("nurse/nlogin.jsp");
                    rd.forward(request,response);

                }
                else
                {
                    RequestDispatcher rd=request.getRequestDispatcher("nurse/nlogin.jsp");
                    rd.forward(request,response);
                }
*/
    
  
    
        catch(Exception e){}
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

    public NurseLogin() {
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
