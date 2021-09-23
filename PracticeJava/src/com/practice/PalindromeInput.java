package com.practice;

import java.util.Scanner;

public class PalindromeInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number you want to check :");
		int N = sc.nextInt();
		int temp = N;
		int rem, rev = 0;
		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if (N == rev) {
			System.out.println(N + " is a Palindrome Number .");
		} else {
			System.out.println(N + " is not a Palindrome Number .");
		}
		sc.close();

	}

}
