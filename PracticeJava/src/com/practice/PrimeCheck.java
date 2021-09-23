package com.practice;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to Check :");
		int N = sc.nextInt();
		int temp = 0;
		for (int i = 2; i < N - 1; i++) {
			if (N % i == 0) {
				temp = temp + 1;

			}
			if (temp == 0) {
				System.out.println(N + " is a Prime Number .");
			} else {
				System.out.println(N + " is not a Prime Number .");
			}
			sc.close();

		}

	}
}
