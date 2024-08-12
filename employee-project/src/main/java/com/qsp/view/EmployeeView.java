package com.qsp.view;

import java.util.Scanner;

import com.qsp.controller.EmployeeController;
import com.qsp.model.Employee;

public class EmployeeView {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e = new Employee();

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
				homeOption();
				inp();
				int inpOpt = sc.nextInt();
				switch (inpOpt) {
				case 1:
					cls();
					System.out.println("Login");
					break;
				case 2:
					cls();
					System.out.println("EXIT");
					break;
				default:
					cls();
					incrOpt();

				}
				break;
			case 2:
				cls();
				aboutUs();
				break;
			case 3:
				cls();
				contactUs();
				break;
			case 4:
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
		String[] opt = { "Home", "About us", "Contact us", "EXIT" };
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
