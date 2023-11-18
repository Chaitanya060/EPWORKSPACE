<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "com.klef.ep.models.Employee"%>
    <%
    Employee emp = (Employee)session.getAttribute("emp");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSF Application</title>
</head>
<body>

<h2 align="center">JSF CRUD Operations with JPA</h2> <hr color="black"/><hr color="black"/>

<a href="emphome.jsp">Home</a>&nbsp;&nbsp;&nbsp;
<a href="empprofile.jsp">Profile</a>&nbsp;&nbsp;&nbsp;


<br>

<h3 align = "center">I am In Employee Profile</h3>
Name <%=emp.getName()%><br>
Department<%=emp.getDepartment() %><br>
Data Of Joining<%=emp.getDateofjoining() %><br>
Contact No<%=emp.getContactno() %><br>

</body>
</html>