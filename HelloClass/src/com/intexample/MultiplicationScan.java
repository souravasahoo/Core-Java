package com.intexample;

import java.util.Scanner;

public class MultiplicationScan {
	int a;
	int b;

	public void multi() {
		int c = a * b;
		System.out.println("Addition of Two Number : " + c);
	}

	public static void main(String[] args) {
		MultiplicationScan srv = new MultiplicationScan();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		srv.a = scan.nextInt();
		System.out.println("Enter Second Number : ");
		srv.b = scan.nextInt();
		srv.multi();
		scan.close();
	}
}
