<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="java.sql.*" %>
<%
String uid = request.getParameter("id");
int id = Integer.parseInt(uid);
String name = request.getParameter("name");
String mstatus = request.getParameter("mstatus");
String password = request.getParameter("pwd");

try
{
  Connection con = null;
    Class.forName("com.mysql.cj.jdbc.Driver");
      System.out.println("Driver Classes Loaded");
     con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/jsps3", "root", "root");
      System.out.println("Connection Established");
      
      PreparedStatement ps = con.prepareStatement("  update user set name=?,maritalstatus=?,password=? where id=?   ");
      ps.setString(1, name);
      ps.setString(2, mstatus);
      ps.setString(3, password);
      ps.setInt(4, id);
      
      int n = ps.executeUpdate();
      
      if(n>0)
      {
        out.println("User Updated Successfully");
      }
      else
      {
        out.println("ID Not Found");
      }
      
}
catch(Exception e)
{
  out.println(e);
}
%>