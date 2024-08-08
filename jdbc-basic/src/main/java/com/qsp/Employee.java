package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp","postgres","Jaiswal#25");
			Statement smt = con.createStatement();
			smt.execute("insert into employee values(1,'Ramesh',5000)");
			con.close();
			System.out.println("Connection Cosed");
		}catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}

}
