package com.examplecondition;

import java.util.Scanner;

public class IfExample4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Value Between 1 to 7");
		Float a = scan.nextFloat();

		if (a == (1.1f)) {
			System.out.println("Sunday");
		}
		if (a == 2.2f) {
			System.out.println("Monday");
		}
		if (a == 3.3f) {
			System.out.println("Tuesday");
		}
		if (a == 4.4f) {
			System.out.println("Wednesday");
		}
		if (a == 5.5f) {
			System.out.println("Thursday");
		}
		if (a == 6.6f) {
			System.out.println("Friday");
		}
		if (a == 7.7f) {
			System.out.println("Saturday");
		}
		scan.close();
	}

}
