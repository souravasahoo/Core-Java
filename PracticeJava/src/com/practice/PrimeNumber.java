package com.practice;

public class PrimeNumber {

	public static void main(String[] args) {
		int N = 12;
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

		}

	}

}
