package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementExample {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp","postgres","Jaiswal#25");
			PreparedStatement ps = con.prepareStatement("insert into student values(?,?)");
			ps.setInt(1, 27);
			ps.setString(2, "Vishal");
			
			ps.executeUpdate();
			con.close();
			System.out.println("Vishal is executed");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
