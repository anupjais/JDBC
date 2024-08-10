package com.qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.util.concurrent.locks.Condition;

public class FetchData {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
//			System.out.println("Loaded");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/qsp", "postgres",
					"Jaiswal#25");
			System.out.println("Connected");
			Statement smt = con.createStatement();
//			System.out.println("Statement");
//			smt.execute("insert into student values(4,'tylar swift')");
//			System.out.println("Query");
			smt.execute("select * from student");
//			smt.execute("select * from employee");

			ResultSet rs = smt.getResultSet();
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
//				System.out.println(rs.getCurrency());
				System.out.println("-----------");
			}
			
//			System.out.println(rs.next());
//			System.out.println(rs.getInt(1));
//			System.out.println(rs.getString(2));
//			rs.next();
//			System.out.println(rs.getInt(1));
//			System.out.println(rs.getString(2));

//			System.out.println("Executed");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
//			System.out.println(e.getMessage());
		}
	}

}
