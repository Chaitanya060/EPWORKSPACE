package servletcollaborationdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet
{
  public void service(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
  {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<b>Servlet Chaining/Servlet Collaboration Demo</b>");
    
//   RequestDispatcher rd = request.getRequestDispatcher("/demo1");
//    rd.forward(request, response);
    
    
//    RequestDispatcher rd = request.getRequestDispatcher("/demo2");
//    rd.include(request, response);
    
//    RequestDispatcher rd = request.getRequestDispatcher("index.html");
//    rd.include(request, response);
//    rd.forward(request, response);    //we can give any of them to get the output
      
//    response.sendRedirect("index.html");   //if we keep the / here we will get the 404 error in output so avoid the /
//    response.sendRedirect("demo2");
    String text = "kluniversity";
    response.sendRedirect("https://www.google.com/");
    
  }
}