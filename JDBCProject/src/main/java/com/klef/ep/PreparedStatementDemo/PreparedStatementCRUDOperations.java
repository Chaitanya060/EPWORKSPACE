package com.klef.ep.PreparedStatementDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class PreparedStatementCRUDOperations   
{
public static void main(String args[])
{
	PreparedStatementCRUDOperations crud = new PreparedStatementCRUDOperations();
	
	//crud.addemployee();
//crud.updateemployee();
	//crud.deleteemp();
	//crud.viewallemployee();
	//crud.vieweployeebyid();
	
}
public void addemployee()
{
	try {
		
		Connection con = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Classes Loaded");
		
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcs3","root", "root");
		 System.out.println("Connection Established");
		 int eid = 103;
		 String ename = "kishore";
		 String egender = "male";
		 String edob = "12/1/2204";
		 double esalary = 5020.300;
		 String empemail = "kishore@gmail.com";
		 String epwd = "kishore";
		 String econtact = "9652514958";
		 PreparedStatement pstmt = con.prepareStatement("insert into employee values(?,?,?,?,?,?,?,?) ");
		 pstmt.setInt(1, eid);
		 pstmt.setString(2, ename);
		 pstmt.setString(3, egender);
		 pstmt.setString(4, edob);
		 pstmt.setDouble(5, esalary);
		 pstmt.setString(6, empemail);
		 pstmt.setString(7, epwd);
		 pstmt.setString(8, econtact);
		 int n = pstmt.executeUpdate();
		 System.out.println(n + " Record(s) Inserted Successfully ");
		 	
	} 
	catch (Exception e)
	{
		System.out.println(e);
	}	
}
     
 public void updateemployee()
 {
	 try {
		 Connection con = null;
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Classes Loaded");
			
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcs3","root", "root");
			 System.out.println("Connection Established");
			 
			 int eid = 102;
			 String ename = "chait";
			 double esalary = 6000.50;
			 PreparedStatement pstmt = con.prepareStatement("update employee set name = ?,salary = ? where id = ?");
			 pstmt.setString(1, ename);
			 pstmt.setDouble(2, esalary);
			 pstmt.setInt(3, eid);
			 int n = pstmt.executeUpdate();
			 System.out.println(n + " Record(s) Update Successfully");
			 
		
	} catch (Exception e) {
		System.out.println(e);
	}
 }
 public void deleteemp()
 {
	 try {
		 Connection con = null;
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Classes Loaded");
			
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcs3","root", "root");
			 System.out.println("Connection Established");
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Enter Employee ID:");
			 int eid = sc.nextInt();
			 PreparedStatement pstmt = con.prepareStatement("delete from employee where id = ?");
			 pstmt.setInt(1, eid);
			 int n = pstmt.executeUpdate();
			 if(n>0)
			 {
				 System.out.println("employee record deleted sucessfully");
				 
			 }
			 else
			 {
				 System.out.println("employee id not foiund");
			 }
			 sc.close();
			 con.close();
			 
		
	} catch (Exception e) {
		System.out.println(e);
	}
 }
public void viewallemployee()
{
	try {
		Connection con = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Classes Loaded");
		
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcs3","root", "root");
		 System.out.println("Connection Established");
		PreparedStatement pstmt = con.prepareStatement("select * from employee");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next())
		{
			System.out.println("employee Record "+ rs.getRow());
		System.out.println(rs.getInt(1));                 //emp id
		System.out.println(rs.getString(2));              // emp name
		System.out.println(rs.getDouble(5));               //  emp salary
		System.out.println(rs.getString(4));                 //  emp dob
		System.out.println(rs.getString("email"));
		}
		con.close();
		
	} catch (Exception e) {
		System.out.println(e);
	}
}
public void vieweployeebyid()
{
	try {
		Connection con = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Classes Loaded");
		
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcs3","root", "root");
		 System.out.println("Connection Established");
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Employee ID:");
		 int eid = sc.nextInt();
		 PreparedStatement pstmt =  con.prepareStatement("select id,name,gender from eployee where id = ?");
		 pstmt.setInt(1, eid);
		 ResultSet rs = pstmt.executeQuery();
		 if(rs.next())
			{
				System.out.println("employee Record "+ rs.getRow());
			System.out.println(rs.getInt("id"));                 //emp id
			System.out.println(rs.getString("name"));              // emp name
			System.out.println(rs.getDouble("gender"));               //  emp salary
		
			}
		
		else {
			System.out.println("record not found");
		}
		 con.close();
		
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
