package com.examplecondition;

import java.util.Scanner;

public class IfExample2 {
	public static void main(String... args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Value Between 1 to 7");
		String x = scan.nextLine();

		if (x.equals("1")) {
			System.out.println("Sunday");
		}
		if (x.equals("2")) {
			System.out.println("Monday");
		}
		if (x.equals("3")) {
			System.out.println("Tuesday");
		}
		if (x.equals("4")) {
			System.out.println("Wednesday");
		}
		if (x.equals("5")) {
			System.out.println("Thursday");
		}
		if (x.equals("6")) {
			System.out.println("Friday");
		}
		if (x.equals("7")) {
			System.out.println("Saturday");
		}
		scan.close();
	}

}
