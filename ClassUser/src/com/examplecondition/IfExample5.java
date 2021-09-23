package com.examplecondition;

import java.util.Scanner;

public class IfExample5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Value Between 0 to 9");
		double a = scan.nextDouble();

		if (a == 1.00d) {
			System.out.println("Delhi");
		}
		if (a == 2.00d) {
			System.out.println("Mumbai");
		}
		if (a == 3.00d) {
			System.out.println("Chennai");
		}
		if (a == 4.00d) {
			System.out.println("Kolkata");
		}
		if (a == 5.00d) {
			System.out.println("Bhubaneswar");
		}
		if (a == 6.00d) {
			System.out.println("Lucknow");
		}
		if (a == 7.00d) {
			System.out.println("Ahamadabad");
		}
		scan.close();
	}

}
