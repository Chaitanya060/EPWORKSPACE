<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*" %>
<%
String emailid=request.getParameter("email");
String password=request.getParameter("pwd");

try{
      Connection con = null;
    
    Class.forName("com.mysql.cj.jdbc.Driver");
      System.out.println("Driver Classes Loaded");
     con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsps3", "root", "root");
      System.out.println("Connection Established");
      
      PreparedStatement pstmt=con.prepareStatement("select * from user where email=? and password=?");
      
      pstmt.setString(1,emailid);
      pstmt.setString(2,password);
      
      ResultSet rs=pstmt.executeQuery();
      
      if(rs.next()){
        session.setAttribute("email", emailid); //email is a session variable
        session.setAttribute("name", rs.getString(2)); //name is a session variable
        
        response.sendRedirect("userhome.jsp");
      }
      
      else{
        out.println("login failed");
        
      }
      
  
}
catch(Exception e){
  out.println(e);
  
}


%>