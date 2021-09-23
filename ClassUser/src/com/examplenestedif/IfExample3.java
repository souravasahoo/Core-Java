package com.examplenestedif;

import java.util.Scanner;

public class IfExample3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Value of X");

		int x = sc.nextInt();

		if (x > 0) {
			System.out.println("X is Greater Than Zero");
		} else {
			System.out.println("X is Less Than Zero");
		}
		sc.close();
	}

}
