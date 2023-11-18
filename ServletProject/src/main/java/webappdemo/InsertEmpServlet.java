package webappdemo;


import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertEmpServlet extends HttpServlet
{
  public void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
  {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    
    String eid=request.getParameter("id");
    int empid = Integer.parseInt(eid);
    String ename=request.getParameter("fname");
    String egender=request.getParameter("gender");
    String edob=request.getParameter("dob");
    String salary=request.getParameter("salary");
      double esal = Double.parseDouble(salary);
    String empemail=request.getParameter("emailid");
    String epwd=request.getParameter("pwd");
    String econtact=request.getParameter("contactno");
    try
    {
        Connection con = null;
          
        Class.forName("com.mysql.cj.jdbc.Driver");
          System.out.println("Driver Classes Loaded");
         con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/servlets3", "root", "root");
          System.out.println("Connection Established");
          
            PreparedStatement pstmt = con.prepareStatement("   insert into employee values(?,?,?,?,?,?,?,?)  ");
            pstmt.setInt(1, empid);
            pstmt.setString(2, ename);
            pstmt.setString(3, egender);
            pstmt.setString(4, edob);
            pstmt.setDouble(5, esal);
            pstmt.setString(6, empemail);
            pstmt.setString(7, epwd);
            pstmt.setString(8, econtact);
            
           int n =  pstmt.executeUpdate();
           
           if(n>0)
           {
//             out.println("<b>Employee Registered Successfully</b>");
        	   response.sendRedirect("empregsuccess.html");
             
           }
           else
           {
             out.println("<b>Failed to Register Employee</b>");
           }
           con.close();
    }
    catch(Exception e)
    {
      out.println(e);
    }
    
    
  }
}