package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BasicProject {
	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Driver is loaded.");
//			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp","postgres","Jaiswal#25");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp?user=postgres&password=Jaiswal#25");
			System.out.println(con);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
