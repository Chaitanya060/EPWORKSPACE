package com.klef.ep.StatementDemo;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
import java.sql.*;
import java.util.Scanner;

public class StatementCRUDOperations {
public static void main(String args[])
{
	StatementCRUDOperations crud = new StatementCRUDOperations();
	//crud.insertstudent();
    // crud.updatestudent();
	//crud.deletestudent();
	crud.viewallstudents();
}

public void insertstudent()
{
	try {
		Connection con = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Classes Loaded");
		
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcs3","root", "root");
		 System.out.println("Connection Established");
		 Statement stmt = null;
		 stmt = con.createStatement();
		 int sid = 104;
		 String sname = "kishore";
		 String sgender = "male";
		 double scgpa = 9.04;
		 int sbacklogs = 1;
		 String semail = "kishore@gmail.com";
		 String scontact = "8852806857";
		 String qry = "insert into student values("+sid+",'"+sname+"','"+sgender+"',"+scgpa+","+sbacklogs+",'"+semail+"','"+scontact+"')";
		int n = stmt.executeUpdate(qry);
		System.out.println(n + " Record(s) Inserted " );
		con.close();
		
	} catch (Exception e) {
		System.out.println(e);
	}
}
public void updatestudent()
{
	try {
		
		Connection con = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Classes Loaded");
		
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcs3","root", "root");
		 System.out.println("Connection Established");
	
		 Statement stmt = con.createStatement();
		 int sid = 103;
		 String sname = "harsha";
		 double scgpa = 9.08;
		 
		 String qry = " update student set name = '"+sname+"', cgpa ="+scgpa+" where id = "+sid+" ";
		int n =  stmt.executeUpdate(qry);
		 System.out.println(n + " Record(s) updated successfully");
		 con.close();
		 
		 
		
	} catch (Exception e) {
	     System.out.println(e);
	}
}

public void deletestudent()
{
	try {
		 
		Connection con = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Classes Loaded");
		
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcs3","root", "root");
		 System.out.println("Connection Established");
	
		 Statement stmt = con.createStatement();
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter student ID:");
		 int sid = sc.nextInt();
		 String sql = "delete from student where id = "+sid+" ";
		 int n = stmt.executeUpdate(sql);
		 System.out.println(n + "Record(s) deleted successfully");
		 con.close();
		
		
	} catch (Exception e) {
		System.out.println(e);
	}
}
public void viewallstudents()
{
	try {
		
		Connection con = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Classes Loaded");
		
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcs3","root", "root");
		 System.out.println("Connection Established");
		 Statement stmt = con.createStatement();
		 String qry = "select * from student ";
		 
		ResultSet rs =  stmt.executeQuery(qry);
		//for( ;rs.next();)
			while(rs.next())
		 // if(rs.next())             // for geting only one student information
		{
			System.out.println(rs.getString(1));          //student id we can use the string or int
			System.out.println(rs.getString(2));         //student name
			System.out.println(rs.getDouble(4));          //student cgpa
			System.out.println(rs.getString(7));             //student contact number
			System.out.println(rs.getString("gender"));        // student gender
			
		}
		con.close();
		
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
