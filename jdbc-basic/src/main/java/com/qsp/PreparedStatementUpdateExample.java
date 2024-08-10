package com.qsp;

import java.util.Scanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementUpdateExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp", "postgres",
					"Jaiswal#25");
			PreparedStatement ps = con.prepareStatement("update employee set salary = ? where id=?");
			System.out.print("id : ");
			ps.setInt(2, sc.nextInt());

			System.out.print("Salary : ");
			ps.setDouble(3, sc.nextDouble());

			ps.executeUpdate();
			con.close();
			System.out.println("Executed");

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
