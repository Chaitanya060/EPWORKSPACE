package com.klef.ep.JDBCProject;
import java.sql.*;
public class TransactionManagment {

	public static void main(String[] args) 
	{
		try {
			Connection con = null;
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Classes Loaded");
			
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcs3","root", "root");
			 System.out.println("Connection Established");
			 con.setAutoCommit(false);
//			con.createStatement().executeUpdate("insert into faculty values(1000,'chaitu','male')");
//			 con.createStatement().executeUpdate("insert into faculty values(1001,'rgv','male')");
//			 con.createStatement().executeUpdate("insert into faculty values(1002,'kakashi','male')");
//			 con.createStatement().executeUpdate("insert into faculty values(1003,'sasuke','male')");
			 Savepoint s1 = con.setSavepoint("s1");
			 
			 con.createStatement().executeUpdate("delete from faculty where id = 1001 ");
			 Savepoint s2 = con.setSavepoint("s2");
			 
			 
			 con.rollback(s2);
			 
			 
			 
		con.commit();
			 con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		

	}

}
