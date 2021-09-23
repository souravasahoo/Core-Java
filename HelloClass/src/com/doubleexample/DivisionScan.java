package com.doubleexample;

import java.util.Scanner;

public class DivisionScan {
	double a;
	double b;

	public void div() {
		double c = a / b;
		System.out.println("Division Results : " + c);
	}

	public static void main(String[] args) {
		DivisionScan srv = new DivisionScan();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		srv.a = scan.nextDouble();
		System.out.println("Enter SeCOND Number : ");
		srv.b = scan.nextDouble();
		srv.div();
	}
}
