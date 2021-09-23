package com.doubleexample;

import java.util.Scanner;

public class SubstractionScan {
	double a;
	double b;

	public void sub() {
		double c = a - b;
		System.out.println("Substraction of Two Number : " + c);
	}

	public static void main(String[] args) {
		SubstractionScan srv = new SubstractionScan();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		srv.a = scan.nextDouble();
		System.out.println("Enter Second Numner : ");
		srv.b = scan.nextDouble();
		srv.sub();
	}
}
