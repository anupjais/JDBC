package com.qsp.view;

import java.util.Scanner;

import com.qsp.model.Employee;

public class EmployeeView2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("***** Welcome *****");
		do {
			System.out.println("1--> Insert");
			System.out.println("2--> Update name by Id");
			System.out.println("3--> Fetch by Id");
			System.out.println("4--> Delete by Id");
			System.out.println("5--> FetchAll");
			switch(sc.nextInt())
			{
			case 1:
				Employee e = new Employee();
				System.out.print("Id : ");
				e.setId(sc.nextInt());
				e.setName(sc.nextLine());
				e.setSal(sc.nextDouble());
			}
		}while("y".equalsIgnoreCase(sc.next()));
	}

}
