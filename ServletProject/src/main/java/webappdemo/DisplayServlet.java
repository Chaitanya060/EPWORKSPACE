package webappdemo;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayServlet extends HttpServlet
{
  public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
  {
	  
	  
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    
    out.println("<b>GET Request Demo</b><br>");
    
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
    
      out.println("Employee ID:"+ empid+"<br>");
      out.println("Employee NAME:"+ ename+"<br>");
      out.println("Employee GENDER:"+ egender+"<br>");
      out.println("Employee DOB:"+ edob+"<br>");
      out.println("Employee Salary:"+ esal+"<br>");
      out.println("Employee EMAIL ID:"+ empemail+"<br>");
      
      
      out.println("Employee Contact no:"+ econtact+"<br>");
  }
  public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
  {
	  
	  
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    
    out.println("<b>POST Request Demo</b><br>");
    
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
    
      out.println("Employee ID:"+ empid+"<br>");
      out.println("Employee NAME:"+ ename+"<br>");
      out.println("Employee GENDER:"+ egender+"<br>");
      out.println("Employee DOB:"+ edob+"<br>");
      out.println("Employee Salary:"+ esal+"<br>");
      out.println("Employee EMAIL ID:"+ empemail+"<br>");
      
      
      out.println("Employee Contact no:"+ econtact+"<br>");
  }
}