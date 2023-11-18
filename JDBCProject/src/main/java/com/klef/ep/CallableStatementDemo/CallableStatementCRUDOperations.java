package com.klef.ep.CallableStatementDemo;
import java.sql.*;
import java.util.*;
public class CallableStatementCRUDOperations {
	
public static void main(String args[])
{
	CallableStatementCRUDOperations crud = new CallableStatementCRUDOperations();
//	crud.addfaculty();
//	crud.updatefaculty();
//	crud.deletefaculty();
	//crud.viewallfaculty();	
	crud.getfacultynamebyid();
}
 public void addfaculty()
 {
	 try {
		 
		 Connection con = null;
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Classes Loaded");
			
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcs3","root", "root");
			 System.out.println("Connection Established");
			 
			 int fid = 3;
			 String fname = "kishore";
			 String fgender = "male";
			 CallableStatement cstmt = con.prepareCall("{call insertfaculty(?,?,?)}");
			 cstmt.setInt(1, fid);
			 cstmt.setString(2, fname);
			 cstmt.setString(3, fgender);
			 int n = cstmt.executeUpdate();
			 System.out.println(n + " record(s) inserted sucessfully");
			 con.close();
		
	} catch (Exception e) {
		System.out.println(e);
	}
 }
 public void updatefaculty()
 {
	 try {
		 Connection con = null;
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Classes Loaded");
			
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcs3","root", "root");
			 System.out.println("Connection Established");
			 int fid = 1;
			 String fname = "SURYA";
			 CallableStatement cstmt = con.prepareCall("{call updatefaculty(?,?)} ");
			 cstmt.setInt(1, fid);
			 cstmt.setString(2, fname);
			 int n = cstmt.executeUpdate();
			 System.out.println(n + "record update sucessfully");
			
			 con.close();
		
	} catch (Exception e) {
		System.out.println(e);
	}
	
 }
 public void deletefaculty()
 {
	 try {
		 Connection con = null;
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Classes Loaded");
			
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcs3","root", "root");
			 System.out.println("Connection Established");
			 Scanner sc = new Scanner(System.in);
			 System.out.println("enter the id");
			 int fid = sc.nextInt();
			 CallableStatement cstmt = con.prepareCall("{ call deletefacultybyid(?)}");
					 cstmt.setInt(1, fid);
			 int n = cstmt.executeUpdate();
			 if(n>0)
			 {
				 System.out.println(n + "Recorsd deleted sucessfully");
			 }
			 else {
				 System.out.println(n + " record deleted sucessfully");
			 }
		con.close();
	} catch (Exception e) {
		System.out.println(e);
	}
 }
 public  void viewallfaculty()
 {
	 try {
		 Connection con = null;
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Classes Loaded");
			
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcs3","root", "root");
			 System.out.println("Connection Established");
			 CallableStatement cstmt = con.prepareCall("{call viewallfaculty()}");
			ResultSet s =  cstmt.executeQuery();
			System.out.println("******faculty Information *******");
			while(s.next())
			{
				System.out.println("faculty records" + s.getRow());
				System.out.println( "faculty id" +s.getInt("id"));        //faculty id
				System.out.println("faculty name"+s.getString("name"));     //faculty name
				System.out.println("faculty gender"+s.getString("gender"));      //faculty gender
				
			}
			con.close();
	} catch (Exception e) {
		System.out.println(e);
	}
 }
 public void getfacultynamebyid()
 {
	 try {
		 Connection con = null;
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Classes Loaded");
			
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcs3","root", "root");
			 System.out.println("Connection Established");
			 int fid = 1;
			 CallableStatement cstmt = con.prepareCall("{call getfacultynamebyid(?,?)}");
			 cstmt.setInt(1, fid);
			 cstmt.registerOutParameter(2, java.sql.Types.VARCHAR);
			 cstmt.execute();
			 System.out.println("faculty name" + cstmt.getString("fname"));  //we can keep the name either 2 or fname
			 System.out.println("faculty name" + cstmt.getString(2));
			 con.close();
			 
			 
		
	} 
	 catch (Exception e) {
		System.out.println(e);
	}
 }
}
