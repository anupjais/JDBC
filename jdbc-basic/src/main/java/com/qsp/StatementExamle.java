package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementExamle {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Loading");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp","postgres","Jaiswal#25");
			System.out.println("Connected");
			
			Statement smt = con.createStatement();
			System.out.println("Statement");
			
			smt.execute("insert into student values(101, 'Lallu', 983465)");
			System.out.println("Data inserted");
			
			con.close();
			System.out.println("Closed Connection");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
