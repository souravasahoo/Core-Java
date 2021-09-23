package com.practice;

public class PalindromeExample {

	public static void main(String[] args) {
		int N = 1331;
		int temp = N;
		int rev = 0, rem;
		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		if (N == rev) {
			System.out.println(N + " is a Palindrome Number.");
		} else {
			System.out.println(N + " is not a Palindrome Number.");
		}

	}

}
