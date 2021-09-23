package com.doubleexample;

import java.util.Scanner;

public class AdditionScan {
	double a;
	double b;

	public void add() {
		double c = a + b;
		System.out.println("Addition of Two Number : " + c);
	}

	public static void main(String[] args) {
		AdditionScan srv = new AdditionScan();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		srv.a = scan.nextDouble();
		System.out.println("Enter Second Number : ");
		srv.b = scan.nextDouble();
		srv.add();

	}
}
