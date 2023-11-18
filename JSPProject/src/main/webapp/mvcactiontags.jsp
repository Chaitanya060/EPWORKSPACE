<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="empinfo" class = "com.klef.ep.dao.Employee"></jsp:useBean>
<jsp:setProperty property = "id" name = "empinfo" param = "id"/>
<jsp:setProperty property = "name" name = "empinfo" param = "name"/>
<jsp:setProperty property = "username" name = "empinfo" param = "uname"/>
<jsp:getProperty property = "id" name = "empinfo"/>
<jsp:getProperty property = "name" name = "empinfo"/>
<jsp:getProperty property = "username" name = "empinfo"/>