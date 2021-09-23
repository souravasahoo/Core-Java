package com.practice;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Required Number : ");
		int N = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= N; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial Result : " + fact);
		sc.close();
	}

}
