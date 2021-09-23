package com.practice;

import java.util.Scanner;

public class ReverseInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number You Want to Reverse : ");
		int N = sc.nextInt();
		int rem, rev = 0;
		while (N != 0) {
			rem = N % 10;
			rev = rev * 10 + rem;
			N = N / 10;
		}
		System.out.println(rev + " is Reverse .");
		sc.close();
	}

}
