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


/*
 * 1. What is API? give an example.
 * 2. What is JDBC?
 * 3. What is JDBC driver?
 * 4. Types of JDBC Drivers.
 * 5. Steps of JDBC.
 * 6. What is ResultSet, why we use it?
 * 7. How to create Statements? explain..
 * 8. How to create Connection? explain..
 * 9. How to load the Driver? explain..
 * 10. What is Class loading?
 * 11. What is JAR file?
 * 12. How to execute queries, explain all method.
 * 13. What is the return type of execute?
 * 14. How to use Dynamic ?
 * 15. What is delimiter ?
 * 16. How to store data inside delimiter?
 * 17. What is the need of closing the Connection?
 * */
