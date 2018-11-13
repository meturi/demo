package com.manasa;

import java.util.Scanner;

public class Combined extends module2 {
	public static void main(String args[]) {
		int eid[] = new int[5];
		String name[] = new String[5];
		double salary[] = new double[5];
		Scanner s = new Scanner(System.in);

		try {
			for (int i = 0; i < 5; i++) {
				eid[i] = s.nextInt();
				name[i] = s.next();
				salary[i] = s.nextDouble();
			}
			/* Combined c = new Combined(); */
			Extend e = new Extend();
			e.display(eid, name, salary);
			e.display(eid, name);
		} finally {
			s.close();
		}
	}
}