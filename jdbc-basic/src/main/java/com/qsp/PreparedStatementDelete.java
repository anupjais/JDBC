package com.qsp;

import java.util.Scanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementDelete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp", "postgres",
					"Jaiswal#25");
			PreparedStatement ps = con.prepareStatement("delete from employee where id=?");
			System.out.print("id : ");
			ps.setInt(2, sc.nextInt());

			con.close();
			System.out.println("Data deleted");

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
