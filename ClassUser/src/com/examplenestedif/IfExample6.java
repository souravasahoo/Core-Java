package com.examplenestedif;

import java.util.Scanner;

public class IfExample6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input Value : ");
		double x = sc.nextDouble();
		if (x > 0) {
			System.out.println("X is Greater than Zero");
		} else if (x < 0) {
			System.out.println("X is Less Than Zero");
		} else {
			System.out.println("X is equal to Zero ");
		}
		sc.close();
	}

}
