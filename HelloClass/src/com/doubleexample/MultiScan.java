package com.doubleexample;

import java.util.Scanner;

public class MultiScan {
	double a;
	double b;

	public void multi() {
		double c = a * b;
		System.out.println("Multiplication of Two Number : " + c);
	}

	public static void main(String[] args) {
		MultiScan srv = new MultiScan();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		srv.a = scan.nextDouble();
		System.out.println("Enter Second Number : ");
		srv.b = scan.nextDouble();
		srv.multi();
	}
}
