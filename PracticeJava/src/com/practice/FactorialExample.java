package com.practice;

public class FactorialExample {

	public static void main(String[] args) {
		int N = 5;
		int fact = 1;
		for (int i = 1; i <= N; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial Result : " + fact);
	}

}
