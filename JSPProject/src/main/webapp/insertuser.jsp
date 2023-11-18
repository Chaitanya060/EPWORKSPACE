<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "java.sql.*"%>
<%
String name = request.getParameter("name");
String gender = request.getParameter("gender");
String dob = request.getParameter("dob");
String mstatus = request.getParameter("mstatus");
String email = request.getParameter("email");
String pwd = request.getParameter("pwd");

String contactno = request.getParameter("contactno");

try
{
	Connection con = null;
    
    Class.forName("com.mysql.cj.jdbc.Driver");
      System.out.println("Driver Classes Loaded");
     con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/jsps3", "root", "root");
      System.out.println("Connection Established");
      
      
      PreparedStatement pstmt = con.prepareStatement("  insert into user(name,gender,dob,maritalstatus,email,password,contact) values(?,?,?,?,?,?,?)  ");
      pstmt.setString(1, name);
      pstmt.setString(2,gender);
      pstmt.setString(3, dob);
      pstmt.setString(4,mstatus);
      pstmt.setString(5, email);
      pstmt.setString(6, pwd);
      pstmt.setString(7, contactno);
      int n = pstmt.executeUpdate();
      if(n>0)
      {
    	  response.sendRedirect("userregsuccess.html");
      }
      
      con.close();
}

catch(Exception e)
{
	System.out.println(e);
}


%>