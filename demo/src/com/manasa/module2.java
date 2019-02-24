package com.manasa;

import java.util.Scanner;

public class module2 {
	int eid[];
	String name[];
	double salary[];

	 void display(int eid[], String name[], double salary[]) {
		System.out.println("ID  " + "  Name  " + "  Salary  ");
		for (int i = 0; i < 5; i++) {
			System.out.println(+eid[i] + "   " + name[i] + "   " + salary[i]);

		}

	}
 void display(int eid[], String name[]) {
		System.out.println("ID  " + "  Name  ");
		for (int i = 0; i < 5; i++) {
			System.out.println(+eid[i] + "   " + name[i]);

		}
	}

	void display(String name1, int eid[], String name[], double salary[]) {
		System.out.println("ID  " + "  Name  " + "  Salary  ");
		for (int i = 0; i < 5; i++) {
			if (name[i].equals(name1))

			{
				System.out.println(+eid[i] + "   " + name[i] + "   " + salary[i]);
			}
		}

	}

	public static void main(String args[]) {
		
/*		int eid[] = { 00, 002, 003, 004, 005 };
		String name[] = { "john", "nancy", "clark", "joe", "mary" };
		double salary[] = { 600000, 550000, 500000, 500000, 300000 };*/
		 

	module2 m = new module2();

		Scanner sc = new Scanner(System.in);
		
			int eid[] = new int[5];
			String name[] = new String[5];
			double salary[] = new double[5];

			for (int i = 0; i < 5; i++) {
				eid[i] = sc.nextInt();
				name[i] = sc.next();
				salary[i] = sc.nextDouble();
			}
			m.display(eid, name, salary);
			m.display(eid, name);
			System.out.println("Enter the name to be searched");
			String name1 = sc.next();
			m.display(name1, eid, name, salary);
		}
	}

