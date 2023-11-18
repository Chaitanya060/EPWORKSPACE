<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<%

String uid = request.getParameter("uid");//where uid is parameter name
int id = Integer.parseInt(uid);

try{
  Connection con = null;
    Class.forName("com.mysql.cj.jdbc.Driver");
      System.out.println("Driver Classes Loaded");
     con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/jsps3", "root", "root");
      System.out.println("Connection Established");
      
      PreparedStatement ps = con.prepareStatement("delete from user where id=?");
      ps.setInt(1,id);
      
      ps.executeUpdate();
      
      response.sendRedirect("viewusers.jsp");
}
catch(Exception e){
  out.println(e);
}
  %>