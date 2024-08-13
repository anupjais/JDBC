package com.qsp.controller;

import java.sql.*;
import java.util.*;

import com.qsp.model.Employee;

public class EmployeeController {

	static String url = "jdbc:postgresql://localhost:5432/qsp";
	static String un = "postgres";
	static String pass = "Jaiswal#25";
	static String path = "org.postgresql.Driver";

	static Connection con;
	static {
		try {
			Class.forName(path);
			con = DriverManager.getConnection(url,un,pass);
			
			
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void insert(Employee e)
	{
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("insert into employee values(?,?,?)");
			ps.setInt(1, e.getId());
			ps.setString(2, e.getName());
			ps.setDouble(3, e.getSal());
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public static void updateById(int id)
	{
		fetchById(id);
	}
	public static Employee fetchById(int id)
	{
		Employee emp = new Employee();
		try {
			PreparedStatement ps = con.prepareStatement("select * from employee where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setSal(rs.getDouble("sal"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emp;
	}
	public static Employee fetchByName(String name)
	{
		Employee emp = new Employee();
		try {
			PreparedStatement ps = con.prepareStatement("select * from employee where name=?");
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setSal(rs.getDouble("sal"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emp;
	}
	
	public static boolean deleteById(int id)
	{
		Employee emp = fetchById(id);
		if(emp.getName() != null)
		{
			try {
				PreparedStatement ps = con.prepareStatement("delete from employee where id=?");
				ps.setInt(1, id);
				ps.executeUpdate();
			}catch(SQLException e)
			{
				e.printStackTrace();
			}
			return true;
		}else {
			return false;
		}
	}
	public static boolean deleteByName(String name)
	{
		Employee emp = fetchByName(name);
		if(emp.getName() != null)
		{
			try {
				PreparedStatement ps = con.prepareStatement("delete from employee where name=?");
				ps.setString(1, name);
				ps.executeUpdate();
			}catch(SQLException e)
			{
				e.printStackTrace();
			}
			return true;
		}else {
			return false;
		}
	}
}
