package lifecycle;

import java.io.PrintWriter;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{
	public void init()
	{
		System.out.println("invoked init method");
	}
	public void service(HttpServletRequest reqeust, HttpServletResponse response) throws IOException , ServletException
	{
		System.out.println("invoked service method");
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<b> i am chaitanya</b>");
		
		
	}
	public void destroy()
	{
		System.out.println("invoked destroy method");
	}
}