package lifecycle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ThirdServlet implements Servlet
{
    ServletConfig config = null;
	@Override
	public void destroy() {
		System.out.println("init method is invoked");
		this.config = config;
		System.out.println("Servlet Name:" + config.getServletName());
		
	}
     
	@Override
	public ServletConfig getServletConfig() {
		return this.config;
	}

	@Override
	public String getServletInfo() {
		return "Author:KLEF - Servlet Life Cycle Demo V1.0";
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("destroy method is invoked");
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service method is invoked");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<b>Servlet Life Cycle Demo</b>");
	}
	
	
}