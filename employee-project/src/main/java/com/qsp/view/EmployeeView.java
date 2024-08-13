package com.qsp.view;

import java.sql.ResultSet;
import java.util.Scanner;

import com.qsp.controller.EmployeeController;
import com.qsp.model.Employee;

public class EmployeeView {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Employee e = new Employee();

//		System.out.print("Employee name : ");
//		String name = sc.next();
//		System.out.println(EmployeeController.deleteByName(name));

		cls();
		outerloop: for (;;) {
			greeting();
			System.out.print("");
			options();
			inp();
			int opt = sc.nextInt();
			switch (opt) {
			case 1:
				cls();
				insertData();
				break;
			case 2:
				cls();
				updateOption();
				break;
			case 3:
				cls();
				deleteOption();
				break;
			case 4:
				cls();
				System.out.print("Enter Id : ");
				int id = sc.nextInt();
				System.out.println(getData(id));
				break;
			case 5:
				cls();
				ext();
			default:
				cls();
				incrOpt();
			}
		}

//		e.setId(200);
//		e.setName("xyz");
//		e.setSal(9999);
//		
//		EmployeeController.insert(e);
//		boolean flag = EmployeeController.deleteById(18);
//		System.out.println("Inserted");
//		System.out.println(flag);
	}

	public static void greeting() {
		System.out.println("\n***** Welcome to the Employee Management System *****");
	}

	public static void options() {
		int count = 1;
//		String[] opt = { "Home", "About us", "Contact us", "EXIT" };
		String[] opt = { "Insert", "Update", "Delete", "Display", "EXIT" };
		for (String op : opt)
			System.out.println(count++ + ". " + op);
	}

	public static void insertData() {
		Employee e = new Employee();
		System.out.print("Id : ");
		e.setId(sc.nextInt());
//		int id=sc.nextInt();

		System.out.print("Name : ");
		e.setName(sc.nextLine());
		System.out.print("Salary : ");
		e.setSal(sc.nextDouble());
		EmployeeController.insert(e);
	}

	public static Employee getData(int id) {
		return EmployeeController.fetchById(id);
	}

	public static void updateOption() {
		int count = 1;
		String[] opt = { "By ID", "By Name", "By Salary", "EXIT" };
		for (String op : opt)
			System.out.println(count++ + ". " + op);
	}

	public static void deleteOption() {
		int count = 1;
		String[] opt = { "By ID", "By Name", "By Salary", "EXIT" };
		for (String op : opt)
			System.out.println(count++ + ". " + op);
	}

	public static void homeOption() {
		int count = 1;
		String[] opt = { "Log-in", "Sign-up", "EXIT" };
		for (String op : opt)
			System.out.println(count++ + ". " + op);
	}

	public static void logedOption() {
		int count = 1;
		String[] opt = { "Home", "Job", "Log-out" };
		for (String op : opt)
			System.out.println(count++ + ". " + op);
	}

	public static void inp() {
		System.out.print("\nEnter your option : ");
	}

	public static void aboutUs() {
		System.out.println("\n***** About Us*****");
		System.out.println("We are product based software company");
		System.out.println("We deals in Customer Development, Project Restructuring and Business Building");
	}

	public static void contactUs() {
		String social = "@ak47_anup_jaiswal";
		String add = "Deccan Mitra Mandali, Deccan Gymkhana, Pune, Maharashtra";
		int pin = 411004;
		String con = "8709783682";
		System.out.println("\n***** Contact Us*****");
		System.out.println("Our Social Media : " + social);
		System.out.println("Contact No : " + con);
		System.out.println("Address : " + add + ", " + pin);
	}

	public static void ext() {
		System.out.print("\nThank you for using our application");
		System.exit(0);
	}

	public static void logout() {
		System.out.print("\nYou are log-out");
		options();
	}

	public static void incrOpt() {
		System.out.println("Incorrect option");
	}

	static void cls() {
		System.out.println("\033[H \033[2J");
	}

}
