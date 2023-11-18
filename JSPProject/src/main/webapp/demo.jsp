<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%!   //declaration tag
 int a= 3,b = 4;
public int add(int x,int y)
{
	return x + y;
}


%>

<%    //scripptlet tag 
System.out.println(add(a,b));
out.println(add(a,b)+"<br>");
out.print("<h3>" + add(10,20)+"</h3><br>");
%>

the value of a is <%=a%> <br>

the value of b is <%=b%> <br>
output is<%=add(a,b)%>