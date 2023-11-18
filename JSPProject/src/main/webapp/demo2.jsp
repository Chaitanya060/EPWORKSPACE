<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<h3 align=center>I am in Demo 2 JSP Page</h3>
    
<%-- <jsp:include page="demo.jsp"></jsp:include> --%>

<jsp:include page="displayvalues.jsp">
<jsp:param name="id" value="100"/>
<jsp:param name="name" value="KLU"></jsp:param>
</jsp:include>