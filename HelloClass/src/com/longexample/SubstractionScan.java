package com.longexample;

import java.util.Scanner;

public class SubstractionScan {
	long a;
	long b;

	public void sub() {
		long c = a - b;
		System.out.println("Substraction of Two Number : " + c);
	}

	public static void main(String[] args) {
		SubstractionScan srv = new SubstractionScan();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		srv.a = scan.nextLong();
		System.out.println("Enter Second Number : ");
		srv.b = scan.nextLong();
		srv.sub();
	}
}
