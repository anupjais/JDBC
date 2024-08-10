package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteQueryExample {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp","postgres","Jaiswal#25");
			Statement smt = con.createStatement();
//			smt.executeQuery("insert into student values(201,'Shubham',5287436),(202,'Shubhangi',2593874),(203,'Shudarshan',91394587)");
			ResultSet rs=smt.executeQuery("select * from student");
			
			while(rs.next())
			{
				System.out.println(rs.getInt("id"));
				System.out.println(rs.getString("name"));
				System.out.println("__________________");
			}
			rs.close();
			System.out.println("Connection closed");
			
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
