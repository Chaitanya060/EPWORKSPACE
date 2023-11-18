<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EP</title>
</head>
<body bgcolor="lightblue">

<h2 align=center>JSP with JPA Example</h2><hr color="black"><hr color="black">

<a href="employeereg.jsp">Employee Registration</a>&nbsp;&nbsp;&nbsp;
<a href="employeelogin.jsp">Employee Login</a>&nbsp;&nbsp;&nbsp;

<h2 align="center"><u>Employee Login</u></h2>
<form method="post"   action="checkemplogin.jsp"> 
<table align="center">
<tr>
</tr>
<tr><td></td></tr>
<tr>
    <td><b>Email ID</b></td>
    <td>
        <input type="email" name="email" required>
    </td>
</tr>
<tr><td></td></tr>
<tr>
    <td><b>Password</b></td>
    <td>
        <input type="password" name="pwd" required>
    </td>
</tr>
<tr><td></td></tr>
<tr><td></td></tr>
<tr><td></td></tr>
<tr align="center">
    <td>
        <input type="submit" value="Login" required>
    </td>
    <td>
        <input type="reset" value="Clear" required>
    </td>
</tr>
</table>
</form>

</body>
</html>