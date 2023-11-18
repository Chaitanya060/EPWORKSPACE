<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
String name = (String) session.getAttribute("name");
String email = (String) session.getAttribute("email");
if(name==null||email==null){
  response.sendRedirect("sessionexpiry.html");
}
%>
<!DOCTYPE html>
<html>
<head>
<title>EP</title>
</head>
<body bgcolor="lightgrey">
<h1 align="center">JSP Web Application</h1>
<hr color="black"><hr color="black"><br>
<a href="userhome.jsp">Home</a>&nbsp;&nbsp;&nbsp;
<a href="userlogout.jsp">Logout</a>&nbsp;&nbsp;&nbsp;
<br><br>
<h3>I am in User Home</h3><br>
My name is <%=name%> and My Email is <%=email%>