<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.klef.ep.services.EmployeeService" import="javax.ejb.EJB"%>
<%!


@EJB(lookup="java:global/JSFCRUDProject/EmployeeServiceImpl!com.klef.ep.services.EmployeeService")
EmployeeService employeeService;
%>

<%
String email=request.getParameter("email");
String pwd=request.getParameter("pwd");



%>