<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<title>EP</title>
</head>
<body bgcolor="lightgrey">
<h1 align="center">JSP Web Application</h1>
<hr color="black"><hr color="black"><br>
<a href="index.html">Home</a>&nbsp;&nbsp;&nbsp;
<a href="userregistrationdemo.html">User Registration</a>&nbsp;&nbsp;&nbsp;
<a href="userlogin.html">User Login</a>&nbsp;&nbsp;&nbsp;
<a href="viewusers.jsp">View Users</a>&nbsp;&nbsp;&nbsp;
<br><br>
<h2 align="center"><u>View All Users</u></h2>
<table align="center" border=2>
<tr>
<th>ID</th>
<th>NAME</th>
<th>GENDER</th>
<th>DATE OF BIRTH</th>
<th>MARTIAL STATUS</th>
<th>EMAIL ID</th>
<th>CONTACT NO</th>
<th>Action</th>
</tr>

<%
try{
  Connection con = null;
    Class.forName("com.mysql.cj.jdbc.Driver");
      System.out.println("Driver Classes Loaded");
     con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/jsps3", "root", "root");
      System.out.println("Connection Established");
      
      ResultSet rs = con.createStatement().executeQuery("select * from user");
      while(rs.next())
      {
        %>
        <tr>
        <td><%=rs.getInt(1)%></td>
        <td><%=rs.getString(2)%></td>
        <td><%=rs.getString(3)%></td>
        <td><%=rs.getString(4)%></td>
        <td><%=rs.getString(5)%></td> 
        <td><%=rs.getString(6)%></td>
        <td><%=rs.getString(8)%></td>
        <td><a href="deleteuser.jsp?uid=<%=rs.getInt(1)%>">Delete</a></td>                
        </tr>
        
        
        <% 
        
      }
      
}
catch(Exception e){
  out.println(e);
}
%>
</table>
</body>
</html>