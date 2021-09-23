package com.longexample;

import java.util.Scanner;

public class MultiplicationScan {
	long a;
	long b;

	public void multi() {
		long c = a * b;
		System.out.println("Multiplication of Two Number : " + c);
	}

	public static void main(String[] args) {
		MultiplicationScan srv = new MultiplicationScan();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		srv.a = scan.nextLong();
		System.out.println("Enter Second Number : ");
		srv.b = scan.nextLong();
		srv.multi();
	}
}
