package com.qsp;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepareStatementScannerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp","postgres","Jaiswal#25");
			PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?)");
			System.out.print("id : ");
			ps.setInt(1, sc.nextInt());
			System.out.print("name : ");
			sc.nextLine();
			ps.setString(2, sc.nextLine());
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
