package lifecycle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondServlet extends GenericServlet {
	
	public void init() {
		System.out.println("invoked init method");
	}

	public void destroy() {
		System.out.println("invoked destroy method");
	}
	
	public void service(ServletRequest request,ServletResponse response) throws ServletException, IOException {
		System.out.println("invoked service method");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<b> YOO! NIGGA MY MAN</b>");
	}

}

