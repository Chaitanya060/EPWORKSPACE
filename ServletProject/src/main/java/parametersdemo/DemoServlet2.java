package parametersdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet2 extends HttpServlet{
  
  public void service(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
    
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<b>I am in Demo Servlet2</b>");
    out.println("<br>");
    out.println("<b>Init and Context Parameter Demo</b></br>");
    
    out.println("<b>Init Parameters</b></br>");
    ServletConfig config = getServletConfig();
    out.println("DEPARTMENT="+config.getInitParameter("dept"));
    out.println("<br>");
    out.println("COURSE="+config.getInitParameter("course"));
    out.println("<br>");
    
    out.println("<b>Context Parameters</b></br>");
    ServletContext context = getServletContext();
    out.println("USERNAME="+context.getInitParameter("uname"));
    out.println("<br>");
    out.println("PASSWORD="+context.getInitParameter("password"));
    out.println("<br>");
  }
}