<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <h3>I am in Display Values JSP page</h3>
<%
String id = request.getParameter("id");
String name = request.getParameter("name");
%>
ID=<%=id%><br>
NAME=<%=name%><br>