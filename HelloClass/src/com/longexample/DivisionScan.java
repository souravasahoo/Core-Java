package com.longexample;

import java.util.Scanner;

public class DivisionScan {
	long a;
	long b;

	public void div() {
		long c = a / b;
		System.out.println("Division Results : " + c);
	}

	public static void main(String[] args) {
		DivisionScan srv = new DivisionScan();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		srv.a = scan.nextLong();
		System.out.println("Enter Second Number : ");
		srv.b = scan.nextLong();
		srv.div();
	}
}
