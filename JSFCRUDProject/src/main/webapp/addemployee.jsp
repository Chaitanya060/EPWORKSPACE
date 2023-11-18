<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page import="com.klef.ep.services.EmployeeService"%>
<%@page import="javax.naming.InitialContext"%>
<%
InitialContext context = new InitialContext();

String eid = request.getParameter("id");
int id =  (Integer) Integer.parseInt(eid);

String name = request.getParameter("name");
String gender = request.getParameter("gender");
String doj = request.getParameter("doj");
String dept = request.getParameter("dept");
String email = request.getParameter("email");
String pwd = request.getParameter("pwd");
String contact = request.getParameter("contact");

String esal = request.getParameter("salary");
Double salary = Double.parseDouble(esal);

%>