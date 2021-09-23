package com.practice;

public class ReverseExample {

	public static void main(String[] args) {
		int N = 5432;
		int rem, rev = 0;
		while (N != 0) {
			rem = N % 10;
			rev = rev * 10 + rem;
			N = N / 10;
		}
		System.out.println("Reverse of a Number : " + rev);

	}
}
