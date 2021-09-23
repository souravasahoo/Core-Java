package com.longexample;

import java.util.Scanner;

public class AdditionScan {
	long a;
	long b;

	public void add() {
		long c = a - b;
		System.out.println("Addition of Two  Number : " + c);
	}

	public static void main(String[] args) {
		AdditionScan srv = new AdditionScan();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		srv.a = scan.nextLong();
		System.out.println("Enter Second Number : ");
		srv.b = scan.nextLong();
		srv.add();
	}
}
